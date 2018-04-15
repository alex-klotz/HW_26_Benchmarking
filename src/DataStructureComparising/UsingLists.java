package DataStructureComparising;

import java.util.*;

public class UsingLists {
 
       public static void main(String[] args) {
              List<Integer> arrayList = new ArrayList<Integer>();
              List<Integer> linkedList = new LinkedList<Integer>();
              List<Integer> vector = new Vector<Integer>();
 
              // ArrayList add
             long startTime = System.nanoTime();
              for (int i = 0; i < 100000; i++) {arrayList.add(i);}
              long endTime = System.nanoTime();
              System.out.println("ArrayList add:  " + (endTime - startTime));
             
             // LinkedList add
              startTime = System.nanoTime();
              for (int i = 0; i < 100000; i++) {linkedList.add(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedList add: " + (endTime - startTime));
 
              // Vector add
              startTime = System.nanoTime();
              for (int i = 0; i < 100000; i++) {vector.add(i);}
              endTime = System.nanoTime();
              System.out.println("Vector add: " + (endTime - startTime) + "\n");
 
              // ArrayList get
              startTime = System.nanoTime();
              for (int i = 0; i < 10000; i++) {arrayList.get(i);}
              endTime = System.nanoTime();
              System.out.println("ArrayList get: " + (endTime - startTime));
 
              // LinkedList iterate all
              startTime = System.nanoTime();
              for (int i = 0; i < 10000; i++) {linkedList.get(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedList get: " + (endTime - startTime));
 
              // Vector get
              startTime = System.nanoTime();
              for (int i = 0; i < 10000; i++) {vector.get(i);}
              endTime = System.nanoTime();
              System.out.println("Vector get: " + (endTime - startTime) + "\n");
 
              // ArrayList remove
              startTime = System.nanoTime();
 
              for (int i = 9999; i >= 0; i--) {arrayList.remove(i);}
              endTime = System.nanoTime();
              System.out.println("ArrayList remove:  " + (endTime - startTime));
 
              // LinkedList remove
              startTime = System.nanoTime();
              for (int i = 9999; i >= 0; i--) {linkedList.remove(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedList remove: " + (endTime - startTime));
 
              // Vector remove
              startTime = System.nanoTime();
              for (int i = 9999; i >= 0; i--) {vector.remove(i);}
              endTime = System.nanoTime();
              System.out.println("Vector remove: " + (endTime - startTime));
       }
}
