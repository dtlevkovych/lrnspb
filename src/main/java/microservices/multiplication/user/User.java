package microservices.multiplication.user;

import java.util.Objects;

public class User {
    private Long id;
    private String alias;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(alias, user.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alias);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public User(Long id, String alias) {
        this.id = id;
        this.alias = alias;
    }
}
