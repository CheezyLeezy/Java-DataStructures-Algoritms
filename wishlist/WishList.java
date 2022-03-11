/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishlist;

import java.io.*;
import java.util.*;

/**
 *
 * @author leeca
 */
public class WishList {

    private ArrayList<Gift> wishList; //declares instance
    private Scanner in;
    File file;

    private WishList() {
        wishList = new ArrayList<>(); //creates it
        in = new Scanner(System.in);
        file = new File("GiftWishList.ser"); //creation of file
    }

    private static WishList INSTANCE = new WishList(); //limiting access

    public static WishList getInstance() {
        return INSTANCE; //to be called upon
    }

    public void saveFile() throws FileNotFoundException, IOException {
        FileOutputStream outFile = new FileOutputStream(file);
        try (ObjectOutputStream output = new ObjectOutputStream(outFile)) {
            output.writeObject(wishList);
        }
    }

    public void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream(file);
        try (ObjectInputStream input = new ObjectInputStream(inFile)) {
            wishList = (ArrayList<Gift>) input.readObject();
        }
    }

    /* Large issue here - there would be a java.io.StreamCorruptedException
    consistently and not sure what was wrong, interpreted that there
    may be an issue with the fact things were already in the file and then i 
    deleted them, then the file could not be found once i fixed the first issue
    so i re factored and copied from one project to a new, made new file name
    and everything was ok. */
    
    public void addGift(Gift gift) {

        wishList.add(gift); //self explanatory

    }

    public void deleteGift(int index)
    {
        wishList.remove(index); 
    }
    
    public int searchGift(int id) { // id counts as identifier here - corresponds to number

        int index = -1; //starts here and searches until 0 or found

        for (int i = 0; i < wishList.size(); i++) {

            if (wishList.get(i).getNumber() == id) {
                index = i;
            }

        }

        return index;
    }

    public String findCheapest() {
        
        int min = 100000;
        String result = "";
        
        for (int i = 0; i < wishList.size(); i++) {

            if (wishList.get(i).getPrice() < min) {
                min = wishList.get(i).getPrice();
                result = wishList.get(i).toString();
            }
                //struggled here - needed to pre set min 
                //could not establish how to get placement.
                // other arrays are easier in terms of [0]
        }
        
        return result;
    }

    public ArrayList<Gift> getGift() { //helps in GUI class

        return wishList;

    }
}
