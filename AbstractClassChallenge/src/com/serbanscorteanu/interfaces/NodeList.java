package com.serbanscorteanu.interfaces;

import com.serbanscorteanu.classes.ListItem;

public interface NodeList {
	public ListItem getRoot();
	public boolean addItem(ListItem item);
		// true if added successfully else false
		// if already present don't add it
		// use compareTo to place in order
	public boolean removeItem(ListItem item); 
		// true if added successfully else false
	public void traverse(ListItem root);
		// if root is null -> "List is empty"
		// else print each value on newLine

}
