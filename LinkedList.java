class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Sample{
    Node head;
    public void insert(int value){
        Node n1 = new Node(value);
        if(head == null){
            head = n1;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n1;
    }
    public void show(){
        Node temp = head;
        System.out.print("Linked List is ");
        while (temp!=null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedList{
    public static void main(String[] args) {
        Sample l1 = new Sample();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.show();
    }
}