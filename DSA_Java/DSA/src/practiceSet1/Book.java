package practiceSet1;

public class Book {
private int srno;
private String bookName;
private String autherName;
private int price;
private String publisher;
private Book next;

public Book() {
	srno=0;
	bookName=autherName=publisher="Null";
	next=null;
}
public Book(int sr, String bn, String an, int pr, String pn) {
	srno=sr;
	bookName = bn;
	autherName = an;
	price = pr;
	publisher = pn;
	next=null;
}
public int getSrno() {
	return srno;
}
public void setSrno(int srno) {
	this.srno = srno;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAutherName() {
	return autherName;
}
public void setAutherName(String autherName) {
	this.autherName = autherName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public Book getNext() {
	return next;
}
public void setNext(Book n) {
	next=n;
}

@Override
public String toString() {
	return "Book [srno=" + srno + ", bookName=" + bookName + ", autherName=" + autherName + ", price=" + price
			+ ", publisher=" + publisher + "]";
}





}
