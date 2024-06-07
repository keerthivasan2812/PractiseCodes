package round2.org;

public class calculationUsingAdditionOperator {
	
	
public static void main(String[] args) {
		
	
	
	
//	2. Find the result subtraction, multiplication, division of two integers using + operator.
//
//	Input: 6 and 4
//
//	output:
//
//	addition 6+4 = 10,    subtraction  6+(-4) = 2,   multiplication = 24,   division = 1
//
//	Input : -8 and -4
//
//	Output:
//
//	addition -8+(-4) = -12,    subtraction  (-8)+(-(-4)) = -4,   multiplication = 32,   division = 2
		
		
	int[]num= {-8,-4};
		
		
		
	System.out.println(add(num));
	System.out.println(sub(num));
	System.out.println(mul(num));
	System.out.println(div(num));
		
		
	}

public static int add(int[] num) {
	
	
int one=	num[0];
int two=	num[1];

int result=one+two;
return result;
	
	
	
}

public static int sub(int[] num) {
	
	
int one=num[0];
int two=num[1];

int result=one+(-two);
return result;
	
	
	
}
public static int mul(int[] num) {
	
	
int one=num[0];
int two=num[1];

int result=((one+two)*2)+(one+(-two)*2);
return result;
	
	
	
}
public static int div(int[] num) {
	
	
int one=num[0];
int two=num[1];

int result=(one+two)/2-(one+(-two)/2);
return result;
	
	
}




}
