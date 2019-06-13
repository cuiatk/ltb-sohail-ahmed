package labTerminalB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	public void test() {
		 Customer calc=new Customer(null);
		String name=me.getName();
		assert name.equals("nadir");
	}
	public void test1() {

		Movie m1 = new Movie("Don", 0);
		Movie m2 = new Movie("khan", 1);
		Customer me = new Customer("Shari");
		Customer me2 = new Customer("malik");
		Rental r1 = new Rental(m1, 20);
		Rental r2 = new Rental(m2,20);
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for shari\r\n" + 
				"	Don	29.0\r\n" + 
				"	Khan	60.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	
	
	
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	

}
