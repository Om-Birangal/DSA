class StackDemo{
    int maxSize;
    int stackArray[];
    int top;
    StackDemo(int size){
        maxSize = size;
        stackArray =new int[maxSize];
        top = -1;
    }
    public void push(int value){
        if(top == maxSize - 1){
            System.out.println("Stack is Overflow");
        }
        else{
            stackArray[++top]=value;
            System.out.println(value + " is pussed in Stack");
        }
    }
    public int pop(){
        if(top ==-1){
            System.out.println("Stack is Underflow");
            return -1;
        }
        else{
            System.out.println(stackArray[top] + " is popped from Stack");
            return stackArray[top--];
        }
    }
    public int display(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            System.out.println("Elements in Stack : ");
            for(int i=top;i>=0;i--){
                System.out.println(stackArray[i]);
            }
            return 0;
        }
    }
}
public class Stack {
    public static   void main(String[] args) {
        StackDemo s1 =new StackDemo(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.pop();
        s1.pop();
        s1.display();
    }
}