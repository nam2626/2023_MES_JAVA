package inheritance_02;

public class EmployeeMain {
	//Employee 타입으로 SalaryEmployee, DispatchEmployee까지 받아 올수 있다.(자식들은 부모가 받을 수 있다)
	//자식 클래스는 부모 클래스로 형변환이 가능
	public static void work(Employee e) {
		e.work();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3 = new DispatchEmployee();
		
		Employee emp = e3;
		emp.work();
		
		work(e1);
		work(e2);
		work(e3);
	}

}





