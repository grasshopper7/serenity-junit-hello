package sauce.steps;

import net.thucydides.core.annotations.Step;
import sauce.pages.InventoryPageObject;

import static org.assertj.core.api.Assertions.assertThat;

public class InventorySteps {

	private String actor;

	private InventoryPageObject inventoryPageObject;

	@Step("'#actor' should see products displayed")
	public void verifyProductsDisplayed() {
		assertThat(inventoryPageObject.getProductPageHeadingText()).isEqualTo("PRODUCTS");
	}
}
