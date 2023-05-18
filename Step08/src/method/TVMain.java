package method;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		
		tv.muteOnOff();
		tv.muteOnOff();
		tv.muteOnOff();
		tv.muteOnOff();
		tv.muteOnOff();
		
		for(int i=0;i<50;i++)
			tv.chDown();
		for(int i=0;i<50;i++)
			tv.chUp();
		for(int i=0;i<30;i++)
			tv.volUp();
		for(int i=0;i<40;i++)
			tv.volDown();
	}

}













