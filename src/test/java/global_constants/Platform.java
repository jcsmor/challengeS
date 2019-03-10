package global_constants;
/**
 * Enum that can be set to give a fast and clean lookup
 * of which Platform is being used.
 * Web is split as it can run on a browser on the local computer
 * or through Sauce Labs.
 */
public enum Platform {
    WEB_SAUCELABS, WEB_LOCAL
}
