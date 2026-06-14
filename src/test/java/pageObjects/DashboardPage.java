package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "transferBtnAutoHealed")
    WebElement btnTransferMoney;

    // Alternative locator
    // @FindBy(xpath = "//button[@data-testid='transfer-btn']")
    // WebElement btnTransferMoney;

    public void clickTransferMoney() {
        btnTransferMoney.click();
    }

    public boolean isTransferMoneyButtonDisplayed() {
        return btnTransferMoney.isDisplayed();
    }
}