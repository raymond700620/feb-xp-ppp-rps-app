package com.xp.rps.gameadmin;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryGameAdminRepo implements GameAdminRepo {
    private int roundPlayed;

    @Override
    public int getRounds() {
        return roundPlayed;
    }

    @Override
    public void playRound() {
        roundPlayed++;
    }
}

