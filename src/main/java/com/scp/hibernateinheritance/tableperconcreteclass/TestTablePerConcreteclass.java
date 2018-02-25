package com.scp.hibernateinheritance.tableperconcreteclass;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestTablePerConcreteclass
{
	public static void main(String[] args)
	{

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
		Person person = new Person("Abc", "Xyz");
		session.save(person);

		Employee employee = new Employee("Pqr", "ckd", "Computer", new Date());
		session.save(employee);

		Owner owner = new Owner("fjkdljf", "vncmcnvm,", 300L, 20L);
		session.save(owner);

		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.closeSessionFactory();

	}

}
