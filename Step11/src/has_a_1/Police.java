package has_a_1;
/*
 * 	경찰이 가지고 있는 총, 수갑
 * 
 *  수갑 기본적으로 3개 들고 있게끔 처리
 *  
 *  총은 상속을 받아서 경찰이 가지고 있게끔 처리
 *  
 *  총 쏘는 행동, 재장전은 메서드 오버라이딩 해서 출력되게끔 처리
 *  
 *  수갑을 사용을하면 1개씩 차감
 */
public class Police extends Gun {
	private int handcuffs;

	public Police() {
		handcuffs = 3;
	}
	
	public void shot() {
		super.shot();
	}
	
	public void reload() {
		super.reload();
	}
	
	public void useHandcuffs() {
		if(handcuffs > 0) {
			handcuffs--;
			System.out.println("수갑을 사용합니다.");
		}else {
			System.out.println("더 이상 사용할 수갑이 없습니다.");
		}
	}
}














