package org.example.sandbox.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SearchingDriver {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 5, 3, 1, -1, -2, 0};

        ArrayList<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayList::new));

        System.out.println(SearchUtility.linearSearch(array,1));
        System.out.println(SearchUtility.linearSearch(array,10));

        System.out.println(SearchUtility.linearSearch(arrayList,1));
        System.out.println(SearchUtility.linearSearch(arrayList,10));
    }
}