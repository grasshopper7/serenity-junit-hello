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
import sauce.steps.ProductDetailsSteps;

@RunWith(SerenityRunner.class)
public class SauceViewProduct {

	@Managed
	private WebDriver driver;

	@Steps(actor = "John Doe")
	private LoginSteps loginSteps;

	@Steps(actor = "John Doe")
	private InventorySteps inventorySteps;

	@Steps(actor = "John Doe")
	private ProductDetailsSteps productSteps;

	@Before
	public void openSauceSite() {
		loginSteps.navigateToWebApp();
		loginSteps.attemptToLoginSuccessfully("standard_user", "secret_sauce");
	}

	@Test
	@Title("View Product Details")
	public void shouldViewProductSuccesfully() {
		String productName = "Test.allTheThings() T-Shirt (Red)";
		String productPrice = "$15.99";

		inventorySteps.attemptToDisplayProductDetails(productName);
		productSteps.verifyProductDetails(productName, productPrice);
	}
}
