package ubb.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {
    @FindBy(xpath = "//a[@class=\"product-desc\"]")
    private WebElementFacade productDescription;

    public String getProductDescriptionText() {
       return this.productDescription.getText();
    }
}
