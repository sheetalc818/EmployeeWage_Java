public class EmployeeWageBuilder{
	public static void main(String args[]){
		int IS_EMP_PRESENT = 1;
		double empCheck = Math.floor(Math.random() * 10) %2;
		if ( empCheck == IS_EMP_PRESENT )
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");
	}
}
