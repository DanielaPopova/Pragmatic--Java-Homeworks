package pragmatic.java.october.homework5.problem1;

public class DemoProblem1 {
	
	public static void main(String[] args) {
		
		AbstractUser user = new UserImpl();
		
		user.getName("sasho");
		user.logIn();
		System.out.println(user.getTimeOfReg());
		 
		AdminUserImpl adminUser = new AdminUserImpl();
		
		adminUser.getName("pesho");
		adminUser.logIn();
		System.out.println(adminUser.getTimeOfReg());
		adminUser.addUser("gosho");
		adminUser.deleteUser("sasho");
	}
}
