package com.scp.hibernateinheritance.tableperclass;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestTablePerClass
{
	public static void main(String[] args)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
		Person person = new Person("Abc", "Xyz");
		session.save(person);

		Employee employee = new Employee("Pqr", "Lmn", "Computer", new Date());
		session.save(employee);
		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.closeSessionFactory();
		
	}

}
