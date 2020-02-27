package com.xp.rps.gameadmin;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryGameAdminRepo implements GameAdminRepo {
    @Override
    public int getRounds() {
        return 0;
    }
}

