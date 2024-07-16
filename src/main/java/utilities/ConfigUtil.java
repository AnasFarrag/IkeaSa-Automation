package utilities;

import utilities.readers.PropertiesReader;

public class ConfigUtil {

    public static String BROWSER;
    public static String HEADLESS;
    public static String ENVIRONMENT;
    public static String Data_Encryption;
    public static String Remote_Execution;
    public static String Hub_URL;
    public static String Web_ST_URL;
    public static String API_ST_URL;
    public static String API_Incident_ST_URL;
    public static String Web_SIT_URL;
    public static String Web_ST_BaseURL;
    public static String Web_SIT_BaseURL;
    public static String API_SIT_URL;
    public static String API_Incident_SIT_URL;
    public static String wtt_ST_URL;
    public static String wtt_SIT_URL;
    public static String DB_User_ST;
    public static String DB_Password_ST;
    public static String DB_User_SIT;
    public static String DB_Password_SIT;
    //=======================Endpoints======================
    public static void loadTestConfigurations() {
        PropertiesReader reader = new PropertiesReader( "config.properties");
        BROWSER = reader.getPropertyUsingKey("Browser");
        HEADLESS = reader.getPropertyUsingKey("HEADLESS");
        ENVIRONMENT = reader.getPropertyUsingKey("Environment");
        Data_Encryption = reader.getPropertyUsingKey("Data_Encryption");
        Remote_Execution = reader.getPropertyUsingKey("Remote_Execution");
        Hub_URL = reader.getPropertyUsingKey("Hub_URL");
        Web_ST_URL = reader.getPropertyUsingKey("Web_ST_URL");
        Web_ST_BaseURL = reader.getPropertyUsingKey("Web_ST_BaseURL");
        wtt_ST_URL = reader.getPropertyUsingKey("wtt_ST_URL");
        API_ST_URL = reader.getPropertyUsingKey("API_ST_URL");
        API_Incident_ST_URL = reader.getPropertyUsingKey("API_Incident_ST_URL");
        Web_SIT_BaseURL = reader.getPropertyUsingKey("Web_SIT_BaseURL");
        Web_SIT_URL = reader.getPropertyUsingKey("Web_SIT_URL");
        wtt_SIT_URL = reader.getPropertyUsingKey("wtt_SIT_URL");
        API_SIT_URL = reader.getPropertyUsingKey("API_SIT_URL");
        API_Incident_SIT_URL = reader.getPropertyUsingKey("API_Incident_SIT_URL");
        DB_User_ST = reader.getPropertyUsingKey("DB_User_ST");
        DB_Password_ST = reader.getPropertyUsingKey("DB_Password_ST");
        DB_User_SIT = reader.getPropertyUsingKey("DB_User_SIT");
        DB_Password_SIT = reader.getPropertyUsingKey("DB_Password_SIT");
    }
}
