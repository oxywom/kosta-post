package emp;

public class CompanyMain {
	public static void main(String[] args) {
		Permanent emp1 = new Permanent(1001,"상부상조",5000000);
		Sales emp2 = new Sales(1002,"자바조",4000000,1000000);
		PartTime emp3 = new PartTime(1003,"커피조",160,300000);
		System.out.println(emp1.info());
		System.out.println(emp2.info());
		System.out.println(emp3.info());
	}
}
/*
사번:1001,이름:상부상조,급여:5000000
사번:1002,이름:자바조,급여:5000000
사번:1003,이름:커피조,급여:4800000
*/