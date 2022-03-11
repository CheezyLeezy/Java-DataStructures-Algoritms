/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishlist;



/**
 *
 * @author leeca
 */
public class Clothing extends Gift{
    String type;
    String size;
    String color;
    
    public Clothing(int number, String description, int price, String url,String type, String size, String color) {
        super(number, description, price, url);
        this.type=type;
        this.size=size;
        this.color=color; //constructor then sets and gets
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
