package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223739038";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Muhammad Jahanzaib Khan";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testBoundaryJune1() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("BoundaryJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testBoundaryJune2() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("BoundaryJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMaxFebruary29LeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("Max February 29 Leap Year Should Increment To March 1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxFebruary28NonLeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(28, 2, 2001);
	    System.out.println("Max February 28 Non Leap Year Should Increment To March 1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2001, date.getYear());
	}

	


	@Test
	public void testBoundaryJune15() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("Boundary June 15 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testBoundaryFebruary1() {
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("Boundary February 1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testBoundaryFebruary28LeapYear() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("Boundary February 28 Leap Year > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}


	@Test
	public void testBoundaryFebruary28NonLeapYear() {
	    DateUtil date = new DateUtil(28, 2, 2001);
	    System.out.println("Boundary February 28 Non Leap Year > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2001, date.getYear());
	}

	@Test
	public void testBoundaryFebruary1NonLeapYear() {
	    DateUtil date = new DateUtil(1, 2, 2001);
	    System.out.println("Boundary February 1 Non Leap Year > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2001, date.getYear());
	}

	@Test
	public void testNominalMarch() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("Test Nominal March > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalApril() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("Test Nominal April > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalMay() {
	    DateUtil date = new DateUtil(3, 5, 2024);
	    System.out.println("Test Nominal May > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalJune() {
	    DateUtil date = new DateUtil(17, 6, 2024);
	    System.out.println("Test Nominal June > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testNominalJuly() {
	    DateUtil date = new DateUtil(6, 7, 2024);
	    System.out.println("Test Nominal July > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testNominalAugust() {
	    DateUtil date = new DateUtil(9, 8, 2024);
	    System.out.println("Test Nominal August > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void test1B() {
	    DateUtil date = new DateUtil(6, 1, 1994);
	    System.out.println("Test Nominal August > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void test2B() {
	    DateUtil date = new DateUtil(2, 2, 1994);
	    System.out.println("Test Nominal August > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void test13B() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("Test Nominal August > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
}
