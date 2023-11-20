package ubb.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//a[@class=\"product-title\"]")
    private List<WebElementFacade> searchResults;

    public List<String> getTextFromSearchResults() {
        List<String> stringResults;
        return stringResults = searchResults.stream()
                .map(searchResults -> searchResults.getText())
                .collect(Collectors.toList());
    }
}
