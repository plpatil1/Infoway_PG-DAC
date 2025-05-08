package sortings;

public class Selection {

	public void selectionSort(int arr[]) {
		int n=arr.length;
		int i,j,temp;
		int min;
		
		
		for(i=0; i<=n-1; i++) {
			min=i;
			for(j=i+1; j<=n-1; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				if(min!=i) {
					temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a +" ");
		}
	}
}
