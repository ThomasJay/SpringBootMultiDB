package com.thomasjayconsulting.multidb.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name="emailAddress")
    private String emailAddress;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

}
