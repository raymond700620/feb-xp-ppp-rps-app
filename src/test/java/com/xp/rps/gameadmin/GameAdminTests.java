package com.xp.rps.gameadmin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GameAdminTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void noRoundsPlayed_returns0() {
        ResponseEntity<Integer> response =  restTemplate.getForEntity("/admin/round",Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(0,response.getBody());
    }
}
