package ru.netology.solid.di;

public class DataSourceInFTP implements DataSource {

    public String readData() {
        return "some data";
    }

    public void writeData(String data) {
        System.out.println("Write... " + data);
    }
}
