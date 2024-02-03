package model;

import com.opencsv.bean.CsvBindByPosition;

public class CsvData {

    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String timestamp;

    @CsvBindByPosition(position = 2)
    private String PersonId;

    @CsvBindByPosition(position = 3)
    private String name;

    @CsvBindByPosition(position = 4)
    private int age;

    @CsvBindByPosition(position = 5)
    private double amount;

    @CsvBindByPosition(position = 6)
    private int installment_number;

}	

