package test;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;
import org.eclipse.rdf4j.repository.http.HTTPRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Test {
	private static final String GRAPHDB_SERVER = "http://localhost:7200/";
	private static final String REPOSITORY_ID = "myrepor,5.;/'ởeê3sd";

	public static RepositoryConnection getRepositoryConnection() {
		Repository repository = new HTTPRepository(GRAPHDB_SERVER, REPOSITORY_ID);
		try
		{
			repository.initialize();
			RepositoryConnection repositoryConnection = repository.getConnection();
			return repositoryConnection;
		}
		catch (RepositoryException Ex)
		{
			Ex.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		
		RepositoryConnection conn = getRepositoryConnection();
		
		String namespace = "http://shawdow.org/";
		
		
		long start = System.currentTimeMillis();
		ValueFactory vf = conn.getValueFactory();
		IRI huynh1 = vf.createIRI(namespace,"huynhid");
		IRI huynh2 = vf.createIRI(namespace , "huynhlabel");
		//IRI huynh3 = vf.createIRI(namespace, "tenhuynh");
		
		
		for (int i = 0; i < 100; i++) {
			conn.add(huynh1, huynh2, vf.createLiteral("huynh" + i));
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
	

}
