public class Payment extends DbProductFactory{
    public void pay(String productID, DB type){
        
        IDbProduct dbProduct = DbProductFactory.create(type);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}