package MyPackage;

import java.util.ArrayList;


public class MyClas {
	public static void main(String[] args) {
		
		ArrayList<EmployeeDetails> emp=new ArrayList<EmployeeDetails>(); 	
		for (int i = 0; i <= 100; i++) {
			String name="emp" + i;
			int id= i;
			double sal = i+100;
			EmployeeDetails employees = new EmployeeDetails(name,id,sal);
			emp.add(employees);
		}
		
		for (int i = 0; i < emp.size() ; i++) {
			EmployeeDetails employees = (EmployeeDetails) emp.get(i);
			System.out.println("Employee " + i +  " name is " + employees.getEmpId());
			System.out.println("Employee " + i +  " id is " + employees.getEmpName());
			System.out.println("Employee " + i +  " sal is " + employees.getSalary());
		    } 
		
	
	
	}

}

