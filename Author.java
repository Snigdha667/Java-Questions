//Question 2: Create a Book with the following information.....
public class Author {
    String auth;
    Author(){
        auth = "New";
    }
}
class Book{
        String name;
        double price;
        int qtyInStock;
        Author obj = new Author();
        Book( int q, double p, String n ){
            qtyInStock = q;
            price = p;
            name = n;
        }

    public Author getObj() {
        System.out.println(obj.auth);
        return obj;
        }

    public int getQtyInStock() {
            qtyInStock = 5;
        return qtyInStock;
    }


    public double getPrice() {
            price = 45.900;
        return price;
    }


    public String getName() {
            name = "Gaga";
        return name;
    }

    public static void main(String[] args) {
        Book obj1 = new Book(8,78.90,"Gigi");
        System.out.println(obj1.price);
        System.out.println(obj1.qtyInStock);
        System.out.println(obj1.name);
        System.out.println(".............................................");
        System.out.println(obj1.getObj());
        System.out.println(obj1.getName());
        System.out.println(obj1.getPrice());
        System.out.println(obj1.getQtyInStock());

    }
}

