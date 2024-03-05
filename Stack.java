public class Stack {
    LinkedList ll;
    Stack(){
       ll=new LinkedList();
    }
    public void push(int value){
        ll.insertNode(value);
        System.out.println("Inserted "+value+" in stack.");
    }
    public boolean isEmpty(){
        if (ll.head==null){
            System.out.println("Stack is empty.");
            return true;
        }
        return false;
    }
    public int pop(){
        int result=-1;
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }else {
            result=ll.head.value;
            ll.deleteNode();
        }
        return result;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }else {
            return ll.head.value;
        }
    }
    public void delete(){
        ll.deleteLinkedList();
        System.out.println("Stack is deleted");
    }
}
