package ru.netology.solid.di;

public class Main {

    public static void main(String[] args) {
        DataSource dataSourceInFTP = new DataSourceInFTP();
        DataSource dataSourceInInternet = new DataSourceInInternet();
        SomeService someService = new SomeService(dataSourceInInternet);
        someService.sendNotificationBeforeWriteDataSource("some_data");
        someService.sendEmailBeforeReadDataSource();
    }
}
