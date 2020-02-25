public class EmployeeWageBuilder{
	public static void main(String args[]){
		int IS_EMP_PRESENT = 1;
		int EMP_RATE_PER_HR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) %2;
		if ( empCheck == IS_EMP_PRESENT ){
			System.out.println("Employee is Present");
			empHrs=8;
		}else{
			System.out.println("Employee is absent");
		}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee wage :"+empWage);
	}
}
