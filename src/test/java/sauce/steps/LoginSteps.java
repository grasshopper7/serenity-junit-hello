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
}
