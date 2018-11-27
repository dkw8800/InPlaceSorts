package com.company;

public class InPlaceSorts {

    public static void selectionsort(int[] arr) {
        int min = 0;
        int temp =  0;

        for(int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int k = i; k < arr.length; k++) {
                if (arr[k] < min) {
                    min = arr[k];
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = i;j > 0;j--)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
    public static void bubble(int[] array)
    {
        int temp = 0;
        for(int k = 0; k < array.length; k++)
        {
            for(int i = 0; i < array.length - 1; i++)
            {
                if(array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }



    public static void quicksort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr,left,right);
            quicksort(arr, left,pivot -1);
            quicksort(arr, pivot + 1, right);
        }
    }

    public static int partition(int[]arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;
        for(int j = left; j < right; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[right];
        arr[right] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }

}
