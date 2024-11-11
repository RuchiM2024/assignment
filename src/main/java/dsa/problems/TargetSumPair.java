package dsa.problems;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class TargetSumPair {

    public boolean CheckPairForTarget(int[] arr,int target)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement=target-arr[i];
            if(set.contains(complement))
            {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public int GetPairCountForTarget(int[] arr,int target)
    {
        Map<Integer,Integer> freq=new HashMap<Integer,Integer>();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(freq.containsKey(target-arr[i]))
            {
                count+=freq.get(target-arr[i]);
            }
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<freq.size();i++) {
            System.out.println(freq.get(i));
        }
        return count;
    }

    public int[] GetPairForTargetSum(int[] arr,int target)
    {
        List<Integer> result=new ArrayList<Integer>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement=target-arr[i];
            //map.put(arr[i],);
        }

        int[] output=result.stream().mapToInt(i -> i).toArray();
        return  output;
    }
}
