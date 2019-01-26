import java.lang.*;

public class Airport{

	private int id;
	private String name;
	private Coordinate location;
	private String status;

	public void setStatus(String status){
		this.status=status;
	}
		

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setLocation(Coordinate location){
		this.location=location;
	}
	public int getId( ){
		return id;
	}
	public String getName( ){
		return name;
	}
	public Coordinate getLocation( ){
		return location;
	}
	/*public String toString() {
		return "Airport "+status+" Name       : "+name+"\n"+"Airport "+status+" ID         : "+id+"\n"+location;

	}*/
}
