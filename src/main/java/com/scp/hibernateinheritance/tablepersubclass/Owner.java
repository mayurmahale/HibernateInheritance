package com.scp.hibernateinheritance.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="OWNER")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Owner extends Person
{

	@Column(name="stocks")
	private Long stocks;
	
	@Column(name="partnership_stake")
	private Long partnershipStake;

	public Owner()
	{
	}
	
	public Owner(String firstname, String lastname, Long stocks, Long partnershipStake)
	{
		
		super(firstname, lastname);
		
		this.stocks = stocks;
		this.partnershipStake = partnershipStake;
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

	public Long getStocks()
	{
		return stocks;
	}

	public void setStocks(Long stocks)
	{
		this.stocks = stocks;
	}

	public Long getPartnershipStake()
	{
		return partnershipStake;
	}

	public void setPartnershipStake(Long partnershipStake)
	{
		this.partnershipStake = partnershipStake;
	}

	@Override
	public String toString()
	{
		return "\nOwner [stocks=" + stocks + ", partnershipStake=" + partnershipStake + "]";
	}
	
	

}