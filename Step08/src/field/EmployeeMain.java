package field;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();//생성
		emp.employeeNo = "A001011";// 변수A.변수B  변수A 안에 있는 변수B에 접근하겠다.
		emp.employeeName = "김철수";
		emp.email = "aaa@gmail.com";
		emp.gender = true;
		emp.pay = 2100;
		emp.position = 2;
		emp.tel = "010-0000-1111";
		emp.department = "회계부";
		
		System.out.println(emp.employeeNo);
		System.out.println(emp.employeeName);
		System.out.println(emp.position);
		System.out.println(emp.department);
		System.out.println(emp.pay);
		System.out.println(emp.email);
		System.out.println(emp.tel);
		System.out.println(emp.gender ? "남자" : "여자");
		
	}

}

