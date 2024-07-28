package unmanned_cafe;

public class Table {
	private int tableNum;
	private boolean isReserved;
	
	public Table(int tableNum) {
		this.tableNum = tableNum;
		this.isReserved = false;
	}
	
	@Override 
	public String toString() {
		return tableNum + ", " + isReserved;
	}
	
	public int getTableNum() {
		return tableNum;
	}
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	
	
}
