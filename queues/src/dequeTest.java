import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by ranko on 3/28/17.
 */
public class dequeTest {
    @Test
    public void testEmpty (){
        Deque<Integer> test = new Deque<>();
        assertTrue(test.isEmpty());
        test.addFirst(5);
        assertFalse(test.isEmpty());
        test = new Deque<>();
        test.addLast(1);
        assertFalse(test.isEmpty());
    }
    @Test
    public void testFirst(){
        Deque<Integer> test = new Deque<>();
        test.addFirst(5);
        assertEquals(1, test.size());
        assertEquals(5, (int)test.removeFirst());
        assertEquals(0, test.size());
        test.addFirst(3);
        test.addFirst(2);
        test.addFirst(1);
        assertEquals(3, test.size());
        assertEquals(1, (int)test.removeFirst());
        assertEquals(2, (int)test.removeFirst());
        assertEquals(3, (int)test.removeFirst());

    }
    @Test
    public void testLast(){
        Deque<Integer> test = new Deque<>();
        test.addLast(5);
        assertEquals(1, test.size());
        test.addLast(6);
        test.addLast(7);
        test.addLast(8);
        assertEquals(4, test.size());
        assertEquals(5, (int)test.removeFirst());
        assertEquals(8, (int) test.removeLast());
        assertEquals(7, (int)test.removeLast());
        assertEquals(6, (int)test.removeLast());
        assertEquals(0, test.size());
    }
    @Test
    public  void testIterator(){
        Deque<Integer> test = new Deque<>();
        test.addLast(5);
        test.addLast(99);

        test.addLast(6);
        test.addLast(7);
        test.addLast(8);
        for (int i:test){
            System.out.print(i);
        }
    }
    public static void main(String[] args){
        jh61b.junit.TestRunner.runTests("all", dequeTest.class);

    }
}
