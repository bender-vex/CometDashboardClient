package CometDashboardClient;

@SuppressWarnings("serial")
public class DuplicateModuleNameException extends Exception
{
	private String name;
	public DuplicateModuleNameException(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
}
