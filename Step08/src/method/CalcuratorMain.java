package method;

public class CalcuratorMain {

	public static void main(String[] args) {
		Calcurator cal = new Calcurator();
		
		System.out.println(cal.sum(10, 7));
		System.out.println(cal.sum(10, 7));
		System.out.println(cal.sum(10, 7));
		System.out.println(cal.min(10, 7));
		System.out.println(cal.min(10, 7));
		System.out.println(cal.mul(10, 7));
		System.out.println(cal.div(10, 7));
		
		cal.printCount();
		
		System.out.println(cal.maxNumber(10, 20));
		System.out.println(cal.minNumber(10, 20));
		
	}

}





