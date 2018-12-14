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
public class FoodItem extends Item{

    private int servingSize;
    private int caloriesPerServing;
    private String productName;
    /**
     * @param b is the barcode
     * @param c is the count of the item
     * @param m is the manufacturer
     * @param ss is the serving size
     * @param cps is the calories per serving
     * @param n is the name of the product
     */
    public FoodItem(int b, int c, String m, int ss, int cps, String n) {
        super(b, c, m);
        servingSize = ss;
        caloriesPerServing = cps;
        productName = n;
    }
    
    public void setServingSize(int ss){servingSize = ss;}
    public void setCaloriesPerServing(int cps){caloriesPerServing = cps;}
    public void setProdcutName(String n){productName = n;}
    
    public int getServingSize(){return servingSize;}
    public int getCaloriesPerServing(){return caloriesPerServing;}

    /**
     * 
     * @return the String of the object
     */
    public String toString()
    {
        return super.toString() + "\nServing Size: " + servingSize +
                "\nCalories Per Serving: " + caloriesPerServing +
                "\nProduct Name: " + productName;
    }
    
    
    @Override
    protected String getProductName() {
        return productName;
    }

    @Override
    protected double getPrice() {
        return 5.00;
    }
    
}
