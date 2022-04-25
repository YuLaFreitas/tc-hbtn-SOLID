public class DebitCard extends BankCard {

    @Override
    public void validate(){
        System.out.println("Verificando Saldo!");
        System.out.println("Saldo disponível!");
    }


}
