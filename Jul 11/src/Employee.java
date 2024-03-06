
public class Employee {

	public int eid;
	public String ename;
	public float esalary;

	public Employee(int eid, String ename, float esalary) {
		// TODO Auto-generated constructor stub
		super();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		}

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
