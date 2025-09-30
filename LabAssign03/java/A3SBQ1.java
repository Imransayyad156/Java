package LabAssign03.java;
import java.util.*;
public class A3SBQ1 {
	    public static void main(String[] args) {
	        LinkedList<String> colours = new LinkedList<>();
	        colours.add("red");
	        colours.add("blue");
	        colours.add("yellow");
	        colours.add("orange");
	        System.out.println("Original List: " + colours);
	        System.out.println("\nUsing Iterator:");
	        Iterator<String> itr = colours.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        System.out.println("\nUsing ListIterator (Reverse Order):");
	        ListIterator<String> listItr = colours.listIterator(colours.size());
	        while (listItr.hasPrevious()) {
	            System.out.println(listItr.previous());
	        }
	        LinkedList<String> newColours = new LinkedList<>();
	        newColours.add("pink");
	        newColours.add("green");
	        int index = colours.indexOf("yellow");
	        colours.addAll(index, newColours);
	        System.out.println("\nAfter inserting new colours between blue and yellow:");
	        System.out.println(colours);
	    }
	}
