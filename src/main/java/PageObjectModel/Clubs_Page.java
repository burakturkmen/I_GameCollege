package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Clubs_Page extends Abstract{

    WebDriver driver;
    public Clubs_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    //Life in College butonunun üstüne gelme
    @FindBy(xpath = "(//a[text()='Life in College'])[2]")
    private WebElement lifeInCollegeButton;

    public void overHoverLifeInCollegeButton(){
        actionsMethod(lifeInCollegeButton);
    }

    //Clubs butonuna tıkla
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[14]")
    private WebElement clubsButton;

    public void clickToClubsButton(){
        clickFunction(clubsButton);
    }

    //Clubs yazısını doğrula
     @FindBy(xpath = "//span[contains(text(),'Clubs')]")
    private WebElement clubsText;

    public void verifyClubsText(){
        Assertion(clubsText, "Clubs");
    }

    //Url doğrulama
    public void urlAssertClubs(){
        URLAssertion("https://igamecollege.com/life-in-college/clubs/");
    }

    //Social Media Club buttonuna tıkla
    @FindBy(xpath = "(//a[@class='wh-content-box-link'])[16]")
    private WebElement socialMediaClubButton;

    public void clickToSocialMediaClub(){
        clickFunction(socialMediaClubButton);
    }

    //Social Media Club yazısını doğrula
    @FindBy(xpath = "//h1[contains(text(),'SOCİAL MEDİA CLUBS')]")
    private WebElement socialMediaClubText;

    public void verifySocialMediaClubText(){
        Assertion(socialMediaClubText, "SOCİAL MEDİA CLUBS");
    }

    //Game Art Club buttonuna tıkla
    @FindBy(xpath = "(//nav[@class='site-nav children-links clearfix'])[2]//li[2]")
    private WebElement gameArtClubButton;

    public void clickGameArtClub(){
        clickFunction(gameArtClubButton);
    }

    //Game Art Club yazısını doğrula
    @FindBy(xpath = "//h1[contains(text(),'GAME ART CLUB')]")
    private WebElement gameArtClubText;

    public void verifyGameArtClub(){
        Assertion(gameArtClubText, "GAME ART CLUB");
    }

    //Game marketing Club'a tıkla
    @FindBy(xpath = "(//nav[@class='site-nav children-links clearfix'])[2]//li[3]")
    private WebElement gameMarketingClubButton;

    public void clickGameMarketingClub(){
        clickFunction(gameMarketingClubButton);
    }

    //Game Marketing Club sayfasındaki Game Marketing Club yazısını doğrula
    @FindBy(xpath = "//h1[contains(text(),'GAME MARKETING CLUB')]")
    private WebElement gameMarketingClubText;

    public void verifyGameMarketingClub(){
        Assertion(gameMarketingClubText, "GAME MARKETING CLUB");
    }
    //Game College Magazine Club'a tıkla
    @FindBy(xpath = "(//nav[@class='site-nav children-links clearfix'])[2]//li[4]")
    private WebElement gameCollegeMagazineClubButton;

    public void clickToGameCollegeMagazineClub(){
        clickFunction(gameCollegeMagazineClubButton);
    }
    //Game College Magazine Club sayfasındaki Game College Magazine Club yazısını doğrula
    @FindBy(xpath = "//h1[contains(text(),'GAME COLLEGE MAGAZINE CLUB')]")
    private WebElement gameCollegeMagazineText;

    public void verifyGameCollegeMagazineClub(){
        Assertion(gameCollegeMagazineText,"GAME COLLEGE MAGAZINE CLUB");
    }
    //Game Networking Club'a tıkla
    @FindBy(xpath = "(//nav[@class='site-nav children-links clearfix'])[2]//li[5]")
    private WebElement gameNetworkingClubButton;

    public void clickToGameNetworkingClub(){
        clickFunction(gameNetworkingClubButton);
    }
    //Game Networking Club sayfasındaki Game Networking Club yazısını doğrula
    @FindBy(xpath = "//h1[contains(text(),'GAME NETWORKING CLUB')]")
    private WebElement gameNetworkingClubText;

    public void verifyGameNetworkingClub(){
        Assertion(gameNetworkingClubText,"GAME NETWORKING CLUB");
    }

}
