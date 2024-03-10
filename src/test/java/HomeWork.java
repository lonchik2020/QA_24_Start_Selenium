import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

//*[@id='root'] ====>search by xpath


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

        WebElement button6 = wd.findElement(By.xpath("//button"));


        //by class

        WebElement el3 = wd.findElement(By.className("container"));

        WebElement el4 = wd.findElement(By.cssSelector(".container"));



        //by id

        WebElement el5 = wd.findElement(By.id("root"));

        WebElement el6 = wd.findElement(By.cssSelector("#root"));



        //by attribute

        WebElement input1 = wd.findElement(By.name("email"));

        WebElement input2 = wd.findElement(By.cssSelector("[name='email']"));


        WebElement input3 = wd.findElement(By.cssSelector("[placeholder='Password']"));

        WebElement button1 = wd.findElement(By.cssSelector("[name='login']"));

        WebElement el7 = wd.findElement(By.cssSelector("[href='/home']"));



        //one of elements find by attribute===> start&end&contains value

        WebElement button2 = wd.findElement(By.cssSelector("[name='registration']"));


        //start

        WebElement button3 = wd.findElement(By.cssSelector("[name ^='reg']"));



        //end

        WebElement button4 = wd.findElement(By.cssSelector("[name $='ion']"));

        //contains

        WebElement button5 = wd.findElement(By.cssSelector("[name *='ist']"));


    }

    @Test
    public void xPathLocators(){

        //by tag name

        WebElement el20 = wd.findElement(By.xpath("//h1"));

        WebElement el21 = wd.findElement(By.xpath("//form"));


        //by class

        WebElement el22 = wd.findElement(By.xpath("//*[@class='container']"));


        //by id

        WebElement el23 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute

        WebElement el24 = wd.findElement(By.xpath("//div[@id='root']"));


        WebElement button25 = wd.findElement(By.xpath("//button[@name='login']"));


        //one of elements find by attribute===> start&end&contains value

        WebElement button20 = wd.findElement(By.xpath("//button[@name='registration']"));


        //start

        WebElement button33 = wd.findElement(By.xpath("//*[starts-with(@name,'reg')]"));


        //contains

        WebElement button55 = wd.findElement(By.xpath("//*[contains(@name,'ist')]"));
        

    }


}
