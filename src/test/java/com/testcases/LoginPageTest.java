/*package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;


public class LoginPageTest {
	LoginPage lp = new LoginPage();
	@BeforeMethod
	public void setup() {
	lp.setup();
	}
	@Test
	public void validateTitleTest() {
	String expectedTitle = "OrangeHRM";
	String actualTitle = lp.validateTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(enabled = false)
	public void validateLoginTest() {
	}
	@AfterMethod
	public void teardown() {
	lp.teardown();
	}

}
*/

/*
package com.testcases;
 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.base.TestBase;
import com.pages.LoginPage;
 
public class LoginPageTest extends TestBase {
    LoginPage lp ;
    @BeforeMethod
    public void setup() {
    initialization();
    lp = new LoginPage();
    }
    @Test
    public void validateTitleTest() {
    String expectedTitle = "OrangeHRM";
    String actualTitle = lp.validateTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test()
    public void validateLoginTest() {
    //Read the username and password from property file
    //Call the validatelogin method
        String user = prop.getProperty("username");
        String pass = prop.getProperty("password");
        lp.validateLogin(user, pass);
    }
    @AfterMethod
    public void closesetup() {
    teardown();
    }
}


/*
package com.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.TestBase;
import com.pages.DashBoardPages;
import com.pages.LoginPage;
public class LoginPageTest extends TestBase {
LoginPage lp;
DashBoardPages dp;
@BeforeMethod
public void setup() {
initialization();
lp = new LoginPage();
}
@BeforeTest
public void Reportsetup() {
ExtentReportSetup();
}
@Test(enabled = false)
public void validateTitleTest() {
ExtentTest test = extent.createTest("OrangeHRMTitleTestCase");
String expectedTitle = "OrangeHRM";
String actualTitle = lp.validateTitle();
Assert.assertEquals(actualTitle, expectedTitle);
test.log(Status.PASS, "ValidateTitleTestCasePassed");
}
@Test(enabled = false)
public void validateLoginTest() {
String Username = prop.getProperty("username");
String Password = prop.getProperty("password");
dp = lp.validateLogin(Username, Password);
if(dp != null) {
Assert.assertTrue(true);
} else {
Assert.assertTrue(false);
}
}
@Test(enabled = false)
@Parameters({"uname" , "pass"})
public void validateLoginTestUsingParameters(String uname, String pass) {
ExtentTest test = extent.createTest("OrangeHRMLoginTestCase");
dp = lp.validateLogin(uname,pass);
test.log(Status.PASS, "ValidateLoginTestCasePassed");
} @Test(dataProvider = "getData")
public void validateLoginUsingTestNGDataProvider(String uname, String pwd) {
//lp.validateLogin(uname, pwd);
System.out.println(uname);
System.out.println(pwd);
}
@DataProvider
public Object[][] getData() {
// Row Indicates how many times we want to execute the testcases
// Column indicates how many values we want to pass the testcases
Object[][] data = new Object[2][2];
data[0][0] = "Admin";
data[0][1] = "admin123";
data[1][0] = "Tom";
data[1][1] = "pass";
return data;
}
@AfterTest
public void GenerateReport() {
CloseReportSetup();
}
@AfterMethod
public void closesetup() {
teardown();
}
}

*/

package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.TestBase;
import com.pages.DashBoardPages;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage lp;
	DashBoardPages dp;
	
	@BeforeMethod
	public void setup() {
		initialization();
		lp = new LoginPage();
	}
	
	@BeforeTest
	public void Reportsetup() {
		ExtentReportSetup();
	}
	
	@Test(enabled = false)
	public void validateTitleTest() {
		String expectedTitle = "OrangeHRM";
		String actualTitle = lp.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(enabled = false)
	public void validateLoginTest() {
		String Username = prop.getProperty("username");
		String Password = prop.getProperty("password");
		dp = lp.validateLogin(Username, Password);
		if(dp != null) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	@Parameters({"uname" , "pass"})
	public void validateLoginTestUsingParameters(String uname, String pass) {
		ExtentTest test = extent.createTest("OrangeHRMLoginTestCase");
		dp = lp.validateLogin(uname,pass);
		test.log(Status.PASS, "ValidateLoginTestCasePassed");
	}
	
	@AfterTest
	public void GenerateReport() {
		CloseReportSetup();
	}
	
	@AfterMethod
	public void closesetup() {	
		teardown();
	}	
}























