package Store;

import java.util.Comparator;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        try {
            store.addProduct(new Product(1, 318, "mouse"));
            store.addProduct(new Product(2, 799, "monitor"));
            store.addProduct(new Product(3, 564, "laptop"));
            store.addProduct(new Product(4, 745, "table"));
            store.addProduct(new Product(5, 649, "tv"));
            store.addProduct(new Product(3, 564, "laptop"));
        } catch (DuplicateItemException e) {
            e.printStackTrace();
        }

        store.getProductList().sort((Comparator.comparingInt(o -> o.getPrice())));
        out.println(store.getProductList().toString());

        store.removeProduct(5);
        out.println(store.getProductList().toString());

        store.setProduct(2, new Product(6, 167, "keyboard"));
        out.println(store.getProductList().toString());
    }
}