package global_constants;


public class TestConfiguration {

    public static Platform PLATFORM = Platform.WEB_LOCAL;

    public static final String WIKI_URL = "https://en.wiktionary.org/";
    /**
     * Which OS to target when testing on web.
     */
    public static final String PLATFORM_WEB = "OS X 10.11";

    /**
     * Which browser to target when testing on web.
     */
    public static String BROWSER_WEB = "Chrome";

    /**
     * Which version of the specified browser to target when testing on web.
     */
    public static final String VERSION_WEB = "72.0";

    /**
     * Define wait time in seconds, for which we will wait for element on screen
     */
    public static final Integer WAIT_TIME = 30;
}
