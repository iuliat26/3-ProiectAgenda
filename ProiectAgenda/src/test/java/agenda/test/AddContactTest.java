package agenda.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agenda.exceptions.InvalidFormatException;

import agenda.model.base.Contact;
import agenda.model.repository.classes.RepositoryContactMock;
import agenda.model.repository.interfaces.RepositoryContact;


public class AddContactTest {

	private Contact con;
	private RepositoryContact rep;
	
	@Before
	public void setUp() throws Exception {
		rep = new RepositoryContactMock();
	}
	
	@Test
	public void testCase1()
	{
		try {
			con = new Contact("Urdea Ana-Maria", "Barbu Delavrancea nr.3", "0740201!!");
			
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		//int n = rep.count();
		rep.addContact(con);
		for(Contact c : rep.getContacts())
			if (c.equals(con))
			{
				assertTrue(true);
				break;
			}
		//assertTrue(n+1 == rep.count());
	}
	
	@Test
	public void testCase2()
	{
		try{
			rep.addContact((Contact) new Object());
		}
		catch(Exception e)
		{
			assertTrue(true);
		}	
	}
	
	@Test
	public void testCase3()
	{
		for(Contact c : rep.getContacts())
			rep.removeContact(c);
		
		try {
			con = new Contact("Tamas Iulia Ioana", "str. Fericirii nr.3", "0752020182");
			rep.addContact(con);
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		int n  = rep.count();
		if (n == 1) 
			if (con.equals(rep.getContacts().get(0))) assertTrue(true);
			else assertTrue(false);
		else assertTrue(false);
	}

	@Test
	public void testCase4()
	{
		for(Contact c : rep.getContacts())
			rep.removeContact(c);
		
		try {
			con = new Contact(26, 12, "Kristian");
			rep.addContact(con);
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		int n  = rep.count();
		if (n == 1) 
			if (con.equals(rep.getContacts().get(0))) assertTrue(true);
			else assertTrue(false);
		else assertTrue(false);
	}

	@Test
	public void testCase5()
	{
		for(Contact c : rep.getContacts())
			rep.removeContact(c);
		
		try {
			con = new Contact("Ana Urdea", "Barbu Delavrancea nr.3", "0721770957");
			rep.addContact(con);
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		int n  = rep.count();
		if (n == 1) 
			if (con.equals(rep.getContacts().get(0))) assertTrue(true);
			else assertTrue(false);
		else assertTrue(false);
	}

	@Test
	public void testCase6()
	{
		for(Contact c : rep.getContacts())
			rep.removeContact(c);
		
		try {
			con = new Contact("Kristian Gro", "somesului 2-12", "0744292929");
			rep.addContact(con);
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		int n  = rep.count();
		if (n == 1) 
			if (con.equals(rep.getContacts().get(0))) assertTrue(true);
			else assertTrue(false);
		else assertTrue(false);
	}

	@Test
	public void testCase7()
	{
		for(Contact c : rep.getContacts())
			rep.removeContact(c);
		
		try {
			con = new Contact("Tamas Iulia", "Titulescu nr.18", "0752020333");
			rep.addContact(con);
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		int n  = rep.count();
		if (n == 1) 
			if (con.equals(rep.getContacts().get(0))) assertTrue(true);
			else assertTrue(false);
		else assertTrue(false);
	}

	@Test
	public void testCase8()
	{
		for(Contact c : rep.getContacts())
			rep.removeContact(c);
		
		try {
			con = new Contact("Kristian", "str. Cioco nr.3", "");
			rep.addContact(con);
		} catch (InvalidFormatException e) {
			assertTrue(false);
		}
		int n  = rep.count();
		if (n == 1) 
			if (con.equals(rep.getContacts().get(0))) assertTrue(true);
			else assertTrue(false);
		else assertTrue(false);
	}
	
}