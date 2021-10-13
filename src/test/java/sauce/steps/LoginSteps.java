package sauce.steps;

import net.thucydides.core.annotations.Step;
import sauce.pages.LoginPageObject;

public class LoginSteps {

	private String actor;

	private LoginPageObject loginPageObject;

	@Step("'#actor' navigates to sauce demo site")
	public void navigateToWebApp() {
		loginPageObject.navigateToLogin();
	}
	
	@Step("'#actor' succesfully logs in with username '{0}' and password '{1}'")
	public void attemptToLoginSuccessfully(String username, String password) {
		loginPageObject.attemptToLoginWithCredentials(username, password);
	}
}
