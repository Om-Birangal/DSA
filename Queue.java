class QueueDemo{
    int maxSize;
    int front;
    int rear;
    int QueueArray[];
    int count;
    QueueDemo(int size){
        maxSize = size;
        front = 0;
        rear =-1;
        QueueArray = new int[maxSize];
        count = 0;
    }
    public boolean isEmpty(){
        if(rear == -1){
            System.out.println("Queue is Empty");
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if(rear == maxSize-1){
            System.out.print("Queue is Full");
            return true;
        }
            
        else
            return false;
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println(" cannot insert " + value);
        }
        else{
            rear = (rear + 1) % maxSize;
            QueueArray[rear] = value;
            count++;
            System.out.println(value + " is inserted in the Queue");
        }
    }
    public void deQueue(){
        if(isEmpty()){
            System.out.print("  cannot serve/remove element from Queue");
        }
        else{
            front = (front +1)%maxSize;
            count--;
            System.out.println(QueueArray[front - 1] + " is served from the Queue");
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue element are : ");
            for(int i=0; i<count; i++){
                System.out.print(QueueArray[(front + i) % maxSize] + " ");
            }
            System.out.println();
        }
    }
}
public class Queue {
    public static void main(String[] args) {
        QueueDemo queue1 = new QueueDemo(5);
        queue1.enQueue(10);
        queue1.enQueue(20);
        queue1.enQueue(30);
        queue1.enQueue(40);
        queue1.enQueue(50);
        queue1.enQueue(60);
        queue1.display();
        queue1.deQueue();
        queue1.display();
        queue1.isEmpty();
    }
}
