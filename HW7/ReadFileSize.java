package HW7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("C:\\CEA102_Workspace\\javaTest\\src\\HW7\\Sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str;	
			int charCounter = 0;
			int lineCounter = 0;
			
			while((str = br.readLine())!= null) {
				lineCounter++;
				charCounter += str.length();
			}
			
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料", file.length(), charCounter, lineCounter );
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
