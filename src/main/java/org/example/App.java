package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory);

        Student s1=new Student(7,"Raj","male");
        System.out.println(s1);

        User u1=new User("Ajay","ajay@123");
        System.out.println(u1);


        Session session=sessionFactory.openSession();
        session.beginTransaction();

//        session.update(s1);
//        session.save(u1);
        //session.delete(u1);
        session.getTransaction().commit();

//
//        //Retrieve single record from table
//        User user=(User) session.get(User.class,1);
//        System.out.println(user);

//        //Retrieve  All records from a Database Table
//        List<User> user=session.createCriteria(User.class).list();
//        System.out.println(user);


        session.close();
    }
}


//Session Provide different methods
/*
    -> session.save():- insert new records/objects into database
    -> session.update():- Update data
    -> session.delete():- delete
    -> session.get(entity.class,ID) :- select values from database

 */