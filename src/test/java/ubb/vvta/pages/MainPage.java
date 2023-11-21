package ubb.vvta.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

@DefaultUrl("https://www.elefant.ro/")
public class MainPage extends PageObject {

    @FindBy(xpath = "//span[@class=\"login-prompt js-login-prompt\"]")
    private WebElementFacade logInButton;
    @FindBy(xpath = "//a[@class=\"my-account-login btn btn-primary btn-block\"]")
    private WebElementFacade connectButton;
    @FindBy(xpath = "//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")
    private WebElementFacade acceptCookies;
    @FindBy(xpath = "//input[@name=\"SearchTerm\"]")
    private WebElementFacade searchField;
    @FindBy(xpath = "//button[@title=\"Începe căutarea\"]")
    private WebElementFacade searchButton;
    @FindBy(xpath = "//a[@class=\"my-account-logout btn btn-default btn-block\"]")
    private WebElementFacade logoutButton;
    @FindBy(xpath = "//a[@class=\"my-account-link hidden-xs\"]")
    private WebElementFacade userButton;

    @FindBy(xpath = "//a[@class=\"wishlist-count wishlist-link\"]")
    private WebElementFacade wishListButton;
    @FindBy(xpath = "//button[@data-testing-class=\"button-addToWishlistProduct\"]")
    private WebElementFacade addToWishListButton;
    @FindBy(xpath = "//button[@name=\"AddWishlistItem\"]")
    private WebElementFacade confirmAddToWishList;

    public void goToLoginPage() {
        this.logInButton.click();
        this.connectButton.click();
    }

    public void setAcceptCookies() {
        if (acceptCookies.isClickable()) {
            acceptCookies.click();
        }

    }

    public void setSearchField(String searchField) {
        this.searchField.sendKeys(searchField);
    }

    public void setSearchButton() {
        this.searchButton.click();
    }

    public void setLogoutButton() {
        this.userButton.click();
        this.logoutButton.click();
    }

    public String getTextFromLoginButton() {
        this.logInButton.click();
        return this.connectButton.getText();
    }

    public void setWishListButton() {
        this.wishListButton.find(By.xpath("./child::*")).click();
//        this.wishListButton.click();
    }

    public void setAddToWishListButton() {
        this.addToWishListButton.click();
    }

    public void setConfirmAddToWishList() {
        this.confirmAddToWishList.click();
    }


}
