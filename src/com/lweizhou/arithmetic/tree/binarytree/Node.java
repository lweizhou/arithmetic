package com.lweizhou.arithmetic.tree.binarytree;

/**
 * 
 * 一棵树的节点
 * @author lweizhou
 *
 */
public class Node {

	int key;
	
	Node left;
	
	Node right;
	
	public Node() {
		super();
	}

	public Node(int key) {
		super();
		this.key = key;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", left=" + left + ", right=" + right + "]";
	}
	
}
