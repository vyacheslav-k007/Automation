package lesson17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public abstract void openPage();

    protected void openPage(String link){
        driver.get(link);
    }

    protected WebDriver getDriver(){
        return driver;
    }

}
