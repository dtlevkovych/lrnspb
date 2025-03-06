package com.dtlev.lrnspb.challenge.service;

import com.dtlev.lrnspb.challenge.domain.ChallengeAttempt;
import com.dtlev.lrnspb.challenge.domain.ChallengeAttemptDTO;

public interface ChallengeService {
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
