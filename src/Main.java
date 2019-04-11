package com.capgemini.test;
import  com.capgemini.hibernate.model.*;
import  com.capgemini.dao.impl.*;

public class Main
{
	public static void main(String args[])
	{
		PersonDaoImpl personImpl=new PersonDaoImpl();
		System.out.println("Hello..");
		personImpl.addDetails(new Person(102,"Mehavash"));
		personImpl.addDetails(new Person(103,"shraddha"));
	}


}