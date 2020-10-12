package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //countDigits();
        // reverse();
        // findDividers();
        //guessNumber();
        //tickets();
        //taskDigits();
        //checkDuplicate()
        //days();
        //countReps();
        //riseSequence();
        //bigStroke();
        //taskArray();
        //sumArray();
        //numbersFibonacci();
        //countNumbers();
        //studentFinance();
        //percents();
        biggestNum();
    }
        public static void countDigits () {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number:");
            int number = input.nextInt();
            String num = Integer.toString(number);
            char[] characters = num.toCharArray();
            System.out.println("Number contains " + characters.length + " digits");
        }

        public static void reverse () {
            int reversed = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number:");
            int number = input.nextInt();

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            System.out.print(reversed);
        }

        public static void findDividers () {
            int rem;
            System.out.println("Enter dividend");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    rem = i;
                    nums.add(rem);
                }
            }
            for (int i : nums) {
                System.out.println("Divisors are: " + i + "\t");
            }
        }

        public static void guessNumber () {
            Random r = new Random();
            int high = 1000;
            int low = 0;
            int guesser;
            System.out.println("Enter number from 0 to 1000: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int move = 0;
            for (int i = 0; ; i++) {
                guesser = r.nextInt(high - low) + low;
                if (guesser == number) {
                    System.out.println("Yeah computer have guessed needed number in just: " + move + " moves");
                    break;
                } else move++;
            }

        }

        public static void tickets () {
            int sum1 = 0;
            int sum2 = 0;
            int digit;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter ticket number:");
            int number = input.nextInt();
            while (number > 1000) {
                digit = number % 10;
                sum1 += digit;
                number /= 10;
                if (number < 1000) {
                    while (number != 0) {
                        digit = number % 10;
                        sum2 += digit;
                        number /= 10;
                    }
                }
            }
            if (sum1 == sum2) {
                System.out.println("You've got lucky ticket");
            } else {
                System.out.println("Sorry but it seems that your ticket aren't lucky");
            }

        }

        public static void taskDigits () {
            int max = 1000000000;
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 100000000; i < max; i++) {
                String num = Integer.toString(i);
                   if(!checkDuplicate(num)&&i%12345==0) {
                       numbers.add(Integer.parseInt(num));

                   }
            }
                System.out.println("These numbers are:"+numbers.size());
        }

        public static boolean checkDuplicate (String text){
            for (int i = 0; i < text.length() - 1; i++) {
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j))
                        return true;
                }
            }
            return false;
        }

        public static void days(){
        String[]week=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input =new Scanner(System.in);
            System.out.println("Enter index of the day:");
            int day=input.nextInt();
            switch (day) {
                case 1 -> System.out.println(week[0]);
                case 2 -> System.out.println(week[1]);
                case 3 -> System.out.println(week[2]);
                case 4 -> System.out.println(week[3]);
                case 5 -> System.out.println(week[4]);
                case 6 -> System.out.println(week[5]);
                case 7 -> System.out.println(week[6]);
                default -> System.out.println("You entered wrong index");
            }
        }

        //Make a final version
        public static void countReps(){
        int randomNum;
        int curr_count = 1;
        int max_count = 1;
        int n=11;
        int [] nums=new int[11];
            for (int i = 0; i < 11; i++) {
                randomNum = ThreadLocalRandom.current().nextInt(-1, 1 + 1);
                nums[i] = randomNum;
            }
            int res = nums[0];
            Arrays.sort(nums);

            // find the max frequency using linear
            // traversal
            for (int i = 1; i < n; i++)
            {
                if (nums[i] == nums[i - 1])
                    curr_count++;
                else
                {
                    if (curr_count > max_count)
                    {
                        max_count = curr_count;
                        res =nums[i - 1];
                    }
                    curr_count = 1;
                }
            }

            // If last element is most frequent
            if (curr_count > max_count)
            {
                max_count = curr_count;
                res = nums[n - 1];
            }
            for (int i = 0; i < 11; i++) {
                System.out.print(nums[i]+"\t");
            }
            System.out.println();
            System.out.println("Most repetetive number is:"+res+" and it repeats: "+ max_count+" times");
            }

        public static void riseSequence(){
        int[] nums=new int[4];

        int count=0;
        for (int i = 0; i < 4; i++) {
            int randomNum=ThreadLocalRandom.current().nextInt(10,99+1);
            nums[i]=randomNum;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                count++;
            }
        }
        if(count==3){
            System.out.println("This is rising sequence");
        }else{
            System.out.println("It isn't rising sequence");
        }

    }

        public static void bigStroke(){
        int [][] nums=new int[7][4];
        int [] res=new int[7];
        int mult;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                int randomNum=ThreadLocalRandom.current().nextInt(-5,5+1);
                nums[i][j]=randomNum;
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Result:");
        for (int i = 0; i < 7; i++) {
             mult=1;
            for (int j = 0; j < 4; j++) {
               mult=mult*Math.abs(nums[i][j]);
                System.out.print(nums[i][j]+" ");
            }
            res[i]=mult;
            System.out.println("= "+mult);
        }
        System.out.println();

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

        int max_value = res[0];
        int max_stroke=0;
        for (int i = 1; i < res.length; i++) {
            if(res[i]>max_value){
                max_value=res[i];
                max_stroke=i+1;
            }
        }
        System.out.println();
        System.out.println("Max stroke is:"+max_stroke+" with composition of elements in row: "+max_value);
    }

        public static void taskArray(){
            int temp1=0;
            int temp2 = 0;

        Scanner input=new Scanner(System.in);
            System.out.println("Enter size of an array:");
            int size=input.nextInt();
        int[] nums=new int[size];

        for(int i=0;i<size;i++){
            int randomNum=ThreadLocalRandom.current().nextInt(1,150+1);
            nums[i]=randomNum;
            }
            int min=nums[0];
            int max=nums[0];

            for (int i = 0; i < size; i++) {
                System.out.print(nums[i]+" ");
            }
            for (int i = 1; i < size; i++) {
                if(nums[i]>max){
                    max=nums[i];
                    temp1=i;
                }else if(nums[i]<min){
                    min=nums[i];
                    temp2=i;
                }
            }
            nums[temp2]=max;
            nums[temp1]=min;
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print(nums[i]+" ");
            }
        }

        public static void sumArray(){
            int sumLeft=0;
            int sumRight=0;
            int size = 0;
            Scanner input=new Scanner(System.in);
            do {
                System.out.println("Enter size of an array: ");
                size = input.nextInt();
            } while (size % 2 != 0);

            int[][] nums=new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int randomNum=ThreadLocalRandom.current().nextInt(-5,5+1);
                    nums[i][j]=randomNum;
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(nums[i][j]+"\t");
                }
                System.out.println();
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size/2; j++) {
                    sumLeft+=nums[i][j];
                }

                for (int j = size/2; j < size; j++) {
                    sumRight+=nums[i][j];
                }
            }
            if(sumLeft>sumRight){
                System.out.println("Left part of matrix is bigger than right");
            }else if(sumLeft<sumRight){
                System.out.println("Right part of matrix is bigger than left");
            }else{
                System.out.println("Both parts are equal");
            }

        }

        public static void numbersFibonacci(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of sequence of Fibonacci");
        int size=input.nextInt();
        int[]nums=new int[size];
        nums[0]=1;
        nums[1]=1;
            for (int i = 2; i < size; i++) {
                nums[i]=nums[i-1]+nums[i-2];
            }
            for (int i = 0; i < size; i++) {
                System.out.print(nums[i]+"\t");
            }
        }

        public static void countNumbers(){
        int sum=0;
        Scanner input=new Scanner(System.in);
            System.out.println("Enter number: ");
        int number=input.nextInt();
   while(number!=0){
    int digit=number%10;
    sum+=digit;
    number/=10;
}
            System.out.println("Sum of digits of given number is: "+sum);
        }

        public static void studentFinance(){
            int totalExpense=0;
            int totalScholarship=0;
            int request=0;

            Scanner input=new Scanner(System.in);
            System.out.println("Enter student's scholarship: ");
            int scholarship=input.nextInt();
            totalScholarship=scholarship*10;
            System.out.println("Enter student's expences: ");
            int startExpense=input.nextInt();
            int percent= (int) (startExpense*0.03);
            for (int i = 0; i < 10; i++) {
                totalExpense+=startExpense+percent ;
            }

            request=totalExpense-totalScholarship;
            System.out.println("Total Expenses "+totalExpense+" Total Scholarship "+totalScholarship);
            System.out.println("Student needs to ask his parents to give him: "+request+" money");
            }

        public static void percents(){
                int [] nums=new int[100];
                int randomNum;
                double posNumber=0;
                double negNumber=0;
                double zero=0;

                for (int i = 0; i < 100; i++) {
                    randomNum = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
                    nums[i] = randomNum;
                }
                for (int i = 0; i < 100; i++) {
                    System.out.print(nums[i] +" ");
                }
                for (int i = 0; i < 100; i++) {
                    if(nums[i]>0){
                        posNumber++;
                    }else if(nums[i]<0){
                        negNumber++;
                    }else{
                        zero++;
                    }
                }
                System.out.println();
                System.out.println("Percent of positive numbers is: "+posNumber+
                        " percent of negative number is: "+negNumber+" percent of zero's is: "+zero);
            }

        public static void biggestNum(){
            int [][] nums=new int[5][8];
            int [] res=new int[7];

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 8; j++) {
                    int randomNum=ThreadLocalRandom.current().nextInt(-99,99+1);
                    nums[i][j]=randomNum;
                }
            }
            int max=nums[0][0];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 8; j++) {
                   if(nums[i][j]>max){
                       max=nums[i][j];
                   }
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(nums[i][j]+" ");
                }
                System.out.println();
            }
            System.out.print("Biggest number in matrix is: "+max);
        }
        }
    




