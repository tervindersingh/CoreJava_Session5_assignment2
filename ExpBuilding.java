class Building
{
	protected float Area;
	protected int NoOfRooms;
	public Building(float a,int r)
	{
		Area=a;
		NoOfRooms=r;
	}
}
class Apartment_A extends Building
{
	char LiftFacility;
	public Apartment_A(float a, int r, char lf)
	{
		super(a,r);
		LiftFacility=lf;
	}
	public void Display()
	{
		System.out.println("Welcome to XYZ Apartments");
		System.out.println("Number of Rooms:"+NoOfRooms);
		System.out.println("Area per Flat is:"+Area);
		System.out.println("Do we have Lift Facility :"+LiftFacility);
	}
}
class Apartment_B extends Building
{
	char PowerFacility24hour;
	public Apartment_B(float a, int r, char pf)
	{
		super(a,r);
		PowerFacility24hour=pf;
	}
	public void Display()
	{
		System.out.println("Welcome to ABC Apartments");
		System.out.println("Number of Rooms:"+NoOfRooms);
		System.out.println("Area per Flat is:"+Area);
		System.out.println("Do we have 24hours PowerSupply  :"+PowerFacility24hour);
	}
}
public class ExpBuilding
{
	public static void main(String args[])
	{
		Apartment_A aa=new Apartment_A(170.12f,3,'y');
		Apartment_A ab=new Apartment_A(150.12f,2,'N');


		Apartment_B ba=new Apartment_B(225.12f,3,'y');
		Apartment_B bb=new Apartment_B(195.12f,2,'N');
		aa.Display();
		ab.Display();
		ba.Display();
		bb.Display();
	}
}