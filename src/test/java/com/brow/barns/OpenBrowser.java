package com.brow.barns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmost\\Desktop\\OSA0817201903A\\SeleniumServer\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.barnesandnoble.com");
	}

}
