package oop;

import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		Book castlevania = new Book();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the title of the book");
		castlevania.title = scan.nextLine();
		System.out.println("Please Enter the author name");
		castlevania.author = scan.nextLine();
		System.out.println("Plese enter the number of pages");
		castlevania.numberOfPages = scan.nextInt();
		
		System.out.println("The book Title is:"+castlevania.title);
		System.out.println("The book Author is:"+castlevania.author);
		System.out.println("The book has "+castlevania.numberOfPages+" pages");
		
		

	}

}
