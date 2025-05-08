package sortings;

public class Insertion {
 
	public void insertionSort(int[] arr) {
		int k;
		int j,i;
		for( i=1;i<=arr.length-1; i++) {
			k=arr[i];
			
			for( j=i-1; j>=0 && k<arr[j]; j--) {
				 
					arr[j+1]=arr[j];
				
			}
			arr[j+1]=k;
		}
		for(int in:arr) {
			System.out.print(in+" ");
		}
		
	}
}
