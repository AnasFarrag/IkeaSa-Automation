package utilities;

import utilities.readers.PropertiesReader;

public class ConfigUtil {

    public static String BROWSER;
    public static String HEADLESS;
    public static String Web_URL;
    public static String Web_TestURL;

    public static String Web_SIT_URL;

    public static String Web_SIT_BaseURL;

    //=======================Endpoints======================
    public static void loadTestConfigurations() {
        PropertiesReader reader = new PropertiesReader( "config.properties");
        BROWSER = reader.getPropertyUsingKey("Browser");
        HEADLESS = reader.getPropertyUsingKey("HEADLESS");
        Web_URL = reader.getPropertyUsingKey("Web_URL");
        Web_TestURL= reader.getPropertyUsingKey("Web_TestURL");

    }
}
