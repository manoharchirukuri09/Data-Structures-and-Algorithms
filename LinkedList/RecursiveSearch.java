public class RecursiveSearch {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
   public static void AddElement(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    // step 2
    newNode.next = head;
    head = newNode;
   }
   public static void Print(){
    if(head==null){
        System.out.println("Null");
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("Null");
   }
   public static int Search(Node head, int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int index = Search(head.next, key);
    if(index == -1){
        return -1;
    }
     return index+1;
   }
   public static void main(String[] args) {
      RecursiveSearch ll = new RecursiveSearch();
      ll.AddElement(1);
      ll.Print();
      ll.AddElement(2);
      ll.Print();
      ll.AddElement(3);
      ll.Print();
      ll.AddElement(4);
      ll.Print();
      ll.AddElement(5);
      ll.Print();
        System.out.println(Search(head, 3));
        System.out.println(Search(head, 10));
   }
}

