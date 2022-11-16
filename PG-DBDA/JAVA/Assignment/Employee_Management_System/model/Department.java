package model;

public class Department {

	String Dname;
	String location;
	int dno;
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public Department(String dname, String location, int dno) {
		super();
		Dname = dname;
		this.location = location;
		this.dno = dno;
	}
	
	

}
