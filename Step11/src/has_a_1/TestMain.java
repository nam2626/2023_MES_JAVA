package has_a_1;

public class TestMain {

	public static void main(String[] args) {
		Police police = new Police();
		
		for(int i=0;i<15;i++)
			police.shot();
		police.reload();
		for(int i=0;i<15;i++)
			police.shot();
	}

}
