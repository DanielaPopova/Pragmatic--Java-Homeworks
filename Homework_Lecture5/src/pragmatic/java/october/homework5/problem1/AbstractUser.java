package pragmatic.java.october.homework5.problem1;

import java.util.Date;

public abstract class AbstractUser implements User{
	
	public void getName(String name) {
		System.out.println(name);
	}
	
	public Date getTimeOfReg(){
		Date timeOfReg = new Date();
		return timeOfReg;
	}
	
	public abstract void logIn();	
	
}
