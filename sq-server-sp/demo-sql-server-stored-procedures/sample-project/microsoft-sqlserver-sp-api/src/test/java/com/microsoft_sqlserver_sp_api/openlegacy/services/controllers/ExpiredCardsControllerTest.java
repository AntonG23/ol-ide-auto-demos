package com.microsoft_sqlserver_sp_api.openlegacy.services.controllers;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.*;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.Date;

import com.microsoft_sqlserver_sp_api.openlegacy.config.AbstractWebContextAwareTest;


/**
 *  A test which invokes controller of ExpiredCards web service using Spring's RestTemplate class for client-side HTTP access.
 *  To run the test, select Run As -> JUnit test.
 *  If the service has parameters, they should be set via the test.
 */
public class ExpiredCardsControllerTest extends AbstractWebContextAwareTest {

    private String url;
    
    @Before
    @Override
    public void init() {
        super.init();
        url = String.format("%s/api/expiredcards", baseUrl);
    }

    @Test
    public void testGetExpiredCards() throws Exception {
        ResponseEntity<Object> response = sendServiceRequest(url, HttpMethod.GET, null);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        extractJsonResponse(response);
    }

    @Test
    public void testExpiredCardsCache() throws Exception {
        int count = 1;
        Thread[] clientThreads = new Thread[count];
        final Throwable error = new Throwable();
        for (int i = 0; i < count; i++) {
            Thread thread = new Thread(new Runnable() {
                int processTimes = 10;

                @Override
                public void run() {
                    while (processTimes > 0) {
                        try {
                            ResponseEntity<Object> response = sendServiceRequest(url, HttpMethod.GET, null);
                            Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
                            Object data = response.getBody();
                            Assert.assertNotNull(data);
                            processTimes--;
                        } catch (Throwable th) {
                            synchronized (error) {
                                error.initCause(th);
                            }
                        }
                    }
                }
            });
            
            clientThreads[i] = thread;
        }

        for (Thread thread : clientThreads) {
            thread.start();
        }

        boolean exit = false;
        while (!exit) {
            synchronized (error) {
                if (error.getCause() != null) {
                    throw (new Exception(error));
                }
            }
            for (Thread thread : clientThreads) {
                exit = !thread.isAlive();
            }
        }
    }

}
