package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test {
   
	public static void main(String[] args) {
		//Stack<String> stack = new Stack<>();
		//stack.push("aa");
		//stack.push("bb");
		//stack.push("cc");
		//System.out.println(stack);
		
		//System.out.println(stack.pop());
		//System.out.println(stack);
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("aa");
		queue.offer("bb");
		queue.offer("cc");
		System.out.println(queue);
	}
}
