package method;

public class AirconMain {

	public static void main(String[] args) {
		Aircon air = new Aircon();
		
		air.powerOnOff();
		air.powerOnOff();
		air.powerOnOff();
		
		for(int i=0;i<20;i++)
			air.tempUp();
		
		for(int i=0;i<40;i++)
			air.tempDown();
		
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
		
		air.changeWindAngle();
		air.changeWindAngle();
		air.changeWindAngle();
		air.changeWindAngle();
		air.changeWindAngle();
		
		air.changeWindPower();
		air.changeWindPower();
		air.changeWindPower();
		air.changeWindPower();
		air.changeWindPower();
	}

}


