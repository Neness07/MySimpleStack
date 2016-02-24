package dcll.emar;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Neness on 17/02/2016.
 */
public class MySimpleStack implements SimpleStack {
    /**
     *
     */
    private Stack<Item> mStack;

    public MySimpleStack(){
        this(new Stack<Item>());
    }

    public MySimpleStack(Stack<Item> mStack) {
        this.mStack = mStack;
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
    public void push(Item item) {
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
