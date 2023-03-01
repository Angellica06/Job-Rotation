package questao5;

public class Inverter {

	public static void main(String[] args) {
		String palavra = "Melancia";
		String resultado = "";
		
		for(int x = palavra.length() -1; x >= 0; x--) {
			resultado = resultado + palavra.charAt(x);
			
			
		}
		System.out.println(resultado);

	}

}
