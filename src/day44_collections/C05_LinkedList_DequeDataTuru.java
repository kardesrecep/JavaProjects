package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop());
        System.out.println("ll4.peek() = " + ll4.peek());
        System.out.println("ll4.getFirst() = " + ll4.getFirst());
        System.out.println("ll4 = " + ll4);
    }
}