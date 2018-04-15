
public class Float_vs_float {
	public static void main(String[] args) {
		 
		 Float_vs_float vs = new Float_vs_float();
		 double floatPrimitiveResult = vs.floatPrimitive();
		 double floatWrapperResult = vs.floatWrapper();
		 double compare = floatWrapperResult / floatPrimitiveResult;
		 System.out.println("\r[long] is faster than [Long] in " + compare + " times");	 
	 }
		 
	 public double floatPrimitive() {  
		  final long start = System.nanoTime();
		  float sum = 0.0f;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [float] " + max + " times, Elapsed time: " + total + " ms");
		  return total;	  
	}
	 
	 public double floatWrapper() {
		  final long start = System.nanoTime();
		  Float sum = 0.0f;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [Float] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
	 }
}
