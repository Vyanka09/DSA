package Linked_List;


import java.util.Scanner;

class LL
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void insertatbeg(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return ;
    }

    public boolean search(int val)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }


}
public class SearchingLL {
    public static void main(String[] args) {


        LL ll = new LL();
        ll.insertatbeg(10);
        ll.insertatbeg(30);
        ll.insertatbeg(11);
        ll.insertatbeg(21);
        ll.insertatbeg(14);
        System.out.println("Enter data to search:- ");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        if((ll.search(data)))
        {
            System.out.println(data+" is present in linked list.");
        }
        else {
            System.out.println("No, "+data +" is not present");
        }


    }
}
