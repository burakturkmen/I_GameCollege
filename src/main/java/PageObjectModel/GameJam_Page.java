package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GameJam_Page extends Abstract{

    WebDriver driver;
    public GameJam_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Life in College butonunun üstüne gelme
    @FindBy(xpath = "(//a[text()='Life in College'])[2]")
    private WebElement lifeInCollegeButton;

    public void overHoverLifeInCollegeButton(){
        actionsMethod(lifeInCollegeButton);
    }

    //GameJam buttonuna tıklama
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[12]")
    private WebElement gameJam_button;

    public void clickToGameJam(){
        clickFunction(gameJam_button);
    }

    //GameJam sayfasındaki GameJams yazısını doğrula
    @FindBy(xpath = "//span[contains(text(),'GameJams')]")
    private WebElement GameJams_text;

    public void verify_gameJam_text(){
        Assertion(GameJams_text, "GameJams");
    }

    //url doğrulama
    public void urlAssert(){
        URLAssertion("https://igamecollege.com/life-in-college/gamejams/");
    }
}
