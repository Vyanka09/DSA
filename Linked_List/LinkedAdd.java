package Linked_List;

class LinkedAdd {
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


    public void insertatend(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            return;
        }
    }


    public void insertafternode(Node temp, int val) {
        Node curr = new Node(val);
        curr.next = temp.next;
        temp.next = curr;
        return;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public Node add(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);
        Node ans = null;
        int sum = 0;
        int carry = 0;
        int digit1 = 0;
        int digit2 = 0;

        while (first != null || second != null) {
            if (first != null) {
                digit1 = first.data;
                first = first.next;
            } else {
                digit1 = 0;
            }
            if (second != null) {
                digit2 = second.data;
                second = second.next;
            } else {
                digit2 = 0;
            }

            if ((digit1 + digit2 + carry) >= 10) {
                sum = (digit1 + digit2 + carry) % 10;
                carry = (digit1 + digit2 + carry) / 10;
            } else {
                sum = digit1 + digit2 + carry;
                carry = 0;
            }

            ans = insertnode(ans, sum);

        }
        if (first == null && second == null && carry > 0) {
            ans = insertnode(ans, carry);
        }
        ans = reverse(ans);
        return ans;
    }


    public Node insertnode(Node ans, int sum) {
        if (ans == null) {
            Node temp = new Node(sum);
            ans = new Node(sum);
            return ans;
        } else {
            Node curr = ans;
            while (curr.next != null) {
                curr = curr.next;
            }
            Node temp = new Node(sum);
            curr.next = temp;
            return ans;
        }
    }

    public Node reverse(Node right) {
        Node prev = null;
        Node curr = right;
        Node next = null;


        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedAdd l1 = new LinkedAdd();
        l1.insertatbeg(7);
        l1.insertatend(5);
        l1.insertatend(9);
        l1.insertatend(4);
        l1.insertatend(6);
        LinkedAdd l2 = new LinkedAdd();
        l2.insertatend(8);
        l2.insertatend(4);
        Node ans = null;
        ans = l1.add(l1.head, l2.head);
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}



