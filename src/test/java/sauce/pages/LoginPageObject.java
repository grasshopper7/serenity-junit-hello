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

	public void navigateToLogin() {
		open();
	}

	@WhenPageOpens
	public void checkLoginButtonIsVisible() {
		loginButton.waitUntilVisible();
	}
}
