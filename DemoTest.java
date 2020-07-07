import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class DemoTest {

    @Test
    public void test_is_triangle_1()
    {
        assertTrue(Demo.isTriangle(4,3,5));

    }

    @Test
    public void test_is_triangle_2()
    {
        assertTrue(Demo.isTriangle(12,5,13));

    }

    @Test
    public void test_is_triangle_3()
    {
        assertTrue(Demo.isTriangle(13,5,12));
    }

    @Test
    public void test_is_triangle_4()
    {
        assertTrue(Demo.isTriangle(5,12,13));
    }

    @Test
    public void test_is_triangle5()
    {
        assertTrue(Demo.isTriangle(1.0,2.0,2.0));
    }

    @Test
    public void test_is_NOT_triangle_1()
    {
        assertFalse(Demo.isTriangle(0,0,0));
    }

    @Test
    public void test_is_NOT_triangle_2()
    {
        assertFalse(Demo.isTriangle(5,3,-3));
    }

    @Test
    public void test_is_NOT_triangle3()
    {
        assertFalse(Demo.isTriangle(2,0,1));
    }

    @Test
    public void test_is_NOT_triangle4()
    {
        assertFalse(Demo.isTriangle(1,1,0));
    }

    @Test
    public void test_is_NOT_triangle5()
    {
        assertFalse(Demo.isTriangle(1,2,1));
    }

    @Test
    public void test_is_NOT_triangle6()
    {
        assertFalse(Demo.isTriangle(1,5,2));
    }

    @Test
    public void test_is_NOT_triangle7()
    {
        assertFalse(Demo.isTriangle(13, 5,7));
    }






}
