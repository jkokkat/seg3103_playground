import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
public int day;
	private int month;
	private int year;

	//the date just prior to the expected date
	private Date dateOf;

	public DateNextDateExceptionTest(int year, int month, int day){
		this.day = day;
		this.month= month;
		this.year = year;
	}
	@Parameters
	public static List<Integer[]> data( )
	{
		List<Integer[]> params = new LinkedList<Integer[]>( );
		
		//test cases 16 to 20 
		params.add(new Integer[] {1500,2,31});
		params.add(new Integer[] {1500,2,29});
		params.add(new Integer[] { -1,10,20});
		params.add(new Integer[] { 1458,15,12});
		params.add(new Integer [] {1975,6,-50});
		
		return params;
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNextDate(){
		Date actualDate = new Date(year,month,day);
	}

}