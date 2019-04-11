package com.capgemini.hibernate.model;

import org.hibernate.*;


import javax.persistence.*;

@Entity
public class Person
{
	@Id
	private int id;
	private String name;

	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public String toString()
	{
		return "id="+id+"\n name= "+name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id=id;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}



}