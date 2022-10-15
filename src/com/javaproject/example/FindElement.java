package com.javaproject.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("cricket"+Keys.ENTER);
		List<WebElement> cricketlist=driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
		System.out.println(cricketlist.size());
		System.out.println("updated");
		System.out.println("updated2");
		System.out.println("updated3");
		
		System.out.println("updated4");
		System.out.println("updated5");
	}

}
