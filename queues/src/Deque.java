import java.util.Iterator;

/**
 * Created by ranko on 3/28/17.
 */
public class Deque<Item> implements Iterable<Item> {
    private class Node<Item>{
        Item head;
        Node next;
    }
     private Node first, last;
    int size;
    public Deque(){
        size = 0;
    }
    public boolean isEmpty(){ return first  == null;}
    public int size(){ return this.size();}
    public void addFirst(Item item){
        if (item == null) throw new NullPointerException();
        Node oldFirst = first;
        Node first = new Node();
        first.head = item; first.next = oldFirst;
        size ++;
    }
    public void addLast(Item item){
        if(item == null) throw new NullPointerException();
        Node newlast = new Node();
        newlast.head = item; newlast.next = null;
        last.next = newlast;
        last = newlast;

    }
    public Item removeFirst(){
        if (size() == 0) throw new java.util.NoSuchElementException();
        Item firstItem = first.head;
        first = first.next;
        if(isEmpty()) last = null;
        return firstItem;

    }
    public Item removeLast(){
        if (size() == 0) throw new java.util.NoSuchElementException();
        Item lastItem = last.head;
        last.head = null;

    }

    public Iterator<Item> iterator(){}
        public static void main(String[] args){} // unit testing(optional)

}
