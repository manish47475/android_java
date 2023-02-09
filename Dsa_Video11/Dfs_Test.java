package Dsa_Video11;



public class Dfs_Test {
	public static void main(String[] args)
	{
		Tree t=new Tree();
		Tree.Node n=new Tree.Node(5);
		
		t.insert(n,2);
		t.insert(n,4);
		t.insert(n,8);
		t.insert(n,6);
		t.insert(n,7);
		t.insert(n,3);
		t.insert(n,9);
		System.out.println("\nInOrder");
		t.traverseInOrder(n);
		System.out.println("\nPreOrder");
		t.traversePreOrder(n);
		System.out.println("\nPostOrder");
		t.traversePostOrder(n);
		System.out.println("\nBFS");
		t.bfs(n);
	}
	public static  class Tree
	{
		//Node n=new Node(5);
		static class  Node
		{
			int value;
			Node left,right;
			Node(int value)
			{
				this.value=value;
				left=null;
				right=null;
			}
		}
		public void insert(Node n,int value)
		{
			
			if(value<n.value)
			{
				if(n.left!=null)
				{
					insert(n.left,value);
				}
				else
				{
					
					System.out.println("Insert "+value+" to the left of "+n.value);
					n.left=new Node(value);
				}
			}else if(value>n.value)
			{
				if(n.right!=null)
				{
					insert(n.right,value);
				}
				else
				{
					
					System.out.println("Insert "+value+" to the right of "+n.value);
					n.right=new Node(value);
				}
			}
			
		}
		
		public void traverseInOrder(Node node)
		{
			
			if(node!=null)
			{
					traverseInOrder(node.left);
					System.out.print(" "+node.value);
					traverseInOrder(node.right);
			}
		}
		public void traversePreOrder(Node node)
		{
			
			if(node!=null)
			{
					System.out.print(" "+node.value);
					traverseInOrder(node.left);
					traverseInOrder(node.right);
			}
		}
		public void traversePostOrder(Node node)
		{
			
			if(node!=null)
			{
					traverseInOrder(node.left);
					traverseInOrder(node.right);
					System.out.print(" "+node.value);
			}
		}
		public int height(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			else {
				int lheight=height(root.left);
				int rheight=height(root.right);
				if(lheight>rheight)
				{
					return lheight+1;
				}
				else
				{
					return rheight+1;
				}
			}
		}
		public void printCurrentLevel(Node root,int level)
		{
			if(root==null)
			{
				return ;
			}
			else
			{
				if(level==1)
				{
					System.out.print(" "+root.value);
				}
				else if(level>1)
				{
					printCurrentLevel(root.left,level-1);
					printCurrentLevel(root.right,level-1);
				}
			}
		}
		public void bfs(Node n)
		{
			int h=height(n);
			for(int i=0;i<=h;i++)
			{
				printCurrentLevel(n,i);
			}
		}
	}
}
