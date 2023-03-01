package questao4;

public class Principal {

	public static void main(String[] args) {
		
		Faturamento fa = new Faturamento();
		
		fa.fatMg = 29.229;
		fa.fatRj = 36.678;
		fa.fatSp = 67.836;
		fa.fatEs = 27.165;
		fa.fatOut = 19.849;
		fa.valorTotal();
		fa.percentual();
		
        System.out.println("Percentual: R$" + fa.percentual());
	}

}
