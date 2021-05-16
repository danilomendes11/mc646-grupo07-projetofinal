import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isEmpty();
        int int10 = circularFifoBuffer5.size();
        int int11 = circularFifoBuffer5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = circularFifoBuffer5.remove();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        java.lang.Object obj9 = circularFifoBuffer1.remove();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int13 = circularFifoBuffer12.size();
        boolean boolean15 = circularFifoBuffer12.add((java.lang.Object) 'a');
        java.util.Iterator iterator16 = circularFifoBuffer12.iterator();
        java.lang.Object obj17 = circularFifoBuffer12.remove();
        java.util.Iterator iterator18 = circularFifoBuffer12.iterator();
        int int19 = circularFifoBuffer12.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer20 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator21 = circularFifoBuffer20.iterator();
        boolean boolean23 = circularFifoBuffer20.add((java.lang.Object) false);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer24 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator25 = circularFifoBuffer24.iterator();
        int int26 = circularFifoBuffer24.size();
        boolean boolean28 = circularFifoBuffer24.add((java.lang.Object) 10);
        boolean boolean29 = circularFifoBuffer24.isFull();
        int int30 = circularFifoBuffer24.size();
        boolean boolean31 = circularFifoBuffer20.add((java.lang.Object) int30);
        java.util.Iterator iterator32 = circularFifoBuffer20.iterator();
        boolean boolean33 = circularFifoBuffer12.add((java.lang.Object) iterator32);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer35 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int36 = circularFifoBuffer35.size();
        boolean boolean38 = circularFifoBuffer35.add((java.lang.Object) 'a');
        java.util.Iterator iterator39 = circularFifoBuffer35.iterator();
        circularFifoBuffer35.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer42 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer42.clear();
        boolean boolean44 = circularFifoBuffer35.add((java.lang.Object) circularFifoBuffer42);
        boolean boolean45 = circularFifoBuffer42.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer47 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int48 = circularFifoBuffer47.size();
        boolean boolean50 = circularFifoBuffer47.add((java.lang.Object) 'a');
        java.util.Iterator iterator51 = circularFifoBuffer47.iterator();
        java.lang.Object obj52 = circularFifoBuffer47.get();
        circularFifoBuffer47.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer55 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int56 = circularFifoBuffer55.size();
        boolean boolean58 = circularFifoBuffer55.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer59 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer55);
        java.lang.Object obj60 = circularFifoBuffer59.get();
        boolean boolean61 = circularFifoBuffer47.add((java.lang.Object) circularFifoBuffer59);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer63 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int64 = circularFifoBuffer63.size();
        boolean boolean66 = circularFifoBuffer63.add((java.lang.Object) 'a');
        java.util.Iterator iterator67 = circularFifoBuffer63.iterator();
        boolean boolean68 = circularFifoBuffer47.add((java.lang.Object) circularFifoBuffer63);
        boolean boolean69 = circularFifoBuffer42.add((java.lang.Object) circularFifoBuffer63);
        java.util.Iterator iterator70 = circularFifoBuffer63.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer72 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int73 = circularFifoBuffer72.size();
        boolean boolean75 = circularFifoBuffer72.add((java.lang.Object) 'a');
        java.util.Iterator iterator76 = circularFifoBuffer72.iterator();
        int int77 = circularFifoBuffer72.size();
        boolean boolean78 = circularFifoBuffer72.isEmpty();
        circularFifoBuffer72.clear();
        int int80 = circularFifoBuffer72.maxSize();
        boolean boolean81 = circularFifoBuffer63.add((java.lang.Object) int80);
        boolean boolean82 = circularFifoBuffer12.add((java.lang.Object) circularFifoBuffer63);
        boolean boolean83 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer63);
        java.lang.Object obj84 = circularFifoBuffer63.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 'a' + "'", obj17, 'a');
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 'a' + "'", obj52, 'a');
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 'a' + "'", obj60, 'a');
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 'a' + "'", obj84, 'a');
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        circularFifoBuffer1.clear();
        int int10 = circularFifoBuffer1.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator12 = circularFifoBuffer11.iterator();
        boolean boolean14 = circularFifoBuffer11.add((java.lang.Object) false);
        boolean boolean15 = circularFifoBuffer11.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int18 = circularFifoBuffer17.size();
        boolean boolean20 = circularFifoBuffer17.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer17);
        java.lang.Object obj22 = circularFifoBuffer17.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer24 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int25 = circularFifoBuffer24.size();
        boolean boolean27 = circularFifoBuffer24.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer28 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer24);
        boolean boolean29 = circularFifoBuffer28.isFull();
        java.lang.Object obj30 = circularFifoBuffer28.remove();
        int int31 = circularFifoBuffer28.size();
        boolean boolean32 = circularFifoBuffer17.add((java.lang.Object) int31);
        java.util.Iterator iterator33 = circularFifoBuffer17.iterator();
        boolean boolean34 = circularFifoBuffer11.add((java.lang.Object) iterator33);
        boolean boolean35 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer11);
        circularFifoBuffer1.clear();
        boolean boolean37 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        boolean boolean13 = circularFifoBuffer11.isFull();
        int int14 = circularFifoBuffer11.size();
        int int15 = circularFifoBuffer11.maxSize();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.Object obj24 = circularFifoBuffer0.get();
        boolean boolean25 = circularFifoBuffer0.isFull();
        java.lang.Class<?> wildcardClass26 = circularFifoBuffer0.getClass();
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
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator1 = circularFifoBuffer0.iterator();
        int int2 = circularFifoBuffer0.size();
        boolean boolean4 = circularFifoBuffer0.add((java.lang.Object) 10);
        java.util.Iterator iterator5 = circularFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer7 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean8 = circularFifoBuffer7.isFull();
        boolean boolean9 = circularFifoBuffer7.isEmpty();
        circularFifoBuffer7.clear();
        circularFifoBuffer7.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int14 = circularFifoBuffer13.size();
        boolean boolean16 = circularFifoBuffer13.add((java.lang.Object) 'a');
        java.util.Iterator iterator17 = circularFifoBuffer13.iterator();
        circularFifoBuffer13.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer20 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer20.clear();
        boolean boolean22 = circularFifoBuffer13.add((java.lang.Object) circularFifoBuffer20);
        boolean boolean23 = circularFifoBuffer7.add((java.lang.Object) circularFifoBuffer13);
        java.util.Iterator iterator24 = circularFifoBuffer7.iterator();
        circularFifoBuffer7.clear();
        boolean boolean26 = circularFifoBuffer0.add((java.lang.Object) circularFifoBuffer7);
        java.lang.Class<?> wildcardClass27 = circularFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer0);
        java.lang.Class<?> wildcardClass18 = circularFifoBuffer17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean5 = circularFifoBuffer4.isEmpty();
        boolean boolean6 = circularFifoBuffer4.isEmpty();
        java.util.Iterator iterator7 = circularFifoBuffer4.iterator();
        boolean boolean8 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer4);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int13 = circularFifoBuffer12.size();
        boolean boolean15 = circularFifoBuffer12.add((java.lang.Object) 'a');
        java.util.Iterator iterator16 = circularFifoBuffer12.iterator();
        circularFifoBuffer12.clear();
        circularFifoBuffer12.clear();
        boolean boolean19 = circularFifoBuffer10.add((java.lang.Object) circularFifoBuffer12);
        int int20 = circularFifoBuffer12.size();
        boolean boolean21 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer12);
        int int22 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        int int28 = circularFifoBuffer1.size();
        int int29 = circularFifoBuffer1.maxSize();
        boolean boolean30 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer31 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer33 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int34 = circularFifoBuffer33.size();
        boolean boolean36 = circularFifoBuffer33.add((java.lang.Object) 'a');
        java.util.Iterator iterator37 = circularFifoBuffer33.iterator();
        circularFifoBuffer33.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer40 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer40.clear();
        boolean boolean42 = circularFifoBuffer33.add((java.lang.Object) circularFifoBuffer40);
        boolean boolean44 = circularFifoBuffer33.add((java.lang.Object) 10.0d);
        boolean boolean45 = circularFifoBuffer33.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer46 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer33);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer47 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer46);
        boolean boolean48 = circularFifoBuffer31.add((java.lang.Object) circularFifoBuffer46);
        boolean boolean49 = circularFifoBuffer46.isFull();
        boolean boolean50 = circularFifoBuffer46.isEmpty();
        boolean boolean51 = circularFifoBuffer46.isEmpty();
        java.lang.Object obj52 = circularFifoBuffer46.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer54 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer54.clear();
        int int56 = circularFifoBuffer54.maxSize();
        boolean boolean57 = circularFifoBuffer46.add((java.lang.Object) int56);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.size();
        java.lang.Object obj9 = circularFifoBuffer1.remove();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        int int28 = circularFifoBuffer1.size();
        int int29 = circularFifoBuffer1.maxSize();
        boolean boolean30 = circularFifoBuffer1.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer31 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer33 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int34 = circularFifoBuffer33.size();
        boolean boolean36 = circularFifoBuffer33.add((java.lang.Object) 'a');
        java.util.Iterator iterator37 = circularFifoBuffer33.iterator();
        circularFifoBuffer33.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer40 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer40.clear();
        boolean boolean42 = circularFifoBuffer33.add((java.lang.Object) circularFifoBuffer40);
        boolean boolean44 = circularFifoBuffer33.add((java.lang.Object) 10.0d);
        boolean boolean45 = circularFifoBuffer33.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer46 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer33);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer47 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer46);
        boolean boolean48 = circularFifoBuffer31.add((java.lang.Object) circularFifoBuffer46);
        boolean boolean49 = circularFifoBuffer46.isFull();
        boolean boolean50 = circularFifoBuffer46.isFull();
        int int51 = circularFifoBuffer46.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer53 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean55 = circularFifoBuffer53.add((java.lang.Object) (byte) 10);
        java.lang.Object obj56 = circularFifoBuffer53.remove();
        int int57 = circularFifoBuffer53.size();
        boolean boolean58 = circularFifoBuffer53.isFull();
        boolean boolean59 = circularFifoBuffer46.add((java.lang.Object) boolean58);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) 10 + "'", obj56, (byte) 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.Object obj17 = circularFifoBuffer1.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Class<?> wildcardClass19 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[a]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        circularFifoBuffer1.clear();
        int int10 = circularFifoBuffer1.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator12 = circularFifoBuffer11.iterator();
        boolean boolean14 = circularFifoBuffer11.add((java.lang.Object) false);
        boolean boolean15 = circularFifoBuffer11.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int18 = circularFifoBuffer17.size();
        boolean boolean20 = circularFifoBuffer17.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer17);
        java.lang.Object obj22 = circularFifoBuffer17.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer24 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int25 = circularFifoBuffer24.size();
        boolean boolean27 = circularFifoBuffer24.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer28 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer24);
        boolean boolean29 = circularFifoBuffer28.isFull();
        java.lang.Object obj30 = circularFifoBuffer28.remove();
        int int31 = circularFifoBuffer28.size();
        boolean boolean32 = circularFifoBuffer17.add((java.lang.Object) int31);
        java.util.Iterator iterator33 = circularFifoBuffer17.iterator();
        boolean boolean34 = circularFifoBuffer11.add((java.lang.Object) iterator33);
        boolean boolean35 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer11);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer36 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer11);
        java.util.Iterator iterator37 = circularFifoBuffer36.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.lang.Object obj17 = circularFifoBuffer1.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean19 = circularFifoBuffer1.isFull();
        java.lang.Class<?> wildcardClass20 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[a]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator10 = circularFifoBuffer9.iterator();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) false);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator14 = circularFifoBuffer13.iterator();
        int int15 = circularFifoBuffer13.size();
        boolean boolean17 = circularFifoBuffer13.add((java.lang.Object) 10);
        boolean boolean18 = circularFifoBuffer13.isFull();
        int int19 = circularFifoBuffer13.size();
        boolean boolean20 = circularFifoBuffer9.add((java.lang.Object) int19);
        java.util.Iterator iterator21 = circularFifoBuffer9.iterator();
        boolean boolean22 = circularFifoBuffer1.add((java.lang.Object) iterator21);
        int int23 = circularFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.util.Iterator iterator6 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        java.util.Iterator iterator12 = circularFifoBuffer8.iterator();
        circularFifoBuffer8.clear();
        circularFifoBuffer8.clear();
        int int15 = circularFifoBuffer8.size();
        boolean boolean16 = circularFifoBuffer8.isEmpty();
        boolean boolean17 = circularFifoBuffer8.isFull();
        boolean boolean18 = circularFifoBuffer1.add((java.lang.Object) boolean17);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer19 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer20 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj21 = circularFifoBuffer20.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = circularFifoBuffer1.add(obj7);
        circularFifoBuffer1.clear();
        int int10 = circularFifoBuffer1.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator12 = circularFifoBuffer11.iterator();
        boolean boolean14 = circularFifoBuffer11.add((java.lang.Object) false);
        boolean boolean15 = circularFifoBuffer11.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int18 = circularFifoBuffer17.size();
        boolean boolean20 = circularFifoBuffer17.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer17);
        java.lang.Object obj22 = circularFifoBuffer17.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer24 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int25 = circularFifoBuffer24.size();
        boolean boolean27 = circularFifoBuffer24.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer28 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer24);
        boolean boolean29 = circularFifoBuffer28.isFull();
        java.lang.Object obj30 = circularFifoBuffer28.remove();
        int int31 = circularFifoBuffer28.size();
        boolean boolean32 = circularFifoBuffer17.add((java.lang.Object) int31);
        java.util.Iterator iterator33 = circularFifoBuffer17.iterator();
        boolean boolean34 = circularFifoBuffer11.add((java.lang.Object) iterator33);
        boolean boolean35 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer11);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer36 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj37 = circularFifoBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        boolean boolean13 = circularFifoBuffer1.isEmpty();
        java.lang.Object obj14 = circularFifoBuffer1.get();
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        int int22 = circularFifoBuffer1.maxSize();
        int int23 = circularFifoBuffer1.maxSize();
        boolean boolean24 = circularFifoBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean2 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int5 = circularFifoBuffer4.size();
        boolean boolean7 = circularFifoBuffer4.add((java.lang.Object) 'a');
        java.util.Iterator iterator8 = circularFifoBuffer4.iterator();
        int int9 = circularFifoBuffer4.size();
        java.util.Iterator iterator10 = circularFifoBuffer4.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer4);
        java.util.Iterator iterator12 = circularFifoBuffer4.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer13 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer4);
        boolean boolean14 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer13);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
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
        int int33 = circularFifoBuffer32.size();
        boolean boolean35 = circularFifoBuffer32.add((java.lang.Object) (short) 0);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer37 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 100);
        boolean boolean38 = circularFifoBuffer32.add((java.lang.Object) circularFifoBuffer37);
        int int39 = circularFifoBuffer32.size();
        boolean boolean40 = circularFifoBuffer15.add((java.lang.Object) int39);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer42 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '4');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer44 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer46 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean47 = circularFifoBuffer46.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer49 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int50 = circularFifoBuffer49.size();
        boolean boolean52 = circularFifoBuffer49.add((java.lang.Object) 'a');
        java.util.Iterator iterator53 = circularFifoBuffer49.iterator();
        int int54 = circularFifoBuffer49.size();
        java.util.Iterator iterator55 = circularFifoBuffer49.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer56 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer49);
        java.util.Iterator iterator57 = circularFifoBuffer49.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer58 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer49);
        boolean boolean59 = circularFifoBuffer46.add((java.lang.Object) circularFifoBuffer58);
        boolean boolean60 = circularFifoBuffer44.add((java.lang.Object) circularFifoBuffer58);
        java.lang.Object obj61 = circularFifoBuffer58.remove();
        boolean boolean62 = circularFifoBuffer42.add((java.lang.Object) circularFifoBuffer58);
        boolean boolean63 = circularFifoBuffer42.isFull();
        boolean boolean64 = circularFifoBuffer15.add((java.lang.Object) boolean63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 'a' + "'", obj61, 'a');
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.Object obj24 = circularFifoBuffer0.get();
        java.lang.Object obj25 = circularFifoBuffer0.remove();
        boolean boolean26 = circularFifoBuffer0.isFull();
        java.util.Iterator iterator27 = circularFifoBuffer0.iterator();
        java.lang.Object obj28 = circularFifoBuffer0.remove();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
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
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        circularFifoBuffer0.clear();
        int int26 = circularFifoBuffer0.size();
        int int27 = circularFifoBuffer0.size();
        java.util.Iterator iterator28 = circularFifoBuffer0.iterator();
        java.lang.Class<?> wildcardClass29 = iterator28.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.size();
        java.lang.Object obj9 = circularFifoBuffer1.get();
        boolean boolean10 = circularFifoBuffer1.isFull();
        boolean boolean11 = circularFifoBuffer1.isEmpty();
        int int12 = circularFifoBuffer1.size();
        int int13 = circularFifoBuffer1.size();
        int int14 = circularFifoBuffer1.maxSize();
        int int15 = circularFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '4');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer3 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean6 = circularFifoBuffer5.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        java.util.Iterator iterator12 = circularFifoBuffer8.iterator();
        int int13 = circularFifoBuffer8.size();
        java.util.Iterator iterator14 = circularFifoBuffer8.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer8);
        java.util.Iterator iterator16 = circularFifoBuffer8.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer17 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer8);
        boolean boolean18 = circularFifoBuffer5.add((java.lang.Object) circularFifoBuffer17);
        boolean boolean19 = circularFifoBuffer3.add((java.lang.Object) circularFifoBuffer17);
        java.lang.Object obj20 = circularFifoBuffer17.remove();
        boolean boolean21 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer17);
        boolean boolean22 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj24 = circularFifoBuffer1.remove();
        boolean boolean25 = circularFifoBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer26 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        int int16 = circularFifoBuffer0.size();
        int int17 = circularFifoBuffer0.maxSize();
        int int18 = circularFifoBuffer0.maxSize();
        int int19 = circularFifoBuffer0.size();
        java.util.Iterator iterator20 = circularFifoBuffer0.iterator();
        java.lang.Object obj21 = circularFifoBuffer0.get();
        int int22 = circularFifoBuffer0.maxSize();
        int int23 = circularFifoBuffer0.size();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        int int20 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int26 = circularFifoBuffer25.size();
        boolean boolean28 = circularFifoBuffer25.add((java.lang.Object) 'a');
        java.util.Iterator iterator29 = circularFifoBuffer25.iterator();
        circularFifoBuffer25.clear();
        circularFifoBuffer25.clear();
        boolean boolean32 = circularFifoBuffer23.add((java.lang.Object) circularFifoBuffer25);
        java.lang.Object obj33 = circularFifoBuffer23.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer35 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int36 = circularFifoBuffer35.size();
        boolean boolean38 = circularFifoBuffer35.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer39 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer35);
        boolean boolean40 = circularFifoBuffer39.isFull();
        int int41 = circularFifoBuffer39.maxSize();
        boolean boolean42 = circularFifoBuffer39.isFull();
        java.util.Iterator iterator43 = circularFifoBuffer39.iterator();
        boolean boolean44 = circularFifoBuffer23.add((java.lang.Object) circularFifoBuffer39);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer45 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer23);
        circularFifoBuffer23.clear();
        boolean boolean47 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer23);
        int int48 = circularFifoBuffer23.size();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer33 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int34 = circularFifoBuffer33.size();
        boolean boolean36 = circularFifoBuffer33.add((java.lang.Object) 'a');
        java.util.Iterator iterator37 = circularFifoBuffer33.iterator();
        boolean boolean38 = circularFifoBuffer17.add((java.lang.Object) circularFifoBuffer33);
        boolean boolean39 = circularFifoBuffer17.isEmpty();
        int int40 = circularFifoBuffer17.maxSize();
        boolean boolean41 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer17);
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 1);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        int int3 = circularFifoBuffer1.maxSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.util.Iterator iterator9 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean12 = circularFifoBuffer11.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int15 = circularFifoBuffer14.size();
        boolean boolean17 = circularFifoBuffer14.add((java.lang.Object) 'a');
        java.util.Iterator iterator18 = circularFifoBuffer14.iterator();
        int int19 = circularFifoBuffer14.size();
        java.util.Iterator iterator20 = circularFifoBuffer14.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        java.util.Iterator iterator22 = circularFifoBuffer14.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        circularFifoBuffer23.clear();
        boolean boolean25 = circularFifoBuffer11.add((java.lang.Object) circularFifoBuffer23);
        boolean boolean26 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer11);
        java.util.Iterator iterator27 = circularFifoBuffer11.iterator();
        circularFifoBuffer11.clear();
        java.lang.Class<?> wildcardClass29 = circularFifoBuffer11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        int int16 = circularFifoBuffer0.size();
        int int17 = circularFifoBuffer0.maxSize();
        int int18 = circularFifoBuffer0.maxSize();
        int int19 = circularFifoBuffer0.size();
        java.util.Iterator iterator20 = circularFifoBuffer0.iterator();
        int int21 = circularFifoBuffer0.maxSize();
        int int22 = circularFifoBuffer0.maxSize();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        circularFifoBuffer5.clear();
        boolean boolean10 = circularFifoBuffer5.isFull();
        boolean boolean11 = circularFifoBuffer5.isEmpty();
        java.util.Iterator iterator12 = circularFifoBuffer5.iterator();
        circularFifoBuffer5.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        boolean boolean7 = circularFifoBuffer1.isFull();
        int int8 = circularFifoBuffer1.maxSize();
        java.lang.Object obj9 = circularFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.get();
        boolean boolean7 = circularFifoBuffer1.isFull();
        java.lang.Object obj8 = circularFifoBuffer1.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int11 = circularFifoBuffer10.size();
        boolean boolean13 = circularFifoBuffer10.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer10);
        boolean boolean15 = circularFifoBuffer14.isFull();
        java.lang.Object obj16 = circularFifoBuffer14.remove();
        boolean boolean17 = circularFifoBuffer14.isFull();
        boolean boolean18 = circularFifoBuffer14.isEmpty();
        java.util.Iterator iterator19 = circularFifoBuffer14.iterator();
        boolean boolean20 = circularFifoBuffer14.isFull();
        boolean boolean21 = circularFifoBuffer1.add((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }
}

