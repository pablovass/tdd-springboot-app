package com.pablovass.test.player;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class PlayerTest {
    //este test no es ta bien por que el numero al ser aleatorio a veces va a dar bien o aveces va a dar mal.
    // asi que vamos hacer un dado simulado
    /*
    *
    @Test
    public  void looses_when_dice_number_is_too_low(){
        Dice dice =new Dice(6);
        Player player=new Player(dice,5);
        assertEquals(false,player.play());
    }
    * */

    @Test
    public  void looses_when_dice_number_is_too_low(){
        Dice dice =Mockito.mock(Dice.class);
        //le vamos a decir al dado que devuelva un dos
        Mockito.when(dice.roll()).thenReturn(2);

        Player player=new Player(dice,3);
        assertEquals(false,player.play());
    }
    @Test
    public  void win_when_dice_number_is_big(){
        Dice dice =Mockito.mock(Dice.class);
        //le vamos a decir al dado que devuelva un dos
        Mockito.when(dice.roll()).thenReturn(4);

        Player player=new Player(dice,3);
        assertTrue(player.play());
    }

}