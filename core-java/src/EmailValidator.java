
public class EmailValidator {

	// 1= Min 4 chars before @
	// 2= Min 3 chars between @ and .
	// 3= Min 2 chars after .
	// 4= Only 1 occurence of @ and . is allowed
	// Note. No regular expressions allowed
	public static void main(String[] args) {
		
		String email = "zubair@gmail.com";
		int iat = email.indexOf('@');
		int idot = email.indexOf('.');
		
//		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') &&
	//			 iat >= 4 && (idot - iat) >= 3 && (email.length() - idot) >=2)
		//	System.out.println("VALID EMAIL");
		//else
			//System.out.println("INVALID EMAIL");
		System.out.println(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') &&iat >= 4 && (idot - iat) >= 3 && 
				(email.length() - idot) >=2?"VALID":"INVALID");
	}

}
