package definepack;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepagedefinition {


    @Given("Go to Login page")
    public void Go_to_Login_page() {
        System.out.println("1");
    }

    @When("click on forgot link")
    public void click_on_forgot_link(String linkText) {
        System.out.println("1");
    }

    @Then("Go to Forgot Login page")
    public void the_user_should_be_redirected_to_the_forgot_password_page() {
        System.out.println("1");
    }
}