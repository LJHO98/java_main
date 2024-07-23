package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("b2525", "자바", "ㅇㅇㅇ"));
		book.add(new Book("b3266", "파이썬", "ㅁㅁㅁ"));
		book.add(new Book("b3963", "자바스크립트", "ㄷㄷㄷ"));
		dvd.add(new DVD("d2637", "신과함께", "ㄹㄹㄹ"));
		dvd.add(new DVD("d2637", "괴물", "ㅎㅎㅎ"));
		dvd.add(new DVD("d2637", "극한직업", "ㅋㅋㅋ"));
		
		//대여 하기
		Library lib = new Library();
		lib.addRental(book.get(0), "이순신");
		lib.addRental(dvd.get(2), "김춘추");
		lib.showRentalList();
		
		
//		Rental<DVD> rent = new Rental<>(dvd.get(0), "이순신");
//		System.out.println(rent);
//		
//		Rental<Book> brent = new Rental<>(book.get(1), "김춘추");
//		System.out.println(brent);

	}

}
