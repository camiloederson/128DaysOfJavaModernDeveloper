package Testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AppTest {

    @Mock
    Greeter greeter;

    @Test
    void shouldReturnHello(){
        // I'm really setting the fake object to return a controlled value;
        when(greeter.sayHello()).thenReturn("Say Hello");

        // Instantiates the real class injecting the fake object.
        App app = new App(greeter);

        assertEquals("Say Hello", app.run());
    }

}