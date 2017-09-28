package Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Methd_lib {
 

	  
	 /* @BeforeTest //Before Test is a precondition which executes initiailly
	  public void beforeTest() {
		  System.out.println("	This is before test (class 2)");
	  }
	  */
 

  @BeforeClass
  public void beforeClass() {
	  System.out.println("			This is before class (class 2)");
  }




  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("				This is before method (class 2)");
  }
  
  @Test
  public void Test1() {
	  System.out.println("					This is Test 1 (class 2)");
  }
  
  @Test
  public void Test2() {
	  System.out.println("					This is Test 2 (class 2)");
  }
  
  @Test
  public void Test3() {
	  System.out.println("					This is Test 3 (class 2)");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("				This is after method (class 2)");
  }
  


  @AfterClass 
  public void afterClass() {
	  System.out.println("			This is after class (class 2)");
  }
  
 /* @AfterTest
  public void afterTest() {
	  System.out.println("		This is after test (class 2)");
  }
*/

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after Suite (class 2)");
  }

}

