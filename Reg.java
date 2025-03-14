package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Reg {

	WebDriver d;
	
	@Given("Valid page")
	public void valid_page() {
		// Write code here that turns the phrase above into concrete actions
		d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.get("https://advantageonlineshopping.com/#/register");
		
	}

	@When("Enter the username")
	public void enter_the_username() {
		d.findElement(By.name("usernameRegisterPage")).sendKeys("rishhabh78");
		d.findElement(By.name("emailRegisterPage")).sendKeys("rajrishabh34@gmail.com");
		System.out.println("Username Details filled");
	}

	@When("Enter Account Details")
	public void enter_account_details() {	
		d.findElement(By.name("passwordRegisterPage")).sendKeys("Hello@1234");
		d.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Hello@1234");	
		System.out.println("Account Details filled");
	}

	@When("Enter Personal Details")
	public void enter_personal_details() {
		
		d.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys("Rishabh");
		d.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys("Raj");
		d.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys("6200562947");	
		System.out.println("Personal Details filled");
	}

	@When("Enter Address")
	public void enter_address() throws Exception {
		
		WebElement drop = d.findElement(By.name("countryListboxRegisterPage"));
		Select select = new Select(drop);
		select.selectByValue("object:174");
		Thread.sleep(2000);
	
		d.findElement(By.name("cityRegisterPage")).sendKeys("Ranchi");		
		d.findElement(By.name("addressRegisterPage")).sendKeys("Near Railway Station");
		d.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Bihar");
		d.findElement(By.name("postal_codeRegisterPage")).sendKeys("825401");			
		System.out.println("Address Details filled");
	}

	@When("Click Checkboxs")
	public void click_checkboxs() throws InterruptedException{
		d.findElement(By.name("i_agree")).click();	
		System.out.println("Checkbox Ticked");
		Thread.sleep(3000);
	}

	@When("Cick on Register button")
	public void cick_on_register_button() {
		d.findElement(By.name("register_btn")).click();
		System.out.println("Button clicked");
	}

	@Then("Next Page Appears")
	public void next_page_appears() {
		System.out.println("Appeared on the next page");
	}

}
