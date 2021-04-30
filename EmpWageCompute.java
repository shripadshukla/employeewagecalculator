
public class EmpWageCompute {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int Employee = 1;
		int Full_time_Wage = 20;
		int Full_time_Hour = 8;
		int Part_time_Hour = 4;
		
		// Total working days for a month
		int Working_days = 20;
		
		switch (Employee) {
		
			case 1:
				System.out.println("Employee is Full Time Present");
				
				double Emp_Wage1 = (Working_days * Full_time_Wage * Full_time_Hour);
				System.out.println("Full Time Employee Wage for a month is = " +Emp_Wage1 );
			
			default:
				System.out.println("Employee is Part Time Present");
				
				double Emp_Wage2 = (Working_days * Full_time_Wage * Part_time_Hour);
				System.out.println("Part Time Employee Wage for a month is = " +Emp_Wage2);
			}

		}
}
