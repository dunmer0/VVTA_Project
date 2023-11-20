package ubb.vvta.features;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ubb.vvta.steps.AddToCartSteps;
import ubb.vvta.steps.LoginSteps;
import ubb.vvta.steps.SearchSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class AddItemToCartFeature {

    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchSteps searchSteps;
    @Steps
    AddToCartSteps addToCartSteps;

    @Title("Check if the searched item is added to cart.")
    @Test
    public void addItemToCart() {
        this.loginSteps.startHomePage();
        this.loginSteps.acceptCookies();
        this.searchSteps.searchItem("Harry Potter");
        this.searchSteps.clickSearchButton();
        this.searchSteps.getSearchedItem("Harry");
        this.searchSteps.clickOnFirstBook("Harry");
        this.addToCartSteps.addItemToCard();
        this.addToCartSteps.goToCart();
        this.addToCartSteps.checkIfProductIsPresentInCart("harry");
    }
}
