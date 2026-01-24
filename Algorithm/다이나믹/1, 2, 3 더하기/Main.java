import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int CaseNum = sc.nextInt();
        int [] CaseInput = new int[CaseNum];
        for(int i=0;i<CaseNum;i++)
        {
            CaseInput[i]=sc.nextInt();
        }

        stratagy st = new DpStratagy();
        st.WhatSolution();

        for(int i : CaseInput)
        {
            if(i==1)
            {
                System.out.println(1);
                continue;
            }
            else if(i==2)
            {
                System.out.println(2);
                continue;
            }
            else if(i==3)
            {
                System.out.println(4);
                continue;
            }
            System.out.println(st.solution(i));
        }
    }
}