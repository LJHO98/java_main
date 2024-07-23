package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Rental<? extends Media>> list = new ArrayList<>();
	
	//제네릭 메서드 - 클래스에는 제네릭이 없고 메서드에만 제네릭 지정
	public <T extends Media> void addRental(T item, String renter) {
		Rental<T> rental = new Rental<>(item, renter);
		list.add(rental);
		System.out.println("대여 -> " + rental);
	}
	
	public void showRentalList() {
		for(Rental<? extends Media> r: list) {
			System.out.println(r);
		}
	}
}
