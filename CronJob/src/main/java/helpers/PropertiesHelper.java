package helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {
    public static Properties useProperty(String path) throws IOException {
        FileReader reader = new FileReader(path);
        Properties properties = new Properties();
        properties.load(reader);
        return properties;
    }
}
