package lesson17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        OnlineTestingCourses onlineTestingCourses = new OnlineTestingCourses(driver);
        onlineTestingCourses.openPage();
        driver.manage().window().maximize();
        Thread.sleep(1000);

        System.out.println("List of courses:");
        onlineTestingCourses.getCourses();
        System.out.println();

        System.out.println("List of additional courses:");
        onlineTestingCourses.getAdditionalCourses();
        System.out.println();

        onlineTestingCourses.getOpportunities();
        System.out.println();

        onlineTestingCourses.goToCategory("Marketing");
        Thread.sleep(3000);






        driver.quit();
    }


}