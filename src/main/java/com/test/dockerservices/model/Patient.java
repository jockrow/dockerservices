package com.test.dockerservices.model;

import javax.persistence.*;

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="first_name", nullable = false, length=255)
    private String firstName;

    @Column(name="last_name", nullable = false, length=255)
    private String lastName;

    @Column(name="email", nullable = false, length=255)
    private String email;

    @Column(name="phone", nullable = false, length=20)
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * patient_id int not null auto_increment,
     *  	 id varchar(20),
     *  	 first_name varchar(255),
     *  	 last_name varchar(255),
     *  	 email varchar(255),
     *  	 phone varchar(20),
     *  	 primary key (patient_id)
     */
}
