package LinkedList;

public class BasicsLL {

    public static void display(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void display_recur(node head)
    {
        if(head==null)
            return ;

        System.out.print(head.data+" ");
        display_recur(head.next);
    }

    public static void reverse_display(node head)
    {
        if(head==null) return ;

        reverse_display(head.next);
        System.out.print(head.data+" ");
    }

    public static int count(node head)
    {
        int c=0;
        while(head!=null)
        {
            c+=1;
            head=head.next;
        }
        return c;
    }

    public static int count_recur(node head)
    {
        if(head==null)
            return 0;

        return 1+count_recur(head.next);
    }
    public static class node{
        int data;
        node next;

        node(int data)
        {
            this.data=data;
        }


    }


    public static void main(String[] args) {
        node n1=new node(5);
        node n2=new node(9);
        node n3=new node(12);
        node n4=new node(15);
        node n5=new node(17);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

       // System.out.println(n1.data);
       // System.out.println(n1.next.data);

        //display(node n1);
        display(n1);
        System.out.println();
        display_recur(n1);
        System.out.println();
        reverse_display(n1);
        int k=count(n1);
        System.out.println("No.of nodes "+k);
        int z=count_recur(n1);
        System.out.println("No of nodes "+z);

    }
}
