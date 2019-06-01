package KoszykInternetowy;
 
import java.util.Comparator;
 
public class ComparatorNameAs {
     public static Comparator<Product> nameAs = new Comparator<Product>() {
            public int compare(Product item, Product item2) {
                return item.name.compareTo(item2.name);
            }
        };
}