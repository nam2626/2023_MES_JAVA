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
//객체와 객체의 Has a 관계의 경우 이렇게 총과 경찰관의 사례보면
//경찰이 총기를 자유롭게 다양하게 교체해야되지만
//상속으로 표현하면 총기 하나에 귀속, 확장성 떨어지는 문제가 생김
//총기 교체할려면 코드를 수정해야 되는 문제가 생김
//이런 문제 때문에 Has a 관계를 표현 할때는 상속 구조로 표현하면 안됨

//public class Police extends Gun {
public class Police extends K2 {
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














