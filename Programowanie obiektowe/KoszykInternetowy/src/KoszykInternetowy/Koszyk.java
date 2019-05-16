package KoszykInternetowy;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Koszyk {
   
    public Koszyk() {};
 
    static List<Product> shopping = new ArrayList<Product>();
   
    static ComparatorAsc cA = new ComparatorAsc();
    static ComparatorDesc cD = new ComparatorDesc();
    static ComparatorNameAs cNA = new ComparatorNameAs();
    static ComparatorNameDesc cND = new ComparatorNameDesc();
   
   
    public static void main(String[] args) {
       
       
        Product item = new Product("2312DC","Myszka",69.99,64.99);
        Product item2 = new Product("2743IG","Klawiatura",84.99);
        Product item3 = new Product("4234VD","Sluchawki",65.99,60.99);
        Product item4 = new Product("7253LD","Monitor",120.99,112.99);
        Product item5 = new Product("5147PO","Glosniki",90.99,85.49);
        Koszyk basket = new Koszyk();
       
        Koszyk.shopping.add(item);
        Koszyk.shopping.add(item2);
        Koszyk.shopping.add(item3);
        Koszyk.shopping.add(item4);
        Koszyk.shopping.add(item5);
               
        discount(item);
       
       
        Collections.sort(Koszyk.shopping, cA);
        //Collections.sort(Koszyk.shopping, cD);
        //Collections.sort(Koszyk.shopping, ComparatorNameAs.nameAs);
        //Collections.sort(Koszyk.shopping, ComparatorNameDesc.nameDesc);
        
        System.out.println("Suma = " + basket.sum());
        System.out.println(basket);

        Koszyk.shopping.remove(item5);
        Koszyk.shopping.remove(item3);
        Koszyk.shopping.remove(item4);
        
        System.out.println("Suma = " + basket.sum());
        System.out.println(basket);
       
    }
     
    
    public static void discount(Product p1) {
    	Product kupon = new Product("6819OP","Kupon rabatowy",0);
    	shopping.add(kupon);
    	p1.setDiscountPrice(p1.getDiscountPrice()*0.7);
    	p1.setDiscountPrice(p1.getDiscountPrice()*100);
    	p1.setDiscountPrice(Math.round(p1.getDiscountPrice()));
    	p1.setDiscountPrice(p1.getDiscountPrice()/100);
    }
   
    public String toString() {
        String basket = "Zawartosc koszyka:\n";
        for(int i=0; i<shopping.size(); i++) {
            basket += shopping.get(i);
        }
        return basket;
    }
 
    public boolean numOfItemsWithoutCup() {
        if(shopping.size() == 3)
            return true;
        else return false;
    }
   
    public boolean isMore(double basket, double money) {
        if(basket > money) return true;
        else return false;
    }
   
    public double countSum() {
        double sum = 0;
        for(int i=0; i<shopping.size(); i++) {
            sum += shopping.get(i).getDiscountPrice();
        }
        return sum;
    }
   
    public double sum() {
       
        double sum = countSum();
        Product kubek = new Product("5194KB","Kubek - gratis",0.00,0.00);

       
        if(isMore(sum,300)) {
            System.out.println("Zrobiles zakupy za 300+ zloty. Otrzymujesz rabat 5%." );
            sum=sum*0.95;
        }
       
        if((isMore(sum,200)) && (!(Koszyk.shopping.contains(kubek)))) {
        	shopping.add(kubek);
        }
        
        if(!(isMore(sum,200)) && (Koszyk.shopping.contains(kubek))) {
        	shopping.remove(kubek);
        }
       
        double sum2 = countSum();
       
        if(sum2<sum) sum=sum2;
       
        sum *= 100;
        sum = Math.round(sum);
        return sum/100;
       
    }

    public static void searchItemLow() {
        Collections.sort(Koszyk.shopping, cA);
        System.out.println(Koszyk.shopping.get(0));
    }
    
    public static void searchItemsLow(int n) {
    	Collections.sort(Koszyk.shopping, cA);
    	for(int i=0; i<n; i++)
    	System.out.println(Koszyk.shopping.get(i));
    }
    
    public static void searchItemHigh() {
    	Collections.sort(Koszyk.shopping, cD);
    	System.out.println(Koszyk.shopping.get(0));
    }
    
    public static void searchItemsHigh(int n) {
    	Collections.sort(Koszyk.shopping, cD);
    	for(int i=0; i<n; i++)
    	System.out.println(Koszyk.shopping.get(i));
    }
}