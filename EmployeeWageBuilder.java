public class EmployeeWageBuilder
{
	//Constants
	public static final int IS_FULL_TIME = 0;
   public static final int IS_PART_TIME = 1;
   public static final int EMP_RATE_PER_HR = 20;

	public static void main(String args[])
	{
		//Variables
		int empHrs = 0;
		int empWage = 0;

		//Computation
		int empCheck =(int) Math.floor((Math.random() * 10) %2);

		switch(empCheck)
		{
			case IS_FULL_TIME :
					empHrs = 8;
					break;
			case IS_PART_TIME :
					empHrs = 4;
					break;
			default :
					empHrs = 0;
		}

		//Calculating Emp wage
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee wage :"+empWage);
	}
}
