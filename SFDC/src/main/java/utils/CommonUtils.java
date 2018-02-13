package utils;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CommonUtils {
	
	public JSONObject getDataFile(String dataFileName) {
        String workingDir = System.getProperty("user.dir");
        String filepath = workingDir + "/src/main/java/dataSource/";
        String dataFilePath = filepath;
        JSONObject testObject = null;

        try {
            FileReader reader = new FileReader(dataFilePath + dataFileName);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            testObject = (JSONObject) jsonObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return testObject;
    }
	
	public int randomNumberGenerator() {
        Random random = new Random(System.nanoTime());
        int randomInt = random.nextInt(1000000000);
        return randomInt;
    }

    public HashMap<String, String> addValuetoJson(String Key, String Value) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put(Key, Value);
        return hm;

    }
    
    public boolean valuesCompare( String actualValue, String compareValue) {
        
        boolean result = false;
        if (actualValue.equals(compareValue)) {

            System.out.println("Values are matching :: " + actualValue);
            result = true;
        } else {
            System.out.println("ActualValue"+actualValue);
            System.out.println("CompareValue"+compareValue);
            System.out.println("Values are not  matching  :: " + actualValue);
            result = false;
        }
        return result;

    }
    
//    
//    public JSONObject getFile(String fileName) {
//         HashMap<String, String> hmap = new HashMap<String, String>();
//   		return null;
//    	
//    }

}
