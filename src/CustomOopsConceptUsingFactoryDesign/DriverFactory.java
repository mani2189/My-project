package CustomOopsConceptUsingFactoryDesign;

public class DriverFactory 
{
  
	public static DriverManager getDriverManager(String browser) throws Exception
	{
		DriverManager drivermanager = null;
		
		switch(browser.toLowerCase())
		{
		case "chrome":
		drivermanager = new ChromeBrowser(); 
		break;
		
		case "firefoxbrowser":
			
			drivermanager = new FireFoxBrowser(); 
			break;
			
		case "ie":
			
		drivermanager = new IEBrowser(); 
		break;
		
		default:
			
			throw new Exception("No such browser Present to be Initialized :" +browser);
			
		}
		
		return drivermanager;
		
		
	}	
		
	}

