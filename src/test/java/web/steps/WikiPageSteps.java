package web.steps;

import cucumber.api.java8.En;
import global_methods.AssertionMethods;
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
            boolean isDefPresent;
            isDefPresent = WikiPage.isTextContained(getDriver(), definition);
            AssertionMethods.assertTrue(isDefPresent);
        });

        Then("^(?:confirm that the same (.*) does not appear repeated$)", (String definition) -> {
            boolean isRepeated;
            isRepeated = WikiPage.isTextUnique(getDriver(), definition);
            AssertionMethods.assertTrue(isRepeated);
        });

    }


}
