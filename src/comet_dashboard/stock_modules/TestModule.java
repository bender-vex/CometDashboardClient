package CometDashboardClient;

@SuppressWarnings("serial")
public class TestModule extends CometModule
{

	public TestModule(String t)
	{
		super(t);
		System.out.println("I am a " + type);
	}
	
}
