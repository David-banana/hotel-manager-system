package jiuDianGuanLi;


public class Guest {
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	private String name;
	private String teleNumber;
	private int roomNumber;
	public String getName() {
		return name;
	}
	public void setName(String name2) {
		this.name = name2;
	}
	public String getTeleNumber() {
		return teleNumber;
	}
	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}
	public Guest(String name,String teleNumber,int roomNumber){
		super();
		this.name = name;
		this.teleNumber = teleNumber;
		this.roomNumber = roomNumber;
	}

}


