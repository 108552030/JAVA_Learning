package HW7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RandomFileOutput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			File file = new File("C:\\CEA102_Workspace\\javaTest\\src\\HW7\\Data.txt");
			//create a outputChan to enable the append value to true
			FileWriter wr = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(wr);
			Integer randomNum = 0;
			for(int i = 0; i < 10; i++) {
				randomNum = (int)(Math.random() * 999) + 1;
				wr.write(randomNum.toString() + " ");
				System.out.print(randomNum + " ");
			}
			wr.write("\n");
			
			bw.close();
			wr.close();	
	}

}
