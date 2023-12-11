package BinarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

class BST {
    Node root;

    class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node insert(Node root,int key)
    {
        if(root==null)
        {
            return new Node(key);
        }
        else if(root.data <key)
        {
            root.right=insert(root.right,key);
        }
        else{
            root.left=insert(root.left,key);
        }
        return root;
    }

    public Node searchitr(Node root,int key)
    {
        if(root==null)
        {
            return null;
        }

        Node temp=root;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return temp;
            }
            else if(temp.data<key)
            {
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        return null;
    }

    public ArrayList<Integer> inorder(ArrayList<Integer>ans, Node root)
    {
        if(root!=null)
        {
            inorder(ans,root.left);
            ans.add(root.data);
            inorder(ans,root.right);
        }
        return ans;
    }
    public int kthlargest(Node root,int k)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        ans=inorder(ans,root);
        return ans.get(ans.size()-k);
    }

    public ArrayList<Integer> pairsum(Node root,ArrayList<Integer>sol,int sum)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        ans=inorder(ans,root);
        int low=0;
        int high=ans.size()-1;

        while(low<high)
        {
            if(ans.get(low)+ans.get(high)==sum)
            {
                sol.add(ans.get(high));
                sol.add(ans.get(low));
                return sol;
            }
            else if(ans.get(low)+ans.get(high)<sum)
            {
                low++;
            }
            else{
                high--;
            }
        }
        return sol;
    }

    public Node LCA(Node root,int p,int q)
    {
        if(searchitr(root,p)==null || searchitr(root,q)==null)
        {
            return null;
        }

        int parval=root.data;
        if(parval<p && parval<q)
        {
            return LCA(root.right,p,q);
        }
        else if(parval>p && parval>q)
        {
            return LCA(root.left,p,q);
        }
        else{
            return root;
        }
    }


   Node pre;
   public void preceddor(Node root,int key)
    {
       if(root==null)
       {
           return;
       }
       if(root.data==key)
        {
           Node temp;
           if(root.left!=null) {
              temp = root.left;
           }
          else{
              return;
          }
          while (temp.right!=null)
             temp=temp.right;
          pre=temp;
          return;
      }
      else if(root.data>key)
       {
           preceddor(root.left,key);
       }
        else{
           pre=root;
           preceddor(root.right,key);
       }
    }

    public static void main(String[] args) {
        BST b=new BST();
        Scanner ssc=new Scanner(System.in);
        System.out.println("Enter no. of nodes:- ");
        int n= ssc.nextInt();
        int key= ssc.nextInt();
        b.root= b.insert(null,key);
        for(int i=2;i<=n;i++)
        {
            b.root=b.insert(b.root, ssc.nextInt());
        }
//        System.out.println("Enter element to search:- ");
//        key= ssc.nextInt();
//        Node temp=b.searchitr(b.root,key);
//
//        if(temp==null)
//        {
//            System.out.println(key+" is not present");
//        }
//        else{
//            System.out.println(temp.data+" is present");
//        }

//      System.out.println("Enter k :- ");
//        int k= ssc.nextInt();
//
//        int ans=b.kthlargest(b.root,k);
//        System.out.println("Answer= "+ans);

//        System.out.println("Enter sum to check:- ");
//        int sum=ssc.nextInt();
//
//        ArrayList<Integer>sol=new ArrayList<>();
//        sol=b.pairsum(b.root,sol,sum);
//
//        if(sol.size()!=0)
//        System.out.println("The pair is "+sol.get(0)+", "+sol.get(1));
//        else
//            System.out.println("The pair is not present");

//       System.out.println("Enter key to find its preceddor:- ");
//       key=ssc.nextInt();
//
//       b.preceddor(b.root,key);
//        if(b.pre==null)
//           System.out.println("Preceddor is null");
//       else
//           System.out.println("Preceddor is "+b.pre.data);

        System.out.println("Enter p and q to find LCA");
        int p= ssc.nextInt();
        int q=ssc.nextInt();
        Node res=b.LCA(b.root,p,q);

        if(res==null)
            System.out.println("LCA is null");
        else
            System.out.println("LCA is "+res.data);



    }
}

