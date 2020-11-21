package HW7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	File input;
	File output;
	
	public  void copyFile(String inputFile, String outputFile) throws IOException{
		input = new File(inputFile);
		output = new File(outputFile);
		
		FileInputStream  fis = new FileInputStream(input);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(output);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int c;
		while(	(c = bis.read()) != -1) {
			bos.write(c);
			System.out.println((char)c);
		}
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyFile cf = new CopyFile();
		try {
			cf.copyFile("C:\\CEA102_Workspace\\javaTest\\src\\HW7\\Data.txt",
						"C:\\CEA102_Workspace\\javaTest\\src\\HW7\\Data_copy.txt");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
