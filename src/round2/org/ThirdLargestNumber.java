package round2.org;

public class ThirdLargestNumber {
	
	
	
	public static void main(String[] args) {
		
		int[] array= {34,2,56,10,1,167};
		
		ascending(array);
		for(int h:array) {
			System.out.print(" "+h);
		}
		System.out.println();
		
		System.out.println("the third largest number in this array is"+array[3]);
		
	}
	
	public static void ascending(int[] array) {
		
		for(int i=0;i<=array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
	}

}
