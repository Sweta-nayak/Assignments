package assignment.com;

import java.time.LocalDate;
import java.time.Period;

public class DaysDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String startDate = "2018-01-01";
		String promotionDate = "2019-11-08";

		LocalDate sdate = LocalDate.parse(startDate);
		LocalDate pdate = LocalDate.parse(promotionDate);

		LocalDate ssdate = LocalDate.of(sdate.getYear(), sdate.getMonth(), sdate.getDayOfMonth());
		LocalDate ppdate = LocalDate.of(pdate.getYear(), pdate.getMonth(), pdate.getDayOfMonth());

		Period period = Period.between(ssdate, ppdate);
		System.out.println("Difference: " + period.getYears() + " years " 
		                                  + period.getMonths() + " months "
		                                  + period.getDays() + " days ");
		

	}

}
