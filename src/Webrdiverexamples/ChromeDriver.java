package Webrdiverexamples;

public class ChromeDriver implements OwnWebdriverInterface 

{
	
	public ChromeDriver()
	{
		System.out.println("Launch chrome browser");
	}

	@Override
	public void get(String url)
	
	{
		System.out.println("Launch url" +url);
		
	}

	@Override
	public void findElement(String locator)
	{

		System.out.println("finding the element" +locator);
	}

	@Override
	public void quit()
	{
		
		System.out.println("quit all the browser");
	}

	@Override
	public void close() 
	{
		System.out.println("Close all the browser");
		
	}

}
