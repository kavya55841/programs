import java.util.*;
class leetcode645_set_mismatch {
    public static void main(String args[])
    {
        int nums[]={1,2,2,4};
        HashSet<Integer> hs=new HashSet<>();
        int duplicate=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.contains(nums[i]))
            {
                hs.add(nums[i]);
            }
            else{
                duplicate=nums[i];
            }
        }
        int missing=-1;
        for(int i=1;i<=nums.length;i++)
        {
            if(!hs.contains(i))
            {
                missing=i;
            }
        }
        int ans[]={duplicate,missing};
        System.out.println(Arrays.toString(ans));
    }
}