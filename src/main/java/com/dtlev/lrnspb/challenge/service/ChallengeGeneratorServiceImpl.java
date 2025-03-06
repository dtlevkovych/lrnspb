package com.dtlev.lrnspb.challenge.service;

import com.dtlev.lrnspb.challenge.domain.Challenge;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {
    private Random random;

    private static final int MINIMUM_FACTOR = 11;
    private static final int MAXIMUM_FACTOR = 100;

//    public ChallengeGeneratorServiceImpl() {
//        this.random = new Random();
//    }

    public ChallengeGeneratorServiceImpl(Random random) {
        this.random = random;
    }

    private int next() {
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) + MINIMUM_FACTOR;
    }

    @Override
    public Challenge randomChallenge() {
        return new Challenge(next(), next());
    }
}