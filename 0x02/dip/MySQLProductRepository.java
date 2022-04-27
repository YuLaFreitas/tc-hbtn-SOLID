public class MySQLProductRepository implements IDbProduct {

    public String getProductById(String productID){
        return DB.MYSQL.name();
    }

    @Override
    public String getAll() {
        return null;
    }

    @Override
    public String update(Product product) {
        return null;
    }

    @Override
    public String delete(String productID) {
        return null;
    }


}
