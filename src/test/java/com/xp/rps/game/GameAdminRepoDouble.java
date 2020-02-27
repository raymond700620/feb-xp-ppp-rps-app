package com.xp.rps.game;

import com.xp.rps.gameadmin.GameAdminRepo;

public class GameAdminRepoDouble implements GameAdminRepo {

    @Override
    public  int getRounds() {
        throw new UnsupportedOperationException();
    }

    @Override
   public void playRound() {

    }
}
