package removeDuplicateElementArray;

public class BigOn {
public static void main(String[] args) {
	int arr[]=new int[] {12,23,22,12,4,23,4,32,22,-999};
	int cnt[] =new int[33];
	int i,j;
	for(i=0;arr[i]!=-999;i++)
	{
		cnt[arr[i]]++;
	}
	for(i=0,j=0;arr[i]!=-999;i++)
	{
		if(cnt[arr[i]]>0)
		{
			arr[j]=arr[i];
			j++;
			cnt[arr[i]]=0;
		}
	}
	arr[j]=-999;
	for(i=0;arr[i]!=-999;i++)
	{
		System.out.println(arr[i]);
	}
}
}
