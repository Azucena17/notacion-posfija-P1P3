package gt.edu.umg.progra3.parcial1.pilas;

import org.junit.Before;
import org.junit.Test;

public class NotationParserTest {
    Pila pila;
    NotationParser parser;

    @Before
    public void init(){
        pila = new PilIm();
        parser = new NotationParser(pila);
    }

    @Test
    public void testNotationPosToInfix(){
        String posFix = parser.posFixToInfix("1 2 * 3 +");
        assert (posFix.equals("1 * 2 + 3"));
    }
}
