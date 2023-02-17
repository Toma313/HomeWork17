package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//*[@id=\"btn-consultation-hero\"]")
    public
    WebElement consultationButton;
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[1]")
    public WebElement programyvania;
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[3]/a")
    public WebElement prazevlashtyvania;
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[1]/div[2]/div/ul/li[1]/div/p/span[2]")
    public WebElement sholaNadae;
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/div[1]/div[1]/div/div/div[1]/a")
    public WebElement osobustiyCabinet;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
