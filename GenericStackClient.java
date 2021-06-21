package DSAstack;

public class GenericStackClient {
	private static void stackOfiStrings() {
		MyGenericStack<String> stack=new MyGenericStack();
		stack.push("Five");
		stack.push("Four");
		stack.push("There");
		stack.push("Two");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
			
		}
		System.out.println("Size of stack after pop operations : " + stack.size());
	}
	public static void stackOfiIntegers() {
		 MyGenericStack<Integer> stack = new MyGenericStack();
	     stack.push(5);
	     stack.push(4);
	     stack.push(3);
	     stack.push(2);
	     stack.push(1);
	     System.out.println("2.1. Size of stack after push operations: " + stack.size());
	     System.out.printf("2.2. Pop elements from stack : ");
	     while (!stack.isEmpty()) {
	         System.out.println(stack.pop());
	     }
	     System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Stack of integers");
        stackOfiIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfiStrings();
	}

}
