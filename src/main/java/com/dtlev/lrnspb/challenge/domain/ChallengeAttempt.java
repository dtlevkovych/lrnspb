package com.dtlev.lrnspb.challenge.domain;

import java.util.Objects;

public class ChallengeAttempt {
    private Long id;

    public Long getId() {
        return id;
    }

    public ChallengeAttempt(Long id, Long userId, int factorA, int factorB, int resultAttempt, boolean correct) {
        this.id = id;
        this.userId = userId;
        this.factorA = factorA;
        this.factorB = factorB;
        this.resultAttempt = resultAttempt;
        this.correct = correct;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChallengeAttempt{" +
                "id=" + id +
                ", userId=" + userId +
                ", factorA=" + factorA +
                ", factorB=" + factorB +
                ", resultAttempt=" + resultAttempt +
                ", correct=" + correct +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChallengeAttempt that = (ChallengeAttempt) o;
        return factorA == that.factorA && factorB == that.factorB && resultAttempt == that.resultAttempt && correct == that.correct && Objects.equals(id, that.id) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, factorA, factorB, resultAttempt, correct);
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getFactorA() {
        return factorA;
    }

    public void setFactorA(int factorA) {
        this.factorA = factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public void setFactorB(int factorB) {
        this.factorB = factorB;
    }

    public int getResultAttempt() {
        return resultAttempt;
    }

    public void setResultAttempt(int resultAttempt) {
        this.resultAttempt = resultAttempt;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    private Long userId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}