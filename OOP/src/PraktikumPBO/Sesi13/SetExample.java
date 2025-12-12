package PraktikumPBO.Sesi13;

import java.util.*;
public class SetExample {

    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("a");
        set.add("b");
        set.add("b");
        set.add("d");
        set.add("c");
        System.out.print("Elemen pada Hashset : ");
        System.out.println(set);
        Set sortSet=new TreeSet(set);
        System.out.print("Elemen pada Treeset : ");
        System.out.println(sortSet);
    }
}