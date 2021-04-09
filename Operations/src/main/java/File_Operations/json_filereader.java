package File_Operations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json_filereader {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser=new JSONParser();
		FileReader reader=new FileReader("aaa.json");
		Object a=parser.parse(reader);
		JSONObject jsonobj=(JSONObject) a;
		String name=(String) jsonobj.get("Name");
		Long age=(Long) jsonobj.get("Age");
		JSONArray array=(JSONArray) jsonobj.get("Qualities");
		Iterator iterator=array.iterator();
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		while(iterator.hasNext())
		{
			System.out.println("Qualities" +iterator.next());
		}

}}
