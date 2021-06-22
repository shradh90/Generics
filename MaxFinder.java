package com.shradha.max;

public class MaxFinder {

    public static Float findMax(Float a, Float b, Float c) {
        Float max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("The max of three numbers %s %s %s is : %s \n",a,b,c,max);
        return max;
    }
    public static void main(String[] args) {
        Float float1 = 55.65f, float2 = 55.7f,float3 = 55.90f;
        Float max = findMax(float1,float2,float3);
    }
}
