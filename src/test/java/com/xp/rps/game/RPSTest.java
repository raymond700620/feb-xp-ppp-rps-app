package com.xp.rps.game;

import com.xp.rps.gameadmin.GameAdminRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.xp.rps.game.RPS.playWithRepo;
import static com.xp.rps.game.Result.P2_WINS;
import static com.xp.rps.game.Throw.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RPSTest {
    GameAdminRepo repoDouble;

    @BeforeEach
    void setUp() {
        repoDouble = new GameAdminRepoDouble();
    }

    @Test
    void rockVsScissors() {
        assertEquals(Result.P1_WINS, playWithRepo(ROCK, SCISSORS, repoDouble));
    }

    @Test
    void scissorsVsRock() {
        assertEquals(P2_WINS, playWithRepo(SCISSORS, ROCK, repoDouble));
    }

    @Test
    void scissorsVsPaper() {
        assertEquals(Result.P1_WINS, playWithRepo(SCISSORS, PAPER, repoDouble));
    }

    @Test
    void paperVsRock() {
        assertEquals(Result.P1_WINS, playWithRepo(PAPER, ROCK, repoDouble));
    }

    @Test
    void rockVsPaper() {
        assertEquals(P2_WINS, playWithRepo(ROCK, PAPER, repoDouble));
    }

    @Test
    void rockVsRock() {
        assertEquals(Result.DRAW, playWithRepo(ROCK, ROCK, repoDouble));
    }

    @Test
    void recordRoundPlayed()
    {
        GameAdminRepoSpy repoSpy = new GameAdminRepoSpy();

        Result result = playWithRepo(ROCK, PAPER, repoSpy);
        //playWithRepo(ROCK, PAPER);


        assertEquals(P2_WINS, result);
        assertTrue(repoSpy.playCalled);
    }


}
