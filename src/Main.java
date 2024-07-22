public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(12);
//        list.insertFirst(13);
//        list.insertFirst(14);
//        list.insertFirst(17);
//        list.insertFirst(21);
//        list.insertLast(99);
//
//        list.insert(100 , 6);
//        list.displayLL();
//
//        System.out.println(list.find(14));
//        list.display();


//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(15);
//        list.insertFirst(25);
//        list.insertFirst(35);
//
//        list.insertLast(45);
//
//        list.insert(55 , 3);
//
//        System.out.println(list.delete(4));
//
//        list.display();
//        list.insertLast(85);
//        list.display();

        CLL list = new CLL();
        list.insert(32);
        list.insert(33);
        list.insert(34);
        list.insert(35);
        list.insert(36);

        list.display();
        list.delete(36);
        list.display();
    }
}

//#Leetcode83
//public ListNode deleteDuplicates(ListNode head) {
//    if(head == null || head.next ==null ){
//        return head;
//    }
//    ListNode temp = head;
//
//    while(temp.next!=null){
//        if(temp.val == temp.next.val){
//            temp.next = temp.next.next;
//        }else{
//            temp = temp.next;
//        }
//
//    }
//    return head;
//}
