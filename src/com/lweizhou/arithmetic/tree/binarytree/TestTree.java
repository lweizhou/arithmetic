package com.lweizhou.arithmetic.tree.binarytree;

public class TestTree {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.insert(60);
		tree.insert(40);
		tree.insert(30);
		tree.insert(50);
		
		System.out.println(tree.find(40));
		
		tree.inOrder(tree.root);
		
		
		System.out.println(tree.minNode());
		System.out.println(tree.maxNode());
	}
	
}
