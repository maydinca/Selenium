package C011_utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// IQ: When do you use catch/try and when do you prefer to throw to method signature?
public class ConfigsReader {
    static Properties properties;

    /**
     *This method will locate and prepare (load) the Properties file
     * @param filePath specify file path / location here
     */
    // NOTE: THIS CLASS READS FROM THE PROPERTIES FILE. Alternative name, to this class, could be "ReadFromProperties"
    public static void loadProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fis);       //JAVA IO open ---->Close()
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

           // e.printStackTrace(); // throw new RuntimeException(e) yerine yazilabilir hatayi yazdirmak icin
        } catch (IOException e) {
            e.printStackTrace(); //throw me yerine kullandim
        }
    }

    /**
     * This methid will return value of the specified key from the properties file
     * @param key accepted as a String
     * @return value from the given key( from the Properties file)
     */
    public static String getProperties(String key) { //alternative for getProperties "readProperties"
       return properties.getProperty(key);
        //return key; ayni sey usteki returnle

    }
}


// single line comment
/*
Multi Line command
 */
/**
 * documentation comments
 */