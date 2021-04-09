package File_Operations;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter_Sample {

	public static void main(String[] args) throws IOException {
		//Using FileWriter
		
			String location="FileWriter.txt";
			String content="Hai. How are You";
			FileWriter filewriter=new FileWriter(location);
			filewriter.write(content);
			filewriter.close();         
			
			//Using BufferFile
			
			String location1="BufferWriter.txt";
			String content1="Welcome to buffered page";
			FileWriter filewriter1=new FileWriter(location1);
			BufferedWriter bufferwriter=new BufferedWriter(filewriter1);
			bufferwriter.write(content1);
			bufferwriter.close();           
			
			//Using FileOutputstream
			
			String location2="FileOutputStream.txt";
			String content2="Welcome to FileOutputStream Page";
			FileOutputStream fos=new FileOutputStream(location2);
			byte[] value=content2.getBytes();
			fos.write(value);
			fos.close();   
			
			
			//Using Path
			String location3="Path4.txt";
			String content3="Welcome to Path Page";
			Path path=Paths.get(location3);
			Files.write(path, content3.getBytes());
			
			
			

		}


	}


