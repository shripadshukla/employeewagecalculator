
public class EmpWageCompute {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
				int Full_time_employee = 1;
				int Part_time_employee = 2;
				int Full_time_Wage = 20;
				int Full_time_Hour = 8;
				int Part_time_Hour = 4;
				
				// Total working days for a month
				int Working_days = 20;
				
				// n is maximum working hours
				int n= 100;
				
				// d is maximum working days
				int d=20;
				
				for(int i=1; i<=n; i++) {
					
					for (int j=1; j<=d; j++) {
						
						double Emp_Wage1 = (j * Full_time_Wage * i);
						
						System.out.println("Full Time Employee Wage for a month is = " +Emp_Wage1 );
					}
					
				}
		}
}
