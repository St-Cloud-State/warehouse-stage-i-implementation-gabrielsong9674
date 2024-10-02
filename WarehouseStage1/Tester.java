import java.util.Iterator;

public class Tester {
    public static void main(String[] args) {
        // Test Client Class (Add Client)
        System.out.println("Test Client Class:");
        Client client1 = new Client("Benjamin Nelson", "100 Bower St", "123-456-7890");
        Client client2 = new Client("Rachel Mixon", "200 Bower St", "456-789-0123");
        Client client3 = new Client("Chris Low", "300 Bower St", "789-012-3456");

        System.out.println("Added client1: " + client1);
        System.out.println("Added client2: " + client2);
        System.out.println("Added client3: " + client3);

        // Test Product Class (Add Product)
        System.out.println("\nTest Product Class");
        Product product1 = new Product("Iphone", 20, "1", 999.99);
        Product product2 = new Product("Imac", 30, "2", 1999.99);
        Product product3 = new Product("Iwatch", 10, "3", 499.99);

        System.out.println("Added product1: " + product1);
        System.out.println("Added product2: " + product2);
        System.out.println("Added product3: " + product3);

        // Instance of ClientList and Catalog
        ClientList clientList = ClientList.instance();
        Catalog catalog = Catalog.instance();

        // Insert Clients to ClientList
        clientList.insertClient(client1);
        clientList.insertClient(client2);
        clientList.insertClient(client3);

        // Insert Products to Catalog
        catalog.insertProduct(product1);
        catalog.insertProduct(product2);
        catalog.insertProduct(product3);

        // Display all Clients
        System.out.println("\nList of Clients:");
        Iterator<Client> clients = clientList.getClients();
        while (clients.hasNext()) {
            Client client = clients.next();
            System.out.println(client);
        }

        // Display all Products
        System.out.println("\nList of Products:");
        Iterator<Product> products = catalog.getProducts();
        while (products.hasNext()) {
            Product product = products.next();
            System.out.println(product);
        }

        // Add Products to Clients Wishlist
        System.out.println("\nAdding products to Client1's Wishlist:");
        boolean addedToWishlist1 = client1.addProductToWishlist(product1, 1);
        boolean addedToWishlist2 = client1.addProductToWishlist(product3, 3);

        if (addedToWishlist1) {
            System.out.println(product1.getName() + " added to " + client1.getName() + "'s wishlist");
        }
        if (addedToWishlist2) {
            System.out.println(product2.getName() + " added to " + client1.getName() + "'s wishlist");
        }

        // Display Client's Wishlist
        System.out.println("\nDisplaying Client1's Wishlist:");
        client1.displayWishlist();
    }
}