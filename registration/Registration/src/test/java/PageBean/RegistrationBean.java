package PageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationBean {
	
	WebDriver driver;
	
	@FindBy(name="txtUName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="txtPwd")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="txtConfPassword")
	@CacheLookup
	WebElement confirmPassword;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(name="gender")
	@CacheLookup
	WebElement gender;
	
	@FindBy(name="DtOB")
	@CacheLookup
	WebElement dob;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="City")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement phone;
	 
	@FindBy(name="chkHobbies")
	@CacheLookup
	WebElement hobbies;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement button;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender.sendKeys(gender);
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob.sendKeys(dob);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies.sendKeys(hobbies);
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton() {
		this.button.click();
	}

	public RegistrationBean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	

	
	
	
	
	
	

}
