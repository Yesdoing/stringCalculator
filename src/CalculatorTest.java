
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		add(cal);
		subtract(cal);
		multiply(cal);
		divide(cal);
	}

	private static void divide(Calculator cal) {
		// TODO Auto-generated method stub
		System.out.println(cal.divide(9, 3));
	}

	private static void multiply(Calculator cal) {
		// TODO Auto-generated method stub
		System.out.println(cal.multiply(3, 4));
	}

	private static void subtract(Calculator cal) {
		// TODO Auto-generated method stub
		System.out.println(cal.subtract(2, 1));
	}

	private static void add(Calculator cal) {
		// TODO Auto-generated method stub
		System.out.println(cal.add(5, 4));
	}
	
	
	
}
