public class DcStratagy implements stratagy{
    @Override
    public int solution(int CaseInput)
    {
        if(CaseInput == 1)
            return  1;
        else if(CaseInput == 2)
            return  2;
        else if(CaseInput == 3)
            return  4;
        return solution(CaseInput-1)+solution(CaseInput-2)+solution(CaseInput-3);
    }

    @Override
    public void WhatSolution()
    {
        System.out.println("DcStratagy");
    }
}
