package graphdb;

import java.util.ArrayList;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.repository.RepositoryConnection;

import model.Country;
import model.Entity;
import model.Event;
import model.Location;
import model.Organization;
import model.Person;
import model.Time;

public class CreateIRIStatement extends IRIConstant {
	private static RepositoryConnection conn = Connection.getRepositoryConnection();
	
	public CreateIRIStatement()
	{
		super();
	}
	
	public void createIRIPerson(Person person)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			IRI subject, predicate;
			Literal object;
			
			subject = valueFactory.createIRI(PERSON.toString(), "/person" + person.getId());
			
			// Add name
			predicate = valueFactory.createIRI(PERSON.toString(), LABEL);
			object = valueFactory.createLiteral(person.getName());
			conn.add(subject, predicate, object);

			// Add description
			predicate = valueFactory.createIRI(PERSON.toString(), DESCRIPTION);
			object = valueFactory.createLiteral(person.getDescription());
			conn.add(subject, predicate, object);
			
			// Add link
			predicate = valueFactory.createIRI(PERSON.toString(), LINK);
			object = valueFactory.createLiteral(person.getLink());
			conn.add(subject, predicate, object);
			
			// Add date
			predicate = valueFactory.createIRI(PERSON.toString(), DATE);
			object = valueFactory.createLiteral(person.getDate());
			conn.add(subject, predicate, object);
			
