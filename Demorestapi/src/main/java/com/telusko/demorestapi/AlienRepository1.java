package com.telusko.demorestapi;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class AlienRepository1 {

	Connection conn=null;
	
	public AlienRepository1()
	{
	 
		String url="jdbc:mysql://localhost:3306/restdb";
		String username="root";
		String passwd="root";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		conn =DriverManager.getConnection(url, username, passwd);
	}
		catch(Exception e)
		{
			System.out.println("uday1"+e);
		}
	}
	

public List<Alien> getAliens()

{
   List<Alien> aliens= new ArrayList<>();
   String sql="select * from employees";
  
   try
   {
   Statement st =conn.createStatement();
   ResultSet rs=st.executeQuery(sql);
   
	   while(rs.next())
	   {
		   Alien a1=new Alien();
		   a1.setCode(rs.getString(1));
		   a1.setName(rs.getString(2));
		   a1.setGender(rs.getString(3));
		   a1.setAnnualsalary(rs.getFloat(4));
		   a1.setDateOfBirth(rs.getString(5));
		   aliens.add(a1);
		   
}
   }
   catch(Exception e)
   {
	   System.out.println("uday2"+e);
   }
	return aliens;
}

public Alien getAlien(String id)
{
	Alien a1=new Alien();
	String sql="select * from employees where code="+"'"+id+"'";
	  
	   try
	   {
	   Statement st =conn.createStatement();
	   ResultSet rs=st.executeQuery(sql);
	   
		   if(rs.next())
		   {
			   
//			   a1.setId(rs.getInt(1));
//			   a1.setName(rs.getString(2));
//			   a1.setPoints(rs.getInt(3));  
			   a1.setCode(rs.getString(1));
			   a1.setName(rs.getString(2));
			   a1.setGender(rs.getString(3));
			   a1.setAnnualsalary(rs.getFloat(4));
			   a1.setDateOfBirth(rs.getString(5));
	}
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
return a1;
}

public void crRepo (Alien a3)
{
	System.out.println("first stage");
	String sql="insert into employees values(?,?,?,?,?)";
	try{
	PreparedStatement st=conn.prepareStatement(sql);
//	st.setInt(1,a3.getId());
//	st.setString(2,a3.getName());
//	st.setInt(3,a3.getPoints());
	st.setString(1,a3.getCode());
	   st.setString(2,a3.getName());
	   st.setString(3,a3.getGender());
	   st.setFloat(4,a3.getAnnualsalary());
	   st.setString(5,a3.getDateOfBirth());
	st.executeUpdate();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public void Update (Alien a3)
{
	System.out.println("first stage");
	String sql="update employees set name=?,gender=? where code=?";
	try{
	PreparedStatement st=conn.prepareStatement(sql);
	st.setString(1,a3.getName());
//	st.setInt(2,a3.getPoints());
//	st.setInt(3,a3.getId());
	st.setString(2,a3.getGender());
	st.setString(3,a3.getCode());
	st.executeUpdate();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void delete (String id)
{
	System.out.println("first stage");
	String sql="delete from alien where code=?";
	try{
	PreparedStatement st=conn.prepareStatement(sql);
	st.setString(1,id);
	st.executeUpdate();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}