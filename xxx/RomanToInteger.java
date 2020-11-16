package xxx;

public class RomanToInteger {
	public static void main(String[] args) {
		String s = "IV";
		int answer = 0;
	    for(int i = 0; i < s.length(); i++){
	        switch(s.charAt(i)){
	            case 'I':
	                if(i != (s.length() - 1)){
	                    if(s.charAt(i + 1) == 'V'){
	                        answer += 4;
	                        i++;
	                    }else if(s.charAt(i + 1) == 'X'){
	                        answer += 9;
	                        i++;
	                    }else{
	                        answer += 1;
	                    }
	                }else{
	                    answer += 1;
	                }
	                break;
	            case 'V':
	                answer += 5;
	                break;
	            case 'X':
	                if(i != (s.length() - 1)){
	                    if(s.charAt(i + 1) == 'L'){
	                        answer += 40;
	                        i++;
	                    }else if(s.charAt(i + 1) == 'C'){
	                        answer += 90;
	                        i++;
	                    }else{
	                        answer += 10;
	                    }
	                }else{
	                    answer += 10;
	                }   
	                break;
	            case 'L':
	                answer += 50;
	                break;
	            case 'C':
	                if(i != (s.length() - 1)){
	                    if(s.charAt(i + 1) == 'D'){
	                        answer += 400;
	                        i++;
	                    }else if(s.charAt(i + 1) == 'M'){
	                        answer += 9000;
	                        i++;
	                    }else{
	                        answer += 100;
	                    }
	                }else{
	                    answer += 100;
	                }     
	                break;
	            case 'D':
	                answer += 500;   
	                break;
	            case 'M':
	                answer += 1000;
	                break;
	            default:
	            	break;
	        }             
	    }
	    System.out.println(answer);
	}
}
