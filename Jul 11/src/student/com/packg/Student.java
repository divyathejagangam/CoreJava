package student.com.packg;

public class Student {
	public int sid;
	public String sname;
	public float sage;
	public float sfee;

	
	public Student(int sid, String sname, float sage, float sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sfee = sfee;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sfee=" + sfee + "]";
	}
	
	}
