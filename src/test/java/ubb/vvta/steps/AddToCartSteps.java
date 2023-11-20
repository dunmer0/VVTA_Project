package ubb.vvta.steps;

import net.serenitybdd.annotations.Step;
import org.junit.jupiter.api.Assertions;
import ubb.vvta.pages.CartPage;
import ubb.vvta.pages.ItemPage;

public class AddToCartSteps {
    private ItemPage itemPage;
    private CartPage cartPage;

    @Step
    public void addItemToCard() {
        this.itemPage.addProductToCart();
    }

    @Step
    public void goToCart() {
        this.itemPage.gotToCart();
    }

    @Step
    public void checkIfProductIsPresentInCart(String itemName) {
        Assertions.assertTrue(this.cartPage.getProductDescriptionText().toLowerCase().contains(itemName.toLowerCase()));
    }
}
