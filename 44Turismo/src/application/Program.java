package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.CidadesInternacionais;
import entities.CidadesNacionais;
import entities.Destinos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int op;
		int op2;
		String nome;

		Scanner sc = new Scanner (System.in);

		CidadesInternacionais[] city = new CidadesInternacionais[6];
		/*
		 * nome, moeda, pontosTuristicos, fuso, temperaturaMin, temperaturaMax, periodo,
		 * cambio, bilhete, alimentacao, hospedagem, aluguel, passagem
		 */
		city[1] = new CidadesInternacionais("Londres", "libra",
				"Londres tem tr�s principais pontos tur�sticos, sendo eles: "
						+ "Pal�cio de Westminster � Big Ben, London Eye, Torre de Londres e mais 39 destinos.",
				"GBP", 3, 0, 0, 0, 7.14f, 1.5f, 25.00f, 150.00f, 32.00f, 7830.00f);
		city[2] = new CidadesInternacionais("Paris", "euro",
				"Paris tem tr�s principais pontos tur�sticos, sendo eles: Torre Eiffel, "
						+ "Arco do Triunfo, Notre Dame de Paris e mais 15 destinos",
				"EUR", 4, 0, 0, 0, 5.94f, 1.7f, 78.00f, 60.00f, 45.00f, 5622.00f);
		city[3] = new CidadesInternacionais("Los Angeles", "d�lar",
				"Los Angeles tem tr�s principais pontos tur�sticos, sendo eles:"
						+ "Hollywood, Warner Bros Studios, Rodeo Drive e mais 12 destinos.",
				"USD", -5, 0, 0, 0, 5.27f, 1.75f, 56.00f, 83.00f, 38.00f, 6332.00f);
		city[4] = new CidadesInternacionais("Buenos Aires", "peso argentino",
				"Buenos Aires tem tr�s principais pontos tur�sticos, sendo eles:"
						+ " Galerias Pac�fico, Casa Rosada, Obelisco  e mais 15 destinos.",
				"ARS", 4, 0, 0, 0, 0.05f, 6.00f, 250.00f, 3932.00f, 1834.00f, 6332.00f);
		city[5] = new CidadesInternacionais("Dubai", "dihram",
				"Dubai tem tr�s principais pontos tur�sticos, sendo eles:"
						+ " Abu Dhabi, Dubai Mall, Ilhas artificiais  e mais 10 destinos.",
				"DH", 7, 0, 0, 0, 1.43f, 6.00f, 250.00f, 3932.00f, 1834.00f, 6332.00f);

		CidadesNacionais[] cidade = new CidadesNacionais[6];

		// nome, pontosTuristicos, (fuso), bilhete, alimentacao, hospedagem, aluguel,
		// passagem
		cidade[1] = new CidadesNacionais("S�o Paulo",
				"S�o Paulo tem tr�s principais pontos tur�sticos,"
						+ " sendo eles: Edif�cio It�lia, Parque do Ibirapuera, MASP e mais 35 destinos.",
				4.40f, 55.83f, 90, 99, 0);
		cidade[2] = new CidadesNacionais("Fortaleza",
				"Fortaleza tem tr�s principais pontos tur�sticos, sendo eles:"
						+ " Mercado Central de Fortaleza, Praia do Futuro, Av. Beira Mar e mais 20 destinos.",
				3.90f, 76, 290, 122.17f, 0);
		cidade[3] = new CidadesNacionais("Manaus",
				"Manaus tem tr�s principais pontos tur�sticos, sendo eles: Centro hist�rico,"
						+ " Encontro das �guas, Praia da Ponta Negra e mais 11 destinos.",
				-1, 3.80f, 60, 120, 139, 0);
		cidade[4] = new CidadesNacionais("Rio de Janeiro",
				"Rio de Janeiro tem tr�s principais pontos tur�sticos, sendo eles:"
						+ " Cristo Redentor, P�o de a��car, Copacabana e mais 36 destinos.",
				5.80f, 95, 150, 130, 0);
		cidade[5] = new CidadesNacionais("Porto Alegre",
				"Porto Alegre tem tr�s principais pontos tur�sticos, sendo eles:"
						+ " Parque Farroupilha, Cidade Baixa, Rio Gua�ba e mais 21 destinos.",
				8.37f, 73, 110, 99, 0);

		Destinos destino[] = null;
		
		String a1 = "\n\n\n* * * * * * * * * * * * * * *";
		String a2 = "* * * * * 44 TURISMO! * * * * ";
		String a3 = "* * * * * * * * * * * * * * *";

		ArrayList<String> cabecalho = new ArrayList<>();
		ArrayList<CidadesNacionais> listacidade = new ArrayList<>();
		ArrayList<CidadesInternacionais> listacity = new ArrayList<>();

		cabecalho.add(a1);
		cabecalho.add(a2);
		cabecalho.add(a3);
		listacidade.add(cidade[1]);
		listacidade.add(cidade[2]);
		listacidade.add(cidade[3]);
		listacidade.add(cidade[4]);
		listacidade.add(cidade[5]);
		listacity.add(city[1]);
		listacity.add(city[2]);
		listacity.add(city[3]);
		listacity.add(city[4]);
		listacity.add(city[5]);
		

		for (String list : cabecalho)
			System.out.println(list);

		System.out.println("\n\n\nOl�, seja bem-vinde!");
		System.out.println("Qual � o seu nome?");
		nome = sc.next();
		
		do {
			System.out.println("\n*********NOSSOS DESTINOS**********");
			for (CidadesNacionais list : listacidade)
				System.out.println(list.getNome());
			for (CidadesInternacionais list : listacity)
				System.out.println(list.getNome());
			System.out.println("**********************************");
		System.out.println("\nOl�, " + nome + ", para prosseguirmos, selecione o destino desejado:");
		System.out.println("\n[1]: Internacional");
		System.out.println("[2]: Nacional");
		System.out.println("[0]: Finalizar aplica��o");
		op = sc.nextInt();

		switch (op) {

		case 0:
			System.out.println("\nObrigado por utilizar o nosso sistema!!");
			System.out.println("\nAplica��o finalizada");
			System.exit(0);
			break;

		case 1:
			destino = city;
			break;

		case 2:
			destino = cidade;
			break;	

		default:
			System.out.println("Op��o Inv�lida");

		}
		}while(op < 0 && op > 2);

		System.out.println("[1]: " + destino[1].getNome());
		System.out.println("[2]: " + destino[2].getNome());
		System.out.println("[3]: " + destino[3].getNome());
		System.out.println("[4]: " + destino[4].getNome());
		System.out.println("[5]: " + destino[5].getNome());
		System.out.println("[0]: Finalizar aplica��o");
		x = sc.nextInt();

		if (x == 0) {
			System.out.println("\nObrigado por utilizar o nosso sistema!!");
			System.out.println("\nAplica��o finalizada");
			System.exit(0);
		}
		if (x < 0 || x > 5) {
			System.out.println("Op��o Inv�lida");
		}

		if (destino == city) {
			System.out.println("[1]: Temperatura");
		}
		if (destino == city || destino[x].getNome() == "Manaus") {
			System.out.println("[2]: Fuso Hor�rio");
		}
		System.out.println("[3]: Custos");
		System.out.println("[4]: Pontos tur�sticos");
		System.out.println("[5]: Todas as op��es");
		System.out.println("[6]: Voltar ao in�cio");
		System.out.println("[0]: Finalizar aplica��o");
		op2 = sc.nextInt();

		if (destino == city) {
			switch (op2) {

			case 0:
				System.out.println("\nObrigado por utilizar o nosso sistema!!");
				System.out.println("\nAplica��o finalizada");
				System.exit(0);
				break;

			case 1:
				System.out.println("\nSelecione o per�odo desejado");
				System.out.println("\n[1] � Janeiro a Mar�o");
				System.out.println("[2] � Abril a Junho");
				System.out.println("[3] � Julho a Setembro");
				System.out.println("[4] � Outubro a Novembro");
				op = sc.nextInt();

				destino[x].setPeriodo(op);
				destino[x].imprimirClima();
				break;

			case 2:
				destino[x].imprimirFuso();
				break;

			case 3:
				destino[x].imprimirCustos();
				break;

			case 4:
				destino[x].pontosTuristicos();
				break;

			case 5:
				System.out.println("\nSelecione o per�odo desejado");
				System.out.println("\n[1] � Janeiro a Mar�o");
				System.out.println("[2] � Abril a Junho");
				System.out.println("[3] � Julho a Setembro");
				System.out.println("[4] � Outubro a Novembro");
				op = sc.nextInt();

				destino[x].setPeriodo(op);
				destino[x].imprimirCustos();
				destino[x].imprimirFuso();
				destino[x].imprimirClima();
				destino[x].pontosTuristicos();
				break;

			case 6:
				main(args);
				break;

			default:
				System.out.println("Op��o Inv�lida");
			}
		} else {
			switch (op2) {

			case 0:
				System.out.println("\nObrigado por utilizar o nosso sistema!!");
				System.out.println("\nAplica��o finalizada");
				System.exit(0);
				break;

			case 2:
				if (destino[x].getNome() == "Manaus") {
					destino[x].imprimirFuso();
				}
				System.out.println("Op��o inv�lida!");
				break;

			case 3:
				destino[x].imprimirCustos();
				break;

			case 4:
				destino[x].pontosTuristicos();
				break;

			case 5:

				destino[x].imprimirCustos();
				if (destino[x].getNome() == "Manaus") {
					destino[x].imprimirFuso();
				}
				destino[x].pontosTuristicos();
				break;

			case 6:
				main(args);
				break;

			default:
				System.out.println("Op��o Inv�lida");
				break;
			}
		}

	}
}
