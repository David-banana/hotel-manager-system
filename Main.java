package jiuDianGuanLi;

import java.util.Scanner;

public class Main {
	static Room room = new Room();
	static Hotel hotel = new Hotel();
	static int  flag = 0;
	public static void main(String[] args) {
		if(flag == 0)hotel.go();
		flag++;
		System.out.println("---------��ӭ�����㽶��Ƶ�---------");
		System.out.println("1.��ѯ�Ƶ�շ�");
		System.out.println("2.��ѯ�Ƶ귿����Ϣ");
		System.out.println("3.�Ǽ���ס");
		System.out.println("4.�˷�");
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
			System.out.println("�������");
			break;
			
		}
		Main.main(args);
	}

}
