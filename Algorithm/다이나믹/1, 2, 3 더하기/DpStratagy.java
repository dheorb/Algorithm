public class DpStratagy implements stratagy
{
    @Override
    public int solution(int CaseInput)
    {
        int[]arr = new int[CaseInput];
        for(int j=0;j<CaseInput;j++)
        {
            arr[j]=0;
        }
        arr[0]=1;arr[1]=1;arr[2]=1;
        for(int j=0;j<CaseInput;j++)
        {
            if(j+1<=CaseInput-1)
                arr[j+1]=arr[j+1]+arr[j];
            if(j+2<=CaseInput-1)
                arr[j+2]=arr[j+2]+arr[j];
            if(j+3<=CaseInput-1)
                arr[j+3]=arr[j+3]+arr[j];
        }
        return arr[CaseInput-1];
    }

    @Override
    public void WhatSolution()
    {
        System.out.println("DpStratagy");
    }

}