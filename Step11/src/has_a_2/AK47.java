package has_a_2;

public class AK47 extends Gun {

	public AK47() {
		bullet = 28;
	}
	@Override
	public void shot() {
		if(bullet == 0) {
			System.out.println("총알이 없습니다. 재장전 하세요");
		}else {
			bullet-=2;
			System.out.println("빵!빵!");
		}
	}
	
	@Override
	public void reload() {
		bullet = 28;
		System.out.println("AK47 소총 28발 재장전 완료.");
	}
}




