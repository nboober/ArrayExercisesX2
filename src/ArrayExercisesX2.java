import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayExercisesX2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program to print a string in reverse
         */
        System.out.println("Enter a word. I will print it out in reverse: ");
        String word = scanner.next();
        String newWord = "";

        for(int i = word.length() - 1; i >= 0 ; i--){
            newWord += word.charAt(i);
        }
        System.out.println(newWord);

        /*
        Write a program that will find the length of an input string
        without using the library function.
        */
        System.out.println("Enter a word. I will tell you the length of the word: ");
        String word2 = scanner.next();
        int count=0;

        char ar[]=word2.toCharArray();
        for(char c : ar){
            count++;
        }

        System.out.println("This word is " + count + " characters long.");


        /*
        Prompt the user to input 10 values and store them into an array.
        If there are any duplicate values in that array,
        remove them and print out the remaining values.
         */
        System.out.println("Enter 10 values greater than 0. I will remove the duplicates and print the remaining");

        int[] myNums = new int[10];
        int[] myNums2 = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Value # " + (i+1) + " : ");
            myNums[i] = scanner.nextInt();

        }
        Arrays.sort(myNums);


        myNums2[0] = myNums[0];
            for(int x = 1; x < myNums.length; x++){


                int num = myNums[x];
                int num2 = myNums[x-1];

                if(num != num2) {
                    myNums2[x] = num;
                }
            }

            System.out.println("Without the duplicates. Your array consists of: ");
            for(int x = 0; x < myNums2.length; x++){
                if(myNums2[x] != 0){
                    System.out.println(myNums[x]);
                }
            }

//        System.out.println(Arrays.toString(myNums));
        System.out.println(Arrays.toString(myNums2));

        /*
        Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        Write a program that will print out all pairs from arrays 1 and 2
        that gives a sum of 13:
        Expected output:
        (6,7)(9,4)
         */
        System.out.println("Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4] \n" + "Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:");
        int[] nums3 = {1,7,6,5,9};
        int[] nums4 = {2,7,6,3,4};

        for(int i = 0; i < nums3.length; i++){
            for(int x = 0; x < nums4.length; x++){

                if((nums3[i] + nums4[x] == 13)){
                    System.out.println(nums3[i] + "," + nums4[x]);
                }
            }

        }

        /*
        Prompt the user to input 10 values and store them into an array.
        Output the total number of odd and even values in the array.
        */
        int[] nums5 = new int[10];
        int odd = 0;
        int even = 0;


        System.out.println("Enter 10 values. I will tell you the total number of odd and even numbers: ");
        for(int i = 0; i < 10; i++){
            System.out.println("Value # " + (i+1) + " : ");
            nums5[i] = scanner.nextInt();

            if(nums5[i]%2 == 0){
                even += 1;
            }else {
                odd += 1;
            }
        }
        System.out.println("Your array contains " + Arrays.toString(nums5));
        System.out.print("There are " + odd + " odd numbers, and " + even + " even numbers.");
    }
}
