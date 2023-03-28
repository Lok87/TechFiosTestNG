package testAddCatagory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdd {
	@Test
	public void testAddCategory() {
	    // Open the web page using a web driver
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://techfios.com/test/107/");
	    
	    // Find the category input field and enter the category name
	    WebElement categoryInput = driver.findElement(By.id("category"));
	    categoryInput.sendKeys("New Category");
	    
	    // Click the submit button to add the category
	    WebElement submitButton = driver.findElement(By.id("submit"));
	    submitButton.click();
	    
	    // Verify that the category is displayed on the page
	    WebElement categoryElement = driver.findElement(By.xpath("//ul[@id='category-list']/li[last()]"));
	    Assert.assertEquals(categoryElement.getText(), "New Category");
	    
	    // Close the web driver
	    driver.quit();
	}
}
