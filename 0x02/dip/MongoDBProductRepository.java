public class MongoDBProductRepository implements IDbProduct{
    @Override
    public String getProductById(String productID) {
        return DB.MONGODB.name();
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
