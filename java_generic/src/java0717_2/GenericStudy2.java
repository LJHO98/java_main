package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("b2525", "�ڹ�", "������"));
		book.add(new Book("b3266", "���̽�", "������"));
		book.add(new Book("b3963", "�ڹٽ�ũ��Ʈ", "������"));
		dvd.add(new DVD("d2637", "�Ű��Բ�", "������"));
		dvd.add(new DVD("d2637", "����", "������"));
		dvd.add(new DVD("d2637", "��������", "������"));
		
		//�뿩 �ϱ�
		Library lib = new Library();
		lib.addRental(book.get(0), "�̼���");
		lib.addRental(dvd.get(2), "������");
		lib.showRentalList();
		
		
//		Rental<DVD> rent = new Rental<>(dvd.get(0), "�̼���");
//		System.out.println(rent);
//		
//		Rental<Book> brent = new Rental<>(book.get(1), "������");
//		System.out.println(brent);

	}

}
