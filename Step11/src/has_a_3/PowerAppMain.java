package has_a_3;

import java.util.Scanner;

public class PowerAppMain {
	public static PowerOnOff createDevice(Scanner sc) {
		System.out.println("기기등록을 시작합니다.......");
		System.out.println("1. TV");
		System.out.println("2. Aircon");
		System.out.println("3. Light");
		int n = sc.nextInt();
		PowerOnOff power = null;
		switch(n) {
		case 1:
			power = new TV();
			break;
		case 2:
			power = new Aircon();
			break;
		case 3:
			power = new Light();
			break;
		}
		return power;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IotApp app = new IotApp();
		
		while(true) {
			System.out.println("1. 기기등록");
			System.out.println("2. 전체 전원 On");
			System.out.println("3. 전체 전원 Off");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호 입력 : ");
			int no = sc.nextInt();
			if(no == 0) break;
			switch(no) {
			case 1:
				PowerOnOff power = createDevice(sc);
				if(power != null) app.addDevice(power);
				break;
			case 2:
				app.deviceAllPowerOn();
				break;
			case 3:
				app.deviceAllPowerOff();
				break;				
			}
			
		}
	}

}














