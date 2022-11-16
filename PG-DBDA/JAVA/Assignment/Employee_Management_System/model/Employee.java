package model;

public class Employee {
	String Ename;
	String Address;
	int empid;
	String phone;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Employee(String ename, String address, int empid, String phone) {
		super();
		Ename = ename;
		Address = address;
		this.empid = empid;
		this.phone = phone;
	}
	

}
