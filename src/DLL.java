public class DLL {

    private Node tail;
    private Node head;
    private int size = 0;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head!=null){
            head.prev = node;
        }

        head = node;

        size++;
    }

    public void insertLast(int val){

        Node node = new Node(val);
        if(head==null){
            node.prev = null;
            head = node;
            tail = node;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        tail = node;

        size++;

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

        Node p = get(index-1);
        Node n = p.next;
        Node node = new Node(val , n , p);

        p.next = node;
        n.prev = node;

        size++;
    }

    public int deleteFirst(){
        if(head == tail){
            return 0;
        }

        int val = head.val;

        if(head.next!=null){
            head.next.prev = null;
            head = head.next;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        int val;
        if(tail!=null){
            val = tail.val;
            tail = tail.prev;
            tail.prev.next = null;
            return val;
        }


        Node temp = get(size-1);
        val = temp.val;
        tail = temp.prev;
        temp.prev.next = null;
        size--;

        return val;
    }

    public int delete(int  index ){
        Node del = get(index);
        if(index == 1){
            deleteFirst();
            return del.val;
        }
        if(index == size){
            deleteLast();
            return del.val;
        }


//        int val = del.val;

        Node p = del.prev;
        Node n = del.next;

        p.next = n;
        n.prev = p;

        size--;
        return del.val;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while( temp != null ){
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }

        System.out.println("Null");
        System.out.println("Print in Reverse");


        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("Null");

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
        while(temp!=null){
            if(temp.val == val){
                return temp;
            }

            temp = temp.next;
        }
        return null;
    }



    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
