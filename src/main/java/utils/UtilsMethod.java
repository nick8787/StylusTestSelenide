package utils;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class UtilsMethod {
    @SneakyThrows
    public static String getValue(String value){
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties");
        properties.load(fileInputStream);

        String data = properties.getProperty(value);
        return data;
    }
}