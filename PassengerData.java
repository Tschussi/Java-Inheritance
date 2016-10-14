
public class PassengerData {
	int count;
	int numSurvivors;
	Passenger[] collection;
	
	public PassengerData ()
	{
		collection = new Passenger[100];
		count = 0;
		numSurvivors = 0;
	}
	public void addPassenger(int w, boolean x, String y, boolean z)
	{
		if(count==collection.length)
			increaseSize();
		if(w==1)
			collection[count] = new FirstClassPassenger(x,y,z);
		else if (w==2)
			collection[count] = new SecondClassPassenger(x,y,z);
		else if (w==3)
			collection[count] = new ThirdClassPassenger(x,y,z);
		else	
			collection[count] = new CrewPassenger(x,y,z);
		count++;
	}
	public void increaseSize() 
	{
		Passenger[] temp = new Passenger[collection.length * 2];

		for (int dvd = 0; dvd < collection.length; dvd++)
			temp[dvd] = collection[dvd];
		
		collection = temp;
	}
	public String toString()
	{
		String report = "Passenger Directory: \n";
		for(int x=0; x<collection.length;x++)
		{	
		if(collection[x]==null)
			break;
		report = report + collection[x] + "\n";
		}
		return report;
	}
}

