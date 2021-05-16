import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass5 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass6 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass3 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = circularFifoBuffer0.add(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = circularFifoBuffer5.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = circularFifoBuffer5.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = circularFifoBuffer0.add(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = circularFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        circularFifoBuffer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        boolean boolean4 = circularFifoBuffer0.isEmpty();
        java.lang.Class<?> wildcardClass5 = circularFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.lang.Class<?> wildcardClass1 = circularFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        boolean boolean2 = circularFifoBuffer1.isFull();
        java.lang.Class<?> wildcardClass3 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        java.lang.Object obj14 = circularFifoBuffer13.get();
        boolean boolean15 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        java.lang.Class<?> wildcardClass16 = circularFifoBuffer13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.maxSize();
        java.util.Iterator iterator9 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = circularFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        circularFifoBuffer0.clear();
        int int5 = circularFifoBuffer0.maxSize();
        int int6 = circularFifoBuffer0.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = circularFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.maxSize();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        java.util.Iterator iterator4 = circularFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        java.lang.Class<?> wildcardClass11 = circularFifoBuffer8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        int int3 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        circularFifoBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = circularFifoBuffer5.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        boolean boolean6 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator8 = circularFifoBuffer7.iterator();
        int int9 = circularFifoBuffer7.size();
        boolean boolean11 = circularFifoBuffer7.add((java.lang.Object) 10);
        boolean boolean12 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        boolean boolean13 = circularFifoBuffer1.isFull();
        int int14 = circularFifoBuffer1.maxSize();
        java.lang.Class<?> wildcardClass15 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        boolean boolean8 = circularFifoBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isFull();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isEmpty();
        circularFifoBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = circularFifoBuffer5.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        boolean boolean8 = circularFifoBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        java.lang.Object obj14 = circularFifoBuffer13.get();
        boolean boolean15 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        boolean boolean16 = circularFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass17 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        boolean boolean8 = circularFifoBuffer1.isFull();
        java.util.Iterator iterator9 = circularFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        java.lang.Object obj14 = circularFifoBuffer13.get();
        boolean boolean15 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int18 = circularFifoBuffer17.size();
        boolean boolean20 = circularFifoBuffer17.add((java.lang.Object) 'a');
        java.util.Iterator iterator21 = circularFifoBuffer17.iterator();
        boolean boolean22 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer17);
        java.lang.Class<?> wildcardClass23 = circularFifoBuffer17.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        boolean boolean6 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator8 = circularFifoBuffer7.iterator();
        int int9 = circularFifoBuffer7.size();
        boolean boolean11 = circularFifoBuffer7.add((java.lang.Object) 10);
        boolean boolean12 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        java.lang.Class<?> wildcardClass13 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        circularFifoBuffer1.clear();
        java.lang.Class<?> wildcardClass5 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isEmpty();
        circularFifoBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = circularFifoBuffer5.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        java.util.Iterator iterator4 = circularFifoBuffer1.iterator();
        boolean boolean5 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        int int3 = circularFifoBuffer0.size();
        int int4 = circularFifoBuffer0.maxSize();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = circularFifoBuffer0.add(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        int int8 = circularFifoBuffer1.maxSize();
        boolean boolean9 = circularFifoBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        boolean boolean4 = circularFifoBuffer0.add((java.lang.Object) 10);
        circularFifoBuffer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) 100);
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isFull();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.util.Iterator iterator9 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Class<?> wildcardClass11 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer7.getClass();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean12 = circularFifoBuffer11.isEmpty();
        java.lang.Object obj13 = circularFifoBuffer11.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        java.util.Iterator iterator2 = circularFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isFull();
        circularFifoBuffer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        circularFifoBuffer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = circularFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        boolean boolean4 = circularFifoBuffer0.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int7 = circularFifoBuffer6.size();
        boolean boolean9 = circularFifoBuffer6.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer6);
        java.lang.Object obj11 = circularFifoBuffer6.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int14 = circularFifoBuffer13.size();
        boolean boolean16 = circularFifoBuffer13.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer13);
        boolean boolean18 = circularFifoBuffer17.isFull();
        java.lang.Object obj19 = circularFifoBuffer17.remove();
        int int20 = circularFifoBuffer17.size();
        boolean boolean21 = circularFifoBuffer6.add((java.lang.Object) int20);
        java.util.Iterator iterator22 = circularFifoBuffer6.iterator();
        boolean boolean23 = circularFifoBuffer0.add((java.lang.Object) iterator22);
        circularFifoBuffer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        int int1 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        boolean boolean6 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator8 = circularFifoBuffer7.iterator();
        int int9 = circularFifoBuffer7.size();
        boolean boolean11 = circularFifoBuffer7.add((java.lang.Object) 10);
        boolean boolean12 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        boolean boolean13 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int16 = circularFifoBuffer15.size();
        boolean boolean18 = circularFifoBuffer15.add((java.lang.Object) 'a');
        java.util.Iterator iterator19 = circularFifoBuffer15.iterator();
        boolean boolean20 = circularFifoBuffer1.add((java.lang.Object) iterator19);
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer22 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.lang.Object obj7 = circularFifoBuffer1.get();
        boolean boolean8 = circularFifoBuffer1.isEmpty();
        int int9 = circularFifoBuffer1.size();
        java.lang.Class<?> wildcardClass10 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        java.util.Iterator iterator8 = circularFifoBuffer1.iterator();
        boolean boolean9 = circularFifoBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        int int5 = circularFifoBuffer1.maxSize();
        java.lang.Class<?> wildcardClass6 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        int int9 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        java.lang.Class<?> wildcardClass11 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        circularFifoBuffer0.clear();
        circularFifoBuffer0.clear();
        java.lang.Class<?> wildcardClass6 = circularFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean5 = circularFifoBuffer4.isEmpty();
        boolean boolean6 = circularFifoBuffer4.isEmpty();
        java.util.Iterator iterator7 = circularFifoBuffer4.iterator();
        boolean boolean8 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer4);
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isFull();
        int int3 = circularFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj6 = circularFifoBuffer1.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer8);
        boolean boolean13 = circularFifoBuffer12.isFull();
        java.lang.Object obj14 = circularFifoBuffer12.remove();
        int int15 = circularFifoBuffer12.size();
        boolean boolean16 = circularFifoBuffer1.add((java.lang.Object) int15);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer17);
        int int19 = circularFifoBuffer18.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean22 = circularFifoBuffer21.isEmpty();
        boolean boolean23 = circularFifoBuffer21.isFull();
        boolean boolean24 = circularFifoBuffer18.add((java.lang.Object) circularFifoBuffer21);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer26 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) 1);
        boolean boolean27 = circularFifoBuffer18.add((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = circularFifoBuffer18.add(obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) 100);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator3 = circularFifoBuffer2.iterator();
        boolean boolean5 = circularFifoBuffer2.add((java.lang.Object) false);
        boolean boolean6 = circularFifoBuffer2.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer8);
        java.lang.Object obj13 = circularFifoBuffer8.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int16 = circularFifoBuffer15.size();
        boolean boolean18 = circularFifoBuffer15.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer19 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer15);
        boolean boolean20 = circularFifoBuffer19.isFull();
        java.lang.Object obj21 = circularFifoBuffer19.remove();
        int int22 = circularFifoBuffer19.size();
        boolean boolean23 = circularFifoBuffer8.add((java.lang.Object) int22);
        java.util.Iterator iterator24 = circularFifoBuffer8.iterator();
        boolean boolean25 = circularFifoBuffer2.add((java.lang.Object) iterator24);
        circularFifoBuffer2.clear();
        boolean boolean27 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer2);
        boolean boolean28 = circularFifoBuffer2.isEmpty();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isFull();
        boolean boolean2 = circularFifoBuffer0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isEmpty();
        int int2 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        java.lang.Object obj14 = circularFifoBuffer13.get();
        boolean boolean15 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        java.lang.Class<?> wildcardClass16 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        java.util.Iterator iterator2 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass3 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer7.getClass();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean12 = circularFifoBuffer11.isEmpty();
        java.util.Iterator iterator13 = circularFifoBuffer11.iterator();
        java.lang.Class<?> wildcardClass14 = iterator13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        int int3 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj6 = circularFifoBuffer1.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer8);
        boolean boolean13 = circularFifoBuffer12.isFull();
        java.lang.Object obj14 = circularFifoBuffer12.remove();
        int int15 = circularFifoBuffer12.size();
        boolean boolean16 = circularFifoBuffer1.add((java.lang.Object) int15);
        java.util.Iterator iterator17 = circularFifoBuffer1.iterator();
        int int18 = circularFifoBuffer1.maxSize();
        java.lang.Class<?> wildcardClass19 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        circularFifoBuffer5.clear();
        boolean boolean10 = circularFifoBuffer5.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = circularFifoBuffer5.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        boolean boolean6 = circularFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass7 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        int int3 = circularFifoBuffer0.size();
        int int4 = circularFifoBuffer0.maxSize();
        java.lang.Class<?> wildcardClass5 = circularFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        java.lang.Object obj14 = circularFifoBuffer13.get();
        boolean boolean15 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int18 = circularFifoBuffer17.size();
        boolean boolean20 = circularFifoBuffer17.add((java.lang.Object) 'a');
        java.util.Iterator iterator21 = circularFifoBuffer17.iterator();
        boolean boolean22 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer17);
        circularFifoBuffer17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = circularFifoBuffer17.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer7.getClass();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        java.lang.Class<?> wildcardClass11 = circularFifoBuffer7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isEmpty();
        circularFifoBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isEmpty();
        circularFifoBuffer5.clear();
        int int11 = circularFifoBuffer5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = circularFifoBuffer5.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.lang.Object obj5 = circularFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 'a' + "'", obj5, 'a');
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        java.lang.Object obj14 = circularFifoBuffer13.get();
        boolean boolean15 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int18 = circularFifoBuffer17.size();
        boolean boolean20 = circularFifoBuffer17.add((java.lang.Object) 'a');
        java.util.Iterator iterator21 = circularFifoBuffer17.iterator();
        java.lang.Object obj22 = circularFifoBuffer17.get();
        circularFifoBuffer17.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int26 = circularFifoBuffer25.size();
        boolean boolean28 = circularFifoBuffer25.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer29 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer25);
        java.lang.Object obj30 = circularFifoBuffer29.get();
        boolean boolean31 = circularFifoBuffer17.add((java.lang.Object) circularFifoBuffer29);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer32 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer29);
        int int33 = circularFifoBuffer29.size();
        boolean boolean34 = circularFifoBuffer13.add((java.lang.Object) circularFifoBuffer29);
        java.lang.Class<?> wildcardClass35 = circularFifoBuffer13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.lang.Object obj7 = circularFifoBuffer1.get();
        java.util.Iterator iterator8 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        int int9 = circularFifoBuffer1.size();
        java.lang.Class<?> wildcardClass10 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        int int8 = circularFifoBuffer1.maxSize();
        boolean boolean9 = circularFifoBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isFull();
        circularFifoBuffer1.clear();
        boolean boolean5 = circularFifoBuffer1.isEmpty();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        int int2 = circularFifoBuffer1.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj6 = circularFifoBuffer5.get();
        circularFifoBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        boolean boolean4 = circularFifoBuffer1.isEmpty();
        int int5 = circularFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = circularFifoBuffer8.add(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        circularFifoBuffer5.clear();
        boolean boolean10 = circularFifoBuffer5.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean14 = circularFifoBuffer12.add((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = circularFifoBuffer12.remove();
        int int16 = circularFifoBuffer12.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean19 = circularFifoBuffer18.isFull();
        java.lang.Class<?> wildcardClass20 = circularFifoBuffer18.getClass();
        boolean boolean21 = circularFifoBuffer12.add((java.lang.Object) circularFifoBuffer18);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer22 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer12);
        boolean boolean23 = circularFifoBuffer22.isEmpty();
        java.lang.Object obj24 = circularFifoBuffer22.remove();
        boolean boolean25 = circularFifoBuffer5.add(obj24);
        java.lang.Class<?> wildcardClass26 = obj24.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isFull();
        int int3 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int4 = circularFifoBuffer3.size();
        boolean boolean6 = circularFifoBuffer3.add((java.lang.Object) 'a');
        java.util.Iterator iterator7 = circularFifoBuffer3.iterator();
        circularFifoBuffer3.clear();
        circularFifoBuffer3.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer3);
        circularFifoBuffer1.clear();
        int int12 = circularFifoBuffer1.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }
}

