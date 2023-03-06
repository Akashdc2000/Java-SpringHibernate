package com.example.orm.dao;

import com.example.orm.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;


public class StudentDao {

    private HibernateTemplate hibernateTemplate;



    //Save Student Details
    @Transactional
    public int insert(Student student){
        int rowCount=(int) this.hibernateTemplate.save(student);
        return rowCount;
    }


    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
