package com.dtlev.lrnspb.challenge.service;

import com.dtlev.lrnspb.challenge.domain.ChallengeAttempt;
import com.dtlev.lrnspb.challenge.domain.ChallengeAttemptDTO;
import com.dtlev.lrnspb.user.User;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {
    public ChallengeServiceImpl() {
    }

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {

        boolean isCorrect = attemptDTO.getGuess() == attemptDTO.getFactorA() * attemptDTO.getFactorB();

        User user = new User(null, attemptDTO.getUserAlias());

        ChallengeAttempt checkedAttempt = new ChallengeAttempt(null, user.getId(), attemptDTO.getFactorA(), attemptDTO.getFactorB(), attemptDTO.getGuess(), isCorrect);

        return checkedAttempt;
    }
}