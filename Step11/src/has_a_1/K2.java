package has_a_1;

public class K2 extends Gun{

	public K2() {
		bullet = 24;
	}
	
	@Override
	public void shot() {
		if(bullet == 0) {
			System.out.println("총알이 없습니다. 재장전 하세요");
		}else {
			bullet--;
			System.out.println("빵!");
		}
	}
	
	@Override
	public void reload() {
		bullet = 24;
		System.out.println("K2 소총 24발 재장전 완료.");
	}
}







