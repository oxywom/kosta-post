package emp;

public class PartTime extends Employee {
	int time;
	int payPerTime;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	public PartTime() {}
	public PartTime(int id, String name, int time, int payPerTime) {
		super(id,name);
		this.time=time;
		this.payPerTime=payPerTime;
	}
	
	public int getPay() {
		return getTime()*getPayPerTime();
	}	
	
	@Override
	public String info() {
		return super.info()+",급여:"+getPay();
	}
}
