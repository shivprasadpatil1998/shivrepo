package testngexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {

    @Test
    public void testcase1() {
        System.out.println("simple test");
    }

    @BeforeMethod
    public void testcase2() {
        System.out.println(" before simple test");
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println(" before class simple test");
    }

    @AfterClass
    public void test11111() {
        System.out.println("simple test");
    }
}
