package DataStructureComparising;

import java.util.*;
 
public class UsingSets {
 
       public static void main(String[] args) {
              Set<Integer> treeSet = new TreeSet<Integer>();
              Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
              Set<Integer> hashSet = new HashSet<Integer>();
             
              Iterator<Integer> ihs = hashSet.iterator();
              Iterator<Integer> ilhs = linkedHashSet.iterator();
              Iterator<Integer> its = treeSet.iterator();
             
              // TreeSet add
              long startTime = System.nanoTime();
              for (int i = 0; i < 100000; i++) {treeSet.add(i);}
              long endTime = System.nanoTime();
              System.out.println("TreeSet add:  " + (endTime - startTime));
            
              // HashSet add
              startTime = System.nanoTime();
              for (int i = 0; i < 100000; i++) {hashSet.add(i);}
              endTime = System.nanoTime();
              System.out.println("HashSet add: " + (endTime - startTime));
             
              // LinkedHashSet add
              startTime = System.nanoTime();
              for (int i = 0; i < 100000; i++) {linkedHashSet.add(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedHashSet add:  " + (endTime - startTime) + "\n");
 
              // HashSet iterate all
              startTime = System.nanoTime();
              while (ihs.hasNext()) {int i = (int) ihs.next();}
              endTime = System.nanoTime();
              System.out.println("HashSet iterate all:  " + (endTime - startTime));
             
              // LinkedHashSet iterate all
              startTime = System.nanoTime();
              while (ilhs.hasNext()) {int i = (int) ilhs.next();}
              endTime = System.nanoTime();
              System.out.println("LinkedHashSet iterate all:  " + (endTime - startTime));
             
              // TreeSet iterate all
              startTime = System.nanoTime();
              while (its.hasNext()) {int i = (int) its.next();}
              endTime = System.nanoTime();
              System.out.println("TreeSet iterate all:  " + (endTime - startTime) + "\n");
 
              // HashSet remove
              startTime = System.nanoTime();
              for (int i = 9999; i >= 0; i--) {hashSet.remove(i);}
              endTime = System.nanoTime();
              System.out.println("HashSet remove: " + (endTime - startTime));
             
              // LinkedHashSet remove
              startTime = System.nanoTime();
              for (int i = 9999; i >= 0; i--) {linkedHashSet.remove(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedHashSet remove: " + (endTime - startTime));
             
              // TreeSet remove
              startTime = System.nanoTime();
              for (int i = 9999; i >= 0; i--) {treeSet.remove(i);}
              endTime = System.nanoTime();
              System.out.println("TreeSet remove:  " + (endTime - startTime));
       }
}
