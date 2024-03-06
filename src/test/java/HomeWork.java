import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setup(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){

        //by tag name

        WebElement el1 = wd.findElement(By.tagName("h1"));

        WebElement el2 = wd.findElement(By.cssSelector("form"));

        List<WebElement> list = wd.findElements(By.tagName("a"));

        int i = list.size();


        //by class

        WebElement el3 = wd.findElement(By.cssSelector(".container"));


        //by id

        WebElement el4 = wd.findElement(By.cssSelector("#root"));


        //by attribute

        WebElement input1 = wd.findElement(By.cssSelector("[name='email']"));

        WebElement input2 = wd.findElement(By.cssSelector("[placeholder='Password']"));

        WebElement button1 = wd.findElement(By.cssSelector("[name='login']"));


        //one of elements find by attribute===> start&end&contains value

        WebElement button2 = wd.findElement(By.cssSelector("[name='registration']"));

        //start

        WebElement button3 = wd.findElement(By.cssSelector("[name ^='reg']"));

        //end

        WebElement button4 = wd.findElement(By.cssSelector("[name $='ion']"));

        //contains

        WebElement button5 = wd.findElement(By.cssSelector("[name *='ist']"));
        

    }
}
