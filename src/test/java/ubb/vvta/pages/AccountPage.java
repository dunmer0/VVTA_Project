package ubb.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {
    @FindBy(xpath = "//a[@rel=\"home\"]")
    private WebElementFacade homeButton;
    @FindBy(xpath = "/html/body/div[2]/div/div[9]/div/div[3]/h1")
    private WebElementFacade accountSettingTitle;
    public void goToHomePage() {
        this.homeButton.click();
    }

    public String getTitleText() {
       return this.accountSettingTitle.getText();
    }
}
