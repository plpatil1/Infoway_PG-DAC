package sortings;

public class Merge {
	
	
	
	public  void mergeSort(int arr[], int low, int high) {
		int mid;
		int temp[] = new int[arr.length];
		
		if(low<high) {
			mid=(low+high)/2;
			mergeSort(arr, low, mid);
		    mergeSort(arr, mid+1, high);
		    
		    merge_Var2(arr, temp, low, mid, mid+1, high);
		    copy(arr, temp, low, high);
		    
		}
		
	}
	
	
	
	
	public static void copy(int arr[], int temp[], int low, int high) {
		int i=low;
		while(i<=high) {
			arr[i]=temp[i];
			i++;
		}
	}

	public static void merge_Var2(int[] arr, int[] res, int low1, int high1, int low2, int high2) {
		int i, j, tar;
		i=low1;
		j=low2;
		tar=low1;
		
		while((i<=high1)&&(j<=high2)) {
			if(arr[i]<arr[j]) {
				res[tar]=arr[i];
				tar++;
				i++;
			}else if(arr[j]<arr[i]) {
				res[tar]=arr[j];
				tar++;
				j++;
			} else {
				res[tar]=arr[i];
				tar++;
				i++;
				j++;
			}
		}
		
		while(i<=high1) {
			res[tar]=arr[i];
			tar++;
			i++;
			
		}
		while(j<=high2) {
			res[tar]=arr[j];
			tar++;
			j++;
		}
		
		/*
		 * for(int s:res) { System.out.print(s+ " "); }
		 */
	}
	
//	public static void merge_ver1(int arr1[], int arr2[], int res[]) {
//		int i=0,j=0,tar=0;
//		
//		while((i<arr1.length) && (j<arr2.length)) {
//			if(arr1[i]<arr2[j]) {
//				res[tar]=arr1[i];
//				tar++;
//				i++;
//				
//			}else if(arr2[j]<arr1[i]) {
//				res[tar]=arr2[j];
//				tar++;
//				j++;
//				
//			}else {
//				res[tar]=arr2[j];
//				tar++;
//				i++;
//				j++;
//			}
//		}
//		while(i<arr1.length) {
//			res[tar]=arr1[i];
//			tar++;
//			i++;
//		}
//		while(j<arr2.length) {
//			res[tar]=arr2[j];
//			tar++;
//			j++;
//		}
//		
//		for(int p:res) {
//			System.out.print(p+" ");
//		}
//	}
//	
	
}
