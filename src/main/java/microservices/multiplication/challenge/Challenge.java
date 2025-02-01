package microservices.multiplication.challenge;

import java.util.Objects;

public class Challenge {
    private int factorA;
    private int factorB;

    public Challenge(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
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

    @Override
    public String toString() {
        return "Challenge{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return factorA == challenge.factorA && factorB == challenge.factorB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factorA, factorB);
    }
}