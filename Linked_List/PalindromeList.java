package Linked_List;

class linked {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertatbeg(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void insertatend(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            return ;
        }
        else{
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=temp;
            return ;
        }
    }

    public void insertafternode(Node temp,int val)
    {
        Node curr=new Node(val);
        curr.next=temp.next;
        temp.next=curr;
        return ;
    }


    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public boolean palindrome()
    {
        if(head.next==null)
        {
            return true;
        }

        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        Node right=slow;
        right=reverse(right);

        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.data!=right.data)
            {
                return false;
            }
            temp=temp.next;
            right=right.next;
        }
        return true;
    }

    public Node reverse(Node right)
    {
        Node prev=null;
        Node curr=right;
        Node next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}


public class PalindromeList {
    public static void main(String[] args) {
        linked l1=new linked();
        l1.insertatbeg(1);
        l1.insertatend(2);
        l1.insertatend(2);
        l1.insertatend(1);
        if(l1.palindrome())
        {
            System.out.println("Linked list is palindrome");
        }
        else {
            System.out.println("Linked list is not palindrome");
        }

        //Example 2:- [1,2]
        linked l2=new linked();
        l2.insertatbeg(1);
        l2.insertatend(2);
        if(l2.palindrome())
        {
            System.out.println("Linked list is palindrome");
        }
        else {
            System.out.println("Linked list is not palindrome");
        }
    }
}
