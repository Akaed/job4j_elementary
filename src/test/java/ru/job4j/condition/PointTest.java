package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
        public void when00to20then2() {
            int in = 0;
            int in1 = 0;
            int in2 = 2;
            int in3 = 0;
            double expected = 2;
            double out = Point.distance(in, in1, in2, in3);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to00then2dot828() {
        int in = 0;
        int in1 = 2;
        int in2 = 0;
        int in3 = 0;
        double expected = 2.82;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        int in = 2;
        int in1 = 0;
        int in2 = 2;
        int in3 = 0;
        double expected = 0;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to70then5() {
        int in = 2;
        int in1 = 0;
        int in2 = 7;
        int in3 = 0;
        double expected = 5;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.01);
    }

}