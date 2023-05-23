package has_a_3;

public class Aircon extends PowerOnOff {

	@Override
	public void powerOn() {
		power = true;
		System.out.println("Aircon 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("Aircon 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("Aircon 전원 On");
		else
			System.out.println("Aircon 전원 Off");
	}
}






