package commons;

import java.io.File;

public class GlobalConstants {
	public static final String PORTAL_DEV_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_DEV_URL = "https://admin-demo.nopcommerce.com/";
	public static final String PORTAL_TESTING_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_TESTING_URL = "https://admin-demo.nopcommerce.com/";
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String UPLOAD_FILE = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String REPORT_SCREENSHOT = PROJECT_PATH + File.separator + "reportNGScreenShots" + File.separator;
	public static final String EXTENT_PATH = PROJECT_PATH + File.separator + "extentV2" + File.separator;
	public static final String DOWNLOAD_FILE = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "browserLogs";
	public static final String DRAG_DROP_HTML5 = PROJECT_PATH + File.separator + "dragDropHTML5";
	public static final String AUTO_IT_SCRIPT = PROJECT_PATH + File.separator + "autoIT";
	public static final String DB_DEV_URL = "32.18.252.185:9860";
	public static final String DB_DEV_USER = "automationFC";
	public static final String DB_DEV_PASS = "P@ssw0rld1!";
	public static final String DB_TEST_URL = "32.18.252.185:9860";
	public static final String DB_TEST_USER = "automationfc";
	public static final String DB_TEST_PASS = "P@ssw0rld1!";
	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
	public static final long RETRY_TEST_FAIL = 3;
	public static final String JAVA_VERSION = System.getProperty("java.version");
	
	public static final String BROWSER_STACK_USERNAME = "lethivananh_i6tpiu";
	public static final String BROWSER_STACK_AUTOMATE_KEY = "E2YtfHiqG3pKSoMPQrwT";
	//https://lethivananh_i6tpiu:E2YtfHiqG3pKSoMPQrwT@hub-cloud.browserstack.com/wd/hub
	public static final String BROWSER_STACK_URL = "https://"+ BROWSER_STACK_USERNAME + ":" + BROWSER_STACK_AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
			
	public static final String SAUCE_LABS_USERNAME = "oauth-vananhleektmtk53-91f7b";
	public static final String SAUCE_LABS_AUTOMATE_KEY = "50815cb6-91b8-4ef1-8b16-20aecad19d46";
	//https://oauth-vananhleektmtk53-91f7b:50815cb6-91b8-4ef1-8b16-20aecad19d46@ondemand.eu-central-1.saucelabs.com:443/wd/hub
	public static final String SAUCE_LABS_URL = "https://"+ SAUCE_LABS_USERNAME + ":" + SAUCE_LABS_AUTOMATE_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
			

}
