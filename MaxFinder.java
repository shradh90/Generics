package com.shradha.max;


public class MaxFinder<T extends Comparable<T>> {

    //declaring instance variables
    T [] arrayOfInt,arrayOfFloat,arrayOfString;

    public MaxFinder(T[] arrayOfInt, T[] arrayOfFloat, T[] arrayOfString) {
        this.arrayOfInt = arrayOfInt;
        this.arrayOfFloat = arrayOfFloat;
        this.arrayOfString = arrayOfString;
    }
    //parameterized constructor


    public static void main(String[] args) {

        Integer[] a = {22,43,22};
        Float [] b = {22.5f,34.43f,34.33f};
        String[] c = {"apple","cat","banana"};

        new MaxFinder(a,b,c).testMaximum();


    }

    private void testMaximum() {

        //passing instance variable to static testMaximum method
        Integer maxOfThreeInt = (Integer) testMaximum(arrayOfInt);
        System.out.println("The maximum value of three integers is : "+maxOfThreeInt);

        Float maxOfThreeFloat = (Float) testMaximum(arrayOfFloat);
        System.out.println("The maximum value of three floats is : "+maxOfThreeFloat);

        String maxOfThreeString = (String) testMaximum(arrayOfString);
        System.out.println("The maximum value of three string is : "+maxOfThreeString);
    }

    //displays maximum of three values
    static <T extends Comparable<T>> T testMaximum(T[] inputArray) {
        T max = inputArray[0];
        for(T t : inputArray){
            if(t.compareTo(max)>0)
                max=t;
        }
        return max;
    }
}
© 2021 GitHub, Inc.