import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


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

        //by class

        //by id

        //by attribute

        //one of elements find by attribute===> start&end&contains value
    }
}
