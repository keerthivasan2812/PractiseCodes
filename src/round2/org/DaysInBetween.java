package round2.org;

public class DaysInBetween {
	
	public static void main(String[] args) {
		
//		
//		4.Given two dates, find total number of days between them.
//
//		Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
//
//		Output: 393
//
//		dt1 represents “10-Feb-2014” and dt2 represents “10-Mar-2015” The difference is 365 + 28
//
//		Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
//
//		Output: 29
//
//		Note that 2000 is a leap year
//
//		Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
//
//		Output: 0
//
//		Both dates are same
//
//		Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
//
//		Output: 1461
//
//		Number of days is 365*4 + 1
//		
//		
		
		
	int[]dt1 = {10, 2, 2000};
	int[]dt2 = {10, 3, 2000};
	
	int days=findDays(dt1,dt2);
		
		System.out.println(days);
	}
	
	public static int findDays(int[] d1 ,int[] d2) {
		
		
		int daysInAYear=365;
		
		int year1=d1[2];
		
		int month1=d1[1];
		int day1=d1[0];
		

	
		
		int year2=d2[2];
		
		int month2=d2[1];
		int day2=d2[0];
		
		int daysbetween=0;
		
		
		for(int i=year1;i<=year2;i++) {
			
			daysbetween+= isleap(i) ? daysInAYear:366;
			
		};
		System.out.println(daysbetween);
	
		for(int j=1;j<month1;j++) {
			daysbetween+=countdaysinmonth(j,year1);
			
		}
		daysbetween+=day1-1;
		 if (month2 < month1) {
		
	    for (int k = month2; k <month1 ; k++) {
	        daysbetween -= countdaysinmonth(k, year2);
	    }
		 }
	    daysbetween -= day2 - 1; // Subt
		return daysbetween;
	}
	
	
	public static boolean isleap(int j){
		
		return (j%4==0&&j%100!=0)||(j%400==0);
		
	}
	
	public static int countdaysinmonth(int month,int year) {
		
		if(month==2) {
			return isleap(year)? 29:28;
			
		}else if(month==4||month==6||month==9||month==11) {
			
			return 30;
		}else {
			return 31;
		}
		
	}
	
	
	
	
	

}
