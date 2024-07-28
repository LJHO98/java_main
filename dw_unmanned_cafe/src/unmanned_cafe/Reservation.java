package unmanned_cafe;

public class Reservation {
	private String reservationDate;
	private int tableNum;
	private Drink drink;
	private Member customer;
	
	public Reservation(String reservationDate, int tableNum, Drink drink, Member customer) {
        this.reservationDate = reservationDate;
        this.tableNum = tableNum;
        this.drink = drink;
        this.customer = customer;
    }

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public Member getCustomer() {
		return customer;
	}

	public void setCustomer(Member customer) {
		this.customer = customer;
	}
	
	
	
	
}
