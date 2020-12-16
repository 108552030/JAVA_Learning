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
	
	public void copyFile(String inputFile, String outputFile){
		input = new File(inputFile);
		output = new File(outputFile);
		FileInputStream  fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//input file stream create
			fis = new FileInputStream(input);
			bis = new BufferedInputStream(fis);
			
			//output file stream create
			fos = new FileOutputStream(output);
			bos = new BufferedOutputStream(fos);
			
			while(bis.available() > 0) {
				char c = (char)bis.read();
				bos.write(c);
				//System.out.println((char)c);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {	
			if(bos != null) {
				try {
					bos.close();
				}catch(IOException e) {
					e.printStackTrace();	
				}
			}
			if(fos != null) {
				try {
					fos.close();
				}catch(IOException e) {
					e.printStackTrace();	
				}
			}
			if(bis != null) {
				try {
					bis.close();
				}catch(IOException e) {
					e.printStackTrace();	
				}
			}
			if(fis != null) {
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();	
				}
			}
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyFile cf = new CopyFile();
		cf.copyFile("C:\\CEA102_Workspace\\javaTest\\src\\HW7\\Data.txt",
						"C:\\CEA102_Workspace\\javaTest\\src\\HW7\\Data_copy.txt");
	}
	
	

}
