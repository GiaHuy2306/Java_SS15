package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

//        queue.add("a"); // them vao cuoi
//        queue.add("b");
//        queue.offer("c"); // them vao cuoi

//        queue.remove();// xoa va xem phan tu dau
//        queue.poll(); // xoa va xem phan tu dau

//        queue.peek(); // xem phan tu dau va ko xoa
//        queue.element(); // xem phan tu dau va ko xoa

        // Hang doi 2 dau
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addFirst("apple");
        linkedList.getFirst();

        linkedList.addLast("orange");
        linkedList.getLast();
    }
}
