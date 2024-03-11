import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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


        //combined search

        WebElement div1 = wd.findElement(By.cssSelector("div#root.container"));


    }

    @Test
    public void xPathLocators() {

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


        //by text

        WebElement home = wd.findElement(By.xpath("//*[text()='HOME']"));

        Assert.assertEquals(home.getText(), "HOME");


        //combined search

        WebElement div2 = wd.findElement(By.xpath("//div[@id='root' and @class='container']"));

        WebElement el34 = wd.findElement(By.xpath("//*[@id and @class]"));




    }

    @Test
    public void classwork(){
        //parent

        WebElement el = wd.findElement(By.xpath("//h1/.."));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::*"));

        //ancestor

        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*")); //all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div")); //two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[1]")); //one option

        //ancestor-or-self

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));


        //following-sibling

        List<WebElement>list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));


        //preceding-sibling

        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement>list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::h1"));


    }

    @Test
    public void classwork2(){
        //inner text
       WebElement button = wd.findElement(By.cssSelector("[name='login']"));
       String text = button.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.tagName("form"));
        String text1 = form.getText();
        System.out.println(text1);

        WebElement html = wd.findElement(By.cssSelector("html"));
        String text2 = html.getText();
        System.out.println(text2);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br---->" + br.getText());

    }


}
