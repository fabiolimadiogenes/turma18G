package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEstudantil;

public class Teste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        ContaEmpresa CE = new ContaEmpresa(369,"455.585.741-99");
        ContaEstudantil CEE = new ContaEstudantil (369,"555.555.555-55",true,5000);
       
        double valor;
        char opcao;
        int escolhaConta;
        double movimento [] = new double [10];
        char sair;
        int contador =0;
        int numero=0;
        int ativo;
        String cpf;
    
        
        System.out.print("\n|             Seja bem vindo ao Banco Horizonte.                |");
        System.out.print("\n| Venha exergar o Horizonte de uma forma diferente com a gente! |");
        System.out.print("\n|                                                               |");
        System.out.print("\n|                 1 -> [ Conta Poupança   ]                     |");
        System.out.print("\n|                 2 -> [ Conta Corrente   ]                     |");
        System.out.print("\n|                 3 -> [ Conta Especial   ]                     |");
        System.out.print("\n|                 4 -> [ Conta Empresa    ]                     |");
        System.out.print("\n|                 5 -> [ Conta Estudantil ]                     |");
        System.out.print("\n|                 6 -> [ Sair             ]                     |");
        System.out.print("\n                   [ Digite a opção desejada ] -> ");
        
        escolhaConta = leia.nextInt();
        System.out.println();
        
        //contaPoupanca
        /*if (escolhaConta == 1) 
        {
        	do {
    			for (int transacao = 0; transacao < 10; transacao++) {
    				System.out.println("Conta Poupança");
    				System.out.println("Digite a opção de transação");
    				System.out.println("1 - Crédito ");
    				System.out.println("2 - Débito ");
    				System.out.println("3 - Saldo ");
    				System.out.println("4 - Aniversário ");
    				System.out.println("0 - Sair");
    				escolha = leia.nextInt();

    				if (escolha == 1) {
    					System.out.println("Digite o valor a se"
    							+ "r creditado");
    					credito = leia.nextDouble();
    					saldo[contaDigitada] = saldo[contaDigitada] + credito;
    					mostrarSaldo(saldo[contaDigitada]);
    				} else if (escolha == 2) {
    					if (saldo[contaDigitada] <= 0.0) {
    						System.out.println("Não é possível realizar o saque!");
    					} else if (saldo[contaDigitada] >= debito) {
    						System.out.println("Digite o valor a ser debitado");
    						debito = leia.nextDouble();
    						saldo[contaDigitada] -= debito;
    						if (saldo[contaDigitada] < 0) {
    							System.out.println(
    									"Não é possível realizar este débito. O saldo final não pode ser negativo");
    							saldo[contaDigitada] = saldo[contaDigitada] + debito;
    						}
    						mostrarSaldo(saldo[contaDigitada]);
    					}				
    				} else if (escolha == 3) {
    					System.out.println("Saldo: R$ " + saldo[contaDigitada]);
    				}else if(escolha == 4) {
    					System.out.println("Digite o aniversário da conta");
    					aniversarioDigitado = leia.nextInt();
    					if(aniversarioDigitado == aniversario[contaDigitada]) {
    						saldo[contaDigitada] = saldo[contaDigitada] +(saldo[contaDigitada] * 0.05);
    						System.out.print("\nO sistema atribuiu data de aniversário dia "+ aniversario[contaDigitada]+"\n\n");
    						System.out.println("Saldo atualizado\n");
    						System.out.print("Novo saldo ");
    						mostrarSaldo(saldo[contaDigitada]);
    						System.out.println();
    					}else if(aniversarioDigitado != aniversario[contaDigitada]) {
    						System.out.println("Não houve reajuste de 0.5% no saldo");
    						System.out.print("\nO sistema atribuiu data de aniversário dia "+ aniversario[contaDigitada]+"\n\n");
    					}	
    				} else if (escolha == 0) {
    					System.out.println("Encerrando acesso a conta");
    					return;
    				}

    			}
    			System.out
    					.println("Você realizou todas as possíveis transações em Conta Poupança, deseja continuar? (S/N)");
    			sair = leia.next().toUpperCase().charAt(0);
    		} while (sair == 'S');
    	}*/
        
        
        //contaCorrente
        if (escolhaConta == 2) 
        {
        	
        }
        
        //contaEspecial
        if (escolhaConta == 3) 
        {
        	
        }
                        
        //contaEmpresa
        if(escolhaConta == 4)
        {
        	
        	do
        	{		
        		if(contador == movimento.length)
        		{
        			System.out.println("                    [!!!!!ATENÇÃO!!!!!]                    ");
        			System.out.println("[Você utilizou todas as 10 transações disponiveis para sua conta]");
        			break;
        		}
        		
        		CE.ofereceEmprestimo();
        		
        		System.out.println();
        		System.out.println("                    [TRANSAÇÕES]                    ");
        		System.out.println("Você gostaria de fazer uma transação de débito ou de crédito?");
        		System.out.print("\n[D-> DÉBITO] [C-> CRÉDITO] -> ");
				opcao = leia.next().toUpperCase().charAt(0);
				
				if(opcao == 'C') 
				{
					CE.credito();
					
				}
					else if(opcao == 'D') 
					{
						CE.debito();
					}
				
					
				
    			System.out.println();
			    System.out.print("Deseja continuar fazendo as transações? [S-> SIM] [N-> NÃO] -> "); 
			    sair = leia.next().toUpperCase().charAt(0);
				contador++;  
					
        	}while(sair == 'S');  
        	
        	
        	CE.ofereceEmprestimo();
        	
        }
        
        //contaEstudantil
        if (escolhaConta == 5) 
        {
        	System.out.println("           BEM VINDO!!         ");
    		System.out.println("  Vamos abrir sua conta estudantil?  ");
    		System.out.println();
    		System.out.println("Qual o numero da sua conta? ");
    		numero = leia.nextInt();
    		System.out.println("Qual o seu CPF? ");
    		cpf = leia.next();
    		System.out.println("Sua conta é ativa? (Digite 1) Sua conta é inativa? (Digite 2)");
    		ativo = leia.nextInt();	
    		if (ativo == 1)
    			{
    				System.out.println("Conta ativa");
    			}
    		else if (ativo == 2) 
    		{
    			System.out.println("Conta inativa");
    		}
    		else 
    		{
    			System.out.println("Você não respondeu corretamente...");
    		}
    		
			
        	do 
        	{
        		
        		System.out.println("Seu saldo é: "+ CEE.getEmprestimo());
        		System.out.println("Seu limite da transação é: "+ CEE.getLimiteEstudantil());
		    	System.out.print("\nDigite o valor da transação: ");
		    	valor = leia.nextDouble();
		    	if (valor > CEE.getLimiteEstudantil())
		    	{
		    		System.out.println("Ultrapassou o limite da transação...");
		    		break;
		    	}
				System.out.println();
				System.out.print("[D-> DÉBITO] [C-> CRÉDITO] -> ");
				opcao = leia.next().toUpperCase().charAt(0);
				
				
					if(opcao == 'D')
					{
						CEE.debito(valor);
						valor = CEE.getEmprestimoDebito();
						System.out.printf("Débito: %.2f",CEE.getEmprestimoDebito(),movimento[contador]);
						
					}
					else if(opcao == 'C')
					{
						CEE.credito(valor);
						valor = CEE.getEmprestimoCredito();
						System.out.printf("Crédito: %.2f",CEE.getEmprestimoCredito(),movimento[contador]);
					}else 
					{
						System.out.println("\nOpção invalida!");
						break;
					}
					
					contador++;
					System.out.println();
					System.out.println();
					
				if (CEE.getLimiteEstudantil() != 0) {
					
				    System.out.print("Deseja continuar fazendo as transações? [S-> SIM] [N-> NÃO] -> "); 
				    sair = leia.next().toUpperCase().charAt(0);
				}
				else 
				{
					break;
				}
        	}while(sair == 'S');
        	
        	System.out.println("------------------------------------------------------------");
        	System.out.println();
        		System.out.println("Numero da sua conta: "+numero);
        		System.out.println("Seu CPF: "+cpf);
        		System.out.println(ativo);
        		if (ativo == 1)
        		{
        			System.out.println("Conta ativa");
        		}
        		else if (ativo == 2) 
        		{
        			System.out.println("Conta inativa");
        		}
        		System.out.println("Seu saldo: R$"+ CEE.getEmprestimo());
        		System.out.println("Seu limite é: "+CEE.getLimiteEstudantil());
        		System.out.println("O emprestimo foi de: R$"+CEE.getEmprestimo());
        		System.out.println("Debito: "+CEE.getEmprestimoDebito());
        		System.out.println("Credito: "+CEE.getEmprestimoCredito());
        }
        
        //sair
        if (escolhaConta == 6) 
        {
        	System.out.println("Obrigado por utilizar os nossos sistemas, o banco Horizonte agradece a preferência.");
        }
                 
    }

}