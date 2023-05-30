package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int command) {
		Controller controller = null;
		
		switch(command) {
		case 1:
			controller = new InsertProductController();
			break;
		case 2:
			controller = new SearchMakerProductController();
			break;
		case 3:
			controller = new UpdateProductController();
			break;
		case 4:
			controller = new PrintAllProductController();
			break;
		}
		
		return controller;
	}
	
	
	
}