			// Add job
			predicate = valueFactory.createIRI(PERSON.toString(), JOB);
			object = valueFactory.createLiteral(person.getJob());
			conn.add(subject, predicate, object);
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}

	public void createIRICountry(Country country)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			IRI subject, predicate;
			Literal object;
			
			subject = valueFactory.createIRI(COUNTRY.toString(), "/country" + country.getId());
			
			// Add name
			predicate = valueFactory.createIRI(COUNTRY.toString(), LABEL);
			object = valueFactory.createLiteral(country.getName());
			conn.add(subject, predicate, object);

			// Add description
			predicate = valueFactory.createIRI(COUNTRY.toString(), DESCRIPTION);
			object = valueFactory.createLiteral(country.getDescription());
			conn.add(subject, predicate, object);
			
			// Add link
			predicate = valueFactory.createIRI(COUNTRY.toString(), LINK);
			object = valueFactory.createLiteral(country.getLink());
			conn.add(subject, predicate, object);
			
			// Add date
			predicate = valueFactory.createIRI(COUNTRY.toString(), DATE);
			object = valueFactory.createLiteral(country.getDate());
			conn.add(subject, predicate, object);
			
			// Add continent
			predicate = valueFactory.createIRI(COUNTRY.toString(), CONTINENT);
			object = valueFactory.createLiteral(country.getContinent());
			conn.add(subject, predicate, object);
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}

	public void createIRIEvent(Event event)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			IRI subject, predicate;
			Literal object;
			
			subject = valueFactory.createIRI(EVENT.toString(), "/event" + event.getId());
			
			// Add name
			predicate = valueFactory.createIRI(EVENT.toString(), LABEL);
			object = valueFactory.createLiteral(event.getName());
			conn.add(subject, predicate, object);

			// Add description
			predicate = valueFactory.createIRI(EVENT.toString(), DESCRIPTION);
			object = valueFactory.createLiteral(event.getDescription());
			conn.add(subject, predicate, object);
			
			// Add link
			predicate = valueFactory.createIRI(EVENT.toString(), LINK);
			object = valueFactory.createLiteral(event.getLink());
			conn.add(subject, predicate, object);
			
			// Add date
			predicate = valueFactory.createIRI(EVENT.toString(), DATE);
			object = valueFactory.createLiteral(event.getDate());
			conn.add(subject, predicate, object);
			
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}

	public void createIRILocation(Location location)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			IRI subject, predicate;
			Literal object;
			
			subject = valueFactory.createIRI(LOCATION.toString(), "/location" + location.getId());
			
			// Add name
			predicate = valueFactory.createIRI(LOCATION.toString(), LABEL);
			object = valueFactory.createLiteral(location.getName());
			conn.add(subject, predicate, object);

			// Add description
			predicate = valueFactory.createIRI(LOCATION.toString(), DESCRIPTION);
			object = valueFactory.createLiteral(location.getDescription());
			conn.add(subject, predicate, object);
			
			// Add link
			predicate = valueFactory.createIRI(LOCATION.toString(), LINK);
			object = valueFactory.createLiteral(location.getLink());
			conn.add(subject, predicate, object);
			
			// Add date
			predicate = valueFactory.createIRI(LOCATION.toString(), DATE);
			object = valueFactory.createLiteral(location.getDate());
			conn.add(subject, predicate, object);
			
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}

	public void createIRIOrganization(Organization organization)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			IRI subject, predicate;
			Literal object;
			
			subject = valueFactory.createIRI(ORGANIZATION.toString(), "/organization" + organization.getId());
			
			// Add name
			predicate = valueFactory.createIRI(ORGANIZATION.toString(), LABEL);
			object = valueFactory.createLiteral(organization.getName());
			conn.add(subject, predicate, object);

			// Add description
			predicate = valueFactory.createIRI(ORGANIZATION.toString(), DESCRIPTION);
			object = valueFactory.createLiteral(organization.getDescription());
			conn.add(subject, predicate, object);
			
			// Add link
			predicate = valueFactory.createIRI(ORGANIZATION.toString(), LINK);
			object = valueFactory.createLiteral(organization.getLink());
			conn.add(subject, predicate, object);
			
			// Add date
			predicate = valueFactory.createIRI(ORGANIZATION.toString(), DATE);
			object = valueFactory.createLiteral(organization.getDate());
			conn.add(subject, predicate, object);

			// Add headquarter
			predicate = valueFactory.createIRI(ORGANIZATION.toString(), HEADQUARTER);
			object = valueFactory.createLiteral(organization.getHeadquarter());
			conn.add(subject, predicate, object);

		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}

	public void createIRITime(Time time)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			IRI subject, predicate;
			Literal object;
			
			subject = valueFactory.createIRI(TIME.toString(), "/time" + time.getId()+"");
			
			// Add name
			predicate = valueFactory.createIRI(TIME.toString(), LABEL);
			object = valueFactory.createLiteral(time.getName());
			conn.add(subject, predicate, object);

			// Add description
			predicate = valueFactory.createIRI(TIME.toString(), DESCRIPTION);
			object = valueFactory.createLiteral(time.getDescription());
			conn.add(subject, predicate, object);
			
			// Add link
			predicate = valueFactory.createIRI(TIME.toString(), LINK);
			object = valueFactory.createLiteral(time.getLink());
			conn.add(subject, predicate, object);
			
			// Add date
			predicate = valueFactory.createIRI(TIME.toString(), DATE);
			object = valueFactory.createLiteral(time.getDate());
			conn.add(subject, predicate, object);

		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}

	public void createIRIRelationship(Entity entity1, Entity entity2, String listRelationship)
	{
		try
		{
			ValueFactory valueFactory = conn.getValueFactory();
			
			IRI subject, predicate, object;
			
			subject = checkEntity(entity1);
			
			predicate = valueFactory.createIRI(RELATIONSHIP.toString(), "_" + listRelationship);
			
			object = checkEntity(entity2);
			
			conn.add(subject, predicate, object);
			
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}
	
	public IRI checkEntity(Entity entity)
	{
		ValueFactory valueFactory = conn.getValueFactory();
		IRI subject;
		
		IRI result = null;
		
		if(entity instanceof Person)
		{
			Person person = (Person) entity;
			result = valueFactory.createIRI(PERSON.toString(), "/person" + person.getId()+"");
		}
		else if(entity instanceof Country)
		{
			Country country = (Country) entity;
			result = valueFactory.createIRI(COUNTRY.toString(), "/country" + country.getId()+"");
		}
		else if(entity instanceof Event)
		{
			Event event = (Event) entity;
			result = valueFactory.createIRI(EVENT.toString(), "/event" + event.getId()+"");
		}
		else if(entity instanceof Location)
		{
			Location location = (Location) entity;
			result = valueFactory.createIRI(LOCATION.toString(), "/location" + location.getId()+"");
		}
		else if(entity instanceof Organization)
		{
			Organization organization = (Organization) entity;
			result = valueFactory.createIRI(ORGANIZATION.toString(), "/organization" + organization.getId()+"");
		}
		else if(entity instanceof Time)
		{
			Time time = (Time) entity;
			result = valueFactory.createIRI(TIME.toString(), "/time" + time.getId()+"");
		}
		
		return result;
	}
}
