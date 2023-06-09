package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}
	//작업자를 찍어냄
	public Controller createController(int command) {
		Controller controller = null;
		
		switch(command) {
		case 1:
			controller = new InsertMemberController();
			break;
		}
		
		return controller;
	}
	
	
	
}











