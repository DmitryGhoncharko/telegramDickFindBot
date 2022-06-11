package dickfindbot.entity;

public class User {
    private final long id;

    private final long userId;

    private final long countUserGames;

    private final long countUserWins;

    private User(Builder builder) {
        id = builder.id;
        userId = builder.userId;
        countUserGames = builder.countUserGames;
        countUserWins = builder.countUserWins;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public long getCountUserGames() {
        return countUserGames;
    }

    public long getCountUserWins() {
        return countUserWins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (userId != user.userId) return false;
        if (countUserGames != user.countUserGames) return false;
        return countUserWins == user.countUserWins;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (countUserGames ^ (countUserGames >>> 32));
        result = 31 * result + (int) (countUserWins ^ (countUserWins >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", countUserGames=" + countUserGames +
                ", countUserWins=" + countUserWins +
                '}';
    }

    public static class Builder {
        private long id;
        private long userId;
        private long countUserGames;
        private long countUserWins;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder withCountUserGames(Long countUserGames) {
            this.countUserGames = countUserGames;
            return this;
        }

        public Builder withCountUserWins(Long countUserWins) {
            this.countUserGames = countUserWins;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
