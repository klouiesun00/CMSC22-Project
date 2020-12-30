package FinalProject;

public class Demo {
	public static void main(String[] args) {
		System.out.println("ACADEMICS TO DO LIST DEMO");
		AcademicsToDoList myNewList1 = new AcademicsToDoList();
		myNewList1.createList();
		myNewList1.addToDo("Do CMSC22 Project");
		myNewList1.addToDo("Study for Math54");
		myNewList1.addToDo("Make PE vid");
		myNewList1.printList();
		myNewList1.done(1);
		myNewList1.done(4);
		myNewList1.prioritize(2);
		myNewList1.prioritize(4);
		myNewList1.printList();
		myNewList1.remove(1);
		myNewList1.printList();
		System.out.println();
		
		System.out.println("CHORES TO DO LIST DEMO");
		ChoresToDoList myNewList2 = new ChoresToDoList();
		myNewList2.createList();
		myNewList2.addToDo("clean my room");
		myNewList2.addToDo("do laundry");
		myNewList2.addToDo("water plants");
		myNewList2.printList();
		myNewList2.done(1);
		myNewList2.done(4);
		myNewList2.prioritize(2);
		myNewList2.prioritize(4);
		myNewList2.printList();
		myNewList2.remove(1);
		myNewList2.printList();
		System.out.println();
		
		System.out.println("PERSONAL TO DO LIST DEMO");
		PersonalToDoList myNewList3 = new PersonalToDoList();
		myNewList3.createList();
		myNewList3.addToDo("Watch Haikyuu");
		myNewList3.addToDo("Go biking");
		myNewList3.addToDo("Do embroidery");
		myNewList3.printList();
		myNewList3.done(1);
		myNewList3.done(4);
		myNewList3.prioritize(2);
		myNewList3.prioritize(4);
		myNewList3.printList();
		myNewList3.remove(1);
		myNewList3.printList();
		
	}
}
