package unmanned_cafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static Map<String, Member> members = new HashMap<>();
    private static Map<Integer, Table> tables = new HashMap<>();
    private static ArrayList<Drink> drinks = new ArrayList<>();
    private static ArrayList<Reservation> reservations = new ArrayList<>();
	
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			tables.put(i, new Table(i));
		}
		
		drinks.add(new Drink("카푸치노", 3500));
		drinks.add(new Drink("유자티", 3000));
		drinks.add(new Drink("자몽에이드", 4000));
		
		Member member1 = new Member("이순신", "010-5315-2419");
		members.put(member1.getContact(), member1);
		
		makeReservation("2024-07-25 15:00", 1, "유자티", member1.getContact());
		
		Robot robot = new Robot();
		for(Reservation rs : reservations) {
			Table reservedTalbe = tables.get(rs.getTableNum());
			robot.makeDrink(rs.getDrink());
			robot.deliverDrink(reservedTalbe);
		}
		
	}

	public static void makeReservation(String date, int tableNum, String drinkName, String contact) {
		if(tables.get(tableNum).isReserved()) {
			System.out.println("예약된 자리입니다.");
			return;
		}
		
		Member customer = members.get(contact);
		Drink selectDrink = null;
		
		for(Drink drink : drinks) {
			if(drink.getName().equals(drinkName)) {
				selectDrink = drink;
				break;
			}
		}
		
		Reservation reservation = new Reservation(date, tableNum, selectDrink, customer);
		reservations.add(reservation);
		tables.get(tableNum).setReserved(true);
		System.out.println("예약 시간 : "+date+", 테이블 번호 : "+tableNum+"로 예약하신 "+customer.getName()+"님의 예약이 완료되었습니다.");
		
	}
	
	
}
