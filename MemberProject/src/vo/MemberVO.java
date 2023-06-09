package vo;
/*
 * 변수 선언
 * 생성자
 * set/get
 * toString
 */
public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private boolean gender;
	public MemberVO(String id, String passwd, String name, boolean gender) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}









