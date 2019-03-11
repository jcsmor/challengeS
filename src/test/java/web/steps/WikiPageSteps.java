package web.steps;

import cucumber.api.java8.En;
import global_methods.Driver;
import page_objects.WikiPage;


public class WikiPageSteps extends Driver implements En {

    public WikiPageSteps() {
        super();

        And("^(?:the user navigates to the wikipage$)", () -> {
            WikiPage.goToWikiPage(getDriver());
        });

        Then("^(?:the user look up the definition of the word (.*)$)", (String word) -> {
            WikiPage.searchWord(getDriver(), word);
        });

        Then("^(?:the user Check that one definition is: (.*)$)", (String definition) -> {
            WikiPage.isTextPresent(getDriver(), definition);
        });

    }



}
