import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{ 
	public int day;
	private int month;
	private int year;

	//the expected date that is going to be calculated by the nextDate() function
	private Date expectedDate;

	//the date just prior to the expected date
	private Date dateOf;


	public DateNextDateOkTest(int year, int month, int day){
		this.day = day;
		this.month= month;
		this.year = year;
		this.dateOf = new Date(year,month,day);
		this.expectedDate = dateOf.nextDate();
	}

	
	@Parameters
	public static List<Integer[]> data( )
	{
		List<Integer[]> params = new LinkedList<Integer[]>( );
		//these values match the expected results in the table

		//test cases 1 to 5 
		params.add(new Integer[] {1700,6,20});
		params.add(new Integer[] {2005,4,15});
		params.add(new Integer[] { 1901,7,20});
		params.add(new Integer[] { 3456,3,27 });
		params.add(new Integer[] { 1500,2,17});
		//
		//test cases 6 to 9
		params.add(new Integer[] { 1700,6,29});
		params.add(new Integer[] {1800,11,29 });
		params.add(new Integer[] {3453,1,29 });
		params.add(new Integer[] { 444,2,29});

		//test cases 10 to 12
		params.add(new Integer[] { 2005,4,30 });
		params.add(new Integer[] { 3453,1,30 });
		params.add(new Integer[] { 3456,3,30 });
		
		//test cases 13 to 15
		
		params.add(new Integer[] {1901,7,31 });
		params.add(new Integer[] { 3453,1,31 });
		params.add(new Integer[] { 3456,12,31 });
	
		return params;
	}

	@Test
	public void testNextDate(){
		//for test case 1 to 5
		//for test case 6 to 9
	
		//for test case 9
		if(year==444 && day==29){
				day=1;
				Date actualDate = new Date(year,(month+1),day);
				Assert.assertEquals(expectedDate,actualDate);

        } else if(day==30 && year==2005){ //for test case 10
				day=1;
				Date actualDate = new Date(year,(month+1),day);
				Assert.assertEquals(expectedDate,actualDate);


		} else if(day==31 ){  //for test cases 13,14,15
			if(month==12){
			day=1;
			month=1;
			year+=1;
			Date actualDate = new Date(year,month,day);
			Assert.assertEquals(expectedDate,actualDate);
            } else {
				day=1;
				Date actualDate = new Date(year,(month+1),day);
				Assert.assertEquals(expectedDate,actualDate);
			}

		}
		else{	
			Date actualDate = new Date(year,month,(day+1));
			Assert.assertEquals(expectedDate,actualDate);

		}
	
	}
}