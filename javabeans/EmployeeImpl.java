package javabeans;

public class EmployeeImpl {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEno(100)	;
		employee.setEname("vijay");
		employee.setEsal(100000);
		System.out.println(employee.getEno())	;
		System.out.println(employee.getEname());
		System.out.println(employee.getEsal());
		
	}

}
