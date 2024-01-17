package TestNGLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;

import org.testng.annotations.Test;

public class ThruTextFile {
	
			
		File fc;
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		BufferedWriter bw;
		String src="C:\\Users\\malay\\eclipse-workspace\\Selenium\\Sel@practice\\workspace\\Java_practice\\src\\data.txt";
		
		@Test
		public void ThruTxtFileData() throws IOException
		{
			fc=new File(src);
			fc.createNewFile();
			fw=new FileWriter(src);
			bw=new BufferedWriter(fw);
			bw.write("This is my first line");
			bw.newLine();
			bw.write("This is my second line");
			bw.close();
			fr=new FileReader(src);
			br=new BufferedReader(fr);
			String content=null;
			while ((content=br.readLine())!=null)
			{
				System.out.println(content);
			}
				br.close();
		
			
		
	}

}
