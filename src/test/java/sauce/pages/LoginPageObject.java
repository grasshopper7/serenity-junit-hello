package sauce.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPageObject extends PageObject {

	@FindBy(id = "login-button")
	private WebElementFacade loginButton;

	@FindBy(id = "user-name")
	private WebElementFacade usernameInput;

	@FindBy(id = "password")
	private WebElementFacade passwordInput;

	public void navigateToLogin() {
		open();
	}

	@WhenPageOpens
	public void checkLoginButtonIsVisible() {
		loginButton.waitUntilVisible();
	}

	public void attemptToLoginWithCredentials(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		submitLogin();
	}

	public void enterUserName(String username) {
		usernameInput.type(username);
	}

	public void enterPassword(String password) {
		passwordInput.type(password);
	}

	public void submitLogin() {
		loginButton.submit();
	}
}
