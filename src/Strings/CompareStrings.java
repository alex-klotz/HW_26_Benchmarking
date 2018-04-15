package Strings;

public class CompareStrings {
	
	   public static void main(String[] args) {
		   CompareStrings str = new CompareStrings();
		   double stringBuilderResult = str.stringBuilder(); // double roundOff = Math.round(a * 100.0) / 100.0;
		   double stringBufferResult = str.stringBuffer();
		   double stringRegularResult = str.stringRegular(); 
		   System.out.println("StringBuilder faster than StringBuffer in: " + Math.round(stringBufferResult / stringBuilderResult) + " times");
		   System.out.println("StringBuilder faster than String in: " + Math.round(stringRegularResult / stringBuilderResult) + " times");
		   System.out.println("StringBuffer faster than String in: " + Math.round(stringRegularResult / stringBufferResult) + " times");
	   }
		   
	   public double stringBuilder() {
		   	final long start = System.nanoTime();
		   	StringBuilder sb = new StringBuilder("a");
		   	int max = 1_000_000;
		   	for (int i = 0; i < max; i++) {sb = sb.append("b");}
		   	final long finish = System.nanoTime();
		   	double total = (finish - start) / 1_000_000.0;
		   	System.out.println("Using [StringBuilder] " + max + " times, Elapsed time: " + total + " ms");
		   	return total;
	   }
	
	public double stringBuffer() {
			final long start = System.nanoTime();
			StringBuffer sb = new StringBuffer("a");
       		int max = 1_000_000;
       		for (int i = 0; i < max; i++) {sb = sb.append("b");}
       		final long finish = System.nanoTime();
       		double total = (finish - start) / 1_000_000.0;
       		System.out.println("Using [StringBuffer] " + max + " times, Elapsed time: " + total + " ms");
       		return total;
		}
	
	public double stringRegular() {
        	final long start = System.nanoTime();
        	String s = "a";
        	int max = 1_000_000;
        	for (int i = 0; i < max; i++) {s = s.concat("b");}
        	final long finish = System.nanoTime();
        	double total = (finish - start) / 1_000_000.0f;
        	System.out.println("Using [String] " + max + " times, Elapsed time: " + total + " ms");
        	return total;
		}	
}
