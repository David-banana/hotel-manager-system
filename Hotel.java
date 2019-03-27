package jiuDianGuanLi;

import java.util.LinkedList;

public class Hotel {
	private String name = "Ïã½¶´ó¾Æµê";
	static LinkedList<Integer> emptyRooms = new LinkedList<Integer>();
	static LinkedList<Integer> fullRooms = new LinkedList<Integer>();
	public  LinkedList<Integer> go(){
		emptyRooms.add(101);emptyRooms.add(102);emptyRooms.add(103);emptyRooms.add(104);emptyRooms.add(105);emptyRooms.add(106);
		emptyRooms.add(201);emptyRooms.add(202);emptyRooms.add(203);emptyRooms.add(204);emptyRooms.add(205);emptyRooms.add(206);
		emptyRooms.add(301);emptyRooms.add(302);emptyRooms.add(303);emptyRooms.add(304);emptyRooms.add(305);emptyRooms.add(306);
		emptyRooms.add(401);emptyRooms.add(402);emptyRooms.add(403);emptyRooms.add(404);emptyRooms.add(405);emptyRooms.add(406);
		emptyRooms.add(501);emptyRooms.add(502);emptyRooms.add(503);emptyRooms.add(504);emptyRooms.add(505);emptyRooms.add(506);
		emptyRooms.add(601);emptyRooms.add(602);emptyRooms.add(603);emptyRooms.add(604);emptyRooms.add(605);emptyRooms.add(606);
		return emptyRooms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void look(){
		int num = 0;
		for(int i = 0;i < emptyRooms.size(); i ++){
			System.out.print(emptyRooms.get(i));
			System.out.print(" ");
			num++;
			if(num == 6){
				System.out.println();
				num = 0;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
