
public class RegExDemo {
	public static void main(String[] args) {
		
		String name = "Zubair";
		String mobile = "9654321980";
		String email = "zubair@gmail.com";
		
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		String mobileRegex = "[6-9]{1}[0-9]{9}";
		String emailRegex = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$\r\n";
		
		System.out.println(name.matches(nameRegex)?"VALID NAME":"INVALID NAME");
		System.out.println(mobile.matches(mobileRegex)?"VALID NUMBER":"INVALID NUMBER");
		System.out.println(email.matches(emailRegex)?"VALID EMAIL":"INVALID EMAIL");
	}

}
