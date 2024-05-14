package org.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        driver.manage().window().maximize();

        WebElement courseButton = driver.findElement(By.cssSelector(".site-nav-btn[data-dropdown-trigger=\"coursesMenu\"]"));
        courseButton.click();
        Thread.sleep(2000);

        WebElement programingButton = driver.findElement(By.cssSelector(".cats-list_btn[data-category=\"programming\"]"));
        programingButton.click();

        WebElement frontEndBasicLink = driver.findElement(By.cssSelector("li.course-list_item a.course-label[href*=\"front-end-basic\"]"));
        Thread.sleep(2000);
        frontEndBasicLink.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2100)");
        Thread.sleep(2000);

        WebElement coachesShowAllButton = driver.findElement(By.id("coachesShowAllButton"));
        coachesShowAllButton.click();
        Thread.sleep(1000);


        WebElement coachList = driver.findElement(By.className("coaches_list"));
        for (WebElement coach : coachList.findElements(By.className("coach-card_name"))) {
            String fullName = coach.getText();
            String[] parts = fullName.split(" ");
            System.out.println(parts[0]);
        }

        driver.quit();
    }
}