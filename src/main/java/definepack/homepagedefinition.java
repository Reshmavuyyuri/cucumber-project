package definepack;//package stepDefinitions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assert;


public class homepagedefinition {


    @Given("Go to Login page")
    public void Go_to_Login_page() {
        // Initialize WebDriver and open the login page
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://yourwebsite.com/login");
        System.out.println("1");
    }

    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_forgot_password_link(String linkText) {
//        // Click on the "Forgot Password" link
//        WebElement forgotPasswordLink = driver.findElement(By.linkText(linkText));
//        forgotPasswordLink.click();
        System.out.println("1");
    }

    @Then("the user should be redirected to the Forgot Password page")
    public void the_user_should_be_redirected_to_the_forgot_password_page() {
//        // Verify the URL of the Forgot Password page
//        String expectedUrl = "https://yourwebsite.com/forgot-password";
//        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
//
//        // Close the browser
//        driver.quit();
        System.out.println("1");
    }

    @When("click on forgot link")
    public void clickOnForgotLink() {
        System.out.println("my page");
    }
}