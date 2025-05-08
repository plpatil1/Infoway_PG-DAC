package sortings;

public class Bubble {
	
	public  void bubbleSort(int[] arr) {
		
		int n=arr.length;
		int i,j,temp,flag;
		
		for(i=n-1; i>=0; i--) {
			flag=0;
			for(j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					flag=1;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(int num : arr) {
			
			System.out.print(num+" ");
		}
		
	}

}
