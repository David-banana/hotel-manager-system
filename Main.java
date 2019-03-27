package jiuDianGuanLi;

import java.util.Scanner;

public class Main {
	static Room room = new Room();
	static Hotel hotel = new Hotel();
	static int  flag = 0;
	public static void main(String[] args) {
		if(flag == 0)hotel.go();
		flag++;
		System.out.println("---------欢迎光临香蕉大酒店---------");
		System.out.println("1.查询酒店空房");
		System.out.println("2.查询酒店房间信息");
		System.out.println("3.登记入住");
		System.out.println("4.退房");
		System.out.println("5.exit");
		System.out.println("-------------------------------");
		Scanner console = new Scanner(System.in);
		int choice = console.nextInt();
		switch(choice){
		case 1:	
			hotel.look();
			break;
		case 2:
			room.roomInformation(args);
			break;
		case 3:
			room.in(args);
			break;
		case 4:
			room.out(args);
			break;
		case 5:
			room.exit();
			break;
		default:
			System.out.println("输入错误");
			break;
			
		}
		Main.main(args);
	}

}
