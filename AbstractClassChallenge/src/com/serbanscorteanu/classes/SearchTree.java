package com.serbanscorteanu.classes;

import com.serbanscorteanu.interfaces.NodeList;

public class SearchTree implements NodeList {

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addItem(ListItem item) {
		// true if added successfully else false
				// if already present don't add it
				// use compareTo to place in order
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// true if removed successfully else false
		// when item is found call performRemoval()
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// if root is null -> "List is empty"
				// else print each value on newLine
		
	}
	
	private void performRemoval(ListItem item1, ListItem item2) {
		
	}
	
}











