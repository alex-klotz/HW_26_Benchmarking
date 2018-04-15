package DataStructureComparising;

import java.util.*;

public class UsingMaps {
 
       public static void main(String args[]) {
              Map<Integer, String> hm = new HashMap<Integer, String>();
              Map<Integer, String> ht = new Hashtable<Integer, String>();
              Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
              Map<Integer, String> trm = new TreeMap<Integer, String>();
              
              // HashMap put
              long startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {hm.put(i, "John Smith");}
              long endTime = System.nanoTime();
              System.out.println("HashMap puts:  " + (endTime - startTime));
              
              // HashTable put
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {ht.put(i, "John Smith");}
              endTime = System.nanoTime();
              System.out.println("HashTable puts:  " + (endTime - startTime));
              
              // LinkedHashMap put
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {lhm.put(i, "John Smith");}
              endTime = System.nanoTime();
              System.out.println("LinkedHashMap puts:  " + (endTime - startTime));
              
              // TreeMap put
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {trm.put(i, "John Smith");}
              endTime = System.nanoTime();
              System.out.println("TreeMap puts:  " + (endTime - startTime));
             
              // HashMap get
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {hm.get(i);}
              endTime = System.nanoTime();
              System.out.println("\rHashMap gets:  " + (endTime - startTime));
              
              // HashTable get
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {ht.get(i);}
              endTime = System.nanoTime();
              System.out.println("HashTable gets:  " + (endTime - startTime));
              
              // LinkedHashMap get
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {lhm.get(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedHashMap gets:  " + (endTime - startTime));
              
              // TreeMap get
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {trm.get(i);}
              endTime = System.nanoTime();
              System.out.println("TreeMap gets:  " + (endTime - startTime));
             
              // HashMap remove
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {hm.remove(i);}
              endTime = System.nanoTime();
              System.out.println("\rHashMap remove:  " + (endTime - startTime));
                           
              // HashTable remove
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {ht.remove(i);}
              endTime = System.nanoTime();
              System.out.println("HashTable remove:  " + (endTime - startTime));              
             
              // LinkedHashMap remove
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {lhm.remove(i);}
              endTime = System.nanoTime();
              System.out.println("LinkedHashMap remove:  " + (endTime - startTime));
             
              // TreeMap remove
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {trm.remove(i);}
              endTime = System.nanoTime();
              System.out.println("TreeMap remove:  " + (endTime - startTime));
      }
}
