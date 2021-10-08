package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setss
{
    public static void main(String[] arg)
    {
        Integer[] A = {22, 45,33, 66, 55, 34, 77};
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};
        Set<Integer> s = new HashSet<>();
        s.addAll(Arrays.asList(A));
        System.out.println(s);
        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(B));
        System.out.println(s1);
        Set<Integer> union = new HashSet<>(s);
        union.addAll(s1);
        System.out.println(union);
        Set<Integer> inter = new HashSet<>(s);
        inter.retainAll(s1);
        System.out.println(inter);
        Set<Integer> diff = new HashSet<>(s);
        diff.removeAll(s1);
        System.out.println(diff);
    }
}
