package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    //兩邊之和大於第三邊
    void testSumOfTwoSidesEqualsThirdSide() {
        assertThrows(TriangleException.class, ()->  new Triangle(1, 2, 3).checkTriangle(1,2,3));
        assertThrows(TriangleException.class, () -> new Triangle(2, 2, 4).checkTriangle(2,2,4));
        assertThrows(TriangleException.class, () -> new Triangle(7, 3, 4).checkTriangle(7,3,4));
    }

    @Test
    //正三角形
    void checkEquilateralTriangle() {
        Triangle triangle = new Triangle(10, 10, 10);
        try {
            int result = triangle.checkTriangle(triangle.a, triangle.b, triangle.c);
            assertEquals(0, result);
        } catch (TriangleException e) {
            fail("Unexpected exception: " + e.getMessage());
        }

    }

    @Test
    //等腰三角形
    void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(5, 5, 7);
        try {
            int result = triangle.checkTriangle(triangle.a, triangle.b, triangle.c);
            assertEquals(1, result);
        } catch (TriangleException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    //邊長小於等於零
    void testZeroOrNegativeSides() {
        assertThrows(TriangleException.class, () -> new Triangle(0, 4, 5).checkTriangle(0,4,5));
        assertThrows(TriangleException.class, () -> new Triangle(3, -2, 5).checkTriangle(3,-2,5));
    }




}