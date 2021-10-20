package sauce.steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import sauce.pages.InventoryPageObject;

public class InventorySteps {

	private String actor;

	private InventoryPageObject inventoryPageObject;

	@Step("'#actor' should see products displayed")
	public void verifyProductsDisplayed() {
		assertThat(inventoryPageObject.getProductPageHeadingText()).isEqualTo("PRODUCTS");
	}

	@Step("#actor selects product named '{0}'")
	public void attemptToDisplayProductDetails(String productName) {
		inventoryPageObject.selectProductByName(productName);
	}

	@Step("#actor adds product named '{0} to cart")
	public void attemptToAddProductToCart(String productName) {
		inventoryPageObject.addProductToCart(productName);
	}
}
