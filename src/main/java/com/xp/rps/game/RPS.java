package com.xp.rps.game;

import com.xp.rps.gameadmin.GameAdminRepo;

import static com.xp.rps.game.Throw.*;

public class RPS {


    public static Result playWithRepo(Throw p1, Throw p2, GameAdminRepo repoSpy) {
        repoSpy.playRound();

        if (p1==p2) {
            return Result.DRAW;
        }
        else if  (ROCK.equals(p1)) {
            if (SCISSORS.equals(p2))
                return Result.P1_WINS;
        }
        else if (SCISSORS.equals(p1)) {
            if (PAPER.equals(p2))
                return Result.P1_WINS;

        } else if (PAPER.equals(p1)) {
            return Result.P1_WINS;
        }
        return Result.P2_WINS;

    }
}
