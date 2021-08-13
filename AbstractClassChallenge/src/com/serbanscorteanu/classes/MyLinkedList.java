package com.serbanscorteanu.classes;

import com.serbanscorteanu.interfaces.NodeList;

public class MyLinkedList implements NodeList {
	private ListItem root;

	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	public ListItem getRoot() {
		return this.root;
	}

	public boolean addItem(ListItem newItem) {
		// true if added successfully else false
		// if already present don't add it
		// use compareTo to place in order\

		if (this.root == null) {
			this.root = newItem;
			return true;
		}

		ListItem currentItem = this.root;

		while (currentItem != null) {

			if (currentItem.compareTo(newItem) < 0) {
				// newItem has a higher value, move right if possible
				if (currentItem.next() != null) { // move to the right, there is at least one more node on the right
					currentItem = currentItem.next();
				} else { // there is no next, this is the end of the list
//					currentItem.setNext(newItem);
//					newItem.setPrevious(currentItem);
					// less code, same idea - because the set method returns the new right/left link
					currentItem.setNext(newItem).setPrevious(currentItem);
					return true;
				}
			} else if (currentItem.compareTo(newItem) > 0) {
				// newItem is less, insert before
				if (currentItem.previous() != null) { // if there is an element before
//					currentItem.previous().setNext(newItem);
//					newItem.setPrevious(currentItem.previous());
					// less code, same idea - because the set method returns the new right/left link
					currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
//					newItem.setNext(currentItem);
//					currentItem.setPrevious(newItem);
					// less code, same idea - because the set method returns the new right/left link
					newItem.setNext(currentItem).setPrevious(newItem);
				} else { // we are at the beginning of the list, the previous is the root. insert as root
//					newItem.setNext(this.root);
//					this.root.setPrevious(newItem);
					// less code, same idea - because the set method returns the new right/left link
					newItem.setNext(this.root).setPrevious(newItem);
					this.root = newItem;
				}
				return true;

			} else {
				System.out.println(newItem.getValue() + " already in the list. Don't need duplicates");
				System.out.println();
				return false;
			}
		}
		return false;
	}

	public boolean removeItem(ListItem item) {
		if (item == null) {
			System.out.println("No item selected");
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			if (currentItem.compareTo(item) == 0) {
				if (currentItem == this.root) { // if this is the first item, make sure the root pointer skips it
					this.root = currentItem.next();
				} else {
					currentItem.previous().setNext(currentItem.next());
					// now check if there are any more nodes on the right
					if (currentItem.next() != null) {
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
//				if (this.root.previous() == null)	// if this is the head
//				this.root.previous().setNext(this.root.next());
//				this.root.next().setPrevious(this.root.previous());
			} else if (currentItem.compareTo(item) < 0) {
				currentItem = currentItem.next();
			} else {	// comparison > 0
				// it means we are at an item with a higher value already
				// bc we start from the root and check this -> conclusion : Item not in the list
				return false;
			}
			
		}
		return false;
	}

	public void traverse(ListItem root) {
		// if root is null -> "List is empty"
		// else print each value on newLine
		if (root == null) {
			System.out.println("List is empty");
		} else {
			while (root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}

	}

}
