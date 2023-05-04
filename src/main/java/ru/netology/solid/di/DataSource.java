package ru.netology.solid.di;

public interface DataSource {

    String readData();

    void writeData(String data);
}
