public class EmployeeWageBuilder
{
	public static void main(String args[])
	{
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) %2;

		if ( empCheck == IS_FULL_TIME )
		{
			System.out.println("Employee is full time");
			empHrs=8;
		}
		else if ( empCheck == IS_PART_TIME )
		{
			System.out.println("Employee is part time");
			empHrs=4;
		}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee wage :"+empWage);
	}
}
