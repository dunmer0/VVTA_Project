package ubb.vvta.features;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import ubb.vvta.steps.LoginSteps;
import ubb.vvta.steps.SearchSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchItemFeature {
    @Managed(uniqueSession = true)
    WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchSteps searchSteps;

    @Title("Check if searched item is found.")
    @Test
    @Order(4)
    public void checkIfSearchedItemIsFound() {
        loginSteps.startHomePage();
        loginSteps.acceptCookies();
        searchSteps.searchItem("Harry Potter");
        searchSteps.clickSearchButton();
        searchSteps.getSearchedItem("harry");
        searchSteps.checkIfTheItemExists("harry");
    }
}
