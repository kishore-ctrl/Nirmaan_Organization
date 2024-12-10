package day14;

public class Employee {
	private String name;
	private int id;
	private long phone;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", phone=" + phone + ", dept=" + dept + "]";
	}
	public Employee(String name, int id, long phone, String dept) {
		
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.dept = dept;
	}
	
	public Employee() {
		
	}

}
