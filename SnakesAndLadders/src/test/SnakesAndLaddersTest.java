package test;

import classes.Controllers.SnakesAndLadders;
import classes.Models.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SnakesAndLaddersTest {
    private SnakesAndLadders SAL;

    private void setUp(){
        SAL = new SnakesAndLadders();
    }

    /**
     *  Tests initialization but cannot get mockito
     *  to work to test it properly
     */
    @Test
    public void testInitialization(){
        setUp();
        assertNotNull(SAL);
    }
}
