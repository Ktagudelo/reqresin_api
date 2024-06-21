package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.GetResponseCode;
import tasks.GetUserTask;

import static constants.Constants.getCodeUser;
import static constants.Constants.getUrlBaseUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class UserStepDefinitions {

    private static final int restCODE= getCodeUser();

    Actor user = Actor.named("user")
            .whoCan(CallAnApi.at(getUrlBaseUser()));

    @When("I consume the endpoint and I get the user information")
    public void iConsumeTheEndpointAndIGetTheUserInformation() {
        user.attemptsTo(
                GetUserTask.fromUser()
        );

    }
    @Then("I can validate the get user response code")
    public void iCanValidateTheGetUserResponseCode() {

        user.should(
                seeThat(
                        "The response code is", GetResponseCode.was(),equalTo(restCODE)
                )
        );

    }

}
