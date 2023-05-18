package access;
/*
 * 	접근제어자
 * 		변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 *
 * 		private : 해당 클래스 내에서만 접근이 가능
 * 		protected : 해당 클래스를 상속받은 자식 클래스들까지 접근이 가능
 * 		default : 접근 제어자를 사용을 안했을때 자동으로 붙음, 같은 패키지 내에 있는 클래스들까지 접근이 가능
 * 		public : 누구나 접근이 가능
 * 
 */
public class Employee {
	//사번
	private String employeeNo;
	//이름
	private String employeeName;
	//급여
	private int salary;
	//부서명
	private String department;

	//전체 초기화하는 생성자
	public Employee(String employeeNo, String employeeName, int salary, String department) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	
	//이름을 문자열로 받아서 employeeName에 저장
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	//사원정보 출력하는 메서드
	public void printEmployeeInfo() {
		System.out.println(employeeNo + " " + employeeName + " "
											+ salary + " " + department);
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	
	
}








