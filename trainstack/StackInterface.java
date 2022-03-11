/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainstack;

/**
 *
 * @author leeca
 */

/*
Q #1) What are Stacks in Java?

Answer: A stack is a LIFO (Last in, First out) data structure for storing elements. 
The stack elements are added or removed from the stack from one end called Top of the stack.

The addition of an element to the stack is done using the Push operation.
The deletion of elements is done using pop operation.
In Java, a stack is implemented using the Stack class.

Q #2) Is Stack a Collection in Java?

Answer: Yes. The stack is a legacy collection in Java that is available 
from Collection API in Java 1.0 onwards. 
Stack inherits the Vector class of the List interface.

Q #3) Is Stack an Interface?

Answer: Interface<E> stack is an interface that describes the last-in, 
first-out structure and is used for storing the state of recursive problems.

Q #4) What are Stacks used for?

Answer: Following are the main applications of the stack:

Expression evaluation and conversions: Stack is used for converting expressions 
into postfix, infix, and prefix. It is also used to evaluate these expressions.
The stack is also used for parsing syntax trees.
The stack is used to check parentheses in an expression.
The stack is used for solving backtracking problems.
Function calls are evaluated using stacks.
Q #5) What are the Advantages of the Stack?

Answer: Variables stored on stack are destroyed automatically when returned. Stacks are a better choice when memory is allocated and deallocated. Stacks also clean up the memory. Apart from that stacks can be used effectively to evaluate expressions and parse the expressions.


*/
public interface StackInterface {
    public Boolean isEmpty();
    public Boolean isFull();
    public void push(Object newItem);
    public Object pop();
    public int size();
    public void emptyStack();
    public String displayStack();
}
