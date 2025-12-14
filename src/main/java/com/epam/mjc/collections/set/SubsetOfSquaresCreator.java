package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer>ans=new TreeSet<>();
        for(Integer e:sourceList){
            int temp=e*e;
            if(temp>= lowerBound && temp <= upperBound){
                ans.add(temp);
            }
        }

        return ans;


    }
}
