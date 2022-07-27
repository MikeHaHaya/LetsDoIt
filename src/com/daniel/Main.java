package com.daniel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Task 1
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            nums1.add((int) (Math.random() * 10));
            nums2.add((int) (Math.random() * 10));
        }

        // Task 2
        printArrays(nums1, nums2);
        // Task 3
//        highestTriple(nums1);

    }

    // Task 2
    public static void printArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        System.out.println(nums1);
        System.out.println(nums2);
    }

//    // Task 3
//    public static void highestTriple(ArrayList<Integer> nums1) throws IndexOutOfBoundsException {
//
//
//        // Some temp variables
//        int highestNum = 0;
//        int position = 0;
//        int highNumPosition = 0;
//
//        // A loop that check the 3 highest digits position
//        for (Integer currNum : nums1) {
//
//            if (currNum > highestNum) {
//                highestNum = currNum;
//                highNumPosition = position;
//
//                // In case the current number is equal to the highest number
//            } else if (currNum == highestNum) {
//
//                // Catch if the array has ended and the index is out of bounds
//                try {
//
//                    // Sets the current num to a 3-digit number
//                    int currNum3Dig;
//                    {
//                        int hundreds = currNum * 100;
//                        int tens = nums1.get(position + 1) * 10;
//                        int units = nums1.get(position + 2);
//                        currNum3Dig = hundreds + tens + units;
//                    }
//
//                    // Sets the last known highest num to a 3-digit number
//                    int highNum3Dig;
//                    {
//                        int hundreds = highestNum * 100;
//                        int tens = nums1.get(highNumPosition + 1) * 10;
//                        int units = nums1.get(highNumPosition + 2);
//                        highNum3Dig = hundreds + tens + units;
//                    }
//
//                    if (currNum3Dig > highNum3Dig)
//                        highNumPosition = position;
//
//                } catch (IndexOutOfBoundsException e) {
//                    break;
//                }
//            }
//
//            position++;
//        }
//
//        int hundreds = highestNum * 100;
//        int tens = nums1.get(highNumPosition + 1) * 10;
//        int units = nums1.get(highNumPosition + 2);
//        int highest3Dig = hundreds + tens + units;
//
//
//        System.out.println("Highest 3 digit number in the array: " + highest3Dig);
//        System.out.println("It's Index: " + highNumPosition + ", " + (highNumPosition + 1) + ", " + (highNumPosition + 2));
//
//    }
}