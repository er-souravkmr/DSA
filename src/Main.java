public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,9,10,13,0};

        int count =0;
        for(int i =0; i<nums.length ; i++){
            if(nums[i]%3!=0 && nums[i]!=0){
                count ++;
            }
        }
        System.out.println(count);





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

//        CLL list = new CLL();
//        list.insert(32);
//        list.insert(33);
//        list.insert(34);
//        list.insert(35);
//        list.insert(36);
//
//        list.display();
//        list.delete(36);
//        list.display();

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


//#leetcode 141 Check  whether  LL is cyclic
//
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if(head == null || head.next == null){
//            return false;
//        }
//
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while(fast != null && fast.next != null && slow != null && slow.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//
//        return false;
//    }


//#Tell the length of the Cyclic nodes in LinkedList

//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if(head == null || head.next == null){
//            return false;
//        }
//
//        ListNode fast = head;
//        ListNode slow = head;
//        int length = 0;
//
//        while(fast != null && fast.next != null ){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                 ListNode temp = slow;
//                  do{
//                      temp=temp.next;
//                      length++;
//                  }while(temp!=slow);
//                 return length;
//            }
//        }
//
//        return length;
//    }


//#Happy Number
//class Solution {
//    public boolean isHappy(int n) {
//        int slow = n;
//        int fast = n;
//
//        do{
//            slow = square(slow);
//            fast = square(square(fast));
//        }while(slow!=fast);
//
//        if(slow==1){
//            return true;
//        }
//
//        return false;
//    }
//
//    private int square(int n){
//        int ans = 0;
//        while(n!=0){
//            int d = n%10;
//            ans = ans + d*d;
//            n/=10;
//        }
//        return ans;
//    }
//}