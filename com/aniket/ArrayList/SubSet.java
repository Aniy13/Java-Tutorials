package com.aniket.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subSet(nums));

    }
    static List<List<Integer>> subSet(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: nums){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }
        return outer;
    }
}
