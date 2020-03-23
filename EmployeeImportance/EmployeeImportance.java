package EmployeeImportance;

import java.util.ArrayList;
import java.util.List;

//690. Employee Importance
// You are given a data structure of employee information, which includes the employee's unique id, his importance value and his direct subordinates' id.
// For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. 
// They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.
// Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all his subordinates.

// Example 1:
// Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
// Output: 11
// Explanation:
// Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3. They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.

// Employee info

class EmployeeImprotance {

    public static void main(String[] args) {
        List<Integer> subEm1 = new ArrayList<>();
        subEm1.add(2);
        subEm1.add(3);

        Employee em1 = new Employee(1, 5, subEm1);

        List<Integer> subEm2 = new ArrayList<>();
        Employee em2 = new Employee(2, 3, subEm2);

        List<Integer> subEm3 = new ArrayList<>();
        Employee em3 = new Employee(3, 3, subEm3);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(em1);
        employees.add(em2);
        employees.add(em3);

        System.out.println(getImportance(employees, 1));
    }

    public static int getImportance(List<Employee> employees, int id) {
        int value = 0;
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).id == id){
                value += employees.get(i).importance + getImportanceHelper(employees, employees.get(i).subordinates, value);
            }
        }

        return value;

    }

    public static int getImportanceHelper(List<Employee> employees, List<Integer> sub, int value) {
        for(int i = 0; i < sub.size(); i++){
            for(int j = 0; j < employees.size(); j++){
                if(sub.get(i) == employees.get(j).id){
                    value += employees.get(j).importance+getImportanceHelper(employees, employees.get(j).subordinates, value);
                }
            }
        }

        return value;
    }

}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    Employee(int i, int j, List<Integer> k) {
        id = i;
        this.importance = j;
        this.subordinates = k;
    }

};