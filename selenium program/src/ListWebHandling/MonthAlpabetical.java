package ListWebHandling;

import java.util.SortedSet;
import java.util.TreeSet;

public class MonthAlpabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SortedSet<String> monthSet=new TreeSet<String>();
		monthSet.add("Jan");
		monthSet.add("Feb");
		monthSet.add("Mar");
		monthSet.add("April");
		monthSet.add("May");
		monthSet.add("Jun");
		monthSet.add("July");
		monthSet.add("Aug");
		monthSet.add("Sep");
		monthSet.add("Oct");
		monthSet.add("Nov");
		monthSet.add("Dec");
		for(String value:monthSet) {
			System.out.println(value);

	}

	}
}
