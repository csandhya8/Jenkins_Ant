package com.ant.web;




import junit.framework.TestCase;

import java.util.Collection;
import java.util.LinkedList;

public class SimpleNewTest extends TestCase
{

	public static int count=15;
	
	final Simple simple = new Simple();

	public SimpleNewTest(String nm)
	{
		super(nm);
	}

	public void testSquare()
	{
		assertEquals(1, simple.square(1));
		assertEquals(1, simple.square(-1));
	}

	public void testF()
	{
		assertEquals(1, simple.f(-1));
		assertEquals(12, simple.f(6));
	}

	public void testSum()
	{
		count++;
		System.out.println("count-------------"+count);
		
		Collection c = new LinkedList();
		c.add(new Integer(3));
		c.add(new Integer(5));
		c.add(new Integer(8));
		assertEquals(count, simple.sum(c));
	}
}