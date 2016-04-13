package dcll.emar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySimpleStackTest {

    private SimpleStack mSimpleStack;

    @Before
    public void setUp() throws Exception {
        mSimpleStack = new MySimpleStack();
        System.out.println("Je suis executéé avant chaque teste");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,mSimpleStack.isEmpty());
        mSimpleStack.push(new Item(new Integer(1)));
        Assert.assertEquals(false,mSimpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {

    }

    @Test
    public void testPush() throws Exception {

    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {

    }
}