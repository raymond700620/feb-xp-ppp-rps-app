package com.xp.rps.gameadmin;

import com.xp.rps.gameclient.PlayRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GameAdminTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    void roundPlayed() {
        ResponseEntity<Integer> response =  restTemplate.getForEntity("/admin/round",Integer.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(0,response.getBody());

        //play the round
        restTemplate.postForEntity("/play", new PlayRequest("rock","paper"), String.class );

        response =  restTemplate.getForEntity("/admin/round",Integer.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(1,response.getBody());




    }


}
