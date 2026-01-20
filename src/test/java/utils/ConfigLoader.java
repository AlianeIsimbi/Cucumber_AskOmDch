package utils;

import java.util.Properties;

public class ConfigLoader {

    private static ConfigLoader instance;
    private Properties properties;

    private ConfigLoader() {
        properties = PropertyUtils.propertyLoader("src/test/resources/config.properties");
    }

    public static ConfigLoader getInstance() {
        if (instance == null) {
            instance = new ConfigLoader();
        }
        return instance;
    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public String getChrome() {
        return properties.getProperty("chrome.driver.path");
    }

    public String getFirefox() {
        return properties.getProperty("firefox.driver.path");
    }

    public String getEdge() {
        return properties.getProperty("edge.driver.path");
    }
}


