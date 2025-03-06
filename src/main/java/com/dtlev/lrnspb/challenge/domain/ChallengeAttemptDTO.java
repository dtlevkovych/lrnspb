package com.dtlev.lrnspb.challenge.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.Objects;

public class ChallengeAttemptDTO {
    @Min(1) @Max(99)
    int factorA, factorB;
    @NotBlank
    String userAlias;
    @Positive(message = "How could you possibly get a negative result here? Try again.")
    int guess;

    public ChallengeAttemptDTO() {}

    public ChallengeAttemptDTO(int factorA, int factorB, String userAlias, int guess) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.userAlias = userAlias;
        this.guess = guess;
    }

    @Override
    public String toString() {
        return "ChallengeAttemptDTO{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", userAlias='" + userAlias + '\'' +
                ", guess=" + guess +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChallengeAttemptDTO that = (ChallengeAttemptDTO) o;
        return factorA == that.factorA && factorB == that.factorB && guess == that.guess && Objects.equals(userAlias, that.userAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factorA, factorB, userAlias, guess);
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

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
}
