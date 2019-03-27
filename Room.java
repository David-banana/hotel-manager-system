package jiuDianGuanLi;

import java.util.Scanner;

public class Room {
	private int number;
	private String guestname; 
	private String guesttelenumber;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void in(String[] args){
		System.out.print("��������ס����:");
		Scanner console = new Scanner(System.in);
		int roomNumber = console.nextInt();
		if( roomNumber == 0)Main.main(args);
		if(Hotel.emptyRooms.contains(roomNumber) == false){
			System.out.println("���Ų����ڣ����������루��0���أ�");
			Main.room.in(args);
		}
		System.out.print("����������:");
		Scanner console1 = new Scanner(System.in);
		String name = console1.nextLine();
		System.out.print("��������ϵ��ʽ:");
		Scanner console2 = new Scanner(System.in);
		String telenumber = console2.nextLine();
		System.out.println();
		Main.room.setNumber(roomNumber);
		Guest guest = new Guest(name,telenumber,roomNumber);
		guestname = guest.getName();
		guesttelenumber = guest.getTeleNumber();
		int a = Hotel.emptyRooms.indexOf(roomNumber);
		Hotel.emptyRooms.remove(a);
		Hotel.fullRooms.add(roomNumber);
	}
	public void out(String[] args){
		System.out.print("�������˷�����:");
		Scanner console = new Scanner(System.in);
		int number = console.nextInt();
		if( number == 0)Main.main(args);
		if(Hotel.fullRooms.contains(number) == false){
			System.out.println("���Ų����ڣ����������루��0���أ�");
			Main.room.out(args);
		}
		int a1 = Hotel.fullRooms.indexOf(number);
		Hotel.fullRooms.remove(a1);
		Hotel.emptyRooms.add(number);
			System.out.println("�˷��ɹ���");
		for(int i = 0; i < Hotel.emptyRooms.size()-1; i++){
			for(int j = 0; j < Hotel.emptyRooms.size()-1-i;j ++){
				if(Hotel.emptyRooms.get(j) >Hotel.emptyRooms.get(j + 1)){
					int temp = Hotel.emptyRooms.get(j + 1);
					Hotel.emptyRooms.set(j + 1,Hotel.emptyRooms.get(j));
					Hotel.emptyRooms.set(j,temp);
				}
			}
		}
	}
	public void roomInformation(String[] args){
		System.out.print("��������Ҫ��ѯ�ķ����:");
		
		Scanner console = new Scanner(System.in);
		int number = console.nextInt();
		if( number == 0)Main.main(args);
		if(Hotel.fullRooms.contains(number) == false){
			System.out.println("���Ų����ڣ����������루��0���أ�");
			Main.room.roomInformation(args);
		}else if(Main.room.getNumber() == number){
			System.out.println();
			System.out.println("--------------------------");
			System.out.println("�˷����п�����ס");
			System.out.println("���˵������ǣ�" + Main.room.getGuestname());
			System.out.println("��1�˵ĵ绰�ǣ�" + Main.room.getGuesttelenumber());
			System.out.println("--------------------------");
			System.out.println();
		}else{
			System.out.println("�˷���Ϊ�գ�û�п�����Ϣ");
			System.out.println();
		}
	}
	public String getGuestname() {
		return guestname;
	}
	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}
	public String getGuesttelenumber() {
		return guesttelenumber;
	}
	public void setGuesttelenumber(String guesttelenumber) {
		this.guesttelenumber = guesttelenumber;
	}
	public void exit(){
		System.exit(0);
	}
}
