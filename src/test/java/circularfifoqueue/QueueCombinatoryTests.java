package circularfifoqueue;


import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class QueueCombinatoryTests {

    public ArrayList<Integer> sizes = new ArrayList<>(Arrays.asList(-2, -1, 3));

    @Test()
    public void testNegativeSizeQueueCreation() {
        sizes.stream()
                .filter(size -> size < 0)
                .forEach(size -> assertThrows(IllegalArgumentException.class, () -> new CircularFifoQueue(size)));
    }

    @Test()
    public void testPositiveSizeQueueCreation() {
        sizes.stream()
                .filter(size -> size > 0)
                .forEach(size ->  {
                    CircularFifoQueue circularFifoQueue = new CircularFifoQueue(size);
                    assert(circularFifoQueue.maxSize() == size);
                });
    }

    @Test()
    public void testGet() {
        Integer size = 5;
        CircularFifoQueue<Integer> circularFifoQueue = new CircularFifoQueue<Integer>(size);
        circularFifoQueue.add(1);
        circularFifoQueue.add(2);
        circularFifoQueue.add(3);
        circularFifoQueue.add(4);
        circularFifoQueue.add(5);

        assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(-1));
        assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(size + 1));
        assert(circularFifoQueue.get(0).equals(1));
    }

    @Test
    public void testIsFull(){
        Integer size = 5;
        CircularFifoQueue<Integer> circularFifoQueue = new CircularFifoQueue<Integer>(size);
        assert(!circularFifoQueue.isFull());
        circularFifoQueue.add(1);
        assert(!circularFifoQueue.isFull());
        circularFifoQueue.add(2);
        assert(!circularFifoQueue.isFull());
        circularFifoQueue.add(3);
        assert(!circularFifoQueue.isFull());
        circularFifoQueue.add(4);
        assert(!circularFifoQueue.isFull());
        circularFifoQueue.add(5);
        assert(!circularFifoQueue.isFull());
        circularFifoQueue.add(6);
        assert(!circularFifoQueue.isFull());
    }

    @Test
    public void testMaxSize(){
        Integer size = 5;
        CircularFifoQueue<Integer> circularFifoQueue = new CircularFifoQueue<Integer>(size);
        assert(circularFifoQueue.maxSize() == size);
    }

    @Test
    public void testClear(){
        //primeira combinacao
        // start != 0, end = positive, full = true
        Integer size = 3;
        CircularFifoQueue<Integer> circularFifoQueue = new CircularFifoQueue<Integer>(size);
        circularFifoQueue.addAll(Arrays.asList(1,2,3));
        circularFifoQueue.clear();
        //teste para indicar se a fila esta vazia
        assertThrows(NoSuchElementException.class, () -> circularFifoQueue.get(0));


        // segunda combinacao
        // start = 0, end = 0, full = false
        size = 3;
        CircularFifoQueue<Integer> caseTwoCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseTwoCircularFifoQueue.clear();
        //teste para indicar se a fila esta vazia
        assertThrows(NoSuchElementException.class, () -> caseTwoCircularFifoQueue.get(0));
    }

    @Test
    public void testElement(){
        //primeira combinacao
        //start = 0, end = positive, full = false, element = notnull
        Integer size = 3;
        CircularFifoQueue<Integer> caseOneCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseOneCircularFifoQueue.addAll(Arrays.asList(1,2));
        assert(caseOneCircularFifoQueue.element() == 1);

        //segunda combinacao
        //start = positive, end = maxelements, full = true, element = notnull
        size = 3;
        CircularFifoQueue<Integer> caseTwoCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseTwoCircularFifoQueue.addAll(Arrays.asList(1,2,3));
        assert(caseTwoCircularFifoQueue.element() == 1);

        //terceira combinacao
        //start = maxelements, end = maxelements, full = false, element = notnull
        size = 3;
        CircularFifoQueue<Integer> caseThreeCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseThreeCircularFifoQueue.addAll(Arrays.asList(1,2,3));
        assert(caseThreeCircularFifoQueue.element() == 1);

        //quarta combinacao
        //start = 0, end = 0, full = false, element = notnull
        size = 3;
        CircularFifoQueue<Integer> caseFourCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseFourCircularFifoQueue.addAll(Arrays.asList(1));
        assert(caseFourCircularFifoQueue.element() == 1);

        //quinta combinacao
        //start = 0, end = positive, full = false, element = null
        size = 3;
        CircularFifoQueue<Integer> caseFiveCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        assertThrows(NoSuchElementException.class, caseFiveCircularFifoQueue::element);
    }

    @Test
    public void testOffer(){
        //primeira combinacao
        // start = 0, end = positive, full = false e element = null
        Integer size = 5;
        CircularFifoQueue<Integer> circularFifoQueue = new CircularFifoQueue<Integer>(size);
        assertThrows(NullPointerException.class, () -> circularFifoQueue.offer(null));

        //segunda combinacao
        // start = positive, end = maxElements, full = true e element = nonnull
        size = 3;
        CircularFifoQueue<Integer> caseTwoCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseTwoCircularFifoQueue.addAll(Arrays.asList(1,2));
        assert(caseTwoCircularFifoQueue.offer(1));

        //terceira combinacao
        // start = maxElements, end = maxElements, full = true e element = nonnull
        size = 3;
        CircularFifoQueue<Integer> caseThreeCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        caseThreeCircularFifoQueue.addAll(Arrays.asList(1,2,3));
        assert(caseThreeCircularFifoQueue.offer(1));

        //quarta combinacao
        // start = 0, end = 0, full = false e element = nonnull
        size = 3;
        CircularFifoQueue<Integer> caseFourCircularFifoQueue = new CircularFifoQueue<Integer>(size);
        assertThrows(NullPointerException.class, () -> caseFourCircularFifoQueue.offer(null));
    }
}
