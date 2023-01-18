package LINKEDLIST;

import java.nio.file.FileStore;
import java.util.List;

import SEARCHING.binarySearch.FirstQue;

public class LLQuestions {

    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    //cycle detection
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;

            if(f==s){
                return true;
            }
        }
        return false;
    }

    //check the length of the cycle in the linked list
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }
                while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

    //find from which node the cycle begins
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                length = lengthCycle(slow);
                break;
            }
        }
        //find the start node
        ListNode f = head;
        ListNode s = head;

        while(length>0){
            s = s.next;
            length--;
        }
        while(f!=s){
            f = f.next;
            s = s.next;
        }

        return s;
    }

    //happy number

    public boolean isHappy(int n){
        int f = n;
        int s = n;
        do{
            f = square(square(n));
            s = square(n);
        }
        while(s!=f); 
        if(s==1){
            return true;
        }
        return false;
    }

    private int square(int num){
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans = rem*rem;
            num/=10;
        }
        return ans;
    }
    //middle of the linked list
    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    //reverse using recursion
    private void reverse(ListNode node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //reverse using iteration
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    //reverse a part of a linked list
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }

        //skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current!=null && i<left-1 ; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse bw left and right
        ListNode next = current.next;
        for (int i = 0;current !=null && i < right-left +1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        if(last!=null){
            last.next = prev; 
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    //check if a linked list is palindrome or not
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode rereversehead = secondHead;

        //compare both halves
        while(head!=null && secondHead!=null){
            if(head.val != secondHead.val){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(rereversehead);

        if(head==null || secondHead==null){
            return true;
        }
        return false;
    }

    //reorder the linked list
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode firstHead = head;
        ListNode secondHead = reverseList(mid);

        while(firstHead!=null && secondHead!=null){
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }

        if(firstHead!=null){
            firstHead.next=null;
        }
    }

    //rotate list
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null|| k<=0){
            return head;
        }

        ListNode lastNode = head;
        int length = 1;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            length++;
        }

        lastNode.next = head;
        int rotations = k%length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
    
}
