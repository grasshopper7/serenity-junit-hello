package sauce.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class InventoryPageObject extends PageObject {

	public String getProductPageHeadingText() {
		return $(By.xpath("//div[@id='header_container']//span[@class='title']")).getTextValue();
	}
}
