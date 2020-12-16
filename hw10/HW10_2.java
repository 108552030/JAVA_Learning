package hw10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HW10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Format dfm1 = null;
		//use BigDecimal to avoid float number has tail of .0000001,something like that.
		BigDecimal bd = null;
		
		while(true) {
			System.out.println("請輸入數字:");
			if(sc.hasNext()) {
				String str = sc.next();
				//if not match , all block , no matter what kind of input
				if(str.matches("^\\d*.?\\d*$")) {
					bd = new BigDecimal(str);
					break;
				}else {
					System.out.println("數字格式不正確，請再輸入一次!");
					//avoid buffered has the /n stuck in
					sc.nextLine();
				}
			}
		}
		
		loop:
		while(true) {
			System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
			if(sc.hasNext()){
				String str = sc.next();
				//use Regular expression to avoid illegal input
				if(str.matches("^[1-3]$")) {
					int choice = Integer.parseInt(str);
					switch(choice){
						case 1:
							dfm1 = new DecimalFormat("###,###.##");
							System.out.println("千分位標記: " + dfm1.format(bd) );
							break loop;
						case 2:
							dfm1 = new DecimalFormat("##%");
							System.out.println("百分比標記: " + dfm1.format(bd));
							break loop;
						case 3:
							dfm1 = new DecimalFormat("#.#E00");
							System.out.println("科學記號標記: " + dfm1.format(bd));
							break loop;
						default:
							System.out.println("數字格式不正確，請再輸入一次!");
							break;
					}		
				}else {
					System.out.println("數字格式不正確，請再輸入一次!");
					//ensure the input buffer be clear
					sc.nextLine();
				}
			}

		}
		
		
		
		
		
		sc.close();
	}

}
