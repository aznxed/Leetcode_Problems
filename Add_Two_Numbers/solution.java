class solution{
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}
    }
    

    //Add each place 1s, 10s, 100s, and use a carry
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode solution = new ListNode(0);
        ListNode temp = solution;
        ListNode list1 = l1, list2 = l2;
        boolean carry = false;

        while(list1 != null || list2 != null){
            int a = (list1 != null) ? list1.val:0; 
            int b = (list2 != null) ? list2.val:0;
            int carr = carry ? 1:0;
            carry = false;


            int sum = a + b + carr;
            if(sum >= 10){
                carry = true;
                sum = sum % 10;
            }
            
            temp.next = new ListNode(sum);
            temp = temp.next;

            if(list1 != null){
                list1 = list1.next;
            }
            if(list2 != null){
                list2 = list2.next;
            }
        }

        if(carry){
            temp.next = new ListNode(1);
        }

        return solution.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        
        ListNode head2 = new ListNode(1);
        ListNode second2 = new ListNode(2);
        ListNode third2 = new ListNode(3);
        head2.next = second2;
        second2.next = third2;

        ListNode solution = addTwoNumbers(head,head2);
        
        while(solution != null){
            System.out.print(solution.val);
            solution = solution.next;
        }
        
    }
}
