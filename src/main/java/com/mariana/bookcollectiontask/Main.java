package com.mariana.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1, 2, 3, 8, 4, 0, 5, 6, 8, 5, 6, 4, 8, 6, 4};

        System.out.println(IntArrayManager.getTheMinValueOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheMinValueIndexOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheAverageOfTheElements(tablouDeDateInt));
    }
}
