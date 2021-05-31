package circularfifoqueue;


import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    }

}
