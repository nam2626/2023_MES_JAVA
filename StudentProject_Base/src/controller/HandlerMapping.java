package controller;

//작업자 찍어내는 클래스
public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	//작업자를 찍어내는 메서드
	public Controller createController(int command) {
		Controller controller = null;
		
		switch(command) {
		
		}
		
		return controller;
	}
	
	
	
}











