package com.xemss.coffeeshop;

import java.util.ArrayList;

/**
 * Created by xemss on 04.10.2017.
 */

public class Drinks {
    private String desc;
    private String name;

    public static final Drinks[] drinks = {
    	new Drinks("Latte", "A coffee drink made with espresso and steamed milk."),
    	new Drinks("Latte", "A coffee drink made with espresso and steamed milk."),
    	new Drinks("Latte", "A coffee drink made with espresso and steamed milk.")
    };

    public Drinks(String name, String desc) {
    	// name = name;
    	this.name = name;
    	// desc = desc;
    	this.desc = desc;
    } 


    public String getDesc() {
        return desc;
    }

    public CharSequence getName() {
        return name;
    }
}


