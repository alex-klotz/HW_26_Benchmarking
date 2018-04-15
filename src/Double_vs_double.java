
public class Double_vs_double {
	public static void main(String[] args) {
		 
		Double_vs_double vs = new Double_vs_double();
		 double doublePrimitiveResult = vs.doublePrimitive();
		 double doubleWrapperResult = vs.doubleWrapper();
		 double compare = doubleWrapperResult / doublePrimitiveResult;
		 System.out.println("\r[double] is faster than [Double] in " + compare + " times");	 
	 }
		 
	 public double doublePrimitive() {  
		  final long start = System.nanoTime();
		  double sum = 0.0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [double] " + max + " times, Elapsed time: " + total + " ms");
		  return total;	  
	}
	 
	 public double doubleWrapper() {
		  final long start = System.nanoTime();
		  Double sum = 0.0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [Double] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
	 }
}
