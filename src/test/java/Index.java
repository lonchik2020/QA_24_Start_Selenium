import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;


    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Leonid/Downloads/21.index.html");
    }

    @Test
    public void cssLocators(){
        //by tag name

        WebElement el = wd.findElement(By.tagName("button"));
        WebElement el2 = wd.findElement(By.cssSelector("button"));

        WebElement el1 = wd.findElement(By.tagName("a"));
        WebElement el3 = wd.findElement(By.cssSelector("a"));


        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
        int i = list.size();

        //by class

        WebElement el4 = wd.findElement(By.className("container"));
        WebElement el5 = wd.findElement(By.cssSelector(".container"));

        WebElement el6 = wd.findElement(By.className("nav-item"));
        WebElement el7 = wd.findElement(By.cssSelector(".nav-item"));


        //by ID

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav2 = wd.findElement(By.cssSelector("#nav"));


        //by attribute

        WebElement divEl = wd.findElement(By.cssSelector("[class='container']"));
        WebElement input = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        //start
        WebElement input3 = wd.findElement(By.cssSelector("[placeholder ^= 'Type'"));
        WebElement divEl1 = wd.findElement(By.cssSelector("class ^='con']"));
        //end
        WebElement input4 = wd.findElement(By.cssSelector("[placeholder $='name']"));
        WebElement divEl2 = wd.findElement(By.cssSelector("[class $='ner']"));
        //contains
        WebElement input5 = wd.findElement(By.cssSelector("[placeholder *='your']"));
        WebElement divEl3 = wd.findElement(By.cssSelector("[class *='tai']"));



        //by name

        WebElement input1 = wd.findElement(By.name("name"));
        WebElement input2 = wd.findElement(By.cssSelector("[name='name']"));


        //By LinkText

        WebElement a = wd.findElement(By.linkText("Item 1"));

        //By PartialLinkText

        WebElement a1 = wd.findElement(By.partialLinkText("m 1"));
        List<WebElement> a2 = wd.findElements(By.partialLinkText("em"));




    }

}
