package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
        public void when00to20then2() {
            int in = 0;
            int in2 = 2;
            double expected = 2;
            double out = Point.distance(in, in, in2, in);
            Assert.assertEquals(expected, out, 0.01);
    }

}