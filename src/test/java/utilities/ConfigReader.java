package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {
        String dosyaYolu="configuration.properties";//buna dikkat et
        try {
        FileInputStream fis=new FileInputStream(dosyaYolu);
        properties=new Properties();
        properties.load(fis);

        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public static String getProperty(String Key){
        return properties.getProperty(Key);
    }
}
