package client;

import dsa.problems.BalanceParanth;
import dsa.problems.TargetSumPair;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args)
    {
        /*
        BalanceParanth obj=new BalanceParanth();
        boolean result=obj.CheckBalancedParanthesis("[09]{}{9090");
        System.out.println(result);*/
        TargetSumPair obj=new TargetSumPair();
       // int[] arr = { 0, -1, 2, -3, 1 };
       // int target = 6;//-2;
       // System.out.println(obj.CheckPairForTarget(arr,target));
        //
        /*
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(obj.GetPairCountForTarget(arr, target));*/
        int target=9;
        int[] nums=new int[]{2,7,11,15};
        Map<Integer,Integer> map=new HashMap();
        int n=nums.length;
        Map<Integer,Integer> output=new HashMap();
        for(int i=0;i<n;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
            {
                output.put(map.get(complement),i);
            }
            map.put(nums[i],i);
        }

    }
}
