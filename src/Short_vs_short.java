
public class Short_vs_short {
	
	 public static void main(String[] args) {
		 
		 Short_vs_short vs = new Short_vs_short();
		 double shortPrimitiveResult = vs.shortPrimitive();
		 double shortWrapperResult = vs.shortWrapper();
		 double compare = shortWrapperResult / shortPrimitiveResult;
		 System.out.println("\r[short] is faster than [Short] in " + compare + " times");	 
	 }
		 
	 public double shortPrimitive() {
		  final long start = System.nanoTime();
		  short sum = 0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [short] " + max + " times, Elapsed time: " + total + " ms");
		  return total;	  
	}
	 
	 public double shortWrapper() {
		  final long start = System.nanoTime();
		  Short sum = 0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [Short] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
	 }
}
