public class EmployeeWageBuilder
{
	//Constants
	public static final int IS_FULL_TIME = 0;
   public static final int IS_PART_TIME = 1;
   public static final int EMP_RATE_PER_HR = 20;
	public static final int NUMBER_OF_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main(String args[])
	{
		//Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int dailyWage=0;
		//Computation
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_DAYS )
		{
			totalWorkingDays++;
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
			dailyWage = empHrs * EMP_RATE_PER_HR;
			totalEmpWage += dailyWage;
			System.out.println("Employee wage :"+dailyWage);
		}
		System.out.println("Total Emp wage:"+totalEmpWage);
	}
}
