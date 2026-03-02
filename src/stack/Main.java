package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        int b = 100;
//        demo();
//        System.out.println("Ket thuc");

        // cach dung Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // phan tu tren cung

        // Lay va xoa phan tu tren cung
        System.out.println("Phan tu tren cung la: " + stack.pop());

        // Lay phan tu tren cung ko xoa
        System.out.println("Phan tu tren cung ko xoa' la: " + stack.peek());

        System.out.println(stack);

        //duyet stack: top-down
        while(!stack.isEmpty()){
            // lay va xu li phan tu tren cung
            Integer top =  stack.pop();
            // Xu li top
            System.out.println("top: " +top);
        }

        // dao nguoc cau
        String seq = "Hello cac ban";

        System.out.println(seq);

        String[] arr = seq.split(" ");

        Stack<String> stringStack = new Stack<>();

        for (String s: arr) {
            stringStack.push(s);
        }

        while (!stringStack.isEmpty()){
            System.out.print(stringStack.pop() + " ");
        }
    }

    public static void demo() {
        int a = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
