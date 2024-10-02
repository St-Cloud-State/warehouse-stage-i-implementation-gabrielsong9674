import java.util.*;
import java.text.*;
import java.io.*;
public class ProductTester {
  
  public static void main(String[] s) {
     Product p1 = new Product("product 1", 4, "1", 20 );
     Product p2 = new Product("product 2", 2, "2", 10);
     Catalog catalog = Catalog.instance();
     catalog.insertProduct(p1);
     catalog.insertProduct(p2);
     System.out.println(p1.getName());
     System.out.println(p1.getStock());
     System.out.println(p1.getPrice());
     System.out.println(p1.getID()); 

     Iterator<Product> products = catalog.getProducts();
     System.out.println("List of Products");
     while(products.hasNext()){
         System.out.println(products.next());
     }
  }
}
