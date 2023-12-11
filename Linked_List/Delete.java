package Linked_List;
class Linkedlist {
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
        return;
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

    public void deleteduplicate()
    {
        if(head==null || head.next==null)
        {
            return ;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
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
}


public class Delete {
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertatbeg(1);
        ll.insertatend(1);
        ll.insertatend(2);
        ll.display();
        ll.deleteduplicate();
        System.out.println();
        System.out.println("After deleting:- ");
        ll.display();


        Linkedlist ll2=new Linkedlist();
        ll2.insertatbeg(1);
        ll2.insertatend(1);
        ll2.insertatend(1);
        ll2.insertatend(3);
        ll2.insertatend(3);
        System.out.println();
        ll2.display();
        ll2.deleteduplicate();
        System.out.println();
        System.out.println("After deleting:- ");
        ll2.display();
    }
}
