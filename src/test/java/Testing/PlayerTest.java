package Testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlayerTest {
    @Mock
    Dice dice;

    @InjectMocks
    Player player;

    @Test
    void shouldWin(){
        when(dice.roll()).thenReturn(6);
        assertEquals(6, player.rollTheDice());
    }
}