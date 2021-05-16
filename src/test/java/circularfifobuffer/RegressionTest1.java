import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        boolean boolean12 = circularFifoBuffer1.add((java.lang.Object) 10.0d);
        boolean boolean13 = circularFifoBuffer1.isFull();
        circularFifoBuffer1.clear();
        int int15 = circularFifoBuffer1.size();
        int int16 = circularFifoBuffer1.size();
        java.lang.Class<?> wildcardClass17 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        boolean boolean4 = circularFifoBuffer0.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
        java.lang.Object obj6 = circularFifoBuffer5.get();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int24 = circularFifoBuffer23.size();
        boolean boolean26 = circularFifoBuffer23.add((java.lang.Object) 'a');
        java.util.Iterator iterator27 = circularFifoBuffer23.iterator();
        circularFifoBuffer23.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer30 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer30.clear();
        boolean boolean32 = circularFifoBuffer23.add((java.lang.Object) circularFifoBuffer30);
        boolean boolean33 = circularFifoBuffer30.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer35 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int36 = circularFifoBuffer35.size();
        boolean boolean38 = circularFifoBuffer35.add((java.lang.Object) 'a');
        java.util.Iterator iterator39 = circularFifoBuffer35.iterator();
        java.lang.Object obj40 = circularFifoBuffer35.get();
        circularFifoBuffer35.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer43 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int44 = circularFifoBuffer43.size();
        boolean boolean46 = circularFifoBuffer43.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer47 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer43);
        java.lang.Object obj48 = circularFifoBuffer47.get();
        boolean boolean49 = circularFifoBuffer35.add((java.lang.Object) circularFifoBuffer47);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer51 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int52 = circularFifoBuffer51.size();
        boolean boolean54 = circularFifoBuffer51.add((java.lang.Object) 'a');
        java.util.Iterator iterator55 = circularFifoBuffer51.iterator();
        boolean boolean56 = circularFifoBuffer35.add((java.lang.Object) circularFifoBuffer51);
        boolean boolean57 = circularFifoBuffer30.add((java.lang.Object) circularFifoBuffer51);
        boolean boolean58 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer51);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer59 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer51);
        int int60 = circularFifoBuffer59.maxSize();
        int int61 = circularFifoBuffer59.size();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 'a' + "'", obj48, 'a');
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) ' ');
        circularFifoBuffer1.clear();
        int int3 = circularFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        boolean boolean4 = circularFifoBuffer0.add((java.lang.Object) 10);
        boolean boolean5 = circularFifoBuffer0.isFull();
        int int6 = circularFifoBuffer0.size();
        boolean boolean7 = circularFifoBuffer0.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
        java.lang.Object obj9 = circularFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10 + "'", obj9, 10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        circularFifoBuffer0.clear();
        circularFifoBuffer0.clear();
        java.util.Iterator iterator6 = circularFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator8 = circularFifoBuffer7.iterator();
        int int9 = circularFifoBuffer7.size();
        java.util.Iterator iterator10 = circularFifoBuffer7.iterator();
        boolean boolean11 = circularFifoBuffer0.add((java.lang.Object) iterator10);
        java.util.Iterator iterator12 = circularFifoBuffer0.iterator();
        int int13 = circularFifoBuffer0.size();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = circularFifoBuffer0.add(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean5 = circularFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        boolean boolean21 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean25 = circularFifoBuffer23.add((java.lang.Object) (byte) 10);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer26 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer23);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer28 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int29 = circularFifoBuffer28.size();
        boolean boolean31 = circularFifoBuffer28.add((java.lang.Object) 'a');
        java.util.Iterator iterator32 = circularFifoBuffer28.iterator();
        java.lang.Object obj33 = circularFifoBuffer28.get();
        circularFifoBuffer28.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer36 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int37 = circularFifoBuffer36.size();
        boolean boolean39 = circularFifoBuffer36.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer40 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer36);
        java.lang.Object obj41 = circularFifoBuffer40.get();
        boolean boolean42 = circularFifoBuffer28.add((java.lang.Object) circularFifoBuffer40);
        int int43 = circularFifoBuffer28.maxSize();
        boolean boolean44 = circularFifoBuffer28.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer46 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int47 = circularFifoBuffer46.size();
        boolean boolean49 = circularFifoBuffer46.add((java.lang.Object) 'a');
        java.util.Iterator iterator50 = circularFifoBuffer46.iterator();
        int int51 = circularFifoBuffer46.size();
        java.util.Iterator iterator52 = circularFifoBuffer46.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer53 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer46);
        boolean boolean54 = circularFifoBuffer28.add((java.lang.Object) circularFifoBuffer46);
        boolean boolean55 = circularFifoBuffer23.add((java.lang.Object) circularFifoBuffer28);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer57 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 10);
        int int58 = circularFifoBuffer57.maxSize();
        boolean boolean59 = circularFifoBuffer57.isEmpty();
        java.util.Iterator iterator60 = circularFifoBuffer57.iterator();
        java.util.Iterator iterator61 = circularFifoBuffer57.iterator();
        boolean boolean62 = circularFifoBuffer28.add((java.lang.Object) circularFifoBuffer57);
        boolean boolean63 = circularFifoBuffer1.add((java.lang.Object) boolean62);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer65 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int66 = circularFifoBuffer65.size();
        boolean boolean68 = circularFifoBuffer65.add((java.lang.Object) 'a');
        java.util.Iterator iterator69 = circularFifoBuffer65.iterator();
        java.lang.Object obj70 = circularFifoBuffer65.remove();
        boolean boolean71 = circularFifoBuffer65.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer73 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean75 = circularFifoBuffer73.add((java.lang.Object) (byte) 10);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer76 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer73);
        boolean boolean77 = circularFifoBuffer65.add((java.lang.Object) circularFifoBuffer73);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer78 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer65);
        java.lang.Object obj79 = circularFifoBuffer65.get();
        boolean boolean80 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer65);
        java.lang.Class<?> wildcardClass81 = circularFifoBuffer65.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 'a' + "'", obj33, 'a');
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 'a' + "'", obj70, 'a');
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[10]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "[10]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[10]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.util.Iterator iterator9 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean11 = circularFifoBuffer10.isEmpty();
        boolean boolean12 = circularFifoBuffer10.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        int int15 = circularFifoBuffer14.maxSize();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = circularFifoBuffer14.add((java.lang.Object) wildcardClass17);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer19 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        boolean boolean20 = circularFifoBuffer10.add((java.lang.Object) circularFifoBuffer14);
        java.lang.Object obj21 = circularFifoBuffer10.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[class java.lang.Object]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[class java.lang.Object]");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        boolean boolean12 = circularFifoBuffer1.add((java.lang.Object) 10.0d);
        boolean boolean13 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        int int16 = circularFifoBuffer15.size();
        java.util.Iterator iterator17 = circularFifoBuffer15.iterator();
        java.lang.Class<?> wildcardClass18 = circularFifoBuffer15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        boolean boolean16 = circularFifoBuffer13.isEmpty();
        java.lang.Object obj17 = circularFifoBuffer13.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 'a' + "'", obj17, 'a');
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        int int1 = circularFifoBuffer0.size();
        java.util.Iterator iterator2 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.isEmpty();
        int int4 = circularFifoBuffer0.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = circularFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        int int18 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer19 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Class<?> wildcardClass20 = circularFifoBuffer1.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int4 = circularFifoBuffer3.size();
        boolean boolean6 = circularFifoBuffer3.add((java.lang.Object) 'a');
        java.util.Iterator iterator7 = circularFifoBuffer3.iterator();
        circularFifoBuffer3.clear();
        circularFifoBuffer3.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer3);
        int int11 = circularFifoBuffer1.size();
        java.lang.Object obj12 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        int int14 = circularFifoBuffer1.size();
        java.util.Iterator iterator15 = circularFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int24 = circularFifoBuffer23.size();
        boolean boolean26 = circularFifoBuffer23.add((java.lang.Object) 'a');
        java.util.Iterator iterator27 = circularFifoBuffer23.iterator();
        circularFifoBuffer23.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer30 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer30.clear();
        boolean boolean32 = circularFifoBuffer23.add((java.lang.Object) circularFifoBuffer30);
        boolean boolean33 = circularFifoBuffer30.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer35 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int36 = circularFifoBuffer35.size();
        boolean boolean38 = circularFifoBuffer35.add((java.lang.Object) 'a');
        java.util.Iterator iterator39 = circularFifoBuffer35.iterator();
        java.lang.Object obj40 = circularFifoBuffer35.get();
        circularFifoBuffer35.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer43 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int44 = circularFifoBuffer43.size();
        boolean boolean46 = circularFifoBuffer43.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer47 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer43);
        java.lang.Object obj48 = circularFifoBuffer47.get();
        boolean boolean49 = circularFifoBuffer35.add((java.lang.Object) circularFifoBuffer47);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer51 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int52 = circularFifoBuffer51.size();
        boolean boolean54 = circularFifoBuffer51.add((java.lang.Object) 'a');
        java.util.Iterator iterator55 = circularFifoBuffer51.iterator();
        boolean boolean56 = circularFifoBuffer35.add((java.lang.Object) circularFifoBuffer51);
        boolean boolean57 = circularFifoBuffer30.add((java.lang.Object) circularFifoBuffer51);
        boolean boolean58 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer51);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer60 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int61 = circularFifoBuffer60.size();
        boolean boolean63 = circularFifoBuffer60.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer64 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer60);
        boolean boolean65 = circularFifoBuffer64.isFull();
        int int66 = circularFifoBuffer64.maxSize();
        boolean boolean67 = circularFifoBuffer1.add((java.lang.Object) int66);
        int int68 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 'a' + "'", obj48, 'a');
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj6 = circularFifoBuffer5.get();
        boolean boolean7 = circularFifoBuffer5.isFull();
        int int8 = circularFifoBuffer5.size();
        int int9 = circularFifoBuffer5.size();
        java.lang.Object obj10 = circularFifoBuffer5.get();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        boolean boolean8 = circularFifoBuffer1.isFull();
        boolean boolean9 = circularFifoBuffer1.isEmpty();
        int int10 = circularFifoBuffer1.maxSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        boolean boolean7 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean11 = circularFifoBuffer9.add((java.lang.Object) (byte) 10);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        boolean boolean13 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer9);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        circularFifoBuffer14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = circularFifoBuffer14.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.Object obj16 = circularFifoBuffer13.remove();
        int int17 = circularFifoBuffer13.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 10);
        int int2 = circularFifoBuffer1.maxSize();
        int int3 = circularFifoBuffer1.size();
        int int4 = circularFifoBuffer1.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        int int16 = circularFifoBuffer1.maxSize();
        java.lang.Object obj17 = circularFifoBuffer1.get();
        int int18 = circularFifoBuffer1.size();
        boolean boolean19 = circularFifoBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass20 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isFull();
        circularFifoBuffer1.clear();
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        circularFifoBuffer0.clear();
        circularFifoBuffer0.clear();
        java.util.Iterator iterator6 = circularFifoBuffer0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = circularFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(10);
        int int2 = circularFifoBuffer1.size();
        int int3 = circularFifoBuffer1.maxSize();
        boolean boolean4 = circularFifoBuffer1.isFull();
        java.lang.Class<?> wildcardClass5 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer7.getClass();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj12 = circularFifoBuffer11.remove();
        circularFifoBuffer11.clear();
        circularFifoBuffer11.clear();
        java.util.Iterator iterator15 = circularFifoBuffer11.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isFull();
        circularFifoBuffer1.clear();
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.util.Iterator iterator6 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        boolean boolean4 = circularFifoBuffer0.isEmpty();
        java.lang.Object obj5 = circularFifoBuffer0.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator7 = circularFifoBuffer6.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int10 = circularFifoBuffer9.size();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        boolean boolean14 = circularFifoBuffer13.isFull();
        java.lang.Object obj15 = circularFifoBuffer13.remove();
        boolean boolean16 = circularFifoBuffer13.isFull();
        boolean boolean17 = circularFifoBuffer13.isEmpty();
        java.lang.Class<?> wildcardClass18 = circularFifoBuffer13.getClass();
        boolean boolean19 = circularFifoBuffer6.add((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = circularFifoBuffer6.get();
        int int21 = circularFifoBuffer6.size();
        boolean boolean22 = circularFifoBuffer6.isFull();
        int int23 = circularFifoBuffer6.maxSize();
        boolean boolean24 = circularFifoBuffer6.isEmpty();
        java.util.Iterator iterator25 = circularFifoBuffer6.iterator();
        boolean boolean26 = circularFifoBuffer0.add((java.lang.Object) circularFifoBuffer6);
        java.lang.Object obj27 = circularFifoBuffer6.get();
        java.lang.Object obj28 = circularFifoBuffer6.get();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isEmpty();
        int int2 = circularFifoBuffer0.size();
        java.util.Iterator iterator3 = circularFifoBuffer0.iterator();
        int int4 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        circularFifoBuffer17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = circularFifoBuffer17.get();
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer7.getClass();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = circularFifoBuffer7.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.lang.Object obj7 = circularFifoBuffer1.get();
        boolean boolean8 = circularFifoBuffer1.isEmpty();
        boolean boolean9 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator11 = circularFifoBuffer10.iterator();
        int int12 = circularFifoBuffer10.size();
        boolean boolean14 = circularFifoBuffer10.add((java.lang.Object) 10);
        boolean boolean15 = circularFifoBuffer10.isFull();
        int int16 = circularFifoBuffer10.size();
        int int17 = circularFifoBuffer10.size();
        boolean boolean18 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer10);
        java.lang.Object obj19 = circularFifoBuffer10.remove();
        int int20 = circularFifoBuffer10.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10 + "'", obj19, 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        circularFifoBuffer0.clear();
        circularFifoBuffer0.clear();
        java.util.Iterator iterator6 = circularFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator8 = circularFifoBuffer7.iterator();
        int int9 = circularFifoBuffer7.size();
        java.util.Iterator iterator10 = circularFifoBuffer7.iterator();
        boolean boolean11 = circularFifoBuffer0.add((java.lang.Object) iterator10);
        java.lang.Class<?> wildcardClass12 = iterator10.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.get();
        boolean boolean5 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer6);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        java.util.Iterator iterator10 = circularFifoBuffer9.iterator();
        boolean boolean11 = circularFifoBuffer9.isFull();
        boolean boolean12 = circularFifoBuffer6.add((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        circularFifoBuffer1.clear();
        int int10 = circularFifoBuffer1.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int13 = circularFifoBuffer12.size();
        boolean boolean15 = circularFifoBuffer12.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer16 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer12);
        boolean boolean17 = circularFifoBuffer16.isFull();
        boolean boolean18 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer16);
        circularFifoBuffer16.clear();
        boolean boolean20 = circularFifoBuffer16.isFull();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean12 = circularFifoBuffer11.isEmpty();
        boolean boolean13 = circularFifoBuffer11.isEmpty();
        java.util.Iterator iterator14 = circularFifoBuffer11.iterator();
        boolean boolean15 = circularFifoBuffer8.add((java.lang.Object) circularFifoBuffer11);
        java.lang.Object obj16 = circularFifoBuffer8.remove();
        int int17 = circularFifoBuffer8.size();
        boolean boolean18 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        boolean boolean19 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int22 = circularFifoBuffer21.size();
        boolean boolean24 = circularFifoBuffer21.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer21);
        boolean boolean26 = circularFifoBuffer25.isFull();
        java.lang.Object obj27 = circularFifoBuffer25.remove();
        boolean boolean28 = circularFifoBuffer25.isFull();
        boolean boolean29 = circularFifoBuffer25.isEmpty();
        int int30 = circularFifoBuffer25.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer31 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        int int32 = circularFifoBuffer31.size();
        java.util.Iterator iterator33 = circularFifoBuffer31.iterator();
        boolean boolean34 = circularFifoBuffer25.add((java.lang.Object) circularFifoBuffer31);
        boolean boolean35 = circularFifoBuffer1.add((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean2 = circularFifoBuffer0.isEmpty();
        int int3 = circularFifoBuffer0.size();
        int int4 = circularFifoBuffer0.maxSize();
        circularFifoBuffer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = circularFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.Class<?> wildcardClass19 = circularFifoBuffer18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) ' ');
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        circularFifoBuffer0.clear();
        int int4 = circularFifoBuffer0.size();
        boolean boolean5 = circularFifoBuffer0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        int int7 = circularFifoBuffer1.size();
        boolean boolean8 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator10 = circularFifoBuffer9.iterator();
        int int11 = circularFifoBuffer9.size();
        boolean boolean13 = circularFifoBuffer9.add((java.lang.Object) 10);
        boolean boolean14 = circularFifoBuffer9.isFull();
        int int15 = circularFifoBuffer9.size();
        int int16 = circularFifoBuffer9.size();
        java.util.Iterator iterator17 = circularFifoBuffer9.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        boolean boolean19 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer18);
        java.lang.Object obj20 = circularFifoBuffer18.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10 + "'", obj20, 10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        int int7 = circularFifoBuffer5.maxSize();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (byte) 100);
        int int2 = circularFifoBuffer1.maxSize();
        boolean boolean3 = circularFifoBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean2 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int5 = circularFifoBuffer4.size();
        boolean boolean7 = circularFifoBuffer4.add((java.lang.Object) 'a');
        java.util.Iterator iterator8 = circularFifoBuffer4.iterator();
        int int9 = circularFifoBuffer4.size();
        java.util.Iterator iterator10 = circularFifoBuffer4.iterator();
        int int11 = circularFifoBuffer4.size();
        java.lang.Class<?> wildcardClass12 = circularFifoBuffer4.getClass();
        boolean boolean13 = circularFifoBuffer1.add((java.lang.Object) wildcardClass12);
        int int14 = circularFifoBuffer1.size();
        java.lang.Object obj15 = circularFifoBuffer1.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean19 = circularFifoBuffer17.add((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = circularFifoBuffer17.remove();
        circularFifoBuffer17.clear();
        int int22 = circularFifoBuffer17.size();
        boolean boolean23 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer17);
        java.util.Iterator iterator24 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass25 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer2 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean3 = circularFifoBuffer2.isEmpty();
        boolean boolean4 = circularFifoBuffer2.isEmpty();
        boolean boolean5 = circularFifoBuffer0.add((java.lang.Object) circularFifoBuffer2);
        int int6 = circularFifoBuffer0.maxSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        java.util.Iterator iterator4 = circularFifoBuffer1.iterator();
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass6 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isEmpty();
        boolean boolean7 = circularFifoBuffer5.isFull();
        java.lang.Object obj8 = circularFifoBuffer5.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = circularFifoBuffer5.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        int int2 = circularFifoBuffer1.maxSize();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        int int4 = circularFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        boolean boolean7 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean11 = circularFifoBuffer9.add((java.lang.Object) (byte) 10);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        boolean boolean13 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer9);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        int int15 = circularFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer8.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean12 = circularFifoBuffer11.isEmpty();
        boolean boolean13 = circularFifoBuffer11.isEmpty();
        java.util.Iterator iterator14 = circularFifoBuffer11.iterator();
        boolean boolean15 = circularFifoBuffer8.add((java.lang.Object) circularFifoBuffer11);
        java.lang.Object obj16 = circularFifoBuffer8.remove();
        int int17 = circularFifoBuffer8.size();
        boolean boolean18 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int4 = circularFifoBuffer3.size();
        boolean boolean6 = circularFifoBuffer3.add((java.lang.Object) 'a');
        java.util.Iterator iterator7 = circularFifoBuffer3.iterator();
        circularFifoBuffer3.clear();
        circularFifoBuffer3.clear();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer3);
        java.lang.Object obj11 = circularFifoBuffer1.remove();
        boolean boolean12 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Class<?> wildcardClass9 = circularFifoBuffer7.getClass();
        boolean boolean10 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer7);
        java.lang.Object obj11 = circularFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        java.lang.Object obj9 = circularFifoBuffer1.get();
        boolean boolean10 = circularFifoBuffer1.isEmpty();
        java.lang.Object obj11 = circularFifoBuffer1.remove();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = circularFifoBuffer1.add(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        boolean boolean4 = circularFifoBuffer0.add((java.lang.Object) 10);
        boolean boolean5 = circularFifoBuffer0.isFull();
        int int6 = circularFifoBuffer0.size();
        boolean boolean7 = circularFifoBuffer0.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
        java.util.Iterator iterator9 = circularFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean4 = circularFifoBuffer3.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int7 = circularFifoBuffer6.size();
        boolean boolean9 = circularFifoBuffer6.add((java.lang.Object) 'a');
        java.util.Iterator iterator10 = circularFifoBuffer6.iterator();
        int int11 = circularFifoBuffer6.size();
        java.util.Iterator iterator12 = circularFifoBuffer6.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer6);
        java.util.Iterator iterator14 = circularFifoBuffer6.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer6);
        boolean boolean16 = circularFifoBuffer3.add((java.lang.Object) circularFifoBuffer15);
        boolean boolean17 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer15);
        java.util.Iterator iterator18 = circularFifoBuffer15.iterator();
        boolean boolean19 = circularFifoBuffer15.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean22 = circularFifoBuffer21.isFull();
        boolean boolean23 = circularFifoBuffer21.isEmpty();
        circularFifoBuffer21.clear();
        circularFifoBuffer21.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer27 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int28 = circularFifoBuffer27.size();
        boolean boolean30 = circularFifoBuffer27.add((java.lang.Object) 'a');
        java.util.Iterator iterator31 = circularFifoBuffer27.iterator();
        circularFifoBuffer27.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer34 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer34.clear();
        boolean boolean36 = circularFifoBuffer27.add((java.lang.Object) circularFifoBuffer34);
        boolean boolean37 = circularFifoBuffer21.add((java.lang.Object) circularFifoBuffer27);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer38 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer21);
        boolean boolean39 = circularFifoBuffer15.add((java.lang.Object) circularFifoBuffer38);
        java.lang.Object obj40 = circularFifoBuffer15.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "[[[]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "[[[]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "[[[]]]");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.maxSize();
        boolean boolean6 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        java.util.Iterator iterator12 = circularFifoBuffer8.iterator();
        int int13 = circularFifoBuffer8.size();
        boolean boolean14 = circularFifoBuffer8.isEmpty();
        circularFifoBuffer8.clear();
        int int16 = circularFifoBuffer8.maxSize();
        java.util.Iterator iterator17 = circularFifoBuffer8.iterator();
        boolean boolean18 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer20 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean21 = circularFifoBuffer20.isEmpty();
        boolean boolean22 = circularFifoBuffer20.isFull();
        circularFifoBuffer20.clear();
        java.util.Iterator iterator24 = circularFifoBuffer20.iterator();
        java.util.Iterator iterator25 = circularFifoBuffer20.iterator();
        boolean boolean26 = circularFifoBuffer8.add((java.lang.Object) iterator25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        java.util.Iterator iterator12 = circularFifoBuffer8.iterator();
        circularFifoBuffer8.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer15.clear();
        boolean boolean17 = circularFifoBuffer8.add((java.lang.Object) circularFifoBuffer15);
        boolean boolean19 = circularFifoBuffer8.add((java.lang.Object) 10.0d);
        boolean boolean20 = circularFifoBuffer8.isFull();
        circularFifoBuffer8.clear();
        int int22 = circularFifoBuffer8.size();
        boolean boolean23 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer8);
        java.lang.Class<?> wildcardClass24 = circularFifoBuffer8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.util.Iterator iterator6 = circularFifoBuffer1.iterator();
        int int7 = circularFifoBuffer1.size();
        java.lang.Object obj8 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        boolean boolean4 = circularFifoBuffer0.add((java.lang.Object) 10);
        boolean boolean5 = circularFifoBuffer0.isFull();
        int int6 = circularFifoBuffer0.size();
        int int7 = circularFifoBuffer0.size();
        java.util.Iterator iterator8 = circularFifoBuffer0.iterator();
        java.util.Iterator iterator9 = circularFifoBuffer0.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.lang.Object obj7 = circularFifoBuffer1.get();
        boolean boolean8 = circularFifoBuffer1.isEmpty();
        java.lang.Object obj9 = circularFifoBuffer1.get();
        int int10 = circularFifoBuffer1.maxSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isEmpty();
        boolean boolean2 = circularFifoBuffer0.isFull();
        circularFifoBuffer0.clear();
        int int4 = circularFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        int int5 = circularFifoBuffer1.size();
        java.util.Iterator iterator6 = circularFifoBuffer1.iterator();
        int int7 = circularFifoBuffer1.maxSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        boolean boolean3 = circularFifoBuffer0.add((java.lang.Object) false);
        boolean boolean4 = circularFifoBuffer0.isEmpty();
        java.lang.Object obj5 = circularFifoBuffer0.remove();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int4 = circularFifoBuffer3.size();
        boolean boolean6 = circularFifoBuffer3.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer3);
        boolean boolean8 = circularFifoBuffer7.isFull();
        java.lang.Object obj9 = circularFifoBuffer7.remove();
        boolean boolean10 = circularFifoBuffer7.isFull();
        boolean boolean11 = circularFifoBuffer7.isEmpty();
        java.lang.Class<?> wildcardClass12 = circularFifoBuffer7.getClass();
        boolean boolean13 = circularFifoBuffer0.add((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = circularFifoBuffer0.get();
        int int15 = circularFifoBuffer0.size();
        boolean boolean16 = circularFifoBuffer0.isFull();
        int int17 = circularFifoBuffer0.maxSize();
        boolean boolean18 = circularFifoBuffer0.isEmpty();
        java.util.Iterator iterator19 = circularFifoBuffer0.iterator();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = circularFifoBuffer0.add(obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Attempted to add null object to buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        int int8 = circularFifoBuffer5.size();
        circularFifoBuffer5.clear();
        java.util.Iterator iterator10 = circularFifoBuffer5.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean13 = circularFifoBuffer12.isFull();
        boolean boolean14 = circularFifoBuffer12.isEmpty();
        boolean boolean15 = circularFifoBuffer5.add((java.lang.Object) circularFifoBuffer12);
        java.lang.Class<?> wildcardClass16 = circularFifoBuffer5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

