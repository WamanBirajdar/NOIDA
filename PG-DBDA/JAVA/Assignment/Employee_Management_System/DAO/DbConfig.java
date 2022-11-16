package DAO;
import java.sql.*;
import model.*;
//DAO -- data access object 

public class DbConfig {

	Connection con;
	PreparedStatement ps;
	
	public DbConfig()
	{
		try
		{	Class.forName("com.mysql.jdbc.Driver");	
		  
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bigdata","root","");
			
			}catch(Exception e) {}
	}
	
public 	void insertData(Employee e)
	{
		try 
		{
		ps= con.prepareStatement ("insert into employee  values(?,?,?,?)");
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEname());
		ps.setString(3, e.getAddress());
		ps.setInt(4, e.getPhone());
		ps.execute();
		}
		catch(Exception d) {
			System.out.println(d.getMessage());
		}
		
	}
	public void deleteData(int  i)
	{
		try 
		{
		ps= con.prepareStatement ("delete from  employee  where empid=?");
		ps.setInt(1,i);
		ps.execute();
		}
		catch(Exception d) {
			System.out.println(d.getMessage());
		}
		
	}
	
	
	
}
