package com.generation.jbay.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Seller extends BaseEntity
{
	private int id;
	protected String username, address;

	@OneToMany(mappedBy = "seller")
	private List<Merch> merchandises;

	@Override
	public Integer getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public List<Merch> getMerchandises()
	{
		return merchandises;
	}

	public void setMerchandises(List<Merch> merchandises)
	{
		this.merchandises = merchandises;
	}

}
