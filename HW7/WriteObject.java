package HW7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			File file = new File("C:\\data\\Object.ser");
			//if there is no file, create the file
			if(!file.exists()) {
				//if the folder doesn't exist, create it
				//1.Get the parent path and create the folder
				File dir = new File(file.getParent());
				if(!dir.exists()) {
					dir.mkdirs();	
				}
				//2.create the file
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			Cat cat = new Cat("Amy");
			Dog dog = new Dog("Black");
			
			oos.writeObject(cat);
			oos.writeObject(dog);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//close the ObjectOutputStream
			try {
				if(oos != null) {
					oos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			//close the FileOutputStream
			try {
				if(fos != null) {
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}


		}
		
		
	
		
		
	}

}
