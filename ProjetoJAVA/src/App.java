import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		CidadeI city = new CidadeI(0, 0, 0); // objeto
		CidadeN nac = new CidadeN(0,0);
	
		System.out.println("* * * * * * * * * * * * * * * *");
		System.out.println("* * * * * 44 TURISMO! * * * * *");
		System.out.println("* * * * * * * * * * * * * * * *");
		
		System.out.println("Ol�, seja bem-vinde!");
		System.out.println("Qual � o seu nome?");
		String nome = leia.next();

		System.out.println("\nOl�, " + nome + ", para prosseguirmos, selecione o destino desejado:");
		System.out.println("\n[1] � Internacional");
		System.out.println("[2] � Nacional");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			city.escolhaCidade();
			break;
		case 2:
			nac.escolhaCidadeN();
			break;
		}

	}
}