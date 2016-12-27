package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    driver.get("https://www.massmutual.com/myaccount/rl/Login/login?type=Customer");
    driver.findElement(By.id("user-name")).click();
    driver.findElement(By.id("user-name")).clear();
    driver.findElement(By.id("user-name")).sendKeys("abcd");
    driver.findElement(By.xpath("//div[@id='continue-button']/input")).click();
    Thread.sleep(5000);

  }
}
