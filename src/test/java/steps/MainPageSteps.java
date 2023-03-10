package steps;

import PageObjects.MainPage;
import config.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class MainPageSteps extends BaseClass {
    MainPage mainPage=new MainPage(getDriver());
    @When("Open page {string}")
    public void openPage(String url)
    {
        {
            getDriver().get(url);
        }
    }
    @And("Check text {string}")
    public  void checkText(String title1) {
        Assert.assertEquals(mainPage.consultationButton.getText(), title1);
        System.out.println(mainPage.consultationButton.getText()+": "+title1);
    }

    @And("Check textCours {string}")
    public void checkTextCours(String title2) {
        Assert.assertEquals(mainPage.programyvania.getText(), title2);
        System.out.println(mainPage.programyvania.getText()+": "+title2);
    }

    @And("Check textMenu {string}")
    public void checkTextMenu(String title3) {
        Assert.assertEquals(mainPage.prazevlashtyvania.getText(), title3);
        System.out.println(mainPage.prazevlashtyvania.getText()+": "+title3);
    }

    @And("Check textSection {string}")
    public void checkTextSection(String title4) {
        Assert.assertEquals(mainPage.sholaNadae.getText(), title4);
        System.out.println(mainPage.sholaNadae.getText()+": "+title4);
    }

    @And("Check textHeader {string}")
    public void checkTextHeader(String title5) {
        Assert.assertEquals(mainPage.osobustiyCabinet.getText(), title5);
        System.out.println(mainPage.osobustiyCabinet.getText()+": "+title5);
    }

    @When("Open pageMain {string}")
    public void openPageMain(String url)
    {
        {
            getDriver().get(url);
        }
    }


    @And("check {string} with  {string}")
    public void checkWith(String arg0, String arg1) {
        System.out.println(arg0+": "+arg1);
        System.out.println(driver.findElement(By.xpath(arg0)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(arg0)).getText(),(arg1));
    }

}
