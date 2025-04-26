import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    char nome = 'G';
	    int idade = 15;
	    boolean cafedamanha = true;
	    
	    int valorLaranja = 8;
	    int valorUva = 16;
	    int UvaELaranja = valorLaranja += valorUva;
	    System.out.println(UvaELaranja);
	    
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.print("Digite o valor da Savero: ");
	   int Savero = entrada.nextInt();
	   
	   System.out.print("Digite o valor da Opala: ");
	   int Opala = entrada.nextInt();
	   
	   System.out.println("Resultado da soma = "+ (Opala + Savero));
	
	
	    float notaAlunos = 0.6f;
	    System.out.println("São Paulo foi campeão três vezes mundial!!");
		System.out.println("Hello World");
	}
}
