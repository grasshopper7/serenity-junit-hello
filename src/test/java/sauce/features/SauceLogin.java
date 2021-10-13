package sauce.features;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import sauce.steps.InventorySteps;
import sauce.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class SauceLogin {

	@Managed
	private WebDriver driver;

	@Steps(actor = "John Doe")
	private LoginSteps loginSteps;

	@Steps(actor = "John Doe")
	private InventorySteps inventorySteps;

	@Before
	public void navigateToLoginPage() {
		loginSteps.navigateToWebApp();
	}

	@Test
	@Title("Successful Login Test")
	public void shouldLoginSuccesfully() {
		loginSteps.attemptToLoginSuccessfully("standard_user", "secret_sauce");
		inventorySteps.verifyProductsDisplayed();
	}
}
