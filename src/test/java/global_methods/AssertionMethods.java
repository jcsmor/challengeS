package global_methods;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Central place for assertion methods
 */
public class AssertionMethods {

    public static void assertTrue (Object actual){
        assertThat(actual, is(true));
    }

    public static void assertFalse (Object actual){
        assertThat(actual, is(false));
    }

}
