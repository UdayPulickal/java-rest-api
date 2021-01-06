package com.telusko.demorestapi;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	AlienRepository1 repo= new AlienRepository1();
	@GET
	@Produces ({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Alien> getAlien()
	{
		/*System.out.println("test");
		Alien a1=new Alien();
		System.out.println("getAlien object");
		a1.setName("Uday");
		System.out.println("getAlien error");
		a1.setPoints(60);
		
		Alien a2=new Alien();
		a2.setName("Nikhil");
		a2.setPoints(55);
		List<Alien> aliens=Arrays.asList(a1,a2);*/
		System.out.println("getAlien error");
		return repo.getAliens();		
		}

@GET
@Path("alien/{id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
 public Alien getalien(@PathParam("id") String id)
{
	return repo.getAlien(id);
}
	
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien CreateRepo(Alien a2)
{
		System.out.println(a2);
		repo.crRepo(a2);
		System.out.println("calling done");
	return a2;
}
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien UpdateRepo(Alien a2)
{
		System.out.println(a2);
		if(repo.getAlien(a2.getCode()).getCode()==null)
		{
			repo.crRepo(a2);
		}
		else
		{
		repo.Update(a2);
		}
		System.out.println("calling done2");
	return a2;
}

	@DELETE
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

	public Alien DeleteRepo(@PathParam("id") String id)
	{
		Alien a= repo.getAlien(id);
		if (a.getCode()!="0")
				{
			repo.delete(id);
				}
		return a;
	}
}
