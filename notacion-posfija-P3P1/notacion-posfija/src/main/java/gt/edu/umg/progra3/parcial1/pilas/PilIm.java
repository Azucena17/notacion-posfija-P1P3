package gt.edu.umg.progra3.parcial1.pilas;

import java.util.LinkedList;

public class PilIm implements Pila{

    private final LinkedList<String> list;

    public PilIm() {
        list = new LinkedList<>();
    }

    @Override
    public void push(String item) {
        list.addFirst(item);
    }

    @Override
    public String pop() {
        return list.removeFirst();
    }

    @Override
    public String peek() {
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
