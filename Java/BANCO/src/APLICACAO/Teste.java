package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEmpresa;

public class Teste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Conta CE = new Conta(345);
       
        double valor;
        char opcao;
        int escolhaConta;
        double movimento [] = new double [2];
        char sair;
        int contador =0;
        
        
        System.out.print("\n|             Seja bem vindo ao Banco Horizonte.                |");
        System.out.print("\n| Venha exergar o Horizonte de uma forma diferente com a gente! |");
        System.out.print("\n|                                                               |");
        System.out.print("\n|                 1 -> [ Conta Poupan�a   ]                     |");
        System.out.print("\n|                 2 -> [ Conta Corrente   ]                     |");
        System.out.print("\n|                 3 -> [ Conta Especial   ]                     |");
        System.out.print("\n|                 4 -> [ Conta Empresa    ]                     |");
        System.out.print("\n|                 5 -> [ Conta Estudantil ]                     |");
        System.out.print("\n|                 6 -> [ Sair             ]                     |");
        System.out.print("\n                    [ Digite a op��o desejada ] -> ");
        
        escolhaConta = leia.nextInt();
        System.out.println();
        
        
        
         //contaEmpresa
         
        if(escolhaConta == 4)
        {
        	
        	do
        	{
			     			     
			    	System.out.println(); 
			    	System.out.print("\nDigite o valor da transa��o ");
			    	valor = leia.nextDouble();
					movimento[contador] = valor;
					System.out.println();
					System.out.print("[D-> D�BITO] [C-> CR�DITO] -> ");
					opcao = leia.next().toUpperCase().charAt(0);
					
					
						if(opcao == 'D')
						{
							CE.debito(valor);
							System.out.printf("\nD�bito: %.2f",movimento[contador]);
						}
						else if(opcao == 'C')
						{
							CE.credito(valor);
							System.out.printf("\nCr�dito: %.2f",movimento[contador]);
						}else 
						{
							System.out.println("\nOp��o invalida!");
							break;
						}
							
					
					contador++;
					System.out.println();
					System.out.println();
						if(contador == movimento.length)
						{
							System.out.println("Voc� atingiu o limite diario de transa��es.");
							System.out.println();
							System.out.println("Voc� gostaria de contratar um empr�stimo no valor de R$: 10,000");
							System.out.println();
							System.out.println("[S-> SIM] [N-> N�O]");
							opcao = leia.next().toUpperCase().charAt(0);
								if(opcao == 'S')
								{
									
								}
								else if(opcao == 'N')
								{
									CE.credito(valor);
									System.out.printf("\nCr�dito: %.2f",movimento[contador]);
								}else 
								{
									System.out.println("\nOp��o invalida!");
									break;
								}
								
								
								break;
						}
				    System.out.print("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] -> "); 
				    sair = leia.next().toUpperCase().charAt(0);
				    System.out.println(contador);
					
        	}while(sair != 'N' );     
        }
        
        //escolhaConta = leia.nextInt();

       /* System.out.println("Digite o valor:");
        valor = leia.nextDouble();
        System.out.println("Debito ou Credito? D/C:");
        opcao = leia.next().toUpperCase().charAt(0);
        if (opcao =='D')
        {
            conta3.debito(valor);
        }
        else if (opcao =='C') {

            conta3.credito(valor);
        } else
        {
            System.out.println("Op��o invalida!!!");
        }
        System.out.println("Saldo atual: "+conta3.getSaldo());
        */
        
       
    }

}