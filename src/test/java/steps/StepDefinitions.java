package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
WebDriver driver;

@After
public void teardown()
{
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.quit();
	
}
@Given("user starts {string} browser")
public void user_starts_browser(String browserName) {
    
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
}

@Given("user launch app using url {string}")
public void user_launch_app_using_url(String url) {
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
}

@When("user enters text {string} in textbox using xpath {string}")
public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
    
	driver.findElement(By.xpath(xpath)).sendKeys(text);
}

@When("user clicks button using xpath {string}")
public void user_clicks_button_using_xpath(String xpath) {
    
	driver.findElement(By.xpath(xpath)).click();
}

@Then("user validates title to be {string}")
public void user_validates_title_to_be(String expTitle) {
   Assert.assertEquals(expTitle, driver.getTitle());
}


@When("user click link using xpath {string}")
public void user_click_link_using_xpath(String xpath) {
    
	driver.findElement(By.xpath(xpath)).click();
}


@When("user enters details in Registration Form")
public void user_enters_details_in_registration_form(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	List<Map<String, String>> listOfMaps=dataTable.asMaps();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(listOfMaps.get(0).get("username"));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(listOfMaps.get(0).get("password"));
	driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(listOfMaps.get(0).get("confirm password"));
	driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(listOfMaps.get(0).get("full name"));
	driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(listOfMaps.get(0).get("email address"));
	driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(listOfMaps.get(0).get("captcha"));
    
}




}
