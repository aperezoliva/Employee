/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Feb 2, 2022
*/
package model;

/**
 * @author krazy
 *
 */
public class EmpBusinessLogic {
	
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		
		return appraisal;
	}

	public boolean isRetirementAge(Employee employee) {
		int retirementAge = 65;
		
		if (employee.getAge() > retirementAge) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
