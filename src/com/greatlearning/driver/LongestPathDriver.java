package com.greatlearning.driver;

import java.util.ArrayList;

public class LongestPathDriver {
	
	// BST node
	static class Node {
		int nodeData;
		Node left, right;
	}
	
	// creation of new node
	static Node newNode(int nodeData) {
		Node temp = new Node();

		temp.nodeData = nodeData;
		temp.left = null;
		temp.right = null;
		return temp;
	}
	
	public static ArrayList<Integer> findLongestpath(Node root) {
		
		if(root == null){
			ArrayList<Integer> output = new ArrayList<>();
			return output;
			
		}
		
		//Recursive call on right leg
		ArrayList<Integer> rightarray = findLongestpath(root.right);
		
		//Recursive call on right leg
		ArrayList<Integer> leftarray = findLongestpath(root.left);
		
		//Comparing the size of left and right branch and inserting elements accordingly
		if(rightarray.size() < leftarray.size()) {
			leftarray.add(root.nodeData);
		}
		else {
			rightarray.add(root.nodeData);
		}
		
		//Return the appropriate branch
		return(leftarray.size() > rightarray.size()? leftarray:rightarray);
		
	}

	public static void main(String[] args) {
		
		//Adding elements to the tree
		Node root = newNode(100);
		root.left =newNode(20);
		root.right= newNode(130);
		root.left.left = newNode(10);
		root.left.right = newNode(50);
		root.right.left = newNode(110);
		root.right.right = newNode(140);
		root.left.left.left = newNode(5);
		
		ArrayList<Integer> output = findLongestpath(root);
		int size = output.size();
		
		System.out.println(output.get(size-1));
		for(int i=size-2;i>=0;i--) {
			System.out.println("->"+output.get(i));
		}
		

	}

}
