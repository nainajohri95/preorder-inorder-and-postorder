class Node
{
  int data;
  Node left;
  Node right;
  
  Node(int data)
  {
    this.data = data;  
  }
  
}

public class BinaryTree
{
  static void preorder(Node root)
  {
    if(root == null)
    {
      return;  
    }
    else
    {
      System.out.println(root.data);
      preorder(root.left);
      peorder(root.right);
    }
}
  static void inorder(Node root)
  {
    if(root == null)
    {
      return;  
    }
    else
    {
      inorder(root.left);
      System.out.println(root.data);
      inorder(root.right);
    }
  }
  static void postorder(Node root)
  {
    if(root == null)
    {
      return;  
    }
    else
    {
      postorder(root.left);
      postorder(root.right);
      System.out.println(root.data);
    }
  }
  public static void main(String args[])
  {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    
    root.left.left = new Node(4);
    root.left.right = new Node(5);
     
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    
    preorder(root);
    System.out.println();
    
    inorder(root);
    System.out.println();
    
    postorder(root);
    System.out.println();
  }
}