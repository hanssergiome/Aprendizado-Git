import java.util.Scanner;

public class Calculdora {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 float mostrar, numA, numB;
	 
	 System.out.println("DIGITE O PRIMEIRO NUMERO");
	 numA = sc.nextFloat();
	 
	 System.out.println("DIGITE O PRIMEIRO NUMERO");
	 numB = sc.nextFloat();
	 
	 Calculos calc = new Calculos();
	 
	 mostrar = calc.soma(numA, numB);
	 System.out.println("A soma � " +mostrar );

	 mostrar = calc.subtrai(numA, numB);
	 System.out.println("a subtra��o � " +mostrar);
	 mostrar = calc.divide(numA, numB);
	 System.out.println("a divis�o � " +mostrar);
	 mostrar = calc.multiplica(numA, numB);
	 System.out.println("a multiplica��o � " +mostrar);
	}

}
