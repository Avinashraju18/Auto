package com.example.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://health.aws.amazon.com/health/status");
		// we can use this method instead of get
//		driver.navigate().to("https://www.youtube.com/watch?v=tJNpTj14-Rg&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=5"); 
//		// to load the page back
//		driver.navigate().back();
//		// to load the page forward
//		driver.navigate().forward();
//		// to refresh the  page 
//		driver.navigate().refresh();
		
		
	//	to find element --  returns single web element
//		WebElement Search=driver.findElement(By.xpath("//input[@id='input10-1654504877244-3143']"));	
//		Search.sendKeys("OK");
		
		
		// to find elements --  returns multiple web elements 
//		List<WebElement> Links = driver.findElements(By.xpath("//input[@id='input10-1654504877244-3143']"));	
//        System.out.println("no of elements captured:"+Links.size());
//        for(WebElement ele:Links) {
//        	 System.out.println(ele.getText());
//        }
		
	
    
}

}
