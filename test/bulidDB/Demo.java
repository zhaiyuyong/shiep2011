package bulidDB;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class Demo {

	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
		System.out.println(sf);
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}
	
	
	
	@Test
	public void testSchemaExport() {
		new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);
	}
	
	
	public static void main(String[] args) {
		beforeClass();
	}
}
