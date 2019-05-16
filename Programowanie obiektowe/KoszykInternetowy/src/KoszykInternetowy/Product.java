package KoszykInternetowy;

import java.util.Objects;

public class Product {
    String code;
    String name;
    double price;
    double discountPrice;
   
   
    Product(){};
   
    Product(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }
   
    Product(String code, String name,double price,double discountPrice){
        this(code,name,price);
        this.discountPrice = discountPrice;
       
    }
   
    public String toString() {
        return name + "\n Cena: " + discountPrice + " Kod: " + code +"\n";
        }
       
   
   
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public double getDiscountPrice() {
        return discountPrice;
    }
 
    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}
    
    
    
}