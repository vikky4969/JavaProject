package com.javaproject.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/?ref_=nav_ya_signin&"); 
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		List<String> urllist=new ArrayList<String>();
		for (WebElement e : links) {
			String url=	e.getAttribute("href");
			urllist.add(url);
		}
		urllist.parallelStream().forEach(e -> checkBrokenLink(e));
	}
public static void checkBrokenLink(String linkurl){

	try {
		URL	url = new URL(linkurl);
		HttpURLConnection httpurl= (HttpURLConnection) url.openConnection();
		httpurl.connect();
		if(httpurl.getResponseCode()>=400) {
			System.out.println(url+"----> "+httpurl.getResponseMessage());
		}
		else {
			System.out.println(url+"----> "+httpurl.getResponseMessage());
		}
	} catch (Exception e) {
		e.printStackTrace();
	}

	
}
}
