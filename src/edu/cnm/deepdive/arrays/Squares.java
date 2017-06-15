package edu.cnm.deepdive.arrays;

import java.util.Arrays;

public class Squares {

  public static void main(String[] args) {
    int[] squareArray = new int[50];
    for(int i = 0; i < squareArray.length ; i++) {
      squareArray[i] = i * i;
    }
    System.out.println(Arrays.toString(squareArray));

  }

}
