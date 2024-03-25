package eWaybill.helpers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataLoader {

    public String urlsData(String key) throws IOException {

        FileReader reader =
                new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                        File.separator + "main" + File.separator + "resources" +
                        File.separator + "testData" + File.separator + "urlsData.properties");
        Properties p = new Properties();
        p.load(reader);

        return p.getProperty(key);
    }

    public String credentialsData(String key) throws IOException {

        FileReader reader =
                new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                        File.separator + "main" + File.separator + "resources" +
                        File.separator + "testData" + File.separator + "credentials.properties");
        Properties p = new Properties();
        p.load(reader);

        return p.getProperty(key);
    }
}
