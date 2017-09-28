package Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_tests {
 
	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This is before Suite");
	  }
 
	  
	  @BeforeTest 
	  public void beforeTest() {
		  System.out.println("	This is before test (class 1)");
	  }
	  
 



  @BeforeClass
  public void beforeClass() {
	  System.out.println("			This is before class (class 1)");
  }




  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("				This is before method (class 1)");
  }
  
  @Test
  public void Test1() {
	  System.out.println("					This is Test 1 (class 1)");
  }
  
  @Test
  public void Test2() {
	
	 
	  Assert.assertEquals("Hello", "Hello", "Strings dont match");
	  
  }
  
  @Test(groups= {"p1","Pageloads"})
  public void Test3() {
	  System.out.println("					This is Test 3 (class 1)");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("				This is after method (class 1)");
  }
  


  @AfterClass 
  public void afterClass() {
	  System.out.println("			This is after class (class 1)");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("		This is after test (class 1)");
  }


  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after Suite");
  }

}

