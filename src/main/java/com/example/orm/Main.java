package com.example.orm;

import com.example.orm.dao.StudentDao;
import com.example.orm.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello From the com.example.orm package");

        ApplicationContext context=new ClassPathXmlApplicationContext("configORM.xml");
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
        System.out.println(studentDao);

        Student s1=new Student(3,"Aananad",21);
        int count=studentDao.insert(s1);
        System.out.println(count+" No of rows inserted");

    }
}
