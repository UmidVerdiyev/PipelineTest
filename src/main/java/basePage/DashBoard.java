package basePage;

import org.openqa.selenium.WebDriver;

public class DashBoard {
    private WebDriver driver;

    public DashBoard(WebDriver driver){
        this.driver=driver;
    }
    public String getDashBoardURL(){
        return driver.getCurrentUrl();
    }


}
