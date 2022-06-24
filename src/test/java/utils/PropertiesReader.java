package utils;

import java.io.FileInputStream;
import java.util.Properties;


public enum PropertiesReader {
    CONFIGURATIONS("src/test/java/resources/properties/configuration.properties"),
    URL("src/test/java/resources/properties/url.properties");
    private Properties properties;
    PropertiesReader(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getProperty(String keyName) {
        return properties.getProperty(keyName);
    }
}
