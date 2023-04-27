package com.thomasjayconsulting.multidb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Analytics {
    @Id
    private String id; // Auto assigned by MongoDB

    private String userId;
    private Long userLoginCount;

}
