import java.lang.*;

public class Start{

	public static void main(String arg[]){

		Coordinate c1=new Coordinate();
		Coordinate c2=new Coordinate();
		c1.setLatitude(72.58);
		c1.setLongitude(23.69);
		c1.setStatus("From");
		c2.setLatitude(35.63);
		c2.setLongitude(73.18);
		c2.setStatus("To  ");		

		Airport a1=new Airport();
		Airport a2=new Airport();
		a1.setId(701);
		a1.setName("NYC Airport");
		a1.setStatus("From");
		a1.setLocation(c1);
		a2.setId(901);
		a2.setName("LA Airport");
		a2.setStatus("To  ");
		a2.setLocation(c2);

		Employee e1=new Employee();
		e1.setId("AVNGR002");
		e1.setName("Tony Stark");
		e1.setDesignation("Senior Pilot");

		Schedule s1=new Schedule();
		s1.setHour(8);
		s1.setMinute(15);
		Schedule s2=new Schedule();
		s2.setHour(10);
		s2.setMinute(20);

		Flight f=new Flight();
		f.setId(707);
		f.setName("OOP1MTAssignment");
		f.setCapacity(60);
		f.setPilot(e1);
		f.setFrom(a1);
		f.setTo(a2);
		f.setDeparture(s1);
		f.setArrival(s2);


		System.out.println("Flight ID               : "+f.getId( ));
		System.out.println("Flight Name             : "+f.getName( ));
		System.out.println("Flight Capacity         : "+f.getCapacity( ));
		System.out.println("Pilot Name              : "+f.getPilot( ).getName( ));
		System.out.println("Pilot Name              : "+f.getPilot( ).getId( ));
		System.out.println("Pilot Designation       : "+f.getPilot( ).getDesignation( ));
		System.out.println("Airport From Name       : "+f.getFrom( ).getName( ));
		System.out.println("Airport From ID         : "+f.getFrom( ).getId( ));
		System.out.println("Airport From Longitude  : "+f.getFrom( ).getLocation( ).getLongitude( ));
		System.out.println("Airport From Latitude   : "+f.getFrom( ).getLocation( ).getLatitude( ));
		System.out.println("Airport To Name         : "+f.getTo( ).getName( ));
		System.out.println("Airport To ID           : "+f.getTo( ).getId( ));
		System.out.println("Airport To Longitude    : "+f.getTo( ).getLocation( ).getLongitude( ));
		System.out.println("Airport To Latitude     : "+f.getTo( ).getLocation( ).getLatitude( ));
		System.out.println("Scheduled Departure at  : "+f.getDeparture( ).getHour( )+":"+f.getDeparture( ).getMinute( ));
		System.out.println("Scheduled Arrival at    : "+f.getArrival( ).getHour( )+":"+f.getArrival( ).getMinute( ));
		


	}
}
