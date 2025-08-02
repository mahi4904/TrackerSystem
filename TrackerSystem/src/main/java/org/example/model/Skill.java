package org.example.model;


import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String skillName;
        private String experienceLevel;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;

        public Skill() {}
        public Skill(String skillName, String experienceLevel) {
            this.skillName = skillName;
            this.experienceLevel = experienceLevel;
        }

    public void setEmployee(Employee employee) {
    }

    // Getters and Setters
    }

