package pac2;

import org.testng.annotations.Test;

public class OrgTest
{
	@Test
	public void CreateOrgTest()
	{
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username","admin");
		String PASSWORD=System.getProperty("password","admin");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createOrgTest");
	}
    
	@Test
	public void ModifyOrgTest()
	{
		System.out.println("execute ModifyOrgTest");
	}

}
