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
public class BoardGame extends Gift{
    
    String bgName;
    String bgPublisher;
    
    public BoardGame(int number, String description, int price, String url, String bgName, String bgPublisher) {
        super(number, description, price, url);
        this.bgName=bgName;
        this.bgPublisher=bgPublisher; //constructor then sets and gets
    }

    public String getBgName() {
        return bgName;
    }

    public void setBgName(String bgName) {
        this.bgName = bgName;
    }

    public String getBgPublisher() {
        return bgPublisher;
    }

    public void setBgPublisher(String bgPublisher) {
        this.bgPublisher = bgPublisher;
    }
    
    
    
}
