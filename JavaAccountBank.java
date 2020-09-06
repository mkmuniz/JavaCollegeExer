//Programa simulando uma conta corrente feito em Java por Mikael Muniz Ribeiro
import java.util.Scanner;

public class ContaCorrente {
	//Método para sacar dinheiro
	static void sacar(float saldoTotal) {
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Quantos R$ você deseja sacar? \n");
		int valorSacado = input.nextInt();
		if(valorSacado > saldoTotal)
			System.out.print("Saldo insuficiente! \n");
		else {
			saldoTotal = (saldoTotal - valorSacado); 
			System.out.printf("O valor retirado foi de R$ %d \n", valorSacado);
			System.out.printf("O valor atual é de R$ %.2f \n", saldoTotal);
		}
	}
	//Método para depositar
	static void depositar(float saldoTotal) {
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Quantos R$ você deseja depositar em sua conta? \n");
		float valorDeposito = input.nextFloat();
		saldoTotal = (valorDeposito + saldoTotal);
		System.out.printf("O seu saldo atual é de R$ %.2f \n", saldoTotal);
	}
	//Método para verificar o saldo atual
	static void verificar(float saldoTotal) {
		System.out.printf("Seu saldo atual é de R$ %.2f \n", saldoTotal);
	}
	//Método para verificar o status da conta
	static void especial(float saldoTotal) {
		if(saldoTotal >= 1000)
			System.out.print("A sua conta tem o status de 'Especial', parabéns! \n");
		else {
			System.out.print("Sua conta possui o status 'Normal'. Para ter uma conta 'Especial' é preciso ter o valor acima de R$ 1000. \n");
		}
	}
	public static void main(String[] arg) {
		float saldoTotal = 1000;
		int opcaoEscolha;
		
		Scanner input;
		input = new Scanner(System.in);
		
		do {
			System.out.println("Olá! O que você deseja fazer? "
					+ "\n 1 - Realizar o saque "
					+ "\n 2 - Realizar depósito "
					+ "\n 3 - Consultar o saldo "
					+ "\n 4 - Verificar o status da conta"
					+ "\n 5 - Sair \n");
			opcaoEscolha = input.nextInt();
			switch(opcaoEscolha){
			case 1:
				sacar(saldoTotal);
				break;
			case 2:
				depositar(saldoTotal);
				break;
			case 3:
				verificar(saldoTotal);
				break;
			case 4:
				especial(saldoTotal);
				break;
			case 5:
				System.out.println("Até mais!");
				break;
			}
		} while(opcaoEscolha != 5);
	}
}
