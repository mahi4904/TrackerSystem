package org.example;

import org.example.Dao.EmployeeDao;
import org.example.model.Employee;
import org.example.model.Skill;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

                EmployeeDao dao = new EmployeeDao();

                // Register new employee with skills
                Employee emp = new Employee("Amit Sharma");
                emp.addSkill(new Skill("Java", "Expert"));
                emp.addSkill(new Skill("SQL", "Intermediate"));

                dao.saveEmployee(emp);

                // Search employee by skill
                System.out.println("Searching for Java-skilled employees...");
                dao.findBySkill("Java").forEach(e ->
                        System.out.println("Found: " + e.getName())
                );
            }
        }
