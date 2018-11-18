package com.company;

public class Runner {
    public static int[] thisarray = new int[10];
    public static int[] longarray = new int[100];

    public static void main(String[] args) {
        System.out.println("Testing Bubblesort...");
        makearr(thisarray);
        returnarr(thisarray);
        InPlaceSorts.bubble(thisarray);
        returnarr(thisarray);

        System.out.println("Testing Insertionsort...");
        makearr(thisarray);
        returnarr(thisarray);
        InPlaceSorts.insertionSort(thisarray);
        returnarr(thisarray);

        System.out.println("Testing Selectionsort...");
        makearr(thisarray);
        returnarr(thisarray);
        InPlaceSorts.selectionsort(thisarray);
        returnarr(thisarray);



        System.out.println("\n" + "Testing Runtimes...");
        makearr(longarray);
        int[] longarray2=longarray.clone();
        int[] longarray3=longarray.clone();
        returnarr(longarray);
        long startTime = System.currentTimeMillis();
        InPlaceSorts.bubble(longarray);
        long endTime = System.currentTimeMillis();
        System.out.println("Bubblesort takes " + (endTime - startTime) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        InPlaceSorts.insertionSort(longarray2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Insertionsort takes " + (endTime2 - startTime2) + " milliseconds");

        long startTime3 = System.currentTimeMillis();
        InPlaceSorts.selectionsort(longarray3);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Selectionsort takes " + (endTime3 - startTime3) + " milliseconds");
        returnarr(longarray);
    }

    public static void makearr(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static void returnarr(int[] array) {
        for(int i = 0; i < array.length; i++)
    {
        System.out.print(array[i]);
    }
        System.out.println(".");
    }
}
