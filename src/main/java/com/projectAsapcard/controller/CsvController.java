package com.projectAsapcard.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectAsapcard.service.CsvToJsonService;

@RestController
@RequestMapping("/csv")
public class CsvController {
	
	@Autowired
	private CsvToJsonService csvToJsonService;
	
	@PostMapping
	public String processCsvFile() {
		csvToJsonService.processCsvFile("C:\\Users\\Viniboy\\Desktop\\csv\\input-data.csv", "queueName");
		return "CSV processed sucessfully!";
	}
}
