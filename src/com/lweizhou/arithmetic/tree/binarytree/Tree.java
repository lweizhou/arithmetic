package com.lweizhou.arithmetic.tree.binarytree;

/**
 * 二叉搜索树
 * @author lweizhou
 *
 */
public class Tree {
	
	Node root;
	
	public Node find(int key){
		
		Node current = root;
		while(current.key != key){
			if(key < current.key)
				current = current.left;
			else
				current = current.right;
			if(current == null)
				return null;
		}
		return current;
	}

	public void insert(int key){
		
		Node newNode = new Node(key);
		if(root == null) {
			root = newNode;
			System.out.println(root);
			return;
		}
		
		Node current = root;
		Node parent;
		while(true){
			parent = current;
			if(key < current.key){//go left
				current = current.left;
				if(current == null){
					parent.left = newNode;
					System.out.println(root);
					return;
				}
			}else{ //go right
 				current =current.right;
 				if(current == null){
 					parent.right = newNode;
 					System.out.println(root);
 					return;
 				}
			}
		}		
	}
	
	public void delete(int key){
		
	}
	
	
	/**
	 * 中序遍历
	 * @param node
	 */
	public void inOrder(Node node ){
		
		if(node != null){
			inOrder(node.left);
			System.out.println(node.key);
			inOrder(node.right);
		}
		
	}
	
	public Node minNode(){
		
		Node current = root;
		Node last = null;
		while(current!= null){
			last = current;
			current=current.left;
			
		}
		return last;
	}

	public Node maxNode(){
		
		Node current = root;
		Node last = null;
		while(current != null){
			last = current;
			current=current.right;
		}
		return last;
	}
	
	
}
