import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //        LinkedList - связанный список на основе узлов

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(25);
        linkedList.add(28);
        linkedList.add(29);

        System.out.println("Linked list before peek() ");
        System.out.println(linkedList); // распечатали лист
        System.out.println("element peeked " + linkedList.peek());// узнали текущий элемента списка
        System.out.println("Linked list after peek() ");
        System.out.println(linkedList);

        System.out.println("Linked list before peekFirst() ");
        System.out.println(linkedList);
        System.out.println("element peeked " + linkedList.peekFirst());// узнали, какой элемент в списке первый
        System.out.println("Linked list after peekFirst() ");
        System.out.println(linkedList);

        System.out.println("Linked list before peekLast() ");
        System.out.println(linkedList);
        System.out.println("element peeked " + linkedList.peekLast()); // узнали, какой элемент в списке последний
        System.out.println("Linked list after peekLast() ");
        System.out.println(linkedList);

    }
}