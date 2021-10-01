package lab1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Variant5Test {
    @Test(dataProvider = "inputProvider")
    public void segmentLongTest(int p1, int p2, long p3) {
        assertEquals(new Variant5().segmentLong(p1, p2), p3);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][]{{425, 10, 5}, {10, 3, 1}, {20, 10, 0}, {78, 33, 12}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativesegmentLongtest() {
        new Variant5().segmentLong(10, 20);
    }


    @Test(dataProvider = "inputProv")
    public void segmentTwoNumberTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant5().segmentTwoNumber(p1, p2), p3);
    }

    @DataProvider
    public Object[][] inputProv() {
        return new Object[][]{{5, -3, true}, {-4, 3, false}, {-20, 10, false}, {78, 33, true}};
    }


    @Test(dataProvider = "inputNumber")
    public void threeNumberTest(int p1, int p2, int p3, int[] p4) {
        assertArrayEquals(new Variant5().threenumber(p1, p2, p3), p4);

    }

    @DataProvider
    public Object[][] inputNumber() {
        return new Object[][]{{-2, -5, 1, 1, 2}, {2, 6, 1, 3, 0}};
    }


    @Test(dataProvider = "inputTwo")
    public void actionsNumberTest(int p1, double p2, double p3, double p4) {
        assertEquals(new Variant5().actionsNumber(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] inputTwo() {
        return new Object[][]{{3, 6, 2, 12.0}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativactionsNumbertest() {
        new Variant5().actionsNumber(3, 2, 0);
    }

    @Test(dataProvider = "inputOne")
    public void forNumberTest(double p1, double[] p2) {

        assertArrayEquals(p2, new Variant5().forNumber(p1), 0.00001);
    }

    @DataProvider
    public Object[][] inputOne() {
        return new Object[][]{{20, new double[]{2., 4., 6., 8., 10., 12., 14., 16., 18., 20.}}};
    }


    @Test(dataProvider = "inputWhile")
    public void while5Test(int p1, int p2) {
        assertEquals(new Variant5().while5(p1), p2);
    }

    @DataProvider
    public Object[][] inputWhile() {
        return new Object[][]{{8, 3}, {19, 4}};
    }




    @Test(dataProvider = "inputMinMax")
    public void minmaxTest(int p1, double[] p2, double[] p3, double[] p4) {
        assertArrayEquals(p4, new Variant5().minmax(p1, p2, p3), 0.00001);
    }

    @DataProvider
    public Object[][] inputMinMax() {
        return new Object[][]{{2, new double[]{2,3}, new double[]{4,5}, new double[]{2,0.6}},{2, new double[]{6,54}, new double[]{9,21}, new double[]{2,2.57142}}};
    }


    @Test(dataProvider = "inputarray")
    public void array5Test(int p1, int[] p2) {
        assertArrayEquals(p2, new Variant5().array5(p1));
    }

    @DataProvider
    public Object[][] inputarray() {
        return new Object[][]{{6, new int[]{1, 1, 2, 3, 5, 8}}, {3, new int[]{1, 1, 2}}, {15, new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610}}};
    }
    @Test()
    public void twoDimensionArrayTest() {
        assertArrayEquals(new int[][]{{7, 9, 11}, {1, 3, 5}, {4, 6, 8},{5, 7, 9}}, new Variant5().twoDimensionArrayTask(4, 3, 2, new int[]{7, 1, 4, 5}));
    }

    @Test(dataProvider = "inputTwoArray")
    public void twoDimensionArrayTest(int p1, int p2, int p3, int[] input, int[][] output) {
        assertArrayEquals(output,new Variant5().twoDimensionArrayTask(p1,p2,p3,input));

    }

    @DataProvider
    public Object[][] inputTwoArray() {
        int[] input = {2, 3, 6};

        int[][] output = {{2, 5, 8},
                {3, 6, 9},
                {6, 9, 12}};

        return new Object[][]{{3, 3, 3, input,output}};

    }
}
