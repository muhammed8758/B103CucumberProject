package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class TechproStepDefinition {
    @Given("tecproeducation sayfasina gidilir")
    public void tecproeducationSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("sayfa basliginda Bootcamop yazisi oldugu test edilir")
    public void sayfaBasligindaBootcamopYazisiOlduguTestEdilir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Bootcamop"));
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
    }
}
