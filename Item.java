/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author 01675894
 */
public abstract class Item {
    private int barcode;
    public static int counter = 0;
    protected String Manufacturer;
    
    /**
     * 
     * @param b is the barcode
     * @param c is the count of the item
     * @param m is the manufacturer
     */
    public Item(int b, int c, String m){
        barcode = b;
        counter += c;
        Manufacturer = m;
    }
    /**
     * @param c is the amount of items bought
    */
    public void buy(int c){
        counter -= c;
    }
    /**
     * 
     * @param c is the amount of items sold
     */
    public void sell(int c){
        counter += c;
    }
    
    //all getters
    final public int getBarcode(){ return barcode;}
    final public int getItemCount(){return counter;}
    final public String getManufacturer(){return Manufacturer;}
    
    //all setters
    final public void setBarcode(int b){barcode = b;}
    final public void setItemCount(int c){counter = c;}
    final public void seteManufacturer(String m){Manufacturer = m;}
    
    /**
     * 
     * @return the String of the object
     */
    public String toString()
    {
        return "Barcode: " + barcode + "\nManufacturer: " + Manufacturer + "\nNumber of Items: " + counter;
    }
    
    
    protected abstract String getProductName();
    protected abstract double getPrice();
            
    
    
    
}
