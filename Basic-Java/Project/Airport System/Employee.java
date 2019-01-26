import java.lang.*;

public class Employee{

	private String id;
	private String name;
	private String designation;

	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDesignation(String designation){
		this.designation=designation;
	}
	public String getId( ){
		return id;
	}
	public String getName( ){
		return name;
	}
	public String getDesignation( ){
		return designation;
	}
	/*public String toString() {
		return  "Pilot Name              : " + name+"\n" 
			+"Pilot ID                : "+ id+"\n"
			+"Pilot Designation       : "+ designation;
	}*/
}
