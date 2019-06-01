package KoszykInternetowy;
 
import java.util.Comparator;
 
public class ComparatorDesc implements Comparator<Product> {
    public int compare(Product item,Product item2) {
        double priceItem = item.getPrice();
        double priceItem2 = item2.getPrice();
        return (int)(priceItem2 - priceItem);
    }
}