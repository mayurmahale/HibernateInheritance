package com.scp.hibernateinheritance.tableperconcreteclass;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
@AttributeOverrides({
    @AttributeOverride(name="firstName", column=@Column(name="FIRSTNAME")),
    @AttributeOverride(name="lastName", column=@Column(name="LASTNAME"))
})
public class Employee extends Person
{
	
	@Column(name="department_name")
	private String departmentName;

	@Column(name="joining_date")
	private Date joiningDate;
	

	public Employee()
	{
		super();
	}

	public Employee(String firstName, String lastName, String departmentName, Date joiningDate)
	{
		super(firstName, lastName);
		
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}
	
	public String getFirstName()
	{
		return super.getFirstName();
	}
	
	public void setFirstName(String firstName)
	{
		super.setFirstName(firstName);
	}
	
	public String getLastName()
	{
		return super.getLastName();
	}
	
	public void setLastName(String lastName)
	{
		super.setLastName(lastName);
	}

	public Date getJoiningDate()
	{
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate)
	{
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName()
	{
		return departmentName;
	}

	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}

	@Override
	public String toString()
	{
		return "\nEmployee [joiningDate=" + joiningDate + ", departmentName=" + departmentName + "]";
	}
}