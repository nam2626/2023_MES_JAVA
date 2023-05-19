package method;
/*
 * 		에어컨
 * 			필드 : 전원, 온도, 모드, 타이머, 바람세기, 바람각도
 * 
 * 			기능
 * 				전원OnOff, 온도Up/Down, 모드변경, 타이머설정, 바람각도변경
 * 
 * 			전원 -> On/Off - boolean
 * 			온도 -> 18 ~ 30
 * 			모드 -> 냉방, 송풍, 제습
 * 			타이머 -> 1 2 3 끔
 * 			바람세기 -> 약, 중, 강, 자동
 * 			바람각도 -> 자동, 고정
 * 
 * 			생성자는 기본 생성자만 생성해서 알맞은 값으로 초기화
 * 
 * 
 * 
 */
public class Aircon {
	private boolean power;
	private int temp;
	private int mode;
	private int timer;
	private int windMode;
	private boolean windAngle;
	private final int MAX_TEMP = 30;
	private final int MIN_TEMP = 18;
	
	public Aircon() {
		temp = 24;
	}
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}
	
	public void tempUp() {
		if(!power) return;
		if(temp < MAX_TEMP) temp++;
		System.out.println("설정 온도 : " + temp);
	}
	public void tempDown() {
		if(!power) return;
		if(temp > MIN_TEMP) temp++;
		System.out.println("설정 온도 : " + temp);
	}
	
}









