package com.thomasjayconsulting.multidb.service;

import com.thomasjayconsulting.multidb.model.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    private final String ANALYTICS_COLLECTION = "analytics";

    @Autowired
    MongoTemplate mongoTemplate;


    public void addUserAccess(String userId) {

        Analytics analytic = new Analytics();

        analytic.setUserId(userId);
        analytic.setUserLoginCount(1L);

        mongoTemplate.insert(analytic, ANALYTICS_COLLECTION);


    }
}
