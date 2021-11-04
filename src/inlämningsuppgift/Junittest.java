package inlämningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Junittest {
    @Test
    public void TestCountLines() {


        //arregene

        Lines c = new Lines();

        //act

        int actual = c.getnrofrows();

        //assert

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void TestSaveLines() {


        //arregene

        Lines c = new Lines();

        //act
        c.SaveLines();
        int actual = c.getnrofrows();

        //assert

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void TestSaveCharacters() {


        //arregene

        Lines c = new Lines();

        //act
        c.SaveCharacters();
        int actual = c.getNrOfCharacters();

        //assert

        int expected = 1;

        assertEquals(expected, actual);
    }
}