package pragmatic.java.october.homework5.problem1;

public class AdminUserImpl extends AbstractUser implements AdminUser{
	
	public void logIn(){
		System.out.println("You have been logged in as Administrator");
	}
	
	public void addUser(String name){
		System.out.println(name + " has been added");
	}
	
	public void deleteUser(String name){
		System.out.println( name + " has been deleted");
	}	
}
