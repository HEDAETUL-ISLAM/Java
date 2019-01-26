import java.lang.*;

public class Flight{

	private int id;
	private String name;
	private int capacity;
	private Employee pilot;
	private Airport from;
	private Airport to;
	private Schedule departure;
	private Schedule arrival;

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public void setPilot(Employee pilot){
		this.pilot=pilot;
	}
	public void setFrom(Airport from){
		this.from=from;
	}
	public void setTo(Airport to){
		this.to=to;
	}
	public void setDeparture(Schedule departure){
		this.departure=departure;
	}
	public void setArrival(Schedule arrival){
		this.arrival=arrival;
	}
	public int getId( ){
		return id;
	}
	public String getName( ){
		return name;
	}
	public int getCapacity( ){
		return capacity;
	}
	public Employee getPilot( ){
		return pilot;
	}
	public Airport getFrom( ){
		return from;
	}
	public Airport getTo( ){
		return to;
	}
	public Schedule getDeparture( ){
		return departure;
	}
	public Schedule getArrival( ){
		return arrival;
	}

}
