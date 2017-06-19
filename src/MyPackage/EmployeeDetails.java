package MyPackage;

public class EmployeeDetails {


	 private String empName;
	 private int empId;
	 private double empSal;
	 EmployeeDetails employees[] = new EmployeeDetails[100];
		 
		 public EmployeeDetails(String empName,int empId,double empSal){
	         this.empName=empName;
	         this.empId=empId; 
	         this.empSal=empSal;
	      }
		 
		 public String getEmpName(){
			 return empName;
		 }
		
		 public int getEmpId(){
		     return empId;
		 }
		 
		  public double getSalary(){
		     return empSal;
		  }
}

		 
	


