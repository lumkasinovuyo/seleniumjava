package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeAlotPageObjects {

    private WebDriver driver;

    @FindBy(id = "nav_item_359")
    public WebElement load_shedding_tab;

    @FindBy(xpath = "//*[@id=\"shopfront-app\"]/div[2]/div/div[2]/div[1]/div/div/div[4]/div[1]/div/a/div")
    public WebElement item;

    @FindBy(xpath = "//*[@id=\"shopfront-app\"]/div[1]/div/div/button")
    public WebElement btn_gotIt;

    @FindBy(xpath = "//*[@id=\"shopfront-app\"]/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/a")
    public WebElement btn_add_to_cart;

    @FindBy(xpath = "//*[@id=\"shopfront-app\"]/div[1]/div/div/header/div[2]/div/div[3]/div[2]/a/svg/path")
    public WebElement btn_view_cart;

    public TakeAlotPageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void load_shedding(){
        load_shedding_tab.click();
    }

    public void load_shedding_item(){
        item.click();
    }

    public void got_it_btn(){
        btn_gotIt.click();
    }

    public void add_to_cart(){
        btn_add_to_cart.click();
    }

    public void view_cart(){
        btn_view_cart.click();
    }


}
