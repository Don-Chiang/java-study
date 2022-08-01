package com.javaee.basis.Collection;

public class ListMain {
    private final char value[];

    public ListMain(char[] value) {
        this.value = value;
    }

    public static void main(String[] args) {
       int MAXIMUM_CAPACITY = 1 << 5;
        System.out.println(MAXIMUM_CAPACITY);
        int n = 8;
        System.out.println(n >>> 1);
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        int i = (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;

        System.out.println("============================");
        int a = 16;
        int b = 29;
        int c = a | b;
        System.out.println(c);

        Integer e =3;
        //e.compareTo()
        //System.out.println(n |= n >>> 16);
    }
}
