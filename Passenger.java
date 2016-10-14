
public class Passenger {

	int status;
	boolean child;
	String sex;
	boolean survivor;

	public Passenger (int w, boolean x, String y, boolean z) 
	{
		status = w;
		child = x;
		sex = y;
		survivor = z;
	}
	public String toString ()
	{
		String description;
		if(status != 4)
			description = "This passenger was a member of class " + status;
		else
			description = "This passenger was a member of the crew";
		if(child)
			description = description + ", a " + sex + " child, "; 
		else
			description = description + ", a " + sex + " adult, ";
		if(survivor)
			description = description + "and survived the Titanic.";
		else
			description = description + "and did not survive the Titanic.";
		return description;
	}
}
