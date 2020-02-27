package com.xp.rps.game;

import com.xp.rps.game.RPS;
import com.xp.rps.game.Result;
import org.junit.jupiter.api.Test;

import static com.xp.rps.game.Throw.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RPSTest {
    @Test
    void rockVsScissors() {
        assertEquals(Result.P1_WINS, RPS.play(ROCK, SCISSORS));
    }

    @Test
    void scissorsVsRock() {
        assertEquals(Result.P2_WINS, RPS.play(SCISSORS, ROCK));
    }

    @Test
    void scissorsVsPaper() {
        assertEquals(Result.P1_WINS, RPS.play(SCISSORS, PAPER));
    }

    @Test
    void paperVsRock() {
        assertEquals(Result.P1_WINS, RPS.play(PAPER, ROCK));
    }

    @Test
    void rockVsPaper() {
        assertEquals(Result.P2_WINS, RPS.play(ROCK, PAPER));
    }

    @Test
    void rockVsRock() {
        assertEquals(Result.DRAW, RPS.play(ROCK, ROCK));
    }


}
