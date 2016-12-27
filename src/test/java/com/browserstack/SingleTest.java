package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    driver.get("https://www.massmutual.com/myaccount/rl/Login/login?type=Customer");
    WebElement element = driver.findElement(By.name("user-name"));
    element.sendKeys("abcdbrowserstack");
    driver.findElement(By.xpath("//div[@id='continue-button']/input")).click();
    //element.submit();
    Thread.sleep(5000);

    //assertEquals("BrowserStack - Google Search", driver.getTitle());
  }
}
