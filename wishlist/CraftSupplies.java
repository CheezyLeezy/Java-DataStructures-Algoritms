/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishlist;

import java.io.Serializable;

/**
 *
 * @author leeca
 */
public class CraftSupplies extends Gift{
    
    String csName;
    String csPublisher;
   
    public CraftSupplies(int number, String description, int price, String url, String csName, String csPublisher) {
        super(number, description, price, url);
        this.csName=csName;
        this.csPublisher=csPublisher; //constructor then sets and gets
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getCsPublisher() {
        return csPublisher;
    }

    public void setCsPublisher(String csPublisher) {
        this.csPublisher = csPublisher;
    }
    
}
