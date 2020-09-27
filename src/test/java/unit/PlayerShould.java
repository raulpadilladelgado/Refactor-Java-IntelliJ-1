package unit;

import signatureChange.Player;
import signatureChange.Role;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayerShould {
    @Test
    public void increase_score_when_dragon_plays() throws Exception {
        Player player1 = new Player(Role.Dragon, "WhiteDragon");
        player1.setScore(0);
        Player player = player1;

        player.play();

        assertThat(player.getScore()).isEqualTo(20);
    }

    @Test
    public void sets_the_initial_score() throws Exception {
        Player player1 = new Player(Role.Dragon, "WhiteDragon");
        player1.setScore(0);
        Player player = player1;

        assertThat(player.getScore()).isEqualTo(0);
    }
}
