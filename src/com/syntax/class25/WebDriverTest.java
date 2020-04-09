package com.syntax.class25;

public class WebDriverTest {
	public static void main(String[] args) {
		FirefoxDriver s1=new FirefoxDriver();
		s1.closeBrowser();
		s1.openBrowser();
		s1.findElment();
		FirefoxDriver s2=new FirefoxDriver();
		s2.clean();
		//WebDriver s2=new WebDriver(); can not instantiate
	
	}

}
