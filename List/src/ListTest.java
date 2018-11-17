import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {
    @Test
    public void checkAddFirst() throws Exception {
        List l = new List();
        l.addFirst(0);
        l.addFirst(1);
        l.addFirst(1);
        assertEquals(l.toString(), "1, 1, 0");
    }

    @Test
    public void checkAddLast() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(1);
        assertEquals(l.toString(), "0, 1, 1");
    }

    @Test
    public void checkAdd() throws Exception {
        List l = new List();
        l.addLast(0);

        l.add(1, 0);
        l.add(5, 2);
        l.add(60, 1);
        l.add(8, 3);

        assertEquals(l.toString(), "1, 60, 0, 8, 5");
    }

    @Test
    public void checkRemoveFirst() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);

        l.removeFirst();

        assertEquals(l.toString(), "1, 2, 3");
    }

    @Test
    public void checkRemoveLast() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);

        l.removeLast();

        assertEquals(l.toString(), "0, 1, 2");
    }

    @Test
    public void checkRemove() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);

        l.remove(2);
        l.remove(0);

        assertEquals(l.toString(), "1, 3");
    }

    @Test
    public void checkGet() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);

        assertEquals(l.get(0), 0);
        assertEquals(l.get(1), 1);
        assertEquals(l.get(2), 2);
        assertEquals(l.get(3), 3);

        l.removeFirst();

        assertEquals(l.get(0), 1);
        assertEquals(l.get(1), 2);
        assertEquals(l.get(2), 3);
    }

    @Test
    public void checkSort() throws Exception {
        List l = new List();
        l.addLast(543);
        l.addLast(190);
        l.addLast(32);
        l.addLast(-1);
        l.addLast(9);

        assertEquals(l.toString(), "543, 190, 32, -1, 9");
        l.sort();
        assertEquals(l.toString(), "-1, 9, 32, 190, 543");
    }

    @Test
    public void checkSize() throws Exception {
        List l = new List();

        assertEquals(l.size(), 0);

        l.addLast(0);
        assertEquals(l.size(), 1);

        l.addFirst(1);
        assertEquals(l.size(), 2);

        l.add(2, 0);
        assertEquals(l.size(), 3);

        l.removeFirst();
        assertEquals(l.size(), 2);

        l.removeLast();
        assertEquals(l.size(), 1);

        l.remove(0);
        assertEquals(l.size(), 0);
    }

    @Test(expected = Exception.class)
    public void checkDeletionException() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);

        l.removeLast();
        l.removeLast();
        l.removeLast();
        l.removeLast();
    }

    @Test(expected = Exception.class)
    public void checkGetException() throws Exception {
        List l = new List();
        l.get(0);
    }

    @Test(expected = Exception.class)
    public void checkGetException2() throws Exception {
        List l = new List();
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);

        l.get(-1);
    }

}