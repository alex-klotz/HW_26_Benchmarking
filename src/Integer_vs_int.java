
public class Integer_vs_int {
	
	 public static void main(String[] args) {
		 
		 Integer_vs_int vs = new Integer_vs_int();
		 double intPrimitiveResult = vs.intPrimitive();
		 double integerWrapperResult = vs.integerWrapper();
		 double compare = integerWrapperResult / intPrimitiveResult;
		 System.out.println("\r[int] is faster than [Integer] in " + compare + " times");
	 }
		 
	public double intPrimitive() {		  
		  final long start = System.nanoTime();
		  int sum = 0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [int] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
		  }
	 
	 public double integerWrapper() {
		  final long start = System.nanoTime();
		  Integer sum = 0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [Integer] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
	 }
}
