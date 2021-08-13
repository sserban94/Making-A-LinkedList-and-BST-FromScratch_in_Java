 package com.serbanscorteanu.main;

import com.serbanscorteanu.classes.ListItem;
import com.serbanscorteanu.classes.MyLinkedList;
import com.serbanscorteanu.classes.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TIP:  The rules for adding an item to the linked tree are:  
//
//		          If the head of the tree is null, make the head refer to the item to be added.
//
//		          If the item to be added is less than the current item in the tree, add the item before the current item (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
//
//		          If the item to be added is greater than the current item, move onto the next item and compare again (if there is no next item, then that is where the new item belongs).
//
//		TIP:  When adding items to a Binary Search Tree, if the item to be added is less than the current item - then move to the left. 
//
//		         If it is greater than the current item - then move to the right. 
//
//		         The new item is added when an attempt to move in the required direction would involve following a null reference. 
//
//		         Once again, duplicates are not allowed.
//
//		TIP:  Inorder = print the previous node, then the parent node, and then the next node (left -> node -> right).
//
//		TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
//
//		TIP:  Be extremely careful about spaces and spelling in the printed output from the traverse() method.
//
//		NOTE:  All fields are private (unless stated otherwise).
//
//		NOTE:  All constructors are public.
//
//		NOTE:  All methods are public (unless stated otherwise).
//
//		NOTE:  Do not add a main method to the solution code.
		
		
		MyLinkedList firstLinkedList = new MyLinkedList(null);
		firstLinkedList.traverse(firstLinkedList.getRoot());
		firstLinkedList.addItem(new Node("Galati"));
		firstLinkedList.addItem(new Node("Braila"));
		firstLinkedList.addItem(new Node("Targu Mures"));
		firstLinkedList.addItem(new Node("Cluj-Napoca"));
		firstLinkedList.addItem(new Node("Timisoara"));
		firstLinkedList.addItem(new Node("Iasi"));
		firstLinkedList.addItem(new Node("Sibiu"));
		firstLinkedList.addItem(new Node("Brasov"));
		firstLinkedList.addItem(new Node("Braila"));
		firstLinkedList.addItem(new Node("Bucuresti"));
		
		firstLinkedList.traverse(firstLinkedList.getRoot());
				
		
		
		
		
		
	}

}




