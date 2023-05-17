package constructor;

public class Employee {
	String employeeNo;
	String employeeName;
	String tel;
	String email;
	String department;
	int pay;
	boolean gender;
	int position;
	
	//기본 생성자
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//전체 필드 초기화 하는 생성자
	public Employee(String employeeNo, String employeeName, String tel, String email, String department, int pay,
			boolean gender, int position) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.tel = tel;
		this.email = email;
		this.department = department;
		this.pay = pay;
		this.gender = gender;
		this.position = position;
	}
	
	//사번, 이름, 연락처, 이메일 필드 초기화 하는 생성자
	public Employee(String employeeNo, String employeeName, String tel, String email) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.tel = tel;
		this.email = email;
	}
	
}







