package Store;

public class DuplicateItemException extends  Exception {
    @Override
    public String getMessage() {
        return "The product with current ID is already exist!";
    }
}
