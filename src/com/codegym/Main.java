package com.codegym;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	AccessModifier accessModifier = new AccessModifier();
        System.out.println("radius: "+accessModifier.getRadius());
        System.out.println("color: "+accessModifier.getColor());
    }
}
