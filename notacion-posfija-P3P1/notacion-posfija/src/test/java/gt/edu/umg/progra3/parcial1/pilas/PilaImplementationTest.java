package gt.edu.umg.progra3.parcial1.pilas;

import org.junit.Before;
import org.junit.Test;

public class PilaImplementationTest {

    private Pila pila;
    @Before
    public void init(){
        pila = new PilIm();

        pila.push("Programacion 3");
        pila.push("a");
        pila.push("Bienvenidos");
    }

    @Test
    public void testPushPila(){
        pila.push("testPushPila");
        String cima = pila.peek();
        assert(cima.equals("testPushPila"));
    }

    @Test
    public void testPopPila(){
        String cima1 = pila.pop();
        String cima2 = pila.peek();
        assert(cima1.equals("Bienvenidos"));
        assert(cima2.equals("a"));

    }

    @Test
    public void testSizePila(){
        int t1 = pila.size();
        pila.pop();
        pila.pop();
        int t2 = pila.size();
        assert (t1==3);
        assert (t2==1);

    }
}
