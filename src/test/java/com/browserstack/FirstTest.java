package com.browserstack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class FirstTest extends AppiumTest {

    @Test
    public void test1() throws Exception {
    	
	WebElement overflowElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
    	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView")));
	overflowElement.click();
	
	WebElement loginElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")));
	loginElement.click();
	
	WebElement usernameElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")));
    usernameElement.sendKeys("SilverScar25");
    
    WebElement passwordElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")));
    passwordElement.sendKeys("Aditya@098");
    
    WebElement loginButtonElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")));
	loginButtonElement.click();
	
	WebElement searchElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
          ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Search Wikipedia")));
	Assert.assertTrue(searchElement.isDisplayed());
	searchElement.click();
	
      WebElement insertTextElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
          ExpectedConditions.elementToBeClickable(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")));
      insertTextElement.sendKeys("BrowserStack");
      Thread.sleep(5000);

      List<WebElement> allProductsName = driver.findElements(AppiumBy.className("android.widget.TextView"));
      Assert.assertTrue(allProductsName.size() > 0);
      
      WebElement backButtonElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageButton")));
	backButtonElement.click();
	
	overflowElement.click();
      
      WebElement logoutButtonElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
	          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[3]")));
	logoutButtonElement.click();
	
	System.out.println("Logged Out");
      
      
    }
    
    
    @Test
    public void test2() throws Exception {
    	
		WebElement overflowElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
			          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView")));
		overflowElement.click();
		
		WebElement loginElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")));
		loginElement.click();
		
		WebElement usernameElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")));
		usernameElement.sendKeys("SilverScar25");
		
		WebElement passwordElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")));
		passwordElement.sendKeys("Aditya@099");
		
		WebElement loginButtonElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
		          ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")));
		loginButtonElement.click();
		
		List<WebElement> searchElement = driver.findElements(AppiumBy.accessibilityId("Search Wikipedia"));
	      Assert.assertFalse(searchElement.size() > 0);
	      
	    System.out.println("Unable to Log In");
			
    }
    
    
}
