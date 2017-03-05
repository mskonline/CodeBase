package tutorial;

public class StrictFP {

	//http://www.codejava.net/java-core/the-java-language/java-keyword-strictfp

	public static void main(String[] args) {
		StrictFP fp = new StrictFP();
		FloatingCalculator fc = fp.new FloatingCalculator();
		System.out.println(fc.mulitiply(2.3, 4.5));
	}

	strictfp class FloatingCalculator {
		public double mulitiply(double a, double b){
			return a * b;
		}
	}
}
