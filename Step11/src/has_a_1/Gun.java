package has_a_1;

public class Gun {
	protected int bullet;

	public Gun() {
		bullet = 12;	
	}
	
	//reload 메서드 : 총알을 12개 채움, 채우고 나면 '재장전 완료' 메세지 출력
	public void reload() {
		bullet = 12;
		System.out.println("재장전 완료");
	}
	
	//shot 메서드 : 총알 한발 발사, 총알 하나를 감소, '빵!' 메세지도 출력
	//            총알이 없으면 '총알이 없습니다. 재장전 하세요' 라는 메세지를 출력
	public void shot() {
		if(bullet == 0) {
			System.out.println("총알이 없습니다. 재장전 하세요");
		}else {
			bullet--;
			System.out.println("빵!");
		}
	}
}













