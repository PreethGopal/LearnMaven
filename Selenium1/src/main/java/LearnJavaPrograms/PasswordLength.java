package LearnJavaPrograms;

import java.util.Scanner;

public class PasswordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	     System.out.print(
	                "1. A password must have at least ten characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits and two  letters.\n" +
	                "4. A password must contain at least one upper case letter.\n" +
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
		String s = scan.nextLine();
		
		if(is_Password_Valid(s)) {
			System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }
			
		}

			
			public static boolean is_Password_Valid(String password) {
				
				
				int Password_Length =0;
				if(password.length()<Password_Length)return false;
				int numCount =0;
				int charCount =0;
				for(int i=0; i<password.length(); i++) {
					
					
					char ch = password.charAt(i);
					
					if(is_Numeric(ch)) numCount++;
					else if (is_Letter(ch)) charCount++;
					else return false;
					
				}
					return (charCount>=2 && numCount>=2);
				
			}
			
				public static boolean is_Letter(char ch) {
					ch=Character.toUpperCase(ch);
					
					return (ch >='A' && ch <='Z');
					
				}
					public static boolean is_Numeric(char ch) {
						return (ch >='0' && ch<='9');
					}
			}



				
		



