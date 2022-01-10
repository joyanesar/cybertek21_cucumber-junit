package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ReRunDemoStepDefs {
    @Given("User adds two numbers")
    public void user_adds_two_numbers() {
        System.out.println("User adds two numbers");

    }
    @Then("Result should be as expected")
    public void result_should_be_as_expected() {
        System.out.println("Result should be as expected");

    }

       @Given("User adds three numbers")
    public void user_adds_three_numbers() {
           System.out.println("User adds three numbers");

    }
    @Then("Result should be sum of three numbers")
    public void result_should_be_sum_of_three_numbers() {
        System.out.println("Result should be sum of three numbers");
        Assert.assertEquals(5,7);
    }


    @Given("User divides two numbers")
    public void user_divides_two_numbers() {
        System.out.println("User divides two numbers");
        Assert.assertEquals(22,21);

    }
    @Then("Result should be division result")
    public void result_should_be_division_result() {
        System.out.println("\"Result should be division result");
        Assert.assertEquals(61,52);

    }



    @Given("User multiplies two numbers")
    public void user_multiplies_two_numbers() {
        System.out.println("User multiplies two numbers");
     ;
    }
    @Then("Result should be multiplication result")
    public void result_should_be_multiplication_result() {
        System.out.println("Result should be multiplication result");
        Assert.assertEquals(52,30);

    }

}
