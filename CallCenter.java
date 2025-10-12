class Call {
    int customerID;
    int callTime;

    Call(int customerID, int callTime) {
        this.customerID = customerID;
        this.callTime = callTime;
    }
}
class CallQueue {
    int maxSize;
    Call[] queueArray;
    int front;
    int rear;
    int count;

    CallQueue(int size) {
        maxSize = size;
        queueArray = new Call[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void addCall(int customerID, int callTime) {
        if (count == maxSize) {
            System.out.println("Call queue is full. Please call after some time.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = new Call(customerID, callTime);
        count++;
        System.out.println("Added: Customer ID " + customerID + " (Call time: " + callTime + " mins)");
    }

    public void answerCall() {
        if (isQueueEmpty()) {
            System.out.println("No calls to answer. Queue is empty.");
            return;
        }
        Call answered = queueArray[front];
        front = (front + 1) % maxSize;
        count--;
        System.out.println("Answered call from Customer ID " + answered.customerID);
    }

    public void viewQueue() {
        if (isQueueEmpty()) {
            System.out.println("No pending calls in the queue.");
            return;
        }
        System.out.println("Calls currently in queue:");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % maxSize;
            Call c = queueArray[index];
            System.out.println("Customer ID: " + c.customerID + ", Call time: " + c.callTime + " mins");
        }
    }

    public boolean isQueueEmpty() {
        return count == 0;
    }
}
public class CallCenter {
    public static void main(String[] args) {
        CallQueue cq = new CallQueue(5);
        cq.addCall(1001, 12);
        cq.addCall(1002, 8);
        cq.addCall(1003, 15);
        cq.addCall(1004, 5);
        cq.addCall(1005, 10);
        cq.viewQueue();

        cq.answerCall();
        cq.viewQueue();
    }
}
