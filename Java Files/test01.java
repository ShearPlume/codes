import java.util.List;
import java.util.Map;

public class test01 {
    public static void main(String[] args) {

        test t1=new test(1);
        System.out.println(t1.a);
        test t2=new test(2);
        System.out.println(t1.a);
        System.out.println(t2.a);
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
