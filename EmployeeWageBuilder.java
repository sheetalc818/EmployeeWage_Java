import java.util.*;
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

	public int calculateEmployeeWageForCompany()
	{
		//Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int dailyWage=0;

		//Computation
		while ( totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays )
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
			dailyWage = empHrs * empRatePerHr;
			totalEmpWage += dailyWage;
			System.out.println("Company :"+company+" Work_Days :"+totalWorkingDays+" Daily_Wage :"+dailyWage);
		 }
		System.out.println(company+" Total_Emp_Wage :"+totalEmpWage);
		return totalEmpWage;
	 }

	public static void main(String args[])
	{
		ArrayList<EmployeeWageBuilder> companyData=new ArrayList<EmployeeWageBuilder>();

		EmployeeWageBuilder company1= new EmployeeWageBuilder("DMart",20,2,10);
		EmployeeWageBuilder company2= new EmployeeWageBuilder("Bridgelabz",40,2,10);

		companyData.add(company1);
		companyData.add(company2);

		for (EmployeeWageBuilder data : companyData)
      {
         data.calculateEmployeeWageForCompany();
			System.out.println("");
      }
   }
}
