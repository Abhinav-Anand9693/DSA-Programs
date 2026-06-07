 /* OUTPUT
 Maximum value: 89
Minimum value: 4*/
    public class MaxMinInArray {
        public static void main(String[] args) {
            int[] numbers = {45, 12, 78, 4, 89, 23, 56};
    
            int max = numbers[0];
            int min = numbers[0];
    
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
    
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
    }
    
