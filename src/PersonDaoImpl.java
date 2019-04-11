package com.capgemini.dao.impl;
import com.capgemini.dao.*;
import org.hibernate.*;
import com.capgemini.util.*;

import  com.capgemini.hibernate.model.*;

import org.hibernate.boot.registry.*;



import org.hibernate.boot.*;



import org.hibernate.*;



import javax.persistence.*;



public class PersonDaoImpl implements PersonDao
{
	@Override
	public void addDetails(Person person)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= session.beginTransaction();
		session.save(person);
		tx.commit();
	
	}
}