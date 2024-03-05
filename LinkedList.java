public class LinkedList {
    Node head;
    Node tail;
    int size=0;
    public void createLinkedList(int nodeValue){
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
    }
    public void insertNode(int nodeValue){
        if (head==null){
            createLinkedList(nodeValue);
        }else {
            Node node=new Node();
            node.value=nodeValue;
            node.next=head;
            head=node;
            size++;
        }
    }
    public void deleteNode(){
        if (head==null){
            System.out.println("Linked List does not exist.");
        }else {
            head=head.next;
            size--;
            if (size==0){
                head=tail=null;
            }
        }
    }
    public void deleteLinkedList(){
        if (head==null){
            System.out.println("Linked List does not exist.");
        }else {
            head=null;
            tail=null;
            size=0;
        }
    }
}
