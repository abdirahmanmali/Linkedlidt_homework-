package LinkedList1;

import LinkedList1.Node;

public class Main {


    public static void main(String[] args) {

        LinkedList1 lists = new LinkedList1();
        Node newnode = new Node(5);
        lists.prependNoded(1);
        lists.prependNoded(2);
        lists.prependNoded(3);
        lists.prependNoded(14);
        lists.appendNode(10);
        lists.appendNode(15);
        lists.appendNode(20);
        lists.removeNode();


        System.out.println(lists);
        System.out.println(newnode.getValue());

    }
}
