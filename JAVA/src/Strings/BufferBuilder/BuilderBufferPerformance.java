package Strings.BufferBuilder;

public class BuilderBufferPerformance
{
    public static void main(String[] args)
    {
        //StringBuffer
        long starttime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("Placement");
        for(int i=0;i<10000000;i++)
        {
            sbf.append("Training");
        }
        System.out.println("Time taken by String Buffer: " + (System.currentTimeMillis() - starttime + "ms"));

        //StringBuilder
         starttime=System.currentTimeMillis();//resetting the time with same variable
        StringBuilder sbl=new StringBuilder("Placement");
        for(int i=0;i<10000000;i++)
        {
            sbl.append("Training");
        }
        System.out.println("Time taken by String Builder: " + (System.currentTimeMillis() - starttime + "ms"));
    }
}

