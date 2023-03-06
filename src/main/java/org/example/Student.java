package org.example;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    //@Id indicate this property filed is primary key in Table
    @Id
    private int id;
    private String name;
    private String gender;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student==>{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
