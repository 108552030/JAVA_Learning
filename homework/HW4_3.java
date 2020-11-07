package homework;

public class HW4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated meth	od stub
		String[] strs = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		//{a, e, i, o, u} counter
		int [] vowelsCounter = new int[5];
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		//Compare each character in the string
		for(int i = 0; i < strs.length; i++ ) {
			for(int j = 0; j < strs[i].length(); j++) {
				switch(strs[i].charAt(j)) {
					case 'a':
					case 'A':
						vowelsCounter[0]++;
						break;
					case 'e':
					case 'E':
						vowelsCounter[1]++;
						break;
					case 'i':
					case 'I':
						vowelsCounter[2]++;
						break;
					case 'o':
					case 'O':
						vowelsCounter[3]++;
						break;
					case 'u':
					case 'U':
						vowelsCounter[4]++;
						break;
					default:
				}
			}
		}
		
		//formatted output
		for(int i = 0; i < vowelsCounter.length; i++) {
			System.out.println( vowels[i] + "：" + vowelsCounter[i]);
		}
	}

}
