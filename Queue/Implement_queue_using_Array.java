public class Implement_queue_using_Array {
    public static class queue{
        int arr[];
        static int size;
        static int rear;
        queue(int n){
            arr = new int[n];
            size=n;
            rear = -1;
        }
        // queue operations isEmpty()
        public  boolean isEmpty(){
            return rear == -1;
        }
        // Add operation
        public  void Add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            // add the element to the queue
            rear = rear +1;
            arr[rear] = data;
        }
        // remove
        public  int Remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear = rear -1;
            return front;
        }
        // front element in queue
        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return arr[0];

    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Remove();
        }
    }}
}
