package Assignment2;

/**
 * Created by LAUW on 2/28/17.
 */
public class ItemSold {

    //list the terms below
    protected int invoice;
    protected String description;
    protected int price;

    //create a set-method that would9 set the invoiceNumber, item description, and the price.
    public void setInvoice (int invoiceNumber){
        this.invoice = invoiceNumber;
    }
    public void setDescription(String itemDescription){
        this.description = itemDescription;
    }
    public void setPrice(int itemPrice){
        this.price = itemPrice;
    }

    //create a get-method that would get the invoiceNumber, item description, and the price.
    public int getInvoice(){
        return this.invoice;
    }
    public String getDescription(){
        return this.description;
    }
    public int getPrice(){
        return this.price;
    }

}
