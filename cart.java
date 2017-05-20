/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bookclass;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author Susmit
 */
public class cart {
    public ArrayList cartItems=new ArrayList<>();
    public double totalamount;
    public void addItem(String bookid, String unitcost, String qty)
    {
        double cost=0.0;
        Bookclass book=new Bookclass();
        
  
   double iunitcost = Double.parseDouble(unitcost);
   int iqty = Integer.parseInt(qty);
   
    totalamount = iunitcost*iqty;
    book.setBOOKID(bookid);
    book.setPRICE(qty);
    book.setQTY(qty);
    cartItems.add(book);
    out.println("The total amount is to paid: "+totalamount);
   }
    }
    

