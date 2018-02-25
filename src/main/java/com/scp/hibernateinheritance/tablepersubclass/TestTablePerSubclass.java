package com.scp.hibernateinheritance.tablepersubclass;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestTablePerSubclass
{
	public static void main(String[] args)
	{

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
		Person person = new Person("Abc", "Xyz");
		
		Employee employee = new Employee("Pqr", "Lmn", "IT", new Date());

		Owner owner = new Owner("sdfjkf", "eireri", 300L, 20L);
		
		session.save(person);
		session.save(employee);
		session.save(owner);

		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.closeSessionFactory();

	}
}
