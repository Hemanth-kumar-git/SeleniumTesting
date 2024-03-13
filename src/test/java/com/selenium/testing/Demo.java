package com.selenium.testing;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Demo {

	public static void main(String[] args) {
		String title;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		title=driver.getTitle();
		System.out.print(title);
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

		

	}

}
