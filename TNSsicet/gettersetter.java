package TNSsicet;

public class gettersetter {
	private String name;
	private String branch;
	private int rollnum;
	public String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String details() {
		if(name.equals("ashwini") && branch.equals("ece") && rollnum==25 && college.equals("sriindu"))
		{
		return "its me";
	}
	else
	{
		return "its not me";
	}
	}
}