import java.util.*;

class CompanyEmpWage
{
    String company;
    int empRatePerHr;
    int numOfWorkingDays;
    int maxHrsPerMonth;

    public CompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth)
    {
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsPerMonth=maxHrsPerMonth;
    }
}

class EmployeeWageBuilder
{
    //Constants
    public static final int IS_FULL_TIME = 0;
    public static final int IS_PART_TIME = 1;

    public List<CompanyEmpWage> companyWage = new ArrayList<CompanyEmpWage>();
    int number=0,i;

    public void addCompany(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth)
    {
        companyWage.add(new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth));
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

        for ( i=0; i<companyWage.size(); i++)
        {
            //Computation
            while ( totalEmpHrs <= companyWage.get(i).maxHrsPerMonth && totalWorkingDays < companyWage.get(i).numOfWorkingDays )
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
                dailyWage = empHrs * companyWage.get(i).empRatePerHr;
                totalEmpWage += dailyWage;
                System.out.println("Company :"+ companyWage.get(i).company+" Work_Days :"+totalWorkingDays+" Daily_Wage :"+dailyWage);
            }
            System.out.println(companyWage.get(i).company+" Total_Emp_Wage :"+totalEmpWage);
        }
        return totalEmpWage;
    }

    public static void main(String args[])
    {
        EmployeeWageBuilder empWage = new EmployeeWageBuilder();

        empWage.addCompany("Dmart",20,2,10);
        empWage.addCompany("Reliance",20,4,10);

        empWage.calculateEmployeeWageForCompany();
    }
}
