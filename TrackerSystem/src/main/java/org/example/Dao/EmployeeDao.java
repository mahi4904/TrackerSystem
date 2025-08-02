package org.example.Dao;

import org.example.Util.HibernateUtil;
import org.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDao {
        public void saveEmployee(Employee e) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                Transaction tx = session.beginTransaction();
                session.save(e);
                tx.commit();
            }
        }

        public List<Employee> findBySkill(String skillName) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                return session.createQuery(
                                "SELECT DISTINCT e FROM Employee e JOIN e.skills s WHERE s.skillName = :skill", Employee.class)
                        .setParameter("skill", skillName)
                        .list();
            }
        }

        public List<Employee> getAll() {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                return session.createQuery("FROM Employee", Employee.class).list();
            }
        }
    }

