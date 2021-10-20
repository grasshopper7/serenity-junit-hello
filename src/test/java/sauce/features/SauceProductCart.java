package sauce.features;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import sauce.steps.CartSteps;
import sauce.steps.InventorySteps;
import sauce.steps.LoginSteps;
import sauce.steps.ProductDetailsSteps;

@RunWith(SerenityRunner.class)
public class SauceProductCart {

	@Managed
	private WebDriver driver;

	@Steps(actor = "John Doe")
	private LoginSteps loginSteps;

	@Steps(actor = "John Doe")
	private InventorySteps inventorySteps;
	
	@Steps(actor = "John Doe")
	private ProductDetailsSteps productDetailsSteps;

	@Steps(actor = "John Doe")
	private CartSteps cartSteps;

	@Before
	public void openSauceSite() {
		loginSteps.navigateToWebApp();
		loginSteps.attemptToLoginSuccessfully("standard_user", "secret_sauce");
	}

	@Test
	@Title("Add to Cart from All Products Page")
	public void shouldAddToCartFromAllProductsSuccesfully() {
		String productName = "Sauce Labs Backpack";
		inventorySteps.attemptToAddProductToCart(productName);
		cartSteps.verifyProductCountInCartIcon(1);
		cartSteps.attemptToDisplayCartDetails();
		cartSteps.verifyProductAvailableInCart(productName);
	}

	@Test
	@Title("Add to Cart from Product Details Page")
	public void shouldAddToCartFromProductDetailSuccesfully() {
		String productName = "Sauce Labs Bike Light";
		inventorySteps.attemptToDisplayProductDetails(productName);
		productDetailsSteps.attemptToAddProductToCart(productName);
		cartSteps.verifyProductCountInCartIcon(1);
		cartSteps.attemptToDisplayCartDetails();
		cartSteps.verifyProductAvailableInCart(productName);
	}

}
