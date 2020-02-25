public class EmployeeWageBuilder
{
	//Constants
	public static final int IS_FULL_TIME = 0;
   public static final int IS_PART_TIME = 1;

	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;

	public EmployeeWageBuilder(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth)
	{
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}

	public static void main (String args[])
	{
		EmployeeWageBuilder dMart = new EmployeeWageBuilder("DMart", 20, 2, 10);

		//Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int dailyWage=0;

		//Computation
		while ( totalEmpHrs <= dMart.maxHrsPerMonth && totalWorkingDays < dMart.numOfWorkingDays )
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor((Math.random() * 10) %2);
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
			dailyWage = empHrs * dMart.empRatePerHr;
			totalEmpWage += dailyWage;
			System.out.println("Company :"+dMart.company+" Work_Days :"+totalWorkingDays+" Daily_Wage :"+dailyWage);
		}
		System.out.println(dMart.company+" Total_Emp_Wage :"+totalEmpWage);
	}
}
