package HW7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\data\\Object.ser");
			//if there is no file, create the file
			if(!file.exists()) {
				//if the folder doesn't exist, create it
				File dir = new File(file.getParent());
				if(!dir.exists()) {
					dir.mkdirs();	
				}
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Cat cat = new Cat("Amy");
			Dog dog = new Dog("Black");
			
			oos.writeObject(cat);
			oos.writeObject(dog);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	
		
		
	}

}
