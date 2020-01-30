import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver


import org.openqa.selenium.chrome.ChromeDriver
System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");

def browser = new Browser(driver : new FirefoxDriver())

browser.go("http://udemy.com")
