package com.xp.rps;

import com.xp.rps.gameclient.PlayRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RpsApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void rockVsPaper() {
        ResponseEntity<String> response = restTemplate.postForEntity("/play",new PlayRequest("rock", "paper"), String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Player 2 Wins",response.getBody());
    }

}
