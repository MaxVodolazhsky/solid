package ru.netology.solid.di;

public class SomeService {

    private DataSource dataSource;

    public SomeService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmailBeforeReadDataSource() {
        System.out.println("Send email...");
        dataSource.readData();
    }

    public void sendNotificationBeforeWriteDataSource(String data) {
        System.out.println("Send notification...");
        dataSource.writeData(data);
    }
}
