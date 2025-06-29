package com.example;

import com.example.file.formats.ExcelReader;
import com.example.file.formats.NumbersReader;
import com.example.file.formats.QuickbooksReader;

public class Main {
    public static void main(String[] args) {
        var excelReader = new ExcelReader(null);
        var numbersReader = new NumbersReader(excelReader);
        var quickBooksReader = new QuickbooksReader(numbersReader);
        var dataReader = new DataReader(quickBooksReader);
        dataReader.read("data.xls");
    }
}
