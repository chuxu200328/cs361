/**
 * 
 */
package mystack;

/**
 * @author Xu Chu & Haonan Wang
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		theStack.next.next = theStack.next.next.next;
		theStack.next = null;
		return theStack.val;
	}

	public void push(T v) {
		// TODO To complete
		MyNode tempNode = new MyNode(v,theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack s1 = new MyStack<Integer>();
		// Push 1 and 2
		s1.push(1);
		s1.push(2);
		// Pop
		s1.pop();
		// Push 5
		s1.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack s2 = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person("Xu","Chu");
		s2.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle","Scharff");
		s2.push(p2);
	}

}
