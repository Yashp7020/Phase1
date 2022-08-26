package com.employee.restservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

#HEllothisis

@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Fname;
    private String Lname;
    private String PhNo;

    public String getFname() {
        return Fname;
    }
    public void setFname(String fname) {
        Fname = fname;
    }
    public String getLname() {
        return Lname;
    }
    public void setLname(String lname) {
        Lname = lname;
    }
    public String getPhNo() {
        return PhNo;
    }
    public void setPhNo(String phNo) {
        PhNo = phNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
