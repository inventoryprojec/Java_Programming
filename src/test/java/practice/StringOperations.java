package practice;

import org.testng.annotations.Test;

/*
 *@Author # Md Molla
 *@Course# Oracle Java Programming 
 *@Date # Jan 25,2024 
 */
public class StringOperations {
	@Test
	public void stringManupulation() {

		String str1 = "Hello";
		String str2 = "md";
		String str3;// uninitialized string variable
		// create a new string by concatenation
		str3 = "you are " + str2;
		// Display a welcome message to the console
		System.out.println("Welcome : " + str3);
		// Display the length of the String

		System.out.println("The length of the str3 is :" + str3.length());
		// Display a subString of
		System.out.println("subString of str3 is :" + str3.substring(0, 1));
		/*
		 * "Hamburger".substring(2,8)returns "urge"
		 */
		// Display a string upper case
		System.out.println(str3.toUpperCase());
	}// end the test method
}// end StringOperation Class
