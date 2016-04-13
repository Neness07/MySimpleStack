/*
 * SimpleStack
 *
 *
 * 13/04/2016
 *
 * Copyright Ernesto MARKELINY
 */

package dcll.emar;

import java.util.EmptyStackException;

/**
 * Interface SimpleStack.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true if this stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     * @return a size of this stack
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item un item
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     * @return the object object at the the top if this stack is not empty.
     * @throws EmptyStackException if this stack is empty.
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object
     * as the value of this function.
     *
     * @return the object object at the the top if this stack is not empty.
     * @throws EmptyStackException  if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}
