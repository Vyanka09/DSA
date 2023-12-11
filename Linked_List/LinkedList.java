package Linked_List;

public class LinkedList {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void insertAtEnd(int newData)
    {
        if(head==null)
        {
            Node newNode=new Node(newData);
            head=newNode;
            return ;
        }
        else{
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            Node newNode=new Node(newData);
            last.next=newNode;
            return ;
        }
    }

    public void insertAtBegining(int newData)
    {
        Node newNode=new Node(newData);
        if(head==null)
        {
            head=newNode;
            return ;
        }
        else{
            newNode.next=head;
            head=newNode;
            return ;
        }
    }

    public void insertionAfterNode(Node prev,int newData)
    {
        if(prev==null)
        {
            System.out.println("Prev cannot be null");
            return ;
        }
        else{
            Node newnode=new Node(newData);
            newnode.next=prev.next;
            prev.next=newnode;
            return ;
        }
    }

    public Node middleNode()
    {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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

    public void reverse()
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void reverserec(Node prev,Node curr)
    {
        if(curr==null)
        {
            head=prev;
            return ;
        }

        Node next=curr.next;
        curr.next=prev;
        reverserec(curr,next);
    }

    public void delete(int pos)
    {
        if(head==null)
        {
            return ;
        }
        if(pos==0)
        {
            head=head.next;
            return ;
        }
        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null && temp.next!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
        {
            return ;
        }
        temp.next=temp.next.next;
        return ;

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtBegining(10);
        //ll.insertAtEnd(5);
        //ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.display();
        ll.insertAtEnd(20);
        System.out.println();
        ll.display();
        System.out.println();
        ll.delete(3);
        System.out.println();
        ll.delete(2);
        ll.display();
        System.out.println();
        ll.insertAtBegining(1);
        Node middle=ll.middleNode();
        System.out.println("Middle:- "+middle.data);

        ll.insertionAfterNode(ll.head.next.next,56);
        ll.display();
        ll.reverse();
        System.out.println();
        ll.display();
        ll.reverserec(null,ll.head);
        System.out.println();
        ll.display();
    }
}
