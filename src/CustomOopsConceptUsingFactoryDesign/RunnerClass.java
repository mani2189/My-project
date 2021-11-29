package CustomOopsConceptUsingFactoryDesign;

public class RunnerClass 

{

	public static void main(String[] args) throws Exception
	
	{
		
       DriverManager drivermanager = DriverFactory.getDriverManager("chrome");
       
       drivermanager.LanuchBrowser();
       
       DriverManager drivermanager1 = DriverFactory.getDriverManager("ie");
       
       drivermanager1.LanuchBrowser();
       
       DriverManager drivermanager2 = DriverFactory.getDriverManager("firefoxbrowser");
       
       drivermanager2.LanuchBrowser();
       
       
	}

}
