package com.xp.rps.gameclient;

import com.xp.rps.game.RPS;
import com.xp.rps.game.Result;
import com.xp.rps.game.Throw;
import com.xp.rps.gameadmin.GameAdminRepo;
import com.xp.rps.gameclient.PlayRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpsController {

    GameAdminRepo repo;

    public RpsController(GameAdminRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello XP!";
    }

    @PostMapping("/play")
    public String play(@RequestBody PlayRequest requestBody) {
        Throw p1 = Throw.valueOf(requestBody.getP1().toUpperCase());
        Throw p2 = Throw.valueOf(requestBody.getP2().toUpperCase());

        //Result result = RPS.play(p1, p2);
        Result result = RPS.playWithRepo(p1,p2,repo);

        if (result.equals(Result.P1_WINS)) {
            return "Player 1 Wins";
        }
        else if (result.equals(Result.P2_WINS)) {
            return "Player 2 Wins";
        }
        else if (result.equals(Result.DRAW)){
            return "Tie!";
        }
        else {
            return "Invalid";
        }

    }

}
