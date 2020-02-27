package com.xp.rps.game;

import com.xp.rps.gameadmin.GameAdminRepo;

public class GameAdminRepoSpy implements GameAdminRepo {
  boolean playCalled=false;

   @Override
    public int getRounds() {
       throw new UnsupportedOperationException();
   }

   @Override
    public void playRound() {
       playCalled=true;
   }
}
