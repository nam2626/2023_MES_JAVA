package method;
/*
 *		TV를 동작시키는 클래스
 *			- 필드 : 채널, 음량, 전원, 음소거
 *						3			4			1        2
 *			- 기능 : 채널Up/Down, 음량Up/Down, 전원OnOff, 음소거OnOff
 *
 *			채널 : 1~456, 음량 : 0~30, 전원 : true/false, 음소거 : true/false  
 * 
 * 		기본 생성자만 생성 - 초기값은 알맞게 임의값으로 초기화
 * 
 * 		TV 테스트 하는 클래스 TVMain도 생성해서 기능을 만들때마다 테스트하면 구현
 */
public class TV {
	private boolean power;
	private boolean mute;
	private int ch;
	private int vol;

	public TV() {
		ch = 24;
		vol = 12;
	}
	
	//전원OnOff
	public void powerOnOff() {
		power = !power;
		
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}
	
	//음소거 OnOff
	public void muteOnOff() {
		if(!power) return;//강제 종료
		
		mute = !mute;
		
		if(mute)
			System.out.println("음소거 활성화");
		else
			System.out.println("음소거 비활성화");
	}
	
	//채널Up
	public void chUp() {
		if(!power) return;		
		
		ch++;
		
		if(ch > 456) ch = 1;
		
		System.out.println("현재 채널 : "+ch);
	}
	//채널Down
	public void chDown() {
		if(!power) return;		
		
		ch--;
		
		if(ch < 1) ch = 456;
		
		System.out.println("현재 채널 : "+ch);
	}
	
	public void volUp() {
		if(!power) return;
		
		if(mute) {
			muteOnOff();
		}else {
			if(vol < 30) vol++;
			System.out.println("현재 음량 : "+vol);
		}
		
	}
	public void volDown() {
		if(!power) return;
		
		if(mute) {
			muteOnOff();
		}else {
			if(vol > 0) vol--;
			System.out.println("현재 음량 : "+vol);
		}
		
	}
	
	
	
}











