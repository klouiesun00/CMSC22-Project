package FinalProject;

/**
 * @author DELL
 */

/**
 * This class creates a to-do list for academic-related things only
 */

class AcademicsToDoList extends ToDoListBuilder {
	/**
	 * Represents the List object created 
	 */
	protected List myAcadsToDo;
	
	/**
	 * Creates the List object
	 */
	@Override
	public void createList() {							   							//create List object
		myAcadsToDo = new List();
	}
	
	/**
	 * Prints the to-do list created
	 * Will throw an error if no List object was created
	 */
	@Override
	public void printList() {
		try{
			if(myAcadsToDo.myList.size() == 0) {
				System.out.println("There is nothing to do");
			}else {
				for(int i = 0;i<myAcadsToDo.myList.size();i++) {
					System.out.println(i+1 + ": " + myAcadsToDo.myList.get(i));		//to-dos begin at 1
				}
			}
		} catch(NullPointerException e) {
			System.out.println("Please create an academics to-do list.");
		}
	}
	
	/**
	 * Adds a to-do item to the list
	 * @param toDo accepts String only
	 * Will throw error if no List object was created
	 */
	@Override
	public void addToDo(String toDo) {
		try {
			myAcadsToDo.addItem(toDo);
			System.out.println("'" + toDo + "'" + " has been added to your academics to-do list!");
		} catch(NullPointerException e) {
			System.out.println("Please create an academics to-do list.");
		}
	}
	
	/**
	 * Removes a finished to-do item
	 * @param index position of finished to-do (from 1, not 0)
	 * Will throw error if no List object created or if param 
	 * provided is out of bounds
	 */
	@Override
	public void done(int index) {												//'index' parameter means integers from 1, not 0
		try {
			String toDo = myAcadsToDo.myList.get(index-1);
			myAcadsToDo.removeItem(index);
			System.out.println("You are done with " + "'" + toDo + "'!");
			System.out.println("Here is your updated to-do list:");
			printList();
			if(myAcadsToDo.myList.size() == 0) {
					System.out.println("Great job! You are done with your to-do list :)");
			}
		} catch(IndexOutOfBoundsException e) {									//catch if index entered is out of bounds
			int size = myAcadsToDo.myList.size();
			System.out.println("Please enter numbers from 1 to " + size + " only.");
		} catch(NullPointerException e) {
			System.out.println("Please create an academics to-do list.");
		}
	}
	
	/**
	 * Puts a new to-do at the top of the list
	 * @param toDo accepts string and represents the new to-do item
	 */
	@Override
	public void prioritize(String toDo) {   			//for when a new to-do should be added at the top of list
		try {
			myAcadsToDo.myList.add(0, toDo);
			System.out.println("'" + toDo + "'" + " has been prioritized!");
		} catch(NullPointerException e) {
			System.out.println("Please create an academics to-do list.");
		}
	}
	/**
	 * Overloaded method that puts an existing to-do at the top of the list
	 * @param index position of the existing to-do
	 */
	public void prioritize(int index) {  	//overloaded method for when a currently existing to-do is to be moved to the top
		try {
			String toDo = myAcadsToDo.myList.get(index-1);
			myAcadsToDo.removeItem(index);
			myAcadsToDo.myList.add(0, toDo);
			System.out.println("'" + toDo + "'" + " has been prioritized!");
		} catch(IndexOutOfBoundsException e) {
			int size = myAcadsToDo.myList.size();
			System.out.println("Please enter numbers from 1 to " + size + " only.");
		} catch(NullPointerException e) {
			System.out.println("Please create an academics to-do list.");
		}
	}
	
	/**
	 * Same as done method but removes a to-do item that hasn't been done
	 * @param index position of to-do item
	 */
	@Override
	public void remove(int index) { 			//similar to done() method but used for when a to-do hasn't been done 
		try {
			String toDo = myAcadsToDo.myList.get(index-1);
			myAcadsToDo.removeItem(index);
			System.out.println("'" + toDo + "'" + " has been removed.");
		} catch(IndexOutOfBoundsException e) {
			int size = myAcadsToDo.myList.size();
			System.out.println("Please enter numbers from 1 to " + size + " only.");
		}  catch(NullPointerException e) {
			System.out.println("Please create an academics to-do list.");
		}
	}
	
}
