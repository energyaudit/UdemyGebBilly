

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver

//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
System.setProperty("webdriver.gecko.driver", "../../resources/geckodriver.exe");
def browser=new Browser(driver:new FirefoxDriver())

browser.go("http://www.51.ca")
browser.go("https://sandbox-beta.airmiles.ca/")
//class SampleTest extends Specification {
//
//
//    def "this is my business need" () {
//        when:
//        Map map = new HashMap();
//
//        then:
//        map.size() == 0
//    }
//}

