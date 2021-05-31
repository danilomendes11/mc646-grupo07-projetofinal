package circularfifobuffer;

import org.apache.commons.collections.buffer.CircularFifoBuffer;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BufferCombinatoryTests {

    public ArrayList<Integer> sizes = new ArrayList<>(Arrays.asList(-2, -1, 3));

    @Test()
    public void testNegativeSizeQueueCreation() {
        sizes.stream()
                .filter(size -> size < 0)
                .forEach(size -> assertThrows(IllegalArgumentException.class, () -> new CircularFifoBuffer(size)));
    }

    @Test()
    public void testPositiveSizeQueueCreation() {
        sizes.stream()
                .filter(size -> size > 0)
                .forEach(size ->  {
                    CircularFifoBuffer circularFifoBuffer = new CircularFifoBuffer(size);
                    assert(circularFifoBuffer.maxSize() == size);
                });
    }

    @Test
    public void testIsFull(){
        Integer size = 5;
        CircularFifoBuffer circularFifoBuffer = new CircularFifoBuffer(size);
        assert(!circularFifoBuffer.isFull());
        circularFifoBuffer.add(1);
        assert(!circularFifoBuffer.isFull());
        circularFifoBuffer.add(2);
        assert(!circularFifoBuffer.isFull());
        circularFifoBuffer.add(3);
        assert(!circularFifoBuffer.isFull());
        circularFifoBuffer.add(4);
        assert(!circularFifoBuffer.isFull());
        circularFifoBuffer.add(5);
        assert(circularFifoBuffer.isFull());
        circularFifoBuffer.add(6);
        assert(circularFifoBuffer.isFull());
    }

    @Test
    public void testMaxSize(){
        Integer size = 5;
        CircularFifoBuffer circularFifoBuffer = new CircularFifoBuffer(size);
        assert(circularFifoBuffer.maxSize() == size);
    }

    @Test
    public void testElement(){
        //primeira combinacao
        //start = 0, end = positive, full = false, element = notnull

        //segunda combinacao
        //start = positive, end = maxelements, full = true, element = notnull

        //terceira combinacao
        //start = maxelements, end = maxelements, full = false, element = notnull

        //quarta combinacao
        //start = 0, end = 0, full = false, element = notnull

        //quinta combinacao
        //start = 0, end = positive, full = false, element = null
    }

    @Test
    public void testClear(){
        //primeira combinacao
        // start != 0, end = positive, full = true
        Integer size = 3;
        CircularFifoBuffer circularFifoBuffer = new CircularFifoBuffer(size);
        circularFifoBuffer.addAll(Arrays.asList(1,2,3));
        circularFifoBuffer.clear();
        //teste para indicar se a fila esta vazia
        assertThrows(NoSuchElementException.class, circularFifoBuffer::get);


        // segunda combinacao
        // start = 0, end = 0, full = false
        size = 3;
        CircularFifoBuffer caseTwoCircularFifoBuffer = new CircularFifoBuffer(size);
        caseTwoCircularFifoBuffer.clear();
        //teste para indicar se a fila esta vazia
        assertThrows(NoSuchElementException.class, caseTwoCircularFifoBuffer::get);
    }

    @Test
    public void testOffer(){
        //o metodo offer na circulafifobuffer só pode ser acessado pelo método add
        //eles tem o mesmo comportamento

        //primeira combinacao
        // start = 0, end = positive, full = false e element = null
        Integer size = 5;
        CircularFifoBuffer circularFifoBuffer = new CircularFifoBuffer(size);
        assertThrows(NullPointerException.class, () -> circularFifoBuffer.add(null));

        //segunda combinacao
        // start = positive, end = maxElements, full = true e element = nonnull
        size = 3;
        CircularFifoBuffer caseTwoCircularFifoBuffer = new CircularFifoBuffer(size);
        caseTwoCircularFifoBuffer.addAll(Arrays.asList(1,2));
        assert(caseTwoCircularFifoBuffer.add(1));

        //terceira combinacao
        // start = maxElements, end = maxElements, full = true e element = nonnull
        size = 3;
        CircularFifoBuffer caseThreeCircularFifoBuffer = new CircularFifoBuffer(size);
        caseThreeCircularFifoBuffer.addAll(Arrays.asList(1,2,3));
        assert(caseThreeCircularFifoBuffer.add(1));

        //quarta combinacao
        // start = 0, end = 0, full = false e element = nonnull
        size = 3;
        CircularFifoBuffer caseFourCircularFifoBuffer = new CircularFifoBuffer(size);
        assertThrows(NullPointerException.class, () -> caseThreeCircularFifoBuffer.add(null));
    }

}
