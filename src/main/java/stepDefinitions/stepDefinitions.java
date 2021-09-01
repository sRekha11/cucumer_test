package stepDefinitions;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.LocalDate;
import java.time.Month;
import static org.junit.Assert.*;


public class stepDefinitions {

    String driverPath = "src/drivers/geckodriver";
    public static WebDriver driver = null;

@io.cucumber.java.en.Given("^Open the app url$")
public void open_the_app_url() throws Throwable {
    System.setProperty("webdriver.gecko.driver",driverPath);
    driver= new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://americas.datasite.com");
    System.out.println("App url launched");
    }

@When("the user clicks on Forgot Password link")
public void the_user_clicks_on_Forgot_Password_link() throws Throwable {
    driver.findElement(By.xpath("//a[text()='FORGOT PASSWORD?']")).click();
    System.out.println("Forgot Password Link is clicked");
    }

    @And("the user clicks on the Submit Button")
    public void theUserClicksOnTheSubmitButton() {
        driver.findElement(By.xpath("//button[text()='SUBMIT']")).click();
        System.out.println("Submit button is clicked");
    }

    @Then("the error message {string} should be displayed")
    public void theErrorMessageShouldBeDisplayed(String arg0) {
        System.out.println("inside3");
        String locator = driver.findElement(By.xpath("//*[contains(text(),'Email address required')]")).getText();
        assertEquals(locator, "Error: Email address required");
    }

    @And("the user is on the Forgot Password page")
    public void theUserIsOnTheForgotPasswordPage() {
        driver.findElement(By.xpath("//a[text()='FORGOT PASSWORD?']")).click();
        System.out.println("Forgot Password Link is clicked");
    }

    @When("the user enters {string} on the text box")
    public void theUserEntersOnTheTextBox(String arg0) {
        driver.findElement(By.xpath("//input[@id='newEmail']")).sendKeys(arg0);
    }

    @Then("the invalid error message {string} should be displayed")
    public void the_invalid_error_message_should_be_displayed(String string) {
        String locator = driver.findElement(By.xpath("//*[contains(text(),'Invalid email address')]")).getText();
        assertEquals(locator, "Error: Invalid email address");
    }

    @When("the user clicks the LogIn button")
    public void the_user_clicks_the_log_in_button() {
        driver.findElement(By.xpath("//a[text()='LOG IN']")).click();
    }

    @When("the user enters username {string} on the username text box")
    public void theUserEntersUsernameOnTheUsernameTextBox(String arg0) {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(arg0);
    }

    @When("the user enters password {string} on the password text box")
    public void theUserEntersPasswordOnThePasswordTextBox(String arg0) {
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(arg0);
    }

    @Then("the invalid credentials error message {string} should be displayed")
    public void the_invalid_credentials_error_message_should_be_displayed(String string) throws InterruptedException {
        System.out.println("Invalid Error Message displayed ");
        Thread.sleep(5000);
        String locator = driver.findElement(By.xpath("//*[contains(text(),'recognize the username')]")).getText();
        assertEquals(locator,string);
    }

    @When("the Listener clicks on Terms of Use link at the bottom of the page")
    public void theListenerClicksOnTermsOfUseLinkAtTheBottomOfThePage() {
        System.out.println("Terms of Use link clicked");
        driver.findElement(By.xpath("//a[contains(@class,'link') and text()='TERMS OF USE']")).click();
    }

    @Then("verify the terms of use page url")
    public void verifyTheTermsOfUsePageUrl()  throws InterruptedException {
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        assertEquals(url,"https://www.datasite.com/us/en/legal/terms-of-use.html");
        System.out.println("Page URL validated");
    }


    @Given("the user is on the Terms of Use page")
    public void the_user_is_on_the_terms_of_use_page() throws InterruptedException{
        driver.findElement(By.xpath("//a[contains(@class,'link') and text()='TERMS OF USE']")).click();
        Thread.sleep(2000);
        WebElement locator = driver.findElement(By.xpath("//h1[text()='Terms of Use']"));
        assertEquals(true, locator.isDisplayed());
    }

    @Then("today's date should be displayed next to the Effective as of field.")
    public void today_s_date_should_be_displayed_next_to_the_effective_as_of_field() {
        String locator = driver.findElement(By.xpath("//p[contains(text(),'Effective as of')]")).getText();
        String[] value = locator.split("\\s+");
        String day = value[4];
        String result = day.replaceAll("[-+.^:,]","");
        LocalDate currentdate = LocalDate.now();
        int currentDay = currentdate.getDayOfMonth();
        int expectedDay = Integer.parseInt(result);
        System.out.println("Current day: "+currentDay);
        System.out.println("expectedDay: "+expectedDay);
        Assert.assertEquals(currentDay,expectedDay);

        int currentYear = currentdate.getYear();
        System.out.println("Current Year: "+currentYear);
        String year = value[5];
        int expectedYear = Integer.parseInt(year);
        System.out.println("Year: "+currentYear);
        System.out.println("expectedYera: "+expectedYear);
        Assert.assertEquals(currentYear,expectedYear);


        //Getting the current month
        Month currentMonth = currentdate.getMonth();
        System.out.println("Current month: "+currentMonth);
        System.out.println("Expected month: "+value[3]);
        Assert.assertEquals(currentMonth,value[3]);
    }

    @When("the Listener clicks on the Language drop on top right corner.")
    public void the_listener_clicks_on_the_language_drop_on_top_right_corner() {
        driver.findElement(By.xpath("//a[contains(@class,'dropdown')]")).click();
    }

    @Then("the dropdown values should be displayed")
    public void the_dropdown_values_should_be_displayed() {
        WebElement locator = driver.findElement(By.xpath("//a[@title='Français']"));
        assertEquals(true, locator.isDisplayed());
        locator = driver.findElement(By.xpath("//a[@title='Deutsch']"));
        assertEquals(true, locator.isDisplayed());
        locator = driver.findElement(By.xpath("//a[@title='中文']"));
        assertEquals(true, locator.isDisplayed());
        locator = driver.findElement(By.xpath("//a[@title='日本語']"));
        assertEquals(true, locator.isDisplayed());
        locator = driver.findElement(By.xpath("//a[@title='Español']"));
        assertEquals(true, locator.isDisplayed());
        locator = driver.findElement(By.xpath("//a[@title='Italiano']"));
        assertEquals(true, locator.isDisplayed());
    }
    @After
    public void af()
    {
        driver.quit();
    }
}