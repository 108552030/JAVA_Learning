package xxx;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"aaa", ""};
		StringBuilder prifix = new StringBuilder("");
        
		int minLength = 0;
        for(int i = 1; i < strs.length; i++){
            if(minLength > strs[i].length()){
                minLength = strs[i].length();
            }
        }
        if(minLength == 0) {
        	System.out.println("");
        }
        
        System.out.println(minLength);
        
        back:
        for(int i = 0; i < minLength; i++){
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    break back;
                }
            }	
            prifix.append(strs[0].charAt(i));
        }
        System.out.println(prifix);
    }
}
