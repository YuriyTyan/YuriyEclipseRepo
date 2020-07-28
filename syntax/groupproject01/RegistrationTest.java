package syntax.groupproject01;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
	Registration obj = new Registration();
	obj.setEmail("1234@yahoo.com");
	System.out.println(obj.getEmail());
	obj.setEmail("1234@gmail.com");
	System.out.println(obj.getEmail());
	obj.setEmail("1234@aol.com");
	System.out.println(obj.getEmail());
	}
}
