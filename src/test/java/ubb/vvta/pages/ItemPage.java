package ubb.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ItemPage extends PageObject {

    @FindBy(xpath = "//h1[@class=\"product-title\"]")
    private WebElementFacade productTitle;
    @FindBy(xpath = "//button[@name=\"addProduct\"]")
    private WebElementFacade addProductButton;
    @FindBy(xpath = "//a[@class=\" btn btn-primary btn-lg btn-block\"]")
    private WebElementFacade cartButton;

    public String getTextFromProductTitle() {
        return this.productTitle.getText();
    }

    public void addProductToCart() {
        this.addProductButton.click();
    }

    public void gotToCart() {
        this.cartButton.click();
    }
}
