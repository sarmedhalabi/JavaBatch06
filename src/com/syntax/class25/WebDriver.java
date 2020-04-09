package com.syntax.class25;

public interface WebDriver {
	void openBrowser();
	public abstract void closeBrowser();
	void findElment();}
class ChromeDriver implements WebDriver{
	public void openBrowser() {
		System.out.println("open browsder");
	}
	public void closeBrowser() {
		System.out.println("close borwder");
	}
	public void findElment() {
		System.out.println("find elment");
	}}
class FirefoxDriver implements WebDriver{
	public void openBrowser() {
		System.out.println("open browsder");
	}
	protected void clean() {
		System.out.println("clean");
	}
	public void closeBrowser() {
		System.out.println("close borwder");
	}
	public void findElment() {
		System.out.println("find elment");}}

	
	
	
	
	


