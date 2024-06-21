package tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static constants.Constants.getUser2;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetUserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(getUser2()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .log()
                                .all()));

        System.out.println("Get= " + SerenityRest.lastResponse().asString());
    }

    public static GetUserTask fromUser() {

        return instrumented(GetUserTask.class);
    }
}
