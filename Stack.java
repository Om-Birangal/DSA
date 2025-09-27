class StackDemo
{
  int maxSize;
  int stackArray[];
  int top;
  Stack(int size)
  {
      maxSize=size;
      stackArray=new int[maxSize];
      top=-1;
  }
  public void push(int value)
  {
      if(top==maxSize-1)
      {
        System.out.println("Stack Overflow");
      }
      else
      {
        stackArray[++top]=value;
        System.out.println(value + " is pushed in the Stack");
      }
  }
  public int pop()
  {
      if(top==-1)
      {
        System.out.println("Stack Underflow");
        return -1;
      }
      else
      {
        System.out.println(stackArray[top] + " is popped from Stack");
        return stackArray[top--];
      }
  }
  public void display()
  {
      if(isEmpty())
      {
        System.out.println("Stack Underflow");
      }
      else
      {
      System.out.println("Stack elements are : ");
        for(int i =0; i<=top; i++)
        {
          System.out.print(stackArray[i] + "\n");
        }
        System.out.println();
      }
  }
  public boolean isEmpty()
  {
    if(top==-1)
    {
      System.out.print("Stack is Empty");
      return true;
    }
    else
    {
      return false;
    }
  }
  public void minStack()
  {
    int min=stackArray[0];
    for(int i=0; i<top; i++)
    {
      if(stackArray[i]<=min)
        min=stackArray[i];
    }
    System.out.println(min + " is the minimum value");
  }
  public void maxStack()
  {
    int max=stackArray[0];
    for(int i=0; i<top; i++)
    {
      if(stackArray[i]>=max)
        max=stackArray[i];
    }
    System.out.println(max + " is the maximum value");
  }
  
  public boolean isFull()
  {
    if(top == maxSize-1)
    {
      System.out.print("Stack is Full");
      return true;
    }
    else
    {
      return false;
    }
    
  }
}
public class Stack
{
  public static void main(String s[])
  {
    StackDemo s1 =new Stack(5);
    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);
    s1.push(50);
    s1.push(60);
    s1.display();
    s1.pop();
    s1.pop();
    s1.display();
    s1.isEmpty();
    s1.isFull();
    s1.minStack();
    s1.maxStack();
  }
}

