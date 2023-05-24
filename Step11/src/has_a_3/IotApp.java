package has_a_3;
/*
 * PowerOnOff 를 상속받은 클래스를 저장할 배열을 선언 길이는 10
 * 위에 배열에 객체를 저장하고 관리할 인덱스번호를 선언
 * 
 * 생성자에서는 배열 생성 하고 기기 3개 정도를 생성해서 저장
 * 
 * 외부로부터 새로운 기기를 받아서 배열에 등록하는 메서드를 생성
 * 단 기기 등록시 배열이 꽉차면 '더이상 등록할 수 없습니다.' 라는 메세지를 출력
 * 
 */
public class IotApp {
	private PowerOnOff[] arr;
	private int idx;

	public IotApp() {
		arr = new PowerOnOff[10];
		arr[idx++] = new TV();
		arr[idx++] = new Light();
		arr[idx++] = new Aircon();
	}
	
	public void addDevice(PowerOnOff device) {
		if(arr.length == idx) {
			System.out.println("더이상 기기를 등록할 공간이 없습니다.");
		}else {
			arr[idx++] = device;
			System.out.println("디바이스 등록 완료");
		}
	}
	
	//전체 전원 On
	public void deviceAllPowerOn() {
		for (int i = 0; i < idx; i++) {
			arr[i].powerOn();
		}
	}
	//전체 전원 Off
	public void deviceAllPowerOff() {
		for (int i = 0; i < idx; i++) {
			arr[i].powerOff();
		}
	}
}
















