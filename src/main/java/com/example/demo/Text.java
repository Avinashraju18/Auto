package com.example.demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://signet-dev-team.s3.amazonaws.com/gold_band_p1s1/GBparent/index.html");
	//to find the element 
	WebElement web=driver.findElement(By.xpath("//textarea[@id='updatedConfig']"));
	web.clear();//to clear the value
	web.sendKeys("luck");// to send value 
	// to capture the default value (text from input box)
	System.out.println("value:"+web.getAttribute("value"));
	// to capture the inner text (eg: text on labels) we need  x-path for this 
	 //System.out.println(web.getText());
	
	/// drop down 
	//WebElement name=driver.findElement(By.id("Username"));
	///import Select
	// Select odd=new select(names);
	///to select particlure text 
	// odd.selectByVisibleText("india");
    /// select through index and value
	//odd.selectByValue("11");
	//odd.selectByIndex(0);
	
	///Slecting option from dropdown without using methods 
	//List<WebElement> Options=name.getoptions();
	//for(WebElement op:Options)
	//{
		//if(op.getText().equals("india");
	        //{
	        //op.click();
	        //break;}
	
	
	        
	
	
	
	} 
}
 
