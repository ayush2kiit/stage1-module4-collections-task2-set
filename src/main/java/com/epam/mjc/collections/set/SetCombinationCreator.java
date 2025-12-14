package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String>ans=new HashSet<>();
        for(String ele:firstSet){
            if(secondSet.contains(ele)  && !thirdSet.contains(ele)){
                ans.add(ele);
            }
        }

        for(String ele : thirdSet){

            if(!secondSet.contains(ele)  && !firstSet.contains(ele)){
                ans.add(ele);
            }

        }
        return ans;

    }
}
