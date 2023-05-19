package datastructs.stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek()); // 3
		System.out.println(stack.pop()); // 3
		System.out.println(stack.peek()); // 2
		System.out.println(stack.pop()); // 2
		System.out.println(stack.pop()); // 1
		System.out.println(stack.pop()); // null
		stack.push(4);
		stack.push(5);
		System.out.println(stack.pop()); // 5
		System.out.println(stack.pop()); // 4
	}
}
