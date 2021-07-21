package SemiStructuredDataExercise;
import org.json.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSON {

    public static void main(String[] args) {
        String jsonString = null ; //assign your JSON String here

        try{
           byte[] allData =  Files.readAllBytes(Paths.get("Data/data.json"));
            jsonString = new String(allData);
        }catch (Exception e){
            e.printStackTrace();
        }
        JSONObject obj = new JSONObject(jsonString);
        JSONObject company = obj.getJSONObject("company");



        JSONArray arr = company.getJSONArray("login"); // notice that `"posts": [...]`
        for (int i = 0; i < arr.length(); i++)
        {
            String username = arr.getJSONObject(i).getString("username");
            System.out.println("Username: "+ username);
            String password = arr.getJSONObject(i).getString("password");
            System.out.println("Password: "+password);

            String message = arr.getJSONObject(i).getString("message");
            System.out.println("Message: "+ message);

            int id = arr.getJSONObject(i).getInt( "id");
            System.out.println("Id: "+ id);
            System.out.println("--------------------------");







        }
    }
}
