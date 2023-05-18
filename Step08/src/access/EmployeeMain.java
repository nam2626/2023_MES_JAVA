package access;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee("A0001", "홍길동", 2300, "경리부");
		emp.printEmployeeInfo();
//		emp.employeeName = "김철수";
		emp.setEmployeeName("김철수");
//		emp.salary = -3000;
		emp.printEmployeeInfo();
		
		System.out.println(emp);
		System.out.println(emp.toString());
		
	}

}
