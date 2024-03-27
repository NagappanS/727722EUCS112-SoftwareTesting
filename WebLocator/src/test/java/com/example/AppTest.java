package com.example;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void works() throws Exception
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(10000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        Thread.sleep(9000);
        String a=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
        System.out.println(a);
        Thread.sleep(8000);
        String b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[3]")).getText();
        System.out.print(b);
        driver.quit();


    }
}
