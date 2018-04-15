
public class Long_vs_long {
	public static void main(String[] args) {
		 
		 Long_vs_long vs = new Long_vs_long();
		 double longPrimitiveResult = vs.longPrimitive();
		 double longWrapperResult = vs.longWrapper();
		 double compare = longWrapperResult / longPrimitiveResult;
		 System.out.println("\r[long] is faster than [Long] in " + compare + " times");	 
	 }
		 
	 public double longPrimitive() {  
		  final long start = System.nanoTime();
		  long sum = 0l;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [long] " + max + " times, Elapsed time: " + total + " ms");
		  return total;	  
	}
	 
	 public double longWrapper() {
		  final long start = System.nanoTime();
		  Long sum = 0l;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [Long] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
	 }
}
