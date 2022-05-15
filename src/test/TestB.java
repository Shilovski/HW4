package test;

import java.util.*;

public class TestB {

    public static void main(String[] args) {
        long a = 0, b = 0, c = 0;
        for (int i = 0; i < 100; i++)
            a += testAddHS();
        for (int i = 0; i < 100; i++)
            b += testAddLHS();
        for (int i = 0; i < 100; i++)
            c += testAddTS();
        System.out.printf("%-15s %-15s %-15s %-15s", "Operation", "HashSet", "LinkedHashSet", "TreeSet");
        System.out.println();
        System.out.printf("%-15s %-15s %-15s %-15s", "Add", a / 100, b / 100, c / 100);
        System.out.println();
        a = 0;
        b = 0;
        c = 0;

        for (int i = 0; i < 100; i++)
            a += testGetHS();
        for (int i = 0; i < 100; i++)
            b += testGetLHS();
        for (int i = 0; i < 100; i++)
            c += testGetTS();
        System.out.printf("%-15s %-15s %-15s %-15s", "Contains", a / 100, b / 100, c / 100);
        System.out.println();
        a = 0;
        b = 0;
        c = 0;

        for (int i = 0; i < 100; i++)
            a += testRemHS();
        for (int i = 0; i < 100; i++)
            b += testRemLHS();
        for (int i = 0; i < 100; i++)
            c += testRemTS();
        System.out.printf("%-15s %-15s %-15s %-15s", "Rem", a / 100, b / 100, c / 100);
        System.out.println();
    }

    public static long testAddHS(){
        HashSet<Integer> collect = new HashSet<>();
        for ( int i = 0; i < 10000; i++)
            collect.add(i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            collect.add(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testAddLHS(){
        LinkedHashSet<Integer> collect = new LinkedHashSet<>();
        for ( int i = 0; i < 10000; i++)
            collect.add(i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            collect.add(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testAddTS(){
        TreeSet<Integer> collect = new TreeSet<>();
        for ( int i = 0; i < 10000; i++)
            collect.add(i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            collect.add(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetHS(){
        HashSet<Integer> collect = new HashSet<>();
        for ( int i = 0; i < 10000; i++)
            collect.add(i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            collect.contains(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetLHS(){
        LinkedHashSet<Integer> collect = new LinkedHashSet<>();
        for ( int i = 0; i < 10000; i++)
            collect.add(i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            collect.contains(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetTS() {
        TreeSet<Integer> collect = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            collect.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.contains(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemHS() {
        HashSet<Integer> collect = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            collect.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemLHS() {
        LinkedHashSet<Integer> collect = new LinkedHashSet<>();
        for (int i = 0; i < 10000; i++) {
            collect.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemTS() {
        TreeSet<Integer> collect = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            collect.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collect.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
