package File_Operations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json_filewriter {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONObject obj=new JSONObject();
		   obj.put("Name", "Chandhu");
		   obj.put("Age",23);
		   JSONArray array=new JSONArray();
		   array.add("Sweet");
		   array.add("Lovable");
		   obj.put("Qualities", array);
		   FileWriter fw=new FileWriter("aaa.json");
		   fw.write(obj.toJSONString());
		   fw.close();
		




	}

}
