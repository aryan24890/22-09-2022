package com.InheritanceInterface.bll;

public class HourlyEmployee extends Employee{
	private double payperhour;
	private double hours;
	
	
    
    public HourlyEmployee( String name, String jobTitle, double hrSalary, double hoursWorked )
    {
       super( name, jobTitle ); 
       setPayPerHour( hrSalary );
       setHours(hoursWorked);
    }
    
    public void setPayPerHour( double hrSalary )
         {
             if ( hrSalary >= 0.0 )
            	 payperhour = hrSalary;
             else {
                System.out.println("Please Enter Salary Greater than 0");
                
             }
          } 
    
       
          public double getPayPerHour()
          {
             return payperhour;
          } 
          
          
          public void setHours(double hoursWorked)
          {
        	  if ( ( hoursWorked >= 0.0 ))
        	  {
        		  hours=hoursWorked;
        	  }
        	  else {
                  System.out.println("Please Enter Hour Greater than 0");
                  
              }
        	  
          }
          public double getHours()
          {
        	  return hours;
          }
          
         
          @Override                                                           
          public double calculatePay()                                            
          {
              return getHours()*getPayPerHour();                                        
          }

		@Override
		public String toString() {
			return "HourlyEmployee [name="+getName()+", jobTitle="+getJobTitle()+", Pay-per-hour=" + payperhour + ", hours=" + hours +", totalPayment="+calculatePay()+ "]";
		}


}
