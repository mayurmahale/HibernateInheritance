package com.scp.hibernateinheritance.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "PERSON")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PERSON_ID")
	private Long personId;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;

	public Person()
	{
		super();
	}

	public Person(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getPersonId()
	{
		return personId;
	}

	/*public void setPersonId(Long personId)
	{
		this.personId = personId;
	}*/

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		return "\nPerson [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}