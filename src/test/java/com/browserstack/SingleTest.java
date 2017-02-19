package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.cssSelector("#lst-ib")).click();
    driver.findElement(By.cssSelector("#lst-ib")).clear();
    driver.findElement(By.cssSelector("#lst-ib")).sendKeys("massmutual");
    driver.findElement(By.id("searchText")).clear();
    driver.findElement(By.id("searchText")).sendKeys("test");
    driver.findElement(By.id("searchSubmit")).click();
    driver.findElement(By.id("yui_3_10_0_1_1487463576596_198")).click();
    //driver.findElement(By.xpath("//div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div/input[1]")).click();
    //driver.findElement(By.xpath("//div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div/input[1]")).sendKeys("\n");
    Thread.sleep(5000);

  }
}
