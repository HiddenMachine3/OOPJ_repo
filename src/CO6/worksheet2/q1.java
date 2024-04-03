package CO6.worksheet2;

import java.util.LinkedList;

public class q1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        for (int i = linkedList.size() - 1; i >= 0; i--) {
            String element = linkedList.get(i);
            System.out.println(element);
        }
    }
}
