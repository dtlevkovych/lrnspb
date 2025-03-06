package com.dtlev.lrnspb.challenge.controller;

import com.dtlev.lrnspb.challenge.domain.Challenge;
import com.dtlev.lrnspb.challenge.service.ChallengeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    @Autowired
    private ChallengeGeneratorService challengeGeneratorService;

    @GetMapping("/random")
    public Challenge getRandomChallenge() {
        return challengeGeneratorService.randomChallenge();
    }
}