import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        System.setProperty("wedbDriver.chrome.driver","C:\\Users\\KATHIKA QA\\Downloads\\chromedriver_win32\\chromedriver.exe\\");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement search= driver.findElement(By.id("APjFqb"));
        search.sendKeys("https://www.amazon.in/");
        search.sendKeys(Keys.ENTER);
        WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        signin.click();
        WebElement newsign = driver.findElement(By.xpath("//span[text()='Sign in']") )   ;
        newsign.click();
        WebElement email = driver.findElement(By.name("emailLogin"));
        email.sendKeys("nkarthikaprabhakaran@gmail.com");
    }
}