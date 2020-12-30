package FinalProject;
/**
 * @author DELL
 */

/**
 * This is for creating a to-do list for chores
 */
class ChoresToDoList extends ToDoListBuilder {
	/**
	 * Represents the List object created 
	 */
	protected List myChoresToDo;
	
	/**
	 * Creates the List object
	 */
	@Override
	public void createList() {				//create List object
		myChoresToDo = new List();
	}
	
	/**
	 * Prints the to-do List created
	 * Will throw error if no List object was created
	 */
	@Override
	public void printList() {
		try{
			if(myChoresToDo.myList.size() == 0) {
				System.out.println("You have no chores.");
			}else {
				for(int i = 0;i<myChoresToDo.myList.size();i++) {
					System.out.println("Chore " + (i+1) + ": " + myChoresToDo.myList.get(i));		//to-dos begin at 1
				}
			}
		} catch(NullPointerException e) {
			System.out.println("Please create a chores to-do list.");
		}
	}
	
	/**
	 * Adds a to-do to the list
	 * @param toDo accepts String only
	 * Will throw error if no List object was created
	 */
	@Override
	public void addToDo(String toDo) {
		try {
			myChoresToDo.addItem(toDo);
			System.out.println("'" + toDo + "'" + " has been added to your chores to-do list!");
		} catch(NullPointerException e) {
			System.out.println("Please create a chores to-do list.");
		}
	}
	
	/**
	 * Will remove a to-do once done 
	 * @param index accepts integers from 1 onwards and represents
	 * 		  		the position of the finished to-do item
	 * Will throw error if no List object was created or if
	 * int provided is 0 or out of bounds
	 */
	@Override
	public void done(int index) {										
		try {
			String toDo = myChoresToDo.myList.get(index-1);
			myChoresToDo.removeItem(index);
			System.out.println("You are done with " + "'" + toDo + "'!");
			System.out.println("Here is your updated to-do list:");
			printList();
			
			if(myChoresToDo.myList.size() == 0) {
					System.out.println("Great job! You are done with all your chores :)");
			}
		} catch(IndexOutOfBoundsException e) {			//catch if index entered is out of bounds
			int size = myChoresToDo.myList.size();
			System.out.println("Please enter numbers from 1 to " + size + " only.");
		} catch(NullPointerException e) {
			System.out.println("Please create a chores to-do list.");
		}
	}
	
	/**
	 * Will put a new to-do item at the top of the list
	 * @param toDo accepts String only
	 * Will throw error if no List object was created
	 */
	@Override
	public void prioritize(String toDo) {   		//for when a new to-do should be added at the top of list
		try {
			myChoresToDo.myList.add(0, toDo);
			System.out.println("The chore '" + toDo + "'" + " has been prioritized!");
		} catch(NullPointerException e) {
			System.out.println("Please create a chores to-do list.");
		}
	}
	/**
	 * Will put an existing to-do item at the top of the list
	 * @param index accepts integers from 1 onwards and represents
	 * 		  		the position of the to-do item to be put at the top 
	 * Will throw error if no List object was created or if
	 * int provided is 0 or out of bounds
	 */
	public void prioritize(int index) {  	  	//overloaded method for when a currently existing to-do is to be moved to the top
		try {
			String toDo = myChoresToDo.myList.get(index-1);
			myChoresToDo.removeItem(index);
			myChoresToDo.myList.add(0, toDo);
			System.out.println("The chore '" + toDo + "'" + " has been prioritized!");
		} catch(IndexOutOfBoundsException e) {
			int size = myChoresToDo.myList.size();
			System.out.println("Please enter numbers from 1 to " + size + " only.");
		} catch(NullPointerException e) {
			System.out.println("Please create a chores to-do list.");
		}
	}
	
	/**
	 * Will remove a to-do item that hasn't been done from the list 
	 * @param index accepts integers from 1 onwards and represents
	 * 				position of to-do item to be removed
	 * Will throw error if no List object was created or if
	 * int provided is 0 or out of bounds
	 */
	@Override
	public void remove(int index) { 											//similar to done() method but used for when a to-do hasn't been done 
		try {
			String toDo = myChoresToDo.myList.get(index-1);
			myChoresToDo.removeItem(index);
			System.out.println("The chore '" + toDo + "'" + " has been removed.");
		} catch(IndexOutOfBoundsException e) {
			int size = myChoresToDo.myList.size();
			System.out.println("Please enter numbers from 1 to " + size + " only.");
		}  catch(NullPointerException e) {
			System.out.println("Please create a chores to-do list.");
		}
	}
}
