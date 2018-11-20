package main;

import java.util.ArrayList;
import java.util.Random;

import create.entity.CreateRandomEntity;
import graphdb.CreateIRIStatement;
import graphdb.Query;
import model.Country;
import model.Entity;
import model.Event;
import model.Location;
import model.Organization;
import model.Person;
import model.Time;

public class Main {
	public static void main(String[] args) {

		long start, end;
		int numberOfEntity = 5;
		int numberOfRelationship = 10;
		
	//	start = System.currentTimeMillis();
		
		CreateRandomEntity cre = new CreateRandomEntity();
		
		ArrayList<Entity> listEntity = cre.getListRandomEntity(numberOfEntity);
		ArrayList<String> listRelationship = cre.getListRelationshipDescription(numberOfRelationship);
		
		//System.out.println("comehere");
		//end = System.currentTimeMillis();
		//System.out.println(end - start);
		//System.exit(1);
		
		
		CreateIRIStatement createIRIStatement = new CreateIRIStatement();
		
		start = System.currentTimeMillis();
		/*============== Insert Data Entity ===================*/
		for (Entity entity : listEntity)
		{
			if(entity instanceof Person)
			{
//				System.out.println("*******************************Class Person******************************");
				Person person = (Person) entity;
				createIRIStatement.createIRIPerson(person);
			}
			else if(entity instanceof Country)
			{
//				System.out.println("*******************************Class Country******************************");
				Country country = (Country) entity;
				createIRIStatement.createIRICountry(country);
			}
			else if(entity instanceof Event)
			{
//				System.out.println("*******************************Class Event******************************");
				Event event = (Event) entity;
				createIRIStatement.createIRIEvent(event);
			}
			else if(entity instanceof Location)
			{
//				System.out.println("*******************************Class Location******************************");
				Location location = (Location) entity;
				createIRIStatement.createIRILocation(location);
			}
			else if(entity instanceof Organization)
			{
//				System.out.println("*******************************Class Location******************************");
				Organization organization = (Organization) entity;
				createIRIStatement.createIRIOrganization(organization);
			}
			else if(entity instanceof Time)
			{
//				System.out.println("*******************************Class Location******************************");
				Time time = (Time) entity;
				createIRIStatement.createIRITime(time);
			}
			else
			{
				System.out.println("Wrong !");
			}
		
		}
		
		end = System.currentTimeMillis();
		System.out.println(end - start);
		System.exit(1);
	
		/*============== Insert Data Relationship ===================*/
		Random rd = new Random();
		for (int i = 0; i < numberOfRelationship; i++)
		{
			Entity entity1 = listEntity.get(rd.nextInt(numberOfEntity));
			Entity entity2 = listEntity.get(rd.nextInt(numberOfEntity));
			String strRelationship = listRelationship.get(rd.nextInt(numberOfRelationship));
			createIRIStatement.createIRIRelationship(entity1, entity2, strRelationship);
		}
		end = System.currentTimeMillis();
		
		
		/*============== Query Data ===================*/
//		Query.queryBasic();
//		Query.queryAdvance();
		
		
		
//		for(int i = 0; i < 5000000; i++)
//		{
//			System.out.println(i);
//		}
		
//		System.out.println("\nList Entity = " + listEntity.size());
//		System.out.println("\nList Relationship = " + listRelationship.size());
		System.out.println("\nTime Add = " + (end-start));

		System.exit(0);
	}  
}


