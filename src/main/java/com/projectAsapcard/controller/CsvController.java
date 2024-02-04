package com.projectAsapcard.controller;

import com.projectAsapcard.model.CsvData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectAsapcard.service.CsvToJsonService;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/csv")
public class CsvController {
	
	@Autowired
	private CsvToJsonService csvToJsonService;
	
	@PostMapping
	public String processCsvFile() {
	    String fileName = "src/main/resources/data.csv";
	    csvToJsonService.processCsvFile(fileName, "csv-stream");
	    return "CSV file processed successfully";
	}

	@PostMapping("/dataJson")
	public List<CsvData> getDataJson() throws IllegalStateException, FileNotFoundException {
		return csvToJsonService.dataJson();
	}
}
