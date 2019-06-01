package KoszykInternetowy;
 
import java.util.Comparator;
 
public class ComparatorNameDesc {
    public static Comparator<Product> nameDesc = new Comparator<Product>() {
        public int compare(Product item, Product item2) {
            return item2.name.compareTo(item.name);
        }
    };
 
}