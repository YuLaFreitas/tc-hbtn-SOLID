public class Payment extends DbProductFactory{
    public void pay(String productID){
        
        MySQLProductRepository dbProduct = new MySQLProductRepository();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}