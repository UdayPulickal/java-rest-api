package com.telusko.demorestapi;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;
public class AlienRepository {

	List<Alien> aliens;
	
	public AlienRepository()
	{
	  aliens =new ArrayList<>();
	  
//	  Alien a1=new Alien();
//	  a1.setId(101);
//      a1.setName("Nikhil");
//      a1.setPoints(55);	
//
//         Alien a2=new Alien();
//         a2.setId(102);
//          a2.setName("Uday");
//          a2.setPoints(25);
//          
//	     aliens.add(a1);
//	     aliens.add(a2);
	}


public List<Alien> getAliens()

{
	return aliens;
}

public Alien getAlien(String id)
{
	for (Alien a : aliens)
	{
		if(a.getCode()==id)
			return a;
	}
	return new Alien();
}

public void crRepo (Alien a3)
{
	aliens.add(a3);
}
}