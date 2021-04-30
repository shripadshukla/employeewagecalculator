
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
				
				double Emp_Wage1 = (Working_days * Full_time_Wage * Full_time_Hour);
				
				double Emp_Wage2 = (Working_days * Full_time_Wage * Part_time_Hour);
				
				System.out.println("Full Time Employee Wage for a month is = " +Emp_Wage1 );
				System.out.println("Part Time Employee Wage for a month is = " +Emp_Wage2);

		}
}
