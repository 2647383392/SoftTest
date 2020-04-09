package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JJuTest {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\RuanJianCeShi\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jju.edu.cn/");
        System.out.println("Home page title:"+ driver.getTitle());

        WebElement element = driver.findElement(By.name("INTEXT"));
        element.sendKeys("教务处");
        element.submit();
    }
}