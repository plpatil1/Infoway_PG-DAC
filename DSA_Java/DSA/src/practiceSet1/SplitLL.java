package practiceSet1;

public class SplitLL {
public static void main(String[] args) {
	BookLL LB1 = new BookLL();
	BookLL LB2 = new BookLL();
	BookLL res = new BookLL();
	
	// Insert books into LB1
	LB1.insertFirst(1, "Mrutyunjay", "Shivaji Sawant", 362, "Historical Fiction");
	LB1.insertFirst(2, "Yayati", "V S Khandekar", 400, "Historical Fiction");
	LB1.insertFirst(3, "Malgudi Days", "R K Narayan", 248, "Short Stories");
	LB1.insertFirst(4, "The Guide", "R K Narayan", 224, "Fiction");
	LB1.insertFirst(5, "Gitanjali", "Rabindranath Tagore", 120, "Poetry");
	LB1.insertFirst(6, "Discovery of India", "Jawaharlal Nehru", 595, "History");
	LB1.insertFirst(7, "The White Tiger", "Aravind Adiga", 320, "Fiction");

	// Insert books into LB2
	LB2.insertFirst(8, "Wings of Fire", "A P J Abdul Kalam", 180, "Autobiography");
	LB2.insertFirst(9, "The Monk Who Sold His Ferrari", "Robin Sharma", 198, "Self-help");
	LB2.insertFirst(10, "The Alchemist", "Paulo Coelho", 208, "Philosophical Fiction");
	LB2.insertFirst(11, "Sapiens", "Yuval Noah Harari", 498, "Non-fiction");
	LB2.insertFirst(12, "A Brief History of Time", "Stephen Hawking", 212, "Science");
	LB2.insertFirst(13, "Atomic Habits", "James Clear", 320, "Self-improvement");
	LB2.insertFirst(14, "Rich Dad Poor Dad", "Robert Kiyosaki", 336, "Personal Finance");
     
	
	LB1.displayr();
	System.out.println("\n---------------------");
	LB2.displayr();
	split(LB1,LB2,res);
}
public static void split(BookLL l1, BookLL l2, BookLL res) {
	
}
}
