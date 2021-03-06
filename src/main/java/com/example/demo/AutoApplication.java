package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class AutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoApplication.class, args);
		// edge browser
		//System.setProperty("webdriver.edge.driver","E:\\edgedriver_win64\\msedgedriver.exe");
		///EdgeDriver driver=new EdgeDriver();
		// to launch browser
		//WebDriver driver=new EdgeDriver();
		//toget url
		//driver.get("https://signet-dev-team.s3.amazonaws.com/gold_band_p1s1/GBparent/index.html");
		
		///using WebDriverManager ,we don't need to download driver(path)
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://health.aws.amazon.com/health/status");
		//to capture Title of the page
		System.out.println("Title of the page"+driver.getTitle());
		// to get current URL
		System.out.println("current URL"+driver.getCurrentUrl());
		//to get source code
		System.out.println("source"+driver.getPageSource());
		
//		//isDisplayed() isEnabled()
//		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		System.out.println("Display status:"+searchStore.isDisplayed()); //true
//		System.out.println("Enabled status:"+searchStore.isEnabled();
		
//		//isSelected() // used for drop downs,check boxes, radio button
//		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	//	WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
//		System.out.println(male.isSelected()); //False
	//	System.out.println(female.isSelected()); //False
		
//		male.click(); //selects male radio button
		
//		System.out.println(male.isSelected()); //True
		//System.out.println(female.isSelected()); //False
		
//		female.click(); //selects female radio button 
	//  System.out.println(male.isSelected()); //False
 //     System.out.println(female.isSelected()); //True||
//	
		
		
	}
}
 	