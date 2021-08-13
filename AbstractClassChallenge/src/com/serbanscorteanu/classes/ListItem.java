package com.serbanscorteanu.classes;

public abstract class ListItem {
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	protected Object value;
	
	public ListItem(Object value) {
		this.value = value;
	}
	
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);	// this will set and return rightLink(listItem)
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);	// this will set and return rightLink
	abstract int compareTo(ListItem item);	// compare this.value with listItem.value

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
