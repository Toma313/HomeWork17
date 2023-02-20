package steps;

import PageObjects.MainPage;
import config.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    public void openPageMain(String url) {
            {
                getDriver().get(url);
            }
    }

    @And("check tittles {string} {string}")
    public void checkTittles(String element, String result) {
        System.out.println(element+": "+result);
        Assert.assertEquals("#"+element,element,result);
    }
}
