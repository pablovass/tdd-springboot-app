package com.pablovass.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void looses_when_number_is_too_low() {
        // Dice dice = new Dice(6); esto es un dado de verdad
        Dice dice = Mockito.mock(Dice.class); // asi se simula el dado
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }

    @Test
    void wins_when_number_is_too_big() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);
        assertEquals(true, player.play());
    }

}