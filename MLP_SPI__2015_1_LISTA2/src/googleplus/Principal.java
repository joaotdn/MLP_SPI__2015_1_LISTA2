package googleplus;

public class Principal {
	public static void main(String[] args) {
		
		Data d = new Data(12,13,21);
		
		try {
			System.out.println(d.toString());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
