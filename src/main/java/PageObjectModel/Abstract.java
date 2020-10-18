package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Driver;
import java.util.List;
import java.util.Random;

public class Abstract {

    private WebDriver driver = Driver.getDriver();


    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();



    }


    public void actionsMethod(WebElement targetElement){

        Actions actions= new Actions(driver);

        actions.moveToElement(targetElement).perform();

    }

    public void Assertion(WebElement actual,String expected){


        Assert.assertEquals(actual.getText(),expected);

        System.out.println("Tested Text =  " + actual.getText());
    }

    public void URLAssertion(String expectedUrl){


        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
        System.out.println("Tested URL  " + driver.getCurrentUrl());

    }
}
