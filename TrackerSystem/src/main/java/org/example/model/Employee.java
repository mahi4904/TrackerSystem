package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;

        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
        private List<Skill> skills = new ArrayList<>();

        public Employee() {}
        public Employee(String name) {
            this.name = name;
        }

        public void addSkill(Skill skill) {
            skill.setEmployee(this);
            skills.add(skill);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters
    }

