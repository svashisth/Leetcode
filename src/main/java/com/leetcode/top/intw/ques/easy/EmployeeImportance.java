/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/employee-importance
 */
public class EmployeeImportance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeImportance main = new EmployeeImportance();
		Employee emp = new Employee();
		emp.id = 1;
		emp.importance = 5;
		emp.subordinates = Arrays.asList(2,3);
		
		Employee emp2 = new Employee();
		emp2.id = 2;
		emp2.importance = 3;
		emp2.subordinates = Arrays.asList(4);
		
		Employee emp3 = new Employee();
		emp3.id = 3;
		emp3.importance = 4;
		emp3.subordinates = new ArrayList<Integer>();
		
		Employee emp4 = new Employee();
		emp4.id = 4;
		emp4.importance = 1;
		emp4.subordinates = new ArrayList<Integer>();
		
		List<Employee> employees = new ArrayList<>();
		employees.add(emp);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		int importance = main.getImportance(employees, 1);
		System.out.println("main\t" + importance);
	}

	public int getImportance(List<Employee> employees, int id) {
		if(employees == null || employees.isEmpty())
		{
			return 0;
		}
		
		Map<Integer, Employee> map = new HashMap<>();
		for (Employee employee : employees) {
			map.put(employee.id, employee);
		}
		
		if(!map.containsKey(id))
		{
			return 0;
		}
		
		Employee employee = map.get(id);
		int imp = employee.importance;
		return getImp(map, employee, imp);
	}
	
	public int getImp(Map<Integer, Employee> map, Employee employee, int imp)
	{
		List<Integer> subs = employee.subordinates;
		if(subs.isEmpty())
		{
			return imp;
		}
		for (Integer empId : subs) {
			Employee empl = map.get(empId);
			imp+=empl.importance;
			if(!empl.subordinates.isEmpty())
			{
				imp = getImp(map, empl, imp);
			}
		}
		
		return imp;
	}
	
	static class Employee {
	    // It's the unique id of each node;
	    // unique id of this employee
	    public int id;
	    // the importance value of this employee
	    public int importance;
	    // the id of direct subordinates
	    public List<Integer> subordinates;
	    
	    
	};
}
