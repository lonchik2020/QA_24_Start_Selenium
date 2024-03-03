import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @Test
    public void test(){
        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/home");//saves history of navigation
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        //wd.close();//closes browser in only 1 tab
        wd.quit();
    }





}
