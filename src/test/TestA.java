package test;

import java.util.*;

public class TestA {

    public static void main(String[] args) {
        long a = 0, b = 0;
        for (int i = 0; i < 100; i++)
            a += methAddFirstLL();
        for (int i = 0; i < 100; i++)
            b += methAddFirstMLL();
        System.out.printf("%-15s %-15s %-15s", "Operation", "LinkedList", "ArrayList");
        System.out.println();
        System.out.printf("%-15s %-15s %-15s", "AddFirst", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += methAddMidLL();
        for (int i = 0; i < 100; i++)
            b += methAddMidMLL();
        System.out.printf("%-15s %-15s %-15s", "AddMid", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += methAddLastLL();
        for (int i = 0; i < 100; i++)
            b += methAddLastMLL();
        System.out.printf("%-15s %-15s %-15s", "AddLast", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += testGetFirstLL();
        for (int i = 0; i < 100; i++)
            b += testGetFirstMLL();
        System.out.printf("%-15s %-15s %-15s", "GetFirst", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += testGetMidLL();
        for (int i = 0; i < 100; i++)
            b += testGetMidMLL();
        System.out.printf("%-15s %-15s %-15s", "GetMid", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += testGetLastLL();
        for (int i = 0; i < 100; i++)
            b += testGetLastMLL();
        System.out.printf("%-15s %-15s %-15s", "GetLast", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += testRemFirstLL();
        for (int i = 0; i < 100; i++)
            b += testRemFirstMLL();
        System.out.printf("%-15s %-15s %-15s", "RemFirst", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += testRemMidLL();
        for (int i = 0; i < 100; i++)
            b += testRemMidMLL();
        System.out.printf("%-15s %-15s %-15s", "RemMid", a / 100, b / 100);
        System.out.println();
        a = 0;
        b = 0;

        for (int i = 0; i < 100; i++)
            a += testRemLastLL();
        for (int i = 0; i < 100; i++)
            b += testRemLastMLL();
        System.out.printf("%-15s %-15s %-15s", "RemLast", a / 100, b / 100);
        System.out.println();
    }

    public static long methAddLastLL(){
        LinkedList<Integer> ll = new LinkedList<>();
        for ( int i = 0; i < 10000; i++)
            ll.add(i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            ll.add(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long methAddLastMLL(){
        ArrayList<Integer> mll = new ArrayList<>();
        for ( int i = 0; i < 10000; i++)
            mll.add(i);
        long start = System.nanoTime();
        for ( int i = 10000; i < 20000; i++)
            mll.add(i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long methAddMidLL(){
        LinkedList<Integer> ll = new LinkedList<>();
        for ( int i = 0; i < 10000; i++)
            ll.add(i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            ll.add(4999, i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long methAddMidMLL(){
        ArrayList<Integer> mll = new ArrayList<>();
        for ( int i = 0; i < 30000; i++)
            mll.add(i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            mll.add(14999, i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long methAddFirstLL(){
        LinkedList<Integer> ll = new LinkedList<>();
        for ( int i = 0; i < 10000; i++)
            ll.add(i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            ll.add(0);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long methAddFirstMLL(){
        ArrayList<Integer> mll = new ArrayList<>();
        for ( int i = 0; i < 10000; i++)
            mll.add(i);
        long start = System.nanoTime();
        for ( int i = 0; i < 10000; i++)
            mll.add(0, i);
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetFirstLL() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.get(0);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetFirstMLL() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.get(0);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetMidLL() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.get(4999);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetMidMLL() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.get(4999);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetLastLL() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.get(list.size()-1);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testGetLastMLL() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.get(9999);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemFirstLL() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemFirstMLL() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemMidLL() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.remove(14999);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemMidMLL() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.remove(14999);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemLastLL() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 29999; i > 20000; i--) {
            list.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public static long testRemLastMLL() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30000; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 29999; i > 20000; i--) {
            list.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
