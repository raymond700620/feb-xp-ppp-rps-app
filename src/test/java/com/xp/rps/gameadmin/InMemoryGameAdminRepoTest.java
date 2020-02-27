package com.xp.rps.gameadmin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryGameAdminRepoTest {

    @Test
    void noRoundsPlayed_returns0() {
        InMemoryGameAdminRepo subject = new InMemoryGameAdminRepo();

        assertEquals(0, subject.getRounds());
    }
}