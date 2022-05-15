package test;

import java.util.*;

public class TestC {

    public static void main(String[] args) {
        long a = 0, b = 0, c = 0;
        for (int i = 0; i < 100; i++)
            a += testAddHM();
        for (int i = 0; i < 100; i++)
            b += testAddLHM();
        for (int i = 0; i < 100; i++)
            c += testAddTM();
        System.out.printf("%-15s %-15s %-15s %-15s", "Operation", "HashSet", "LinkedHashSet", "TreeSet");
        System.out.println();
        System.out.printf("%-15s %-15s %-15s %-15s", "Put", a / 100, b / 100, c / 100);
        System.out.println();
        a = 0;
        b = 0;
        c = 0;

        for (int i = 0; i < 100; i++)
            a += testGetHM();
        for (int i = 0; i < 100; i++)
            b += testGetLHM();
        for (int i = 0; i < 100; i++)
            c += testGetTM();
        System.out.printf("%-15s %-15s %-15s %-15s", "Contains", a / 100, b / 100, c / 100);
        System.out.println();
        a = 0;
        b = 0;
        c = 0;

        for (int i = 0; i < 100; i++)
            a += testRemHM();
        for (int i = 0; i < 100; i++)
            b += testRemLHM();
        for (int i = 0; i < 100; i++)
            c += testRemTM();
        System.out.printf("%-15s %-15s %-15s %-15s", "Rem", a / 100, b / 100, c / 100);
        System.out.println();
    }

    public static long testAddHM(){
        HashMap<Integer, Integer> collect = new HashMap<>();
        for ( int i = 0; i < 10000; i++)
            collect.put(i, i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            collect.put(i, i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testAddLHM(){
        LinkedHashMap<Integer, Integer> collect = new LinkedHashMap<>();
        for ( int i = 0; i < 10000; i++)
            collect.put(i, i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            collect.put(i, i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testAddTM(){
        TreeMap<Integer, Integer> collect = new TreeMap<>();
        for ( int i = 0; i < 10000; i++)
            collect.put(i, i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            collect.put(i, i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetHM(){
        HashMap<Integer, Integer> collect = new HashMap<>();
        for ( int i = 0; i < 10000; i++)
            collect.put(i, i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            collect.get(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetLHM(){
        LinkedHashMap<Integer, Integer> collect = new LinkedHashMap<>();
        for ( int i = 0; i < 10000; i++)
            collect.put(i, i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            collect.get(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetTM() {
        TreeMap<Integer, Integer> collect = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            collect.put(i, i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.get(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemHM() {
        HashMap<Integer, Integer> collect = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            collect.put(i, i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemLHM() {
        LinkedHashMap<Integer, Integer> collect = new LinkedHashMap<>();
        for (int i = 0; i < 10000; i++) {
            collect.put(i, i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemTM() {
        TreeMap<Integer, Integer> collect = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            collect.put(i, i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
