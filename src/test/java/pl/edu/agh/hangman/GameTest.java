package pl.edu.agh.hangman;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {
    @Test
    public void updateGameStateTest(){
         Game game = new Game("Ala");
         game.updateGameState('A');
         game.updateGameState('L');
         assertFalse(game.updateGameState('a'));


    }
    @Test
    public void updateGameStateTest2(){
        Game game = new Game("Zosia");
        game.updateGameState('A');
        game.updateGameState('t');
        game.updateGameState('r');
        game.updateGameState('w');
        game.updateGameState('o');
        game.updateGameState('m');
        game.updateGameState('i');
        game.updateGameState('m');
        assertFalse(game.updateGameState('n'));
    }
}
