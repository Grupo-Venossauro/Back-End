package com.projectAsapcard.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.projectAsapcard.model.CsvData;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service
public class CsvToJsonService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void processCsvFile(String csvFilePath, String inputData) {
        try {
            CSVParser csvParser = new CSVParserBuilder()
                .withSeparator(';')
                .build();

            CSVReader csvReader = new CSVReaderBuilder(new FileReader(csvFilePath))
                .withCSVParser(csvParser)
                .build();

            CsvToBean<CsvData> csvToBean = new CsvToBeanBuilder<CsvData>(csvReader)
                .withType(CsvData.class)
                .build();

            List<CsvData> csvDataList = csvToBean.parse();

            ObjectMapper objectMapper = new ObjectMapper();

            for (CsvData csvData : csvDataList) {
                String json = objectMapper.writeValueAsString(csvData);
                System.out.println(json);

                rabbitTemplate.convertAndSend(inputData, json);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<CsvData> dataJson() throws IllegalStateException, FileNotFoundException {
        String fileName = "src/main/resources/data.csv";

        CSVParser csvParser = new CSVParserBuilder()
            .withSeparator(';')
                .build();

        CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileName))
            .withCSVParser(csvParser)
            .build();

        List<CsvData> beans = new CsvToBeanBuilder<CsvData>(csvReader)
            .withType(CsvData.class)
            .build()
            .parse();

        return beans;
    }
}
