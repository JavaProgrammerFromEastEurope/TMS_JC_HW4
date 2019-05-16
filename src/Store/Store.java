package Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {

    private List<Product> productList;

    public Store(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Store() {
        productList = new ArrayList<Product>();
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    void addProduct(Product product) throws DuplicateItemException {
        if (productList.contains(product)) {
            throw new DuplicateItemException();
        } else {
            productList.add(product);
        }
    }

    void setProduct(int id, Product setProduct) {
        int i = 0;
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.set(i, setProduct);
                break;
            }
            i++;
        }
    }

    void removeProduct(int id) {
        productList.stream().filter(product -> product.getId() == id).
                findFirst().ifPresent(product -> productList.remove(product));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(productList, store.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }
}