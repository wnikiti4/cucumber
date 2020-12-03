package ru.stqa.cucumber;

import io.cucumber.java8.En;
import org.junit.Assert;

public class StringStepdefs  implements En {

    private  String results;

    public StringStepdefs() {
    When("we concatenate string {string} and {string}",(String s1, String s2) ->{
        results = s1 + s2;
    });
    Then("we get new string {string}",(String exp) ->{
        Assert.assertEquals(results,exp);
    });
    }
}
