package LinkedList;

public class implementation {

    public static  class node{
        int data;
        node next;

        node(int data)
        {
            this.data=data;
        }
    }

    public static class linkedlist{
        node head=null;

        void insertAtEnd(int data)
        {
            node temp=new node(data);
            if(head==null)
                head=temp;
            else
            {
                node temp2=head;
                while(temp2.next!=null)
                {
                    temp2=temp2.next;
                }
                temp2.next=temp;

            }

        }

        void insertatbegin(int data)
        {
            node temp=new node(data);
            if(head==null)
                head=temp;

            else{
                temp.next=head;
                head=temp;
            }

        }

        void insertatindex(int index,int data)
        {
            if(index==0)
            {
                insertatbegin(data);
            }
            else if (index==size()) {
                insertAtEnd(data);
            }
            else if (index<0 || index>size())
            {
                System.out.println("wrong input");
                return ;
            }
            node temp=new node(data);
            node k=head;
            for(int i=0;i<index-1;i++)
            {
                k=k.next;
            }
            temp.next=k.next;
            k.next=temp;

        }

        int getdata(int index)
        {
            if(index<0 || index>=size())
            {
                System.out.println("Invalid index");
                return -1;
            }
            else{
                node temp=head;
                for(int i=0;i<index;i++)
                {
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        void display()
        {
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int size()
        {
            node k=head;
            int c=0;
            while(k!=null)
            {
                k=k.next;
                c+=1;
            }
            return c;
        }

        void deleteatindex(int index)
        {
            if(index<0 || index>=size())
            {
                System.out.println("Wrong input");
                return ;
            }
            else if (index==0)
            {
                deletefrombegin();
                return ;
            }
            node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;


        }

        void deletefrombegin()
        {
            head=head.next;
        }

    }
    public static void main(String[] args) {

        linkedlist ll=new linkedlist();
        ll.insertatbegin(10);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtEnd(12);
        ll.display();
        ll.insertatbegin(6346);
        System.out.println();
        ll.display();
        ll.insertatindex(2,54);
        System.out.println();
        ll.display();
        ll.insertatindex(1,32);
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println(ll.getdata(5));
        System.out.println();
        ll.deleteatindex(6);
        ll.display();
        ll.deleteatindex(0);
        System.out.println();
        ll.display();


    }
}
