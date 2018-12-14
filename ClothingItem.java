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
public class ClothingItem extends Item{

    String productName;

    
    /**
     * 
     * @param b is the barcode
     * @param c is the count of the item
     * @param m is the manufacturer
     * @param n is the name of the product
     */
    public ClothingItem(int b, int c, String m, String n) {
        super(b, c, m);
        productName = n;
    }

    public void setProductName(String n){productName = n;}
    
    /**
     * 
     * @return returns the String of the object
     */
    public String toString()
    {
        return super.toString() + "\nProductName: " + productName;
    }
    
    
    @Override
    protected String getProductName() {
        return productName;
    }

    @Override
    protected double getPrice() {
        return 20.00;
    }
    
    
}
