package p1;

public class Product {
private int pid;
private int price;
private int quantity;
private int total;
	
	public Product()
	{
		
	}
	public Product(int pid, int price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void Highest(Product arr[])
	{
		Product temp=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(temp.price<arr[i].price)
			{
				temp=arr[i];
			}
		}
		System.out.println("Highest Product Pid:-  "+temp.pid+"   Price:-    "+temp.price);
		
	}
	
	public void TotalAmount(Product ar[])
	{
		int sum=0;
		for(int i=0; i<ar.length; i++)
		{
			ar[i].total=ar[i].price*ar[i].quantity;
			sum+=ar[i].total;
		}
		System.out.println("")
		
	}
}
