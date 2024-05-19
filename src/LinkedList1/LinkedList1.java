package LinkedList1;

import LinkedList1.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList1 {
    private Node head;

    public void prependNoded(int num ){
        Node newnode = new Node( num);
        newnode.setNext(this.head);
        this.head = newnode;

    }

    public void appendNode(int num ){
        Node newnode = new Node(num);
        Node i = this.head;
        if( i == null ){
            this.head = newnode;
            return;
        }
        while(i.getNext()!= null){
            i = i.getNext();

        }
        i.setNext(newnode);
    }

    public void removeNode(){
        if(this.head ==null) return;
        this.head= head.getNext();

    }

    @Override
    public String toString() {

        List<Integer> lists = new ArrayList<>();
        Node i = this.head;
        while(i != null){
            lists.add(i.getValue());
            i = i.getNext();


        }

        return lists.toString();

    }
}
