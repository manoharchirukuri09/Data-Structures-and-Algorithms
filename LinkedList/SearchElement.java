public class SearchElement {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void AddElement(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step 2
        newNode.next = head;
        head = newNode;
    }
    public static void  Print(){
        if(head==null){
            System.out.println("Null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static int Search(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
        
            }
            temp= temp.next;
            i++;

        }
        return -1;
    }
    public static void main(String[] args) {
        SearchElement ll = new SearchElement();
        ll.AddElement(1);
        ll.Print();
        ll.AddElement(2);
        ll.Print();
        ll.AddElement(3);
        ll.Print();
        ll.AddElement(4);
        ll.Print();
        System.out.println(Search(3));
        System.out.println(Search(10));
    }
}

