package com.example.demo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://signet-dev-team.s3.amazonaws.com/gold_band_p1s1/GBparent/index.html");
		// for wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to maximize the window (we can min tooo)
		driver.manage().window().maximize();
		driver.findElement(By.id(""));
		
	}
	public static void Choice(WebDriver driver ,String... value ) {
		List<WebElement> ch= driver.findElements(By.xpath("//input[@id='input10-1654774793221-3590']"));
//		//for(WebElement Listt:ch){    /// storing all elemnts in present in ch in listt
//		
//		if(listt.getText().contains("hey") // checking the text is present or not
//		{
//			Listt.click();
//	        break();
//		}
//	 	listt.sendkeys(keys.Arrow_Down);  ///to click on arrow buttons
//		
//		
//		
//		
	}

}
