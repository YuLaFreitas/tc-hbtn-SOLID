public class CreditCard extends BankCard{
    @Override
    public void validate(){
        System.out.println("Verificando Limite!");
        System.out.println("Limite disponível!");
    }
}
