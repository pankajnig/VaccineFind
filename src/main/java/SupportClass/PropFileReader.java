package SupportClass;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropFileReader {

    public static String getProp(String urltype) throws IOException {
        FileReader reader=new FileReader("src/main/java/Resource/test.properties");
        Properties p=new Properties();
        p.load(reader);
        return (p.getProperty(urltype));
    }
}
