package lesson17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnlineTestingCourses extends BasePage {

    private static final String link = "https://ithillel.ua/courses/testing";
    private static final String Additional_Courses_Block_XPath = "(//div[@class='block-profession_group'])[3]";
    private static final String Profession_Group_Block_XPath = "(//div[@class='block-profession_group'])";
    private static final String Profession_Title_Block_Css = "profession-bar_title";
    private static final String Opportunities_Block_XPath = "(//ul[@class='opportunities_list'])";
    private static final String Opportunity_title_Css = "opportunity-item_title";
    private static final String Programming_button_Css = ".categories_link.btn[href*=\"programming\"]";
    private static final String Management_button_Css = ".categories_link.btn[href*=\"management\"]";
    private static final String Business_button_Css = ".categories_link.btn[href*=\"business-training\"]";
    private static final String Marketing_button_Css = ".categories_link.btn[href*=\"marketing\"]";
    private static final String Design_button_Css = ".categories_link.btn[href*=\"design\"]";
    private static final String Kids_button_Css = ".categories_link.btn[href*=\"kids\"]";
    private static final String Kids_7_11_button_Css = ".categories_link.btn[href*=\"kids-7-11\"]";

    @FindBy(xpath = Additional_Courses_Block_XPath)
    private WebElement additionalCoursesBlock;

    @FindBy(xpath = Profession_Group_Block_XPath)
    private List<WebElement> professionGroupBlocks;

    @FindBy(xpath = Opportunities_Block_XPath)
    private WebElement opportunitiesBlock;

    public OnlineTestingCourses(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        super.openPage(link)
        ;
    }

    @Override
    protected WebDriver getDriver() {
        return super.getDriver();
    }

    public void getAdditionalCourses() {
        WebElement coursesList = additionalCoursesBlock;
        for (WebElement course : coursesList.findElements(By.className(Profession_Title_Block_Css))) {
            String courses = course.getText();
            System.out.println(courses);
        }
    }

    public void getCourses() {
        for (WebElement block : professionGroupBlocks) {
            List<WebElement> coursesList = block.findElements(By.className(Profession_Title_Block_Css));
            for (WebElement course : coursesList) {
                String courseName = course.getText();
                System.out.println(courseName);
            }
        }
    }

    public void getOpportunities() {
        WebElement opportunitiesList = opportunitiesBlock;
        for (WebElement opportunity : opportunitiesList.findElements(By.className(Opportunity_title_Css))) {
            String opportunities = opportunity.getText();
            System.out.println(opportunities);
        }
    }

    public void goToCategory(String category) {
        WebElement element = null;
        switch (category) {
            case "Programming":
                element = driver.findElement(By.cssSelector(Programming_button_Css));
                break;
            case "Management":
                element = driver.findElement(By.cssSelector(Management_button_Css));
                break;
            case "Business":
                element = driver.findElement(By.cssSelector(Business_button_Css));
                break;
            case "Marketing":
                element = driver.findElement(By.cssSelector(Marketing_button_Css));
                break;
            case "Design":
                element = driver.findElement(By.cssSelector(Design_button_Css));
                break;
            case "Kids":
                element = driver.findElement(By.cssSelector(Kids_button_Css));
                break;
            case "Kids 7-11":
                element = driver.findElement(By.cssSelector(Kids_7_11_button_Css));
                break;
            default:
                System.out.println("Wrong category");
                return;
        }
        if (element != null) {
            element.click();
        }
    }
}