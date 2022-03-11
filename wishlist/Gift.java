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
public class Gift implements Serializable{ //only gift has to be serializable as it is parent.
    int number;
    String description;
    int price;
    String url;

    public Gift(int number, String description, int price, String url) {
        this.number = number;
        this.description = description;
        this.price = price;
        this.url = url; //constructor then sets and gets
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString() //how it will appear in jList or when called
    {
        return "   ID: -  " + number + "    € - " + price + "    DESC: - " + description + "    URL: - " + url;
    }
}
