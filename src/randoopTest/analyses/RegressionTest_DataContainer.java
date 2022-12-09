package analyses;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest_DataContainer {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.lang.Class<?> wildcardClass7 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.lang.Class<?> wildcardClass7 = strList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.lang.Class<?> wildcardClass10 = strList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass9 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass9 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.ArrayList<java.lang.String> strList0 = null;
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap1 = null;
        analyses.DataContainer dataContainer2 = new analyses.DataContainer(strList0, strMap1);
        java.lang.Class<?> wildcardClass3 = dataContainer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.lang.Class<?> wildcardClass13 = strList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass14 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strMap11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass10 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass14 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.lang.Class<?> wildcardClass7 = dataContainer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.lang.Class<?> wildcardClass14 = dataContainer12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.lang.Class<?> wildcardClass12 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.lang.Class<?> wildcardClass11 = strList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.lang.Class<?> wildcardClass15 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.lang.Class<?> wildcardClass10 = dataContainer9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.lang.Class<?> wildcardClass14 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.lang.Class<?> wildcardClass13 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer6.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.lang.Class<?> wildcardClass15 = dataContainer12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList9, strMap12);
        java.lang.Class<?> wildcardClass14 = strList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.lang.Class<?> wildcardClass15 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass12 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.lang.Class<?> wildcardClass16 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.lang.Class<?> wildcardClass13 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.lang.Class<?> wildcardClass13 = dataContainer12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.lang.Class<?> wildcardClass15 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer9.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer10.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = strMap16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer12.getDescription();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.lang.Class<?> wildcardClass11 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.lang.Class<?> wildcardClass12 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.lang.Class<?> wildcardClass10 = dataContainer9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList8, strMap13);
        java.lang.Class<?> wildcardClass15 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        java.lang.Class<?> wildcardClass14 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList7, strMap12);
        java.lang.Class<?> wildcardClass14 = strList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.lang.Class<?> wildcardClass11 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList10, strMap13);
        java.lang.Class<?> wildcardClass15 = strList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.lang.Class<?> wildcardClass12 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer6.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.lang.Class<?> wildcardClass17 = strList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.ArrayList<java.lang.String> strList0 = null;
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap1 = null;
        analyses.DataContainer dataContainer2 = new analyses.DataContainer(strList0, strMap1);
        java.util.ArrayList<java.lang.String> strList3 = dataContainer2.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.lang.Class<?> wildcardClass12 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.lang.Class<?> wildcardClass12 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.lang.Class<?> wildcardClass16 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = dataContainer17.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList8, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = strMap15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList18 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.ArrayList<java.lang.String> strList13 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList16, strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.ArrayList<java.lang.String> strList8 = dataContainer7.getDescription();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.ArrayList<java.lang.String> strList0 = null;
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap1 = null;
        analyses.DataContainer dataContainer2 = new analyses.DataContainer(strList0, strMap1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap3 = dataContainer2.getData();
        java.util.ArrayList<java.lang.String> strList4 = dataContainer2.getDescription();
        java.util.ArrayList<java.lang.String> strList5 = dataContainer2.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.lang.Class<?> wildcardClass6 = dataContainer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList6, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList6, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer11.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList9, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList9, strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.lang.Class<?> wildcardClass18 = dataContainer17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer12.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer12.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer12.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = strMap17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass12 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList8, strMap13);
        java.lang.Class<?> wildcardClass15 = strList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = dataContainer5.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer9.getData();
        java.lang.Class<?> wildcardClass11 = dataContainer9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.lang.Class<?> wildcardClass11 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer5.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.lang.Class<?> wildcardClass19 = dataContainer17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strMap9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.ArrayList<java.lang.String> strList16 = dataContainer15.getDescription();
        java.lang.Class<?> wildcardClass17 = dataContainer15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass12 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList8, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.lang.Class<?> wildcardClass13 = dataContainer12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList15, strMap16);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = dataContainer17.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer15.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.lang.Class<?> wildcardClass13 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.ArrayList<java.lang.String> strList17 = dataContainer16.getDescription();
        java.lang.Class<?> wildcardClass18 = dataContainer16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList14, strMap17);
        java.util.ArrayList<java.lang.String> strList19 = dataContainer18.getDescription();
        java.lang.Class<?> wildcardClass20 = dataContainer18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer13.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass15 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList16, strMap17);
        java.lang.Class<?> wildcardClass19 = dataContainer18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer9.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.ArrayList<java.lang.String> strList0 = null;
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap1 = null;
        analyses.DataContainer dataContainer2 = new analyses.DataContainer(strList0, strMap1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap3 = dataContainer2.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = dataContainer2.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = dataContainer2.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = null;
        analyses.DataContainer dataContainer20 = new analyses.DataContainer(strList18, strMap19);
        java.util.ArrayList<java.lang.String> strList21 = dataContainer20.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap22 = dataContainer20.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.ArrayList<java.lang.String> strList17 = dataContainer16.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = null;
        analyses.DataContainer dataContainer19 = new analyses.DataContainer(strList17, strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer6.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.ArrayList<java.lang.String> strList13 = dataContainer12.getDescription();
        java.lang.Class<?> wildcardClass14 = dataContainer12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.lang.Class<?> wildcardClass8 = dataContainer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList10, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList6, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList6, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList12, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer16.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.lang.Class<?> wildcardClass11 = dataContainer9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList3, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList3, strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer15.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer17.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap20 = null;
        analyses.DataContainer dataContainer21 = new analyses.DataContainer(strList19, strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer6.getData();
        java.lang.Class<?> wildcardClass15 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.lang.Class<?> wildcardClass8 = dataContainer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList8, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList15, strMap16);
        java.lang.Class<?> wildcardClass18 = dataContainer17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList6, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList6, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass12 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.ArrayList<java.lang.String> strList17 = dataContainer16.getDescription();
        java.util.ArrayList<java.lang.String> strList18 = dataContainer16.getDescription();
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer15.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer17.getDescription();
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.ArrayList<java.lang.String> strList16 = dataContainer15.getDescription();
        java.util.ArrayList<java.lang.String> strList17 = dataContainer15.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.ArrayList<java.lang.String> strList8 = dataContainer7.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer7.getData();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer7.getDescription();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer7.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList9, strMap12);
        java.lang.Class<?> wildcardClass14 = dataContainer13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList9, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList9, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer15.getData();
        java.util.ArrayList<java.lang.String> strList17 = dataContainer15.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = null;
        analyses.DataContainer dataContainer19 = new analyses.DataContainer(strList17, strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList6, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList6, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer9.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer9.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer9.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = dataContainer6.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strMap8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = dataContainer7.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer7.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList6, strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer11.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList17 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList15, strMap16);
        java.lang.Class<?> wildcardClass18 = strList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList11, strMap14);
        java.lang.Class<?> wildcardClass16 = strList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass15 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList12, strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList2, strMap12);
        java.lang.Class<?> wildcardClass14 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList14, strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = null;
        analyses.DataContainer dataContainer20 = new analyses.DataContainer(strList18, strMap19);
        java.util.ArrayList<java.lang.String> strList21 = dataContainer20.getDescription();
        java.lang.Class<?> wildcardClass22 = strList21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass12 = dataContainer10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList2, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer13.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer13.getDescription();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer13.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer13.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.lang.Class<?> wildcardClass17 = strList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.lang.Class<?> wildcardClass10 = dataContainer9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.lang.Class<?> wildcardClass18 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer14.getDescription();
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = strMap14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList18 = dataContainer14.getDescription();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList14, strMap17);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = null;
        analyses.DataContainer dataContainer20 = new analyses.DataContainer(strList14, strMap19);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap21 = dataContainer20.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList3, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer8.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.ArrayList<java.lang.String> strList8 = dataContainer7.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer7.getDescription();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.lang.Class<?> wildcardClass14 = dataContainer13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer17.getDescription();
        java.util.ArrayList<java.lang.String> strList20 = dataContainer17.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList14, strMap17);
        java.util.ArrayList<java.lang.String> strList19 = dataContainer18.getDescription();
        java.util.ArrayList<java.lang.String> strList20 = dataContainer18.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList7, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer13.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer13.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = dataContainer5.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.lang.Class<?> wildcardClass12 = dataContainer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass13 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        java.lang.Class<?> wildcardClass17 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.lang.Class<?> wildcardClass18 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.lang.Class<?> wildcardClass13 = strList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer10.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer10.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer12.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.lang.Class<?> wildcardClass8 = dataContainer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList13, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = null;
        analyses.DataContainer dataContainer20 = new analyses.DataContainer(strList18, strMap19);
        java.util.ArrayList<java.lang.String> strList21 = dataContainer20.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap22 = null;
        analyses.DataContainer dataContainer23 = new analyses.DataContainer(strList21, strMap22);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap24 = dataContainer23.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList2, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer16.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.lang.Class<?> wildcardClass15 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList6, strMap7);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList6, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.lang.Class<?> wildcardClass10 = dataContainer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.ArrayList<java.lang.String> strList13 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer12.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList2, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer13.getDescription();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer13.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList14, strMap17);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = null;
        analyses.DataContainer dataContainer20 = new analyses.DataContainer(strList14, strMap19);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap21 = null;
        analyses.DataContainer dataContainer22 = new analyses.DataContainer(strList14, strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList9, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer13.getData();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer13.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList17 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = null;
        analyses.DataContainer dataContainer19 = new analyses.DataContainer(strList17, strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer5.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList7, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList7, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer13.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer5.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.ArrayList<java.lang.String> strList13 = dataContainer12.getDescription();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = dataContainer14.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList11 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.ArrayList<java.lang.String> strList16 = dataContainer15.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer15.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = strMap17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer10.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer12.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer11.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.lang.Class<?> wildcardClass15 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.ArrayList<java.lang.String> strList13 = dataContainer12.getDescription();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList16, strMap17);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = dataContainer18.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer6.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.lang.Class<?> wildcardClass17 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer11.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.ArrayList<java.lang.String> strList8 = dataContainer7.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer7.getData();
        java.lang.Class<?> wildcardClass10 = dataContainer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList12, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList12, strMap17);
        java.util.ArrayList<java.lang.String> strList19 = dataContainer18.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap20 = null;
        analyses.DataContainer dataContainer21 = new analyses.DataContainer(strList19, strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer15.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer15.getData();
        java.util.ArrayList<java.lang.String> strList18 = dataContainer15.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap19 = dataContainer15.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList10, strMap13);
        java.lang.Class<?> wildcardClass15 = dataContainer14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.lang.Class<?> wildcardClass14 = dataContainer12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList11, strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = null;
        analyses.DataContainer dataContainer15 = new analyses.DataContainer(strList13, strMap14);
        java.util.ArrayList<java.lang.String> strList16 = dataContainer15.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.ArrayList<java.lang.String> strList15 = dataContainer14.getDescription();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer14.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap20 = null;
        analyses.DataContainer dataContainer21 = new analyses.DataContainer(strList19, strMap20);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap22 = dataContainer21.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer14.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = strMap16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList14, strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.ArrayList<java.lang.String> strList12 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = dataContainer12.getData();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer12.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList15, strMap16);
        java.util.ArrayList<java.lang.String> strList18 = dataContainer17.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList17 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList18 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap20 = null;
        analyses.DataContainer dataContainer21 = new analyses.DataContainer(strList19, strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap6 = null;
        analyses.DataContainer dataContainer7 = new analyses.DataContainer(strList2, strMap6);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList2, strMap8);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList2, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList2, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer13.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList15, strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = null;
        analyses.DataContainer dataContainer8 = new analyses.DataContainer(strList3, strMap7);
        java.util.ArrayList<java.lang.String> strList9 = dataContainer8.getDescription();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer8.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer11.getData();
        java.lang.Class<?> wildcardClass15 = dataContainer11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = null;
        analyses.DataContainer dataContainer11 = new analyses.DataContainer(strList9, strMap10);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer11.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer11.getDescription();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer11.getDescription();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer14.getData();
        java.util.ArrayList<java.lang.String> strList16 = dataContainer14.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer9.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList9 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap10 = dataContainer5.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer5.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer5.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap14 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList17 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList18 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList19 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList20 = dataContainer10.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = dataContainer6.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList10 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList13 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer10.getDescription();
        java.util.ArrayList<java.lang.String> strList15 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap16 = null;
        analyses.DataContainer dataContainer17 = new analyses.DataContainer(strList15, strMap16);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap18 = null;
        analyses.DataContainer dataContainer19 = new analyses.DataContainer(strList15, strMap18);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap20 = null;
        analyses.DataContainer dataContainer21 = new analyses.DataContainer(strList15, strMap20);
        java.lang.Class<?> wildcardClass22 = strList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.ArrayList<java.lang.String> strList11 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap12 = null;
        analyses.DataContainer dataContainer13 = new analyses.DataContainer(strList11, strMap12);
        java.util.ArrayList<java.lang.String> strList14 = dataContainer13.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList14, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = dataContainer16.getData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap4 = null;
        analyses.DataContainer dataContainer5 = new analyses.DataContainer(strList2, strMap4);
        java.util.ArrayList<java.lang.String> strList6 = dataContainer5.getDescription();
        java.util.ArrayList<java.lang.String> strList7 = dataContainer5.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap8 = null;
        analyses.DataContainer dataContainer9 = new analyses.DataContainer(strList7, strMap8);
        java.util.ArrayList<java.lang.String> strList10 = dataContainer9.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList10, strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.ArrayList<java.lang.String> strList7 = dataContainer6.getDescription();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = dataContainer10.getData();
        java.util.ArrayList<java.lang.String> strList12 = dataContainer10.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap13 = null;
        analyses.DataContainer dataContainer14 = new analyses.DataContainer(strList12, strMap13);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap15 = null;
        analyses.DataContainer dataContainer16 = new analyses.DataContainer(strList12, strMap15);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap17 = null;
        analyses.DataContainer dataContainer18 = new analyses.DataContainer(strList12, strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap5 = null;
        analyses.DataContainer dataContainer6 = new analyses.DataContainer(strList3, strMap5);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap7 = dataContainer6.getData();
        java.util.ArrayList<java.lang.String> strList8 = dataContainer6.getDescription();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap9 = null;
        analyses.DataContainer dataContainer10 = new analyses.DataContainer(strList8, strMap9);
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Double>> strMap11 = null;
        analyses.DataContainer dataContainer12 = new analyses.DataContainer(strList8, strMap11);
        java.util.ArrayList<java.lang.String> strList13 = dataContainer12.getDescription();
        java.util.ArrayList<java.lang.String> strList14 = dataContainer12.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }
}

