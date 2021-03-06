package com.automationpractice.www.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.ArrayList;
import java.util.Collections;
import static com.automationpractice.www.userinterfaces.MyStoreDressesPage.DRESSES_PRICES;
import static com.automationpractice.www.userinterfaces.MyStoreDressesPage.dress;

public class ChooseMoreExpensive implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        String mostExpensive;
        String price;
        ArrayList<String> listPrices = new ArrayList<String>();

        for(WebElementFacade elementFacade : DRESSES_PRICES.resolveAllFor(actor)) {
            price = elementFacade.getText();
            listPrices.add(price);
        }
        mostExpensive = Collections.max(listPrices);
        actor.attemptsTo(Click.on(dress(mostExpensive)));
    }


    public static ChooseMoreExpensive fromTheList() {
        return Tasks.instrumented(ChooseMoreExpensive.class);
    }
}
