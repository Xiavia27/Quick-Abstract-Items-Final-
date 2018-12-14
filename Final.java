/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author 01675894
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //1
       ArrayList<Item> items = new ArrayList<>();
       //2
       FoodItem fi1 = new FoodItem(12345, 500, "Nestle", 700, 250, "Chocolate");
       FoodItem fi2 = new FoodItem(12346, 500, "Quacker", 550, 110, "Oatmeal");
       
       ClothingItem ci1 = new ClothingItem(12347, 500, "GAP", "Sweater");
       ClothingItem ci2 = new ClothingItem(12348, 500, "Nike", "Shoe");
       
       items.add(fi1);
       items.add(fi2);
       items.add(ci1);
       items.add(ci2);
       
       //3
       for(int i = 0; i < items.size(); i++)
       {
           if(items.get(i) instanceof FoodItem)
               items.get(i).buy(250);
       }
       //4
       for(Item a : items)
       {
           if(a instanceof ClothingItem)
               a.sell(100);
       }
       //5
       for(Item a : items)
       {
           if(a instanceof FoodItem)
           {
               System.out.println("Food:\n" + a.toString());
           }
           if(a instanceof ClothingItem)
               System.out.println("Clothing:\n" + a.toString());
       }
       //6
       String outputFile = "Not Valid File";
       Scanner in = new Scanner(System.in);
       
       while(!outputFile.substring(outputFile.length() - 4, outputFile.length()).equals(".txt"))
       {
           System.out.println("Please enter valid file output file area.");
           outputFile = in.nextLine();
       }
       
       //7 & 8
       PrintWriter out = new PrintWriter(new File(outputFile));
       out.println(items.toString());
       out.close();
       
       //9
       int sum = 0;
       for(Item a : items)
       {
           sum += a.getPrice() * a.getItemCount();
       }
       
       System.out.println("\n\nSum: " + sum);
    }
    
}
