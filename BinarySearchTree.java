package com.sanchi.tutorial.algorithms;

/**
 * Class to implement Binary Search Tree 
 * and its operations.
 * 	1) addNode
 * 	2) contains
 *  3) inorderTraversal
 *  4) preorderTraversal
 *  5) postorderTraversal
 *  
 *  
 * @author Sanchi
 *
 */
public class BinarySearchTree {
	
	private Node root;
	
	/**
	 * Method to add an element to BST.
	 * 
	 * @param value
	 */
	public void addNode(int value)
	{
		if(root == null)
		{
			root = new Node(value);
		}
		else
		{
			root.addNode(value);
		}
	}
	
	/**
	 * Method to check if the element
	 * belongs to BST.
	 * 
	 * @param value
	 * @return
	 */
	public boolean contains(int value)
	{
		if(root == null)
		{
			return false;
		}
		
		if(root.value == value)
		{
			return true;
		}
		else
		{
			return root.contains(value);
		}
	}
	
	/**
	 * Method to perform inorder traversal.
	 * Left Child -> Parent-> Right Child
	 * 
	 */
	public void inorderTraversal()
	{
		if(root == null)
		{
			System.out.println("No elements to display");
			return;
		}
		
		root.inorderTraversal();
	}
	
	/**
	 * Method to perform preorder traversal.
	 * Parent-> Left Child -> Right Child
	 * 
	 */
	public void preorderTraversal()
	{
		if(root == null)
		{
			System.out.println("No elements to display");
			return;
		}
		
		root.preorderTraversal();
	}
	
	/**
	 * Method to perform post order traversal.
	 * Left Child -> Right Child - >Parent
	 * 
	 */
	public void postorderTraversal()
	{
		if(root == null)
		{
			System.out.println("No elements to display");
			return;
		}
		
		root.postorderTraversal();
	}
	
	/**
	 * Method to validate BST.
	 * 
	 * @return
	 */
	public boolean validateBST()
	{
		if(root == null)
		{
			return false;
		}
		else
		{
			return root.validate();
		}
	}
	
	private class Node
	{
		private int value;
		private Node leftChild, rightChild;
		
		Node(int value)
		{
			this.value = value;
		}
		
		public boolean validate() {
			boolean rightValidate = false;
			boolean leftValidate = false;
			
			if(this.rightChild == null)
			{
				rightValidate = true;
			}
			
			if(this.leftChild == null)
			{
				leftValidate = true;
			}
			
			if(this.rightChild != null && this.value<this.rightChild.value)
			{
				rightValidate = this.rightChild.validate();
			}
			else if(this.rightChild != null)
			{
				rightValidate = false;
			}
			
			if(this.leftChild != null && this.value>this.leftChild.value)
			{
				leftValidate = this.leftChild.validate();
			}
			else if(this.leftChild != null)
			{
				leftValidate = false;
			}
			
			return leftValidate && rightValidate;
		}

		public void inorderTraversal() {
			
			if(leftChild !=null){
				leftChild.inorderTraversal();
			}
			
			System.out.println(this.value);
			
			if(rightChild != null)
			{
				rightChild.inorderTraversal();
			}
			
		}
		
		public void preorderTraversal() {
			
			System.out.println(this.value);
			
			if(leftChild !=null){
				leftChild.preorderTraversal();
			}
			
			if(rightChild != null)
			{
				rightChild.preorderTraversal();
			}
			
		}
		
		public void postorderTraversal() {
			
			if(leftChild !=null){
				leftChild.postorderTraversal();
			}
			
			if(rightChild != null)
			{
				rightChild.postorderTraversal();
			}
			
			System.out.println(this.value);
			
		}

		boolean contains(int value)
		{
			if(value == this.value)
			{
				return true;
			}
			if(value<this.value)
			{
				if(leftChild == null)
				{
					return false;
				}
				else
				{
					return leftChild.contains(value);
				}
			}
			else
			{
				if(rightChild == null)
				{
					return false;
				}
				else
				{
					return rightChild.contains(value);
				}
			}
			
		}
		
		void addNode(int value)
		{
			if(value<= this.value)
			{
				if(leftChild == null)
				{
					leftChild = new Node(value);
				}
				else
				{
					leftChild.addNode(value);
				}
			}
			else
			{
				if(rightChild == null)
				{
					rightChild = new Node(value);
				}
				else
				{
					rightChild.addNode(value);
				}
			}
		}
	}
}
