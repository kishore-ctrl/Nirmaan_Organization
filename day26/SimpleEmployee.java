package day26;

import java.util.Objects;

public class SimpleEmployee {
	private String empName;
	private int empId;
	private String department;
	private double mobNo;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMobNo() {
		return mobNo;
	}
	public void setMobNo(double mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "SimpleEmployee [empName=" + empName + ", empId=" + empId + ", department=" + department + ", mobNo="
				+ mobNo + "]";
	}
	public SimpleEmployee() {
		super();
	}
	public SimpleEmployee(String empName, int empId, String department, double mobNo) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.mobNo = mobNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleEmployee other = (SimpleEmployee) obj;
		return empId == other.empId;
	}
	
	
	
	

}
