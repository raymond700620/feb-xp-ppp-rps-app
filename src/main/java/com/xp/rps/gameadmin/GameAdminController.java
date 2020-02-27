package com.xp.rps.gameadmin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GameAdminController {

    private GameAdminRepo gameAdminRepo;

    public GameAdminController(GameAdminRepo gameAdminRepo) {
        this.gameAdminRepo = gameAdminRepo;
    }

    @GetMapping("/admin/round")
    public int getRoundsPlayed() {
        return gameAdminRepo.getRounds();
    }
}
