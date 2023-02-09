package tests;

import model.User;

public class UserTest {
	
	public static void main(String[] args) {
		
		// To test this we will declare a new object of type User
		// with values that we can test our object with
		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
		
		System.out.println(testUser);
		
	}
}
