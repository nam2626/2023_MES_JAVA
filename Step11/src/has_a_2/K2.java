package has_a_2;

public class K2 extends Gun{

	public K2() {
		bullet = 24;
	}
	
	@Override
	public void shot() {
		super.shot();
		super.shot();
		super.shot();
	}
	
	@Override
	public void reload() {
		bullet = 24;
		System.out.println("K2 소총 24발 재장전 완료.");
	}
}







