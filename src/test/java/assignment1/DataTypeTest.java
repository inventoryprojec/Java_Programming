package assignment1;

import org.testng.annotations.Test;

/*@Descreption: * This class, DataTypeTest, contains a TestNG test method named upDateData.
 * The purpose of this test is to demonstrate the initialization and display of
 * variables of different data types in Java. This test serves as a basic example showcasing the
 * initialization and output of variables in Java 
 *
 *@ Author # Md Molla
 *@Course# Oracle Java Programming 
 *@Date # Jan 25,2024 
 */
public class DataTypeTest {

	@Test
	public void upDateData() {

		int iNum = 25;
		char cVal = 'B';
		boolean bVal = true;

		// Display all the value sin the console

		System.out.println(iNum);
		System.out.println(cVal);
		System.out.println(bVal);

	}
}
