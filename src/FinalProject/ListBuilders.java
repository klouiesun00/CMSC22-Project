package FinalProject;

/**
 * @author DELL
 */

import java.util.ArrayList;

/**
 * This class provides the implementation of a List object
 */
class List{																//implementation
	/**
	 * The list of the user
	 */
	ArrayList<String> myList = new ArrayList<>();
	/**
	 * This method will add items to a List object
	 * @param item accepts only strings 
	 */
	public void addItem(String item) {
		myList.add(item);
	/**
	 * This method will remove items from a List object
	 * @param index represents the order of the items 
	 * 				(begin at 1, not 0)
	 */
	}public void removeItem(int index) {
		if(index>0) {
			myList.remove(index-1);
		}else {
			System.out.println("Items begin at 1");
		}
	}
}

/**
 * This class cannot be instantiated and represents the methods 
 * a List object must have; This creates the List object 
 */
abstract class ListBuilder extends List{ 								//creating object
	public abstract void createList();
	public abstract void printList();
}

/**
 * Also cannot be instantiated and has methods of a List object
 * and methods specific for a to-do list
 */
abstract class ToDoListBuilder extends ListBuilder{ 					//specifics for to-do lists; creates list builder object
	/**
	 * Abstract method for adding to-dos
	 * @param toDo accepts string only
	 * will probably use addItem method
	 * from List class for its implementation
	 */
	public abstract void addToDo(String toDo);
	/**
	 * Abstract method for removing finished to-dos
	 * @param index 
	 * 	will probably use removeItem method
	 * 	from List class for its implementation
	 */
	public abstract void done(int index);
	/**
	 * Abstract method for putting to-dos on top of the list
	 * @param toDo accepts string only
	 * will put a to-do item at the top of the list
	 */
	public abstract void prioritize(String toDo);
	/**
	 * Abstract method for removing exisitng to-do items
	 * @param index 
	 * will probably use removeItem method
	 * from List class for its implementation
	 */
	public abstract void remove(int index);
}

