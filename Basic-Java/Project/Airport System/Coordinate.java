import java.lang.*;

public class Coordinate{
	
	private double latitude;
	private double longitude;
	private String status;

	public void setStatus(String status){
		this.status=status;
	}

	public void setLatitude(double latitude){
		this.latitude=latitude;	
	}
	public void setLongitude(double longitude){
		this.longitude=longitude;
	}
	public double getLatitude( ){
		return latitude;
	}
	public double getLongitude( ){
		return longitude;
	}
	/*public String toString() {
		return "Airport "+status+" Longitude  : " + longitude +"\n"+"Airport "+status+" Latitude   : "+latitude;
	}*/
}
