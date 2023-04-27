package com.thomasjayconsulting.multidb.dto;

import lombok.Data;

@Data
public class NewUserRequest {

    private String emailAddress;
    private String firstName;
    private String lastName;

}
