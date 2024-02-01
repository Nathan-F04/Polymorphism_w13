package ie.atu.productv4;

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


        TV myTV;
        if (productCode.equalsIgnoreCase("kdl43")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(57.50);
            myTV.setManufacture("SONY");
            myTV.setScreenSize("Screen size is 55' ");
            myProduct=myTV;
        } else if (productCode.equalsIgnoreCase("UE55")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SAMSUNG UE55CU7100 4K ULTRA SMART TV");
            myTV.setPrice(57.50);
            myTV.setManufacture("SAMSUNG");
            myTV.setScreenSize("Screen size is 52'");
            myProduct=myTV;
        } else if (productCode.equalsIgnoreCase("TLC")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("TLC 4k HRD PREMIUM 1300nits Motion clarity pro");
            myTV.setPrice(57.50);
            myTV.setManufacture("TLC");
            myTV.setScreenSize("Screen size is 50'");
            myProduct=myTV;
        }

        Music myMusic;
        if (productCode.equalsIgnoreCase("PINK")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Part of the Columbia group");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("So")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("So much for stardust");
            myMusic.setPrice(13.50);
            myMusic.setArtist("Fall out boy");
            myMusic.setLabel("Part of the PAX AM Record Label");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("Midnight")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Midnight Memories");
            myMusic.setPrice(12.35);
            myMusic.setArtist("One Direction");
            myMusic.setLabel("Part of the Syco records record label");
            myProduct=myMusic;
        }
        return myProduct;

    //We need all the book and software objects, but what kind of object do we return?
    //}
    }
}

