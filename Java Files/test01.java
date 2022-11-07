import java.util.List;
import java.util.Map;

public class test01 {
    public static void main(String[] args) {

        int [] temp={1,0,-1,0,-2,2};
        
        fun(temp,0);
        
    }
    static public List fun(int[] nums, int target)
    {
        List outpuList=null;
        int out;
        for(int i=0;i<nums.length;i++)
        {
            out=target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                out=out-nums[j];
                for(int k=j+1;k<nums.length;k++)
                {
                    out=out-nums[k];
                    for(int l=k+1;l<nums.length;l++)
                    {
                        List temp=null;
                        if(nums[l]==out)
                        temp.add(nums[i]);       
                        temp.add(nums[j]);             
                        temp.add(nums[k]);  
                        temp.add(nums[l]); 
                        outpuList.add(temp);       
        
                    }
    
    
                }
            }
            

        }
        return outpuList;


    }


}
