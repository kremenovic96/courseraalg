import java.util.Iterator;

/**
 * Created by ranko on 3/28/17.
 */
public class Deque<Item> implements Iterable<Item> {
    Item[] items;
    private int nextfirst, nextlast;
    private int size;
    public Deque(){
        size = 0;
        items =  (Item[]) new Object[8];
        nextfirst = 2;
        nextlast = 3;
    }
    public boolean isEmpty(){ return size()  == 0;}
    public int size(){ return this.size;}
    public void addFirst(Item item){
        if (item == null) throw new NullPointerException();
        items[nextfirst--] = item;
        if (nextfirst == -1) nextfirst = items.length -1;
        size ++;
    }
    public void addLast(Item item){
        if(item == null) throw new NullPointerException();
        items[nextlast++] = item;
        if (nextlast == items.length ) nextlast = 0;
        size ++;
    }
    public Item removeFirst(){
        if (size() == 0) throw new java.util.NoSuchElementException();
        if(nextfirst == items.length-1) nextfirst = 0;
        else nextfirst++;
        Item firstItem = items[nextfirst];
        items[nextfirst] = null;
        size --;
        return firstItem;

    }
    public Item removeLast(){
        if (size() == 0) throw new java.util.NoSuchElementException();
        if (nextlast == 0) nextlast = items.length-1;
        else nextlast--;
        Item lastItem = items[nextlast];
        size --;
        return lastItem;

    }

    public Iterator<Item> iterator(){ return new listIterator();}

    private class listIterator implements Iterator<Item>{
         int index = nextfirst+1;
         int i = 0;
         @Override
         public boolean hasNext () {return i < size(); }
         @Override
         public Item next() {Item item = items[index];
         if (i == size()) throw new java.util.NoSuchElementException();
         index ++;
         if (index == items.length) index = 0;
          i++;
         return item;}
        @Override
        public void remove(){throw new UnsupportedOperationException();}
}

}
