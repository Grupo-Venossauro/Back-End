package service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import model.CsvData;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class CsvToJsonService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void processCsvFile(String csvFilePath, String queueName) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
            CsvToBean<CsvData> csvToBean = new CsvToBeanBuilder<CsvData>(reader)
                    .withType(CsvData.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<CsvData> csvDataList = csvToBean.parse();

            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(csvDataList);
            System.out.println(json);

            rabbitTemplate.convertAndSend(queueName, json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}