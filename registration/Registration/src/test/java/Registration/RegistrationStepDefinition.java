package Registration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBean.RegistrationBean;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegistrationStepDefinition {

	private WebDriver driver;
	private RegistrationBean bean;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\bdd\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^user is on 'WorkingWithForms' page$")
	public void user_is_on_WorkingWithForms_page() throws Throwable {
		driver.get("D:\\New folder\\Registration\\WorkingWithForms.html");
		bean= new RegistrationBean(driver);
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
	   bean.setUsername("");
	   bean.setButton();
	}

	@Then("^displays 'Please fill the username'$")
	public void displays_Please_fill_the_username() throws Throwable {
		String expectedMessage="Please fill the User Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("");
		bean.setButton();
		
	   
	}

	@Then("^displays 'Please fill the password'$")
	public void displays_Please_fill_the_password() throws Throwable {
		String expectedMessage="Please fill the Password";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	@When("^user enters invalid confirm password$")
	public void user_enters_invalid_confirm_password() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("");
		bean.setButton();
	}

	@Then("^displays 'Please fill the password again'$")
	public void displays_Please_fill_the_password_again() throws Throwable {
		String expectedMessage="Please enter password";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid First Name$")
	public void user_enters_invalid_First_Name() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("");
		bean.setButton();
		
	}

	@Then("^display 'Please fill the First Name'$")
	public void display_Please_fill_the_First_Name() throws Throwable {
		String expectedMessage="Please fill the FirstName";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Last Name$")
	public void user_enters_invalid_Last_Name() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("");
		bean.setButton();
	}

	@Then("^display 'Please fill Last Name'$")
	public void display_Please_fill_Last_Name() throws Throwable {
		String expectedMessage="Please fill the LastName";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doen't select$")
	public void user_doen_t_select() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("");
		bean.setButton();
	}

	@Then("^display 'Please enter valid gender'$")
	public void display_Please_enter_valid_gender() throws Throwable {
		String expectedMessage="Please select gender";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Date of Birth$")
	public void user_enters_invalid_Date_of_Birth() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("");
		bean.setButton();
	}

	@Then("^display 'Correct DOB'$")
	public void display_Correct_DOB() throws Throwable {
		String expectedMessage="Please enter DOB";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enter valid Email$")
	public void user_does_not_enter_valid_Email() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("25/01/1998");
		bean.setEmail("");
		bean.setButton();
	}

	@Then("^display 'Please Enter valid Email'$")
	public void display_Please_Enter_valid_Email() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid City$")
	public void user_enters_invalid_City() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("25/01/1998");
		bean.setEmail("jamy@gamil.com");
		bean.setCity("");
		bean.setButton();
	}

	@Then("^display 'Please fill City'$")
	public void display_Please_fill_City() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Address$")
	public void user_enters_invalid_Address() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("25/01/1998");
		bean.setEmail("jamy@gamil.com");
		bean.setCity("Torronto");
		bean.setAddress("");
		bean.setButton();
	}

	@Then("^display 'Please fill the Address'$")
	public void display_Please_fill_the_Address() throws Throwable {
		String expectedMessage="Please fill the Address.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Phone number$")
	public void user_enters_invalid_Phone_number() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("25/01/1998");
		bean.setEmail("jamy@gamil.com");
		bean.setCity("Torronto");
		bean.setAddress("Ontario park");
		bean.setPhone("");
	}

	@Then("^displays 'Please fill the valid Phone Number'$")
	public void displays_Please_fill_the_valid_Phone_Number() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters nothing$")
	public void user_enters_nothing() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("25/01/1998");
		bean.setEmail("jamy@gamil.com");
		bean.setCity("Torronto");
		bean.setAddress("Ontario park");
		bean.setPhone("9876543210");
		bean.setHobbies("");
	}

	@Then("^displays 'Please fill the hobbies'$")
	public void displays_Please_fill_the_hobbies() throws Throwable {
		String expectedMessage="Please select hobbies";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters valid  registration details$")
	public void user_enters_valid_registration_details() throws Throwable {
		bean.setUsername("James");
		bean.setPassword("Robert");
		bean.setConfirmPassword("Robert");
		bean.setFirstname("Jamy");
		bean.setLastname("Bolt");
		bean.setGender("Male");
		bean.setDob("25/01/1998");
		bean.setEmail("jamy@gamil.com");
		bean.setCity("Torronto");
		bean.setAddress("Ontario park");
		bean.setPhone("9876543210");
		bean.setHobbies("sleeping");
		bean.setButton();
	}

	@Then("^displays 'Registration Completed!!!'$")
	public void displays_Registration_Completed() throws Throwable {
		driver.navigate().to("D:\\\\New folder\\\\Registration\\\\Success.html");
		driver.close();
	}

}
