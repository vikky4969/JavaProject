package com.javaproject.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li/descendant::div[@class='wM6W7d']"));
		System.out.println(list.size());
		for (WebElement x : list) {
			String text=x.getText();
			System.out.println(text);
			if(x.getText().equals("testing jobs chennai")) {
				x.click();
				break;
			}
		}
	}

}
