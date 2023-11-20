package ubb.vvta.steps;

import net.serenitybdd.annotations.Step;
import org.junit.jupiter.api.Assertions;
import ubb.vvta.pages.*;

public class SearchSteps {
    private MainPage mainPage;
    private ResultsPage resultsPage;

    @Step
    public void searchItem(String itemName) {
        this.mainPage.setSearchField(itemName);
    }

    @Step
    public void clickSearchButton() {
        this.mainPage.setSearchButton();
    }

    @Step
    public String getSearchedItem(String itemName) {
       return this.resultsPage.getTextFromSearchResults()
               .stream()
               .filter(result -> result.toLowerCase().contains(itemName.toLowerCase()))
               .findFirst()
               .orElse("Not Found");
    }

    @Step
    public void clickOnFirstBook(String itemName) {
        this.resultsPage.getParentSearchResult(itemName).click();
    }

    @Step
    public void checkIfTheItemExists(String itemName) {
        Assertions.assertTrue(getSearchedItem(itemName).toLowerCase().contains(itemName.toLowerCase()));
    }
}
