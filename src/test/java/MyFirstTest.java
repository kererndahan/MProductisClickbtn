import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class MyFirstTest {
        private static WebDriver driver;

        @BeforeClass
        public static void bc() throws MalformedURLException {
            System.setProperty("webdriver.chrome.driver", "C:\\AutomationMaterials\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://maven.apache.org/");
        }

        @Test
        public void test01_login(){
            driver.findElement(By.linkText("What is Maven?")).click();
        }



        @AfterClass
        public static void ac(){
            driver.quit();
        }

    }

