package Week1.TrainCampanion;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	static LinkedList<String> boogie = new LinkedList<>();
	
	public static void addboogie(String name) {
		boogie.add(name);
		System.out.println("Added : " + name);
	}
	
	public static void removeboogie(String name) {
		if(boogie.remove(name)) {
			System.out.println("Removed : " + name);
		}
		else {
			System.out.println("Not found");
		}
	}
	public static void moveforward() {
		System.out.println("Move forward");
		for(String c:boogie) {
			System.out.print(c + " ");
		}
		System.out.println("END");
	}
	
	public static void moveback() {
		System.out.println("Move backward");
		ListIterator<String> itr = boogie.listIterator(boogie.size());
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous() + " ");
		}
		System.out.println("Start");
	}
	
	public static void showadjacent(String name) {
		int index = boogie.indexOf(name);
		
		if(index == -1) {
			System.out.println(name + " not found");
		}
		
		System.out.println("Selected : " + name);
		
		if (index > 0)
            System.out.println("Previous: " + boogie.get(index - 1));
        else
            System.out.println("Previous: None");

        // Next
        if (index < boogie.size() - 1)
            System.out.println("Next: " + boogie.get(index + 1));
        else
            System.out.println("Next: None");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addboogie("1");
		addboogie("2");
		addboogie("3");
		addboogie("4");
		addboogie("5");
		
		moveforward();
		moveback();
		
		showadjacent("3");
	}

}
