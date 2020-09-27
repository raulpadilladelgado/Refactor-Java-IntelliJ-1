package signatureChange;

public class Player {
    private String name;
    private int score;
    private Role role;


    public Player(Role role, String name) {
        this.role = role;
        this.name = name;
        this.score = 0;
    }

    public void play() {
        if (role == Role.Dragon) {
            score += 20;
        } else {
            score = score - 10;
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
