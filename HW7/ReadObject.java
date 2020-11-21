package HW7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream  ois = new ObjectInputStream(fis);
			
			//test if it is the end of file
			while(fis.available() > 0){
				Object obj = ois.readObject();
				//confirm which the class is for casting
				if(obj instanceof Cat) {
					Cat cat = (Cat)obj;
					cat.speak();
				}else if (obj instanceof Dog) {
					Dog dog = (Dog)obj;
					dog.speak();
				}
			}
		
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
