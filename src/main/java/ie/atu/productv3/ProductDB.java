package ie.atu.productv3;

import ie.atu.productv3.Book;
import ie.atu.productv3.Software;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data
    public static Product getProduct(String productCode) {

    Product myProduct=null;

    Software mySoftware;
            if (productCode.equalsIgnoreCase("studios")) {
                mySoftware=new Software();
        mySoftware.setCode(productCode);
        mySoftware.setDescription("Visual Studios");
        mySoftware.setPrice(57.50);
        mySoftware.setVersion("Microsoft 1.1");
                myProduct=mySoftware;
    } else if (productCode.equalsIgnoreCase("eclipse")) {
                mySoftware=new Software();
        mySoftware.setCode(productCode);
        mySoftware.setDescription("Build Java apps");
        mySoftware.setPrice(57.50);
        mySoftware.setVersion("Eclipse Neon");
                myProduct=mySoftware;
    } else if (productCode.equalsIgnoreCase("oracle")) {
                mySoftware=new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Latest MySQL");
                mySoftware.setPrice(54.50);
                mySoftware.setVersion("Oracle 3.0");
                myProduct=mySoftware;
            }

        Book myBook;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct=myBook;
        }
        return myProduct;

    //We need all the book and software objects, but what kind of object do we return?
    //}
    }
}

