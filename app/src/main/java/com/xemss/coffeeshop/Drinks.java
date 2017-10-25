package com.xemss.coffeeshop;

import java.util.ArrayList;

/**
 * Created by xemss on 04.10.2017.
 *
 * // TODO: 15.10.2017 didn't show in listView drinks from Drinks
 * // TODO: 18.10.2017 solved! add method toString
 */

public class Drinks {
    // TODO: 15.10.2017 create var
    private String desc;
    private String name;
    private int image;

    // TODO: 15.10.2017 add image resources
    public static final Drinks[] drinks = {
    	new Drinks("Latte", "A coffee drink made with espresso and steamed milk.", R.drawable.latte),
    	new Drinks("Cappuccino", "A coffee drink made with espresso and steamed milk.", R.drawable.cappuccino),
//    	new Drinks("Latte", "A coffee drink made with espresso and steamed milk.")
    };

    // TODO: 10.10.2017 constr
    public Drinks(String name, String desc,  int image) {
    	// name = name;
    	this.name = name;
    	// desc = desc;
    	this.desc = desc;
    	this.image = image;
    }

    // TODO: 10.10.2017  create getters
    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    // TODO: 18.10.2017 add toString method to show data in listView
    public String toString() {
        return this.name;
    }
}


