package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Random;
//import org.json.JSONObject;

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
    
//    public static JSONObject readFile(String filename) {
//        String result = "";
//        
//        try {
//              BufferedReader br = new BufferedReader(new FileReader(filename));
//              StringBuilder sb = new StringBuilder();
//              String line = br.readLine();
//              while (line != null) {
//                  sb.append(line);
//                  line = br.readLine();
//              }
//              result = sb.toString();
//              br.close();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//               
//        JSONObject json = new JSONObject(readFile(result));
//        return json;
//      }
//    
    
    
    
//    
//    public JSONObject getFile(String fileName) {
//         HashMap<String, String> hmap = new HashMap<String, String>();
//   		return null;
//    	
//    }

}
