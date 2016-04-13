/*
 * MySimpleStack
 *
 *
 * 13/04/2016
 *
 * Copyright Ernesto MARKELINY
 */

package dcll.emar;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Description de MySimpleStack.
 */
public class MySimpleStack implements SimpleStack {
    /**
     *
     */
    private Stack<Item> mStack;

    /**
     * Constructor.
     */
    public MySimpleStack() {
        this(new Stack<Item>());
    }

    /**
     * Constructor.
     * @param aStack un stack
     */
    public MySimpleStack(final Stack<Item> aStack) {
        this.mStack = aStack;
    }

    @Override
    public boolean isEmpty() {
        return this.mStack.empty();
    }


    @Override
    public int getSize() {
        return mStack.size();
    }

    @Override
    public void push(final Item item) {
        mStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return mStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return mStack.pop();
    }
}
