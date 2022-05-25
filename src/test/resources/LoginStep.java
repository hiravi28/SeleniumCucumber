
public class LoginStep {

	@Given("user navigates to application")
	public void user_navigates_to_application() {
	    System.out.println("@Given -- User navigates to application");

	@When("User validates the home page title")
	public void user_validates_the_home_page_title() {
	    System.out.println("@When -- User validates Home page title");
	}

	@Then("user entered the username")
	public void user_entered_the_username() {
	    System.out.println("@Then -- User enter the username");
	}

	@Then("user entered the password")
	public void user_entered_the_password() {
	    System.out.println("@Then -- User enter the password");
	}

	@Then("user should be successfully loggedin")
	public void user_should_be_successfully_loggedin() {
	    System.out.println("@Then -- User shouldbe successfully logged in");
	}


}
