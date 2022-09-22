package com.InheritanceInterface.bll;

public class SalaryEmployee extends Employee{
	private double weeklySalary;

    
    public SalaryEmployee( String name, String jobTitle, double salary )
    {
       super( name, jobTitle ); 
       setWeeklySalary( salary );
    }
    
    public void setWeeklySalary( double salary )
         {
             if ( salary >= 0.0 )
                weeklySalary = salary;
             else
                System.out.println("Salary must be greater than 0");
          } 
    
       
          public double getWeeklySalary()
          {
             return weeklySalary;
          } 
    
         
          @Override                                                           
          public double calculatePay()                                            
          {
              return getWeeklySalary();                                        
          }

			@Override
			public String toString() {
				return "SalaryEmployee [name=" + getName() + ", jobTitle="+getJobTitle()+", totalWeeklySalary=" + calculatePay() + "]";
			}

}
