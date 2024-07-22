
public class LL {

    private Node tail ;
    private Node head ;
    private int size ;
    public LL() {
        this.size =0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size+=1;
    }

    public void insertLast(int val) {
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++ ;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;

        size++;

    }

    public void display()
    {
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp= temp.next;
        }
        System.out.println("Null");
    }

    public int deleteFirst(){
        if(head==tail) {
            return 00;
        }
        int val = head.val;
        head = head.next;
        if(head==null){
            tail =null;
        }
        size--;

        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;

    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }

        if(index == size-1){
            deleteLast();
        }

        Node prev = get(index-1);

        int val = prev.next.val;
        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }




    private class Node {
       private  int val ;
       private Node next;

       public Node(int val){
           this.val = val;
       }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }


    public static LL mergesort(Node head1 , Node head2){
        Node f = head1;
        Node s = head2;
        LL ans = new LL();
        while(f!=null && s!=null){
            if(f.val<s.val){
                ans.insertLast(f.val);
                f=f.next;
            }else{
                ans.insertLast(s.val);
                s=s.next;
            }
        }

        while(f!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.val);
            s=s.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(4);

        first.display();

        second.insertLast(1);
        second.insertLast(4);
        second.insertLast(6);
        second.insertLast(8);

        System.out.println();
        second.display();
        System.out.println();

        LL ans = LL.mergesort(first.head, second.head);
        ans.display();
    }
}
