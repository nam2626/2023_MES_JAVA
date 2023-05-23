package has_a_2;

public class Police{
	private int handcuffs;
	private Gun gun;
	
	public Police() {
		handcuffs = 3;
		gun = new Gun();
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
	public void changeGun(Gun gun) {
		this.gun = gun;
		System.out.println(gun.getClass().getSimpleName() + "로 총기를 교체했습니다.");
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














