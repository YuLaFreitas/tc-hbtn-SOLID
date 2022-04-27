public class Payment extends DbProductFactory{
    public void pay(String productID){

        MySQLProductRepository dbProduct = (MySQLProductRepository) create(DB.SQLSERVER);//new MySQLProductRepository();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}