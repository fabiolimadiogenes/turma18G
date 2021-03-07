package CLASSES;


public class ContaPoupanca extends Conta{

    private int dataAniversarioConta;



    //Contrutor
    public ContaPoupanca(int numeroConta, String cpf, int dataAniversario) {
        super(numeroConta, cpf);
        this.dataAniversarioConta = dataAniversario;
    }


    //Get Set - encapsulamento
    public int getdataAniversarioConta() {
        return dataAniversarioConta;
    }


    public void correcaoPoupanca(int dataAtual) {

        if (dataAtual == this.dataAniversarioConta) {
            super.credito(super.getSaldo()*0.005);
            System.out.println("Houve correção no valor da conta");
        }else {
            System.out.println("Não houve correção no valor da conta");
        }
    }


}
