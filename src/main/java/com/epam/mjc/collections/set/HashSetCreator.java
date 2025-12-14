package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer>ans=new HashSet<>();
        for(Integer e: sourceList){
            if (e % 2!=0) {
                ans.add(e);
                ans.add(2*e);
            }

            else{
                int n=e;
                while(n % 2 ==0){
                    ans.add(n);
                    n=n/2;
                }
                ans.add(n);
            }
        }

        return ans;

    }
}
