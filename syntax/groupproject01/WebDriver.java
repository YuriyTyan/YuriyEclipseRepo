package syntax.groupproject01;

public interface WebDriver {
	
	void open();
	void close();
	String getTitle();
}

interface RemoteWebDriver extends WebDriver{
	void navigate();
}
interface TakesScreenshot {
	void getScreenshot();
}
