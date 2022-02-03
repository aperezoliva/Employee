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
public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Employee() {
		this.name = "John";
		this.monthlySalary = 0;
		this.age = 0;
	}
	
	public Employee(String name) {
		this.name = name;
	}
}
