package pac1;

import org.testng.annotations.Test;

public class ContactTest
{
@Test
public void CreateContactTest()
{
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username","admin");
	String PASSWORD=System.getProperty("password","admin");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute CreateContactTest");
}

@Test
public void ModifyContactTest()
{
	System.out.println("execute ModifyContactTest");
}
@Test
public void DeleteContactTest()
{
	System.out.println("execute DeleteContactTest");
}
}
