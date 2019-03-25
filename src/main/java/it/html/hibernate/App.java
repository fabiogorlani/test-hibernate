package it.html.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import it.html.hibernate.bean.Persona;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        
        Persona p = new Persona();
		p.setId(101);
		p.setNome("Pasquale Congiustì");
		p.setEmail("p.congiusti@html.it");
		//Chiedo al middleware di salvare questo oggetto nel database
		session.save(p);
		
  
        
        tx.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}
