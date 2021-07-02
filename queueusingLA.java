public class queueusingLA
{
    int front=-1;
    int rear=-1;
    int capacity;
    int arr[];
    queueusingLA(int c)
    {
    capacity=c;
    arr=new int[capacity];
    }
    boolean isFull()
    {
    if (rear==capacity-1)
    {
return true;
    }
    else
    {
    return false;
    }
    }
    boolean isEmpty()
    {
    if (front==-1)
    {
    return true;
    }
    else
    {
    return false;
    }
    }
    void enqueue(int data)
    {
if (isFull())
{
System.out.println("Queuer is Full");
}
    else
    {
    if (front==-1&&rear==-1)
    {
    front++;
    }
    arr[++rear]=data;
    System.out.println("Item added into queue "+data);
    }
    }
    void dequeue()
    {
    int delete;
    if (isEmpty())
    {
    System.out.println("Queue is empty");
    }
    else
    {
    if (front==rear)
    {
    delete=arr[front];
    front=-1;
    rear=-1;
    }
  else
  {
delete =arr[front++];
  }
    System.out.println("Item deleted from queue "+ delete);
    }
    }
public static void main(String g[])
{
queueusingLA obj=new queueusingLA(5);
obj.enqueue(1);
obj.enqueue(2);
obj.enqueue(3);
obj.enqueue(4);
obj.enqueue(5);
obj.enqueue(5);
System.out.println(obj.isFull());
obj.dequeue();
obj.dequeue();
obj.dequeue();
obj.dequeue();
obj.dequeue();
obj.dequeue();
System.out.println(obj.isEmpty());
System.out.println(obj.isFull());
}
}