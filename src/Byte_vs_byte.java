
public class Byte_vs_byte {
	public static void main(String[] args) {
		 
		 Byte_vs_byte vs = new Byte_vs_byte();
		 double bytePrimitiveResult = vs.bytePrimitive();
		 double byteWrapperResult = vs.byteWrapper();
		 double compare = byteWrapperResult / bytePrimitiveResult;
		 System.out.println("\r[byte] is faster than [Byte] in " + compare + " times");	 
	 }
		 
	 public double bytePrimitive() {  
		  final long start = System.nanoTime(); // System.currentTimeMillis();
		  byte sum = 0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime(); // System.currentTimeMillis();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [byte] " + max + " times, Elapsed time: " + total + " ms");
		  return total;	  
	}
	 
	 public double byteWrapper() {
		  final long start = System.nanoTime();
		  Byte sum = 0;
		  int max = 1_000_000_000;
		  for (int i = 0; i < max; i++) {sum++;}
		  final long finish = System.nanoTime();
		  double total = (finish - start) / 1_000_000.0;
		  System.out.println("Using [Byte] " + max + " times, Elapsed time: " + total + " ms");
		  return total;
	 }
}
