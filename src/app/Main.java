import java.io.*;
import java.util.*;


/*
download and import json jar
download and import json simple jar
 */

// https://jar-download.com/artifacts/org.glassfish/javax.json/1.0.4/source-code
// https://stackoverflow.com/questions/47022653/provider-org-glassfish-json-jsonproviderimpl-not-found-at-javax-json-spi-jsonpro

//import org.json.*;
//import org.json.simple.*;

//import org.json.simple.JSONObject;
//import org.json.simple.parser.*;




public class Main {

    public static void main(String[] args) throws Exception {


        recipe one = new recipe();
        System.out.println(one.s);


        System.out.println("\n\n"+"Jason Part: "+"\n");
        
        //one.readjson();


    }
}



class recipe  {


    public String s =
            "\nPublic variable Hello, World! ";


    public recipe() throws Exception {


        /*     Read recipes and print     */

        File rec = new File("recipes.txt");
        BufferedReader br = new BufferedReader(new FileReader(rec));
        String str;

        List<String> listLines = new ArrayList<String>();

        while ((str = br.readLine()) != null ) {
            listLines.add(str);
        }
        String firsts = listLines.get(0)+"\n"+listLines.get(1); System.out.println(firsts);
        // mid.forEach((String value) -> System.out.print(value+" "));
    }



    /*
    //@SuppressWarnings("unchecked")

    public static void readjson() throws Exception {

        // parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("src/rec.json"));

        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        // getting firstName and lastName
        String firstName = (String) jo.get("firstName");

        System.out.println("The first name is: "+ firstName);


        // getting address
        Map address = ((Map)jo.get("ingredients"));

        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }


    }

    */
    //@Override
    public String toString()
    {
        return "recipe read";
    }



}
