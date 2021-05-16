import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        boolean boolean7 = circularFifoBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.Object obj14 = circularFifoBuffer1.get();
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = circularFifoBuffer1.get();
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
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[10]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[10]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[10]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isFull();
        int int3 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.util.Iterator iterator6 = circularFifoBuffer1.iterator();
        int int7 = circularFifoBuffer1.size();
        int int8 = circularFifoBuffer1.maxSize();
        int int9 = circularFifoBuffer1.size();
        java.lang.Class<?> wildcardClass10 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isEmpty();
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        boolean boolean6 = circularFifoBuffer1.isEmpty();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        boolean boolean8 = circularFifoBuffer1.isFull();
        int int9 = circularFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        circularFifoBuffer13.clear();
        int int18 = circularFifoBuffer13.maxSize();
        boolean boolean19 = circularFifoBuffer13.isEmpty();
        circularFifoBuffer13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = circularFifoBuffer13.get();
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        int int19 = circularFifoBuffer18.size();
        java.lang.Object obj20 = circularFifoBuffer18.remove();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[a]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = circularFifoBuffer1.remove();
        circularFifoBuffer1.clear();
        int int6 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int9 = circularFifoBuffer8.size();
        boolean boolean11 = circularFifoBuffer8.add((java.lang.Object) 'a');
        boolean boolean12 = circularFifoBuffer1.add((java.lang.Object) boolean11);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int15 = circularFifoBuffer14.size();
        boolean boolean17 = circularFifoBuffer14.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        java.lang.Object obj19 = circularFifoBuffer14.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int22 = circularFifoBuffer21.size();
        boolean boolean24 = circularFifoBuffer21.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer21);
        boolean boolean26 = circularFifoBuffer25.isFull();
        java.lang.Object obj27 = circularFifoBuffer25.remove();
        int int28 = circularFifoBuffer25.size();
        boolean boolean29 = circularFifoBuffer14.add((java.lang.Object) int28);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer30 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer31 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer30);
        java.lang.Object obj32 = circularFifoBuffer30.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer34 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int35 = circularFifoBuffer34.size();
        boolean boolean37 = circularFifoBuffer34.add((java.lang.Object) 'a');
        java.util.Iterator iterator38 = circularFifoBuffer34.iterator();
        java.lang.Object obj39 = circularFifoBuffer34.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer41 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int42 = circularFifoBuffer41.size();
        boolean boolean44 = circularFifoBuffer41.add((java.lang.Object) 'a');
        java.util.Iterator iterator45 = circularFifoBuffer41.iterator();
        circularFifoBuffer41.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer48 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer48.clear();
        boolean boolean50 = circularFifoBuffer41.add((java.lang.Object) circularFifoBuffer48);
        boolean boolean52 = circularFifoBuffer41.add((java.lang.Object) 10.0d);
        boolean boolean53 = circularFifoBuffer41.isFull();
        circularFifoBuffer41.clear();
        int int55 = circularFifoBuffer41.size();
        boolean boolean56 = circularFifoBuffer34.add((java.lang.Object) circularFifoBuffer41);
        circularFifoBuffer34.clear();
        boolean boolean58 = circularFifoBuffer30.add((java.lang.Object) circularFifoBuffer34);
        boolean boolean59 = circularFifoBuffer30.isEmpty();
        boolean boolean60 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer30);
        boolean boolean61 = circularFifoBuffer1.isFull();
        int int62 = circularFifoBuffer1.maxSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        int int19 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer20 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        circularFifoBuffer20.clear();
        boolean boolean22 = circularFifoBuffer20.isFull();
        java.util.Iterator iterator23 = circularFifoBuffer20.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer24 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isFull();
        int int3 = circularFifoBuffer1.size();
        int int4 = circularFifoBuffer1.size();
        circularFifoBuffer1.clear();
        int int6 = circularFifoBuffer1.maxSize();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer1.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer4 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean5 = circularFifoBuffer4.isEmpty();
        boolean boolean6 = circularFifoBuffer4.isEmpty();
        java.util.Iterator iterator7 = circularFifoBuffer4.iterator();
        boolean boolean8 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer4);
        java.lang.Object obj9 = circularFifoBuffer1.remove();
        int int10 = circularFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer16 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean19 = circularFifoBuffer18.isEmpty();
        boolean boolean20 = circularFifoBuffer18.isEmpty();
        boolean boolean21 = circularFifoBuffer16.add((java.lang.Object) circularFifoBuffer18);
        boolean boolean22 = circularFifoBuffer16.isFull();
        boolean boolean23 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer16);
        java.lang.Object obj24 = circularFifoBuffer16.get();
        circularFifoBuffer16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = circularFifoBuffer16.get();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        java.lang.Object obj14 = circularFifoBuffer1.get();
        boolean boolean15 = circularFifoBuffer1.isFull();
        int int16 = circularFifoBuffer1.maxSize();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.size();
        int int9 = circularFifoBuffer1.maxSize();
        java.util.Iterator iterator10 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.lang.Object obj12 = circularFifoBuffer11.get();
        boolean boolean13 = circularFifoBuffer11.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 'a' + "'", obj12, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        boolean boolean8 = circularFifoBuffer5.isFull();
        boolean boolean9 = circularFifoBuffer5.isEmpty();
        int int10 = circularFifoBuffer5.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer11 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        int int12 = circularFifoBuffer11.size();
        java.util.Iterator iterator13 = circularFifoBuffer11.iterator();
        boolean boolean14 = circularFifoBuffer5.add((java.lang.Object) circularFifoBuffer11);
        boolean boolean15 = circularFifoBuffer11.isEmpty();
        java.lang.Class<?> wildcardClass16 = circularFifoBuffer11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer(10);
        int int16 = circularFifoBuffer15.maxSize();
        boolean boolean17 = circularFifoBuffer1.add((java.lang.Object) int16);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer19 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int20 = circularFifoBuffer19.size();
        boolean boolean22 = circularFifoBuffer19.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer19);
        boolean boolean24 = circularFifoBuffer23.isFull();
        java.lang.Object obj25 = circularFifoBuffer23.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer27 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean29 = circularFifoBuffer27.add((java.lang.Object) (byte) 10);
        java.lang.Object obj30 = circularFifoBuffer27.remove();
        int int31 = circularFifoBuffer27.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer33 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean34 = circularFifoBuffer33.isFull();
        java.lang.Class<?> wildcardClass35 = circularFifoBuffer33.getClass();
        boolean boolean36 = circularFifoBuffer27.add((java.lang.Object) circularFifoBuffer33);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer37 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer27);
        boolean boolean38 = circularFifoBuffer37.isEmpty();
        boolean boolean39 = circularFifoBuffer23.add((java.lang.Object) boolean38);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer40 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer23);
        boolean boolean41 = circularFifoBuffer40.isEmpty();
        java.lang.Object obj42 = circularFifoBuffer40.get();
        boolean boolean43 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        boolean boolean7 = circularFifoBuffer1.isEmpty();
        int int8 = circularFifoBuffer1.size();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.util.Iterator iterator12 = circularFifoBuffer11.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer14 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int15 = circularFifoBuffer14.size();
        boolean boolean17 = circularFifoBuffer14.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer18 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer14);
        boolean boolean19 = circularFifoBuffer18.isFull();
        java.lang.Object obj20 = circularFifoBuffer18.remove();
        boolean boolean21 = circularFifoBuffer18.isFull();
        boolean boolean22 = circularFifoBuffer18.isEmpty();
        java.lang.Class<?> wildcardClass23 = circularFifoBuffer18.getClass();
        boolean boolean24 = circularFifoBuffer11.add((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = circularFifoBuffer11.get();
        int int26 = circularFifoBuffer11.size();
        int int27 = circularFifoBuffer11.size();
        int int28 = circularFifoBuffer11.maxSize();
        int int29 = circularFifoBuffer11.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer30 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer11);
        boolean boolean31 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer30);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer32 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator33 = circularFifoBuffer32.iterator();
        boolean boolean35 = circularFifoBuffer32.add((java.lang.Object) false);
        circularFifoBuffer32.clear();
        circularFifoBuffer32.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer38 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator39 = circularFifoBuffer38.iterator();
        int int40 = circularFifoBuffer38.size();
        boolean boolean42 = circularFifoBuffer38.add((java.lang.Object) 10);
        boolean boolean43 = circularFifoBuffer38.isFull();
        int int44 = circularFifoBuffer38.size();
        int int45 = circularFifoBuffer38.size();
        boolean boolean46 = circularFifoBuffer32.add((java.lang.Object) circularFifoBuffer38);
        java.lang.Object obj47 = circularFifoBuffer38.get();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer49 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer49.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer52 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean53 = circularFifoBuffer52.isEmpty();
        boolean boolean54 = circularFifoBuffer52.isEmpty();
        java.util.Iterator iterator55 = circularFifoBuffer52.iterator();
        boolean boolean56 = circularFifoBuffer49.add((java.lang.Object) circularFifoBuffer52);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer58 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer60 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int61 = circularFifoBuffer60.size();
        boolean boolean63 = circularFifoBuffer60.add((java.lang.Object) 'a');
        java.util.Iterator iterator64 = circularFifoBuffer60.iterator();
        circularFifoBuffer60.clear();
        circularFifoBuffer60.clear();
        boolean boolean67 = circularFifoBuffer58.add((java.lang.Object) circularFifoBuffer60);
        int int68 = circularFifoBuffer60.size();
        boolean boolean69 = circularFifoBuffer49.add((java.lang.Object) circularFifoBuffer60);
        int int70 = circularFifoBuffer49.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer71 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator72 = circularFifoBuffer71.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer74 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int75 = circularFifoBuffer74.size();
        boolean boolean77 = circularFifoBuffer74.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer78 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer74);
        boolean boolean79 = circularFifoBuffer78.isFull();
        java.lang.Object obj80 = circularFifoBuffer78.remove();
        boolean boolean81 = circularFifoBuffer78.isFull();
        boolean boolean82 = circularFifoBuffer78.isEmpty();
        java.lang.Class<?> wildcardClass83 = circularFifoBuffer78.getClass();
        boolean boolean84 = circularFifoBuffer71.add((java.lang.Object) wildcardClass83);
        java.lang.Object obj85 = circularFifoBuffer71.get();
        int int86 = circularFifoBuffer71.size();
        int int87 = circularFifoBuffer71.size();
        int int88 = circularFifoBuffer71.maxSize();
        boolean boolean89 = circularFifoBuffer49.add((java.lang.Object) int88);
        boolean boolean90 = circularFifoBuffer38.add((java.lang.Object) circularFifoBuffer49);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer91 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer49);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer92 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator93 = circularFifoBuffer92.iterator();
        boolean boolean95 = circularFifoBuffer92.add((java.lang.Object) false);
        boolean boolean96 = circularFifoBuffer92.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer97 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer92);
        boolean boolean98 = circularFifoBuffer91.add((java.lang.Object) circularFifoBuffer97);
        boolean boolean99 = circularFifoBuffer30.add((java.lang.Object) circularFifoBuffer91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 10 + "'", obj47, 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 'a' + "'", obj80, 'a');
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "class org.apache.commons.collections.buffer.CircularFifoBuffer");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 32 + "'", int88 == 32);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(iterator93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        int int15 = circularFifoBuffer1.maxSize();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = circularFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isEmpty();
        int int2 = circularFifoBuffer0.size();
        circularFifoBuffer0.clear();
        boolean boolean4 = circularFifoBuffer0.isFull();
        int int5 = circularFifoBuffer0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer16 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer13);
        int int17 = circularFifoBuffer16.size();
        boolean boolean19 = circularFifoBuffer16.add((java.lang.Object) (short) 0);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) (short) 100);
        boolean boolean22 = circularFifoBuffer16.add((java.lang.Object) circularFifoBuffer21);
        boolean boolean23 = circularFifoBuffer16.isEmpty();
        int int24 = circularFifoBuffer16.size();
        java.lang.Class<?> wildcardClass25 = circularFifoBuffer16.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        java.lang.Object obj6 = circularFifoBuffer1.remove();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        boolean boolean8 = circularFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        boolean boolean34 = circularFifoBuffer33.isFull();
        boolean boolean35 = circularFifoBuffer33.isEmpty();
        circularFifoBuffer33.clear();
        circularFifoBuffer33.clear();
        boolean boolean38 = circularFifoBuffer33.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer40 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean42 = circularFifoBuffer40.add((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = circularFifoBuffer40.remove();
        int int44 = circularFifoBuffer40.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer46 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean47 = circularFifoBuffer46.isFull();
        java.lang.Class<?> wildcardClass48 = circularFifoBuffer46.getClass();
        boolean boolean49 = circularFifoBuffer40.add((java.lang.Object) circularFifoBuffer46);
        java.lang.Object obj50 = circularFifoBuffer40.remove();
        boolean boolean51 = circularFifoBuffer33.add(obj50);
        java.lang.Object obj52 = circularFifoBuffer33.get();
        int int53 = circularFifoBuffer33.size();
        boolean boolean54 = circularFifoBuffer31.add((java.lang.Object) circularFifoBuffer33);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer55 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer31);
        java.lang.Object obj56 = circularFifoBuffer31.get();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[[]]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer8 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        java.util.Iterator iterator9 = circularFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer10 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean11 = circularFifoBuffer10.isFull();
        boolean boolean12 = circularFifoBuffer10.isFull();
        boolean boolean13 = circularFifoBuffer10.isEmpty();
        java.util.Iterator iterator14 = circularFifoBuffer10.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        boolean boolean6 = circularFifoBuffer5.isFull();
        java.lang.Object obj7 = circularFifoBuffer5.remove();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean11 = circularFifoBuffer9.add((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = circularFifoBuffer9.remove();
        int int13 = circularFifoBuffer9.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean16 = circularFifoBuffer15.isFull();
        java.lang.Class<?> wildcardClass17 = circularFifoBuffer15.getClass();
        boolean boolean18 = circularFifoBuffer9.add((java.lang.Object) circularFifoBuffer15);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer19 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer9);
        boolean boolean20 = circularFifoBuffer19.isEmpty();
        boolean boolean21 = circularFifoBuffer5.add((java.lang.Object) boolean20);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer22 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer5);
        boolean boolean23 = circularFifoBuffer22.isEmpty();
        java.lang.Object obj24 = circularFifoBuffer22.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean3 = circularFifoBuffer1.add((java.lang.Object) (byte) 10);
        java.util.Iterator iterator4 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        int int6 = circularFifoBuffer1.maxSize();
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = circularFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int16 = circularFifoBuffer15.size();
        boolean boolean18 = circularFifoBuffer15.add((java.lang.Object) 'a');
        java.util.Iterator iterator19 = circularFifoBuffer15.iterator();
        int int20 = circularFifoBuffer15.size();
        java.lang.Object obj21 = circularFifoBuffer15.get();
        java.util.Iterator iterator22 = circularFifoBuffer15.iterator();
        boolean boolean23 = circularFifoBuffer15.isFull();
        java.util.Iterator iterator24 = circularFifoBuffer15.iterator();
        boolean boolean25 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer15);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer26 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        circularFifoBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = circularFifoBuffer1.get();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        int int6 = circularFifoBuffer1.size();
        java.util.Iterator iterator7 = circularFifoBuffer1.iterator();
        int int8 = circularFifoBuffer1.size();
        java.lang.Object obj9 = circularFifoBuffer1.get();
        boolean boolean10 = circularFifoBuffer1.isFull();
        int int11 = circularFifoBuffer1.size();
        java.util.Iterator iterator12 = circularFifoBuffer1.iterator();
        boolean boolean13 = circularFifoBuffer1.isFull();
        java.lang.Class<?> wildcardClass14 = circularFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean2 = circularFifoBuffer1.isEmpty();
        boolean boolean3 = circularFifoBuffer1.isFull();
        int int4 = circularFifoBuffer1.maxSize();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer6 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        boolean boolean7 = circularFifoBuffer6.isEmpty();
        boolean boolean8 = circularFifoBuffer6.isEmpty();
        boolean boolean9 = circularFifoBuffer6.isFull();
        boolean boolean10 = circularFifoBuffer6.isFull();
        boolean boolean11 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer6);
        boolean boolean12 = circularFifoBuffer6.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        int int19 = circularFifoBuffer1.size();
        java.util.Iterator iterator20 = circularFifoBuffer1.iterator();
        boolean boolean21 = circularFifoBuffer1.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer22 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer23 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer1);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '4');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer27 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer29 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) 'a');
        boolean boolean30 = circularFifoBuffer29.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer32 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int33 = circularFifoBuffer32.size();
        boolean boolean35 = circularFifoBuffer32.add((java.lang.Object) 'a');
        java.util.Iterator iterator36 = circularFifoBuffer32.iterator();
        int int37 = circularFifoBuffer32.size();
        java.util.Iterator iterator38 = circularFifoBuffer32.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer39 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer32);
        java.util.Iterator iterator40 = circularFifoBuffer32.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer41 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer32);
        boolean boolean42 = circularFifoBuffer29.add((java.lang.Object) circularFifoBuffer41);
        boolean boolean43 = circularFifoBuffer27.add((java.lang.Object) circularFifoBuffer41);
        java.lang.Object obj44 = circularFifoBuffer41.remove();
        boolean boolean45 = circularFifoBuffer25.add((java.lang.Object) circularFifoBuffer41);
        boolean boolean46 = circularFifoBuffer25.isFull();
        circularFifoBuffer25.clear();
        boolean boolean48 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = circularFifoBuffer25.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 'a' + "'", obj44, 'a');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer1 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int2 = circularFifoBuffer1.size();
        boolean boolean4 = circularFifoBuffer1.add((java.lang.Object) 'a');
        java.util.Iterator iterator5 = circularFifoBuffer1.iterator();
        circularFifoBuffer1.clear();
        circularFifoBuffer1.clear();
        int int8 = circularFifoBuffer1.size();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer9 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator10 = circularFifoBuffer9.iterator();
        boolean boolean12 = circularFifoBuffer9.add((java.lang.Object) false);
        circularFifoBuffer9.clear();
        circularFifoBuffer9.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator16 = circularFifoBuffer15.iterator();
        int int17 = circularFifoBuffer15.size();
        boolean boolean19 = circularFifoBuffer15.add((java.lang.Object) 10);
        boolean boolean20 = circularFifoBuffer15.isFull();
        int int21 = circularFifoBuffer15.size();
        int int22 = circularFifoBuffer15.size();
        boolean boolean23 = circularFifoBuffer9.add((java.lang.Object) circularFifoBuffer15);
        java.lang.Object obj24 = circularFifoBuffer15.get();
        boolean boolean25 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer15);
        boolean boolean26 = circularFifoBuffer15.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10 + "'", obj24, 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer15 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator16 = circularFifoBuffer15.iterator();
        int int17 = circularFifoBuffer15.size();
        boolean boolean19 = circularFifoBuffer15.add((java.lang.Object) 10);
        circularFifoBuffer15.clear();
        circularFifoBuffer15.clear();
        boolean boolean22 = circularFifoBuffer1.add((java.lang.Object) circularFifoBuffer15);
        circularFifoBuffer15.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer25 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int26 = circularFifoBuffer25.size();
        boolean boolean28 = circularFifoBuffer25.add((java.lang.Object) 'a');
        java.util.Iterator iterator29 = circularFifoBuffer25.iterator();
        boolean boolean30 = circularFifoBuffer25.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer31 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        java.util.Iterator iterator32 = circularFifoBuffer31.iterator();
        int int33 = circularFifoBuffer31.size();
        boolean boolean35 = circularFifoBuffer31.add((java.lang.Object) 10);
        boolean boolean36 = circularFifoBuffer25.add((java.lang.Object) circularFifoBuffer31);
        boolean boolean37 = circularFifoBuffer25.isFull();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer39 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int40 = circularFifoBuffer39.size();
        boolean boolean42 = circularFifoBuffer39.add((java.lang.Object) 'a');
        java.util.Iterator iterator43 = circularFifoBuffer39.iterator();
        boolean boolean44 = circularFifoBuffer25.add((java.lang.Object) iterator43);
        circularFifoBuffer25.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer47 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int48 = circularFifoBuffer47.size();
        boolean boolean50 = circularFifoBuffer47.add((java.lang.Object) 'a');
        java.util.Iterator iterator51 = circularFifoBuffer47.iterator();
        circularFifoBuffer47.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer54 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer54.clear();
        boolean boolean56 = circularFifoBuffer47.add((java.lang.Object) circularFifoBuffer54);
        boolean boolean57 = circularFifoBuffer54.isEmpty();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer59 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int60 = circularFifoBuffer59.size();
        boolean boolean62 = circularFifoBuffer59.add((java.lang.Object) 'a');
        java.util.Iterator iterator63 = circularFifoBuffer59.iterator();
        java.lang.Object obj64 = circularFifoBuffer59.get();
        circularFifoBuffer59.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer67 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int68 = circularFifoBuffer67.size();
        boolean boolean70 = circularFifoBuffer67.add((java.lang.Object) 'a');
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer71 = new org.apache.commons.collections.buffer.CircularFifoBuffer((java.util.Collection) circularFifoBuffer67);
        java.lang.Object obj72 = circularFifoBuffer71.get();
        boolean boolean73 = circularFifoBuffer59.add((java.lang.Object) circularFifoBuffer71);
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer75 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int76 = circularFifoBuffer75.size();
        boolean boolean78 = circularFifoBuffer75.add((java.lang.Object) 'a');
        java.util.Iterator iterator79 = circularFifoBuffer75.iterator();
        boolean boolean80 = circularFifoBuffer59.add((java.lang.Object) circularFifoBuffer75);
        boolean boolean81 = circularFifoBuffer54.add((java.lang.Object) circularFifoBuffer75);
        boolean boolean82 = circularFifoBuffer25.add((java.lang.Object) circularFifoBuffer75);
        boolean boolean83 = circularFifoBuffer15.add((java.lang.Object) circularFifoBuffer75);
        java.lang.Object obj84 = circularFifoBuffer75.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 'a' + "'", obj64, 'a');
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 'a' + "'", obj72, 'a');
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 'a' + "'", obj84, 'a');
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.util.Iterator iterator49 = circularFifoBuffer31.iterator();
        java.lang.Class<?> wildcardClass50 = circularFifoBuffer31.getClass();
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
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer0 = new org.apache.commons.collections.buffer.CircularFifoBuffer();
        boolean boolean1 = circularFifoBuffer0.isEmpty();
        int int2 = circularFifoBuffer0.size();
        java.util.Iterator iterator3 = circularFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer5 = new org.apache.commons.collections.buffer.CircularFifoBuffer(100);
        int int6 = circularFifoBuffer5.size();
        boolean boolean8 = circularFifoBuffer5.add((java.lang.Object) 'a');
        java.util.Iterator iterator9 = circularFifoBuffer5.iterator();
        circularFifoBuffer5.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer12 = new org.apache.commons.collections.buffer.CircularFifoBuffer((int) '#');
        circularFifoBuffer12.clear();
        boolean boolean14 = circularFifoBuffer5.add((java.lang.Object) circularFifoBuffer12);
        boolean boolean16 = circularFifoBuffer5.add((java.lang.Object) 10.0d);
        boolean boolean17 = circularFifoBuffer5.isFull();
        java.lang.Object obj18 = circularFifoBuffer5.get();
        circularFifoBuffer5.clear();
        org.apache.commons.collections.buffer.CircularFifoBuffer circularFifoBuffer21 = new org.apache.commons.collections.buffer.CircularFifoBuffer(2);
        boolean boolean22 = circularFifoBuffer21.isFull();
        boolean boolean23 = circularFifoBuffer5.add((java.lang.Object) boolean22);
        boolean boolean24 = circularFifoBuffer0.add((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }
}

