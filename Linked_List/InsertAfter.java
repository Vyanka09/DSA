package Linked_List;

import java.util.Scanner;

class ll {
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

public class InsertAfter {
    public static void main(String[] args) {
        ll linkedlist=new ll();
        linkedlist.insertatbeg(1);
        linkedlist.insertatend(2);
        linkedlist.insertatend(4);
        linkedlist.insertatend(5);
        linkedlist.insertatend(6);
        linkedlist.display();
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter val:- ");
        int val=sc.nextInt();
        linkedlist.insertafternode(linkedlist.head.next,val);
        System.out.println("After inserting node:-  ");
        linkedlist.display();


    }
}
