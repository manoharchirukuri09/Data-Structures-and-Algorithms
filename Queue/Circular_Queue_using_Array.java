public class Circular_Queue_using_Array {
    public static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        // empty operation
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        // full operation
        public boolean isFull(){
            return (rear+1)% size == front;
        }
        // Add
        public void  Add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Add first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]= data;
        }
        // remove
        public  int Remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // delete last element
            if(rear==front){
                rear=front=-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args){
            queue q = new queue(3);
            q.Add(1);
            q.Add(2);
            q.Add(3);
            System.out.println(q.Remove());
            q.Add(4);
            System.out.println(q.Remove());
            q.Add(5);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.Remove();
            }
        }
    }
}
