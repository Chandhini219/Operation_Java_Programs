package File_Operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_Sample {


		public static void main(String[] args) throws IOException {
			
			String location="FileWriter.txt";
			
			FileReader fw=new FileReader(location);
			BufferedReader br=new BufferedReader(fw);
			String read;
			while((read=br.readLine())!=null)
			{
				System.out.println(read);
			}
			

		}

	}

	
