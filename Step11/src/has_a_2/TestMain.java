package has_a_2;

public class TestMain {

	public static void main(String[] args) {
		Police p = new Police();
		
		for(int i=0;i<15;i++) {
			p.shot();
		}
		p.reload();
		for(int i=0;i<15;i++) {
			p.shot();
		}
		K2 k2 = new K2();
		p.changeGun(k2);
		for(int i=0;i<15;i++) {
			p.shot();
		}
		p.changeGun(new AK47());
		for(int i=0;i<15;i++) {
			p.shot();
		}
		
	}

}





