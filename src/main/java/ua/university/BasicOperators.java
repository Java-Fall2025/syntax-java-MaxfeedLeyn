package ua.university;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double[] result = new double[2];
        result[0] = a+b+c;
        result[1] = result[0] / 3;
        return result;
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if(score < 0 || score > 100)
            throw new IllegalArgumentException("Incorrect Value");
        else if(score >= 90)
            return 'A';
        else if(score >= 80)
            return 'B';
        else if(score >= 70)
            return 'C';
        else if(score >= 60)
            return 'D';
        else if(score >= 50)
            return 'E';
        else
            return 'F';
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        if(day < 1 || day > 7)
            throw new IllegalArgumentException("Incorrect Value");
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfTheWeek[day-1];
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if(n < 0)
            throw new IllegalArgumentException("Incorrect Value");
        int[] countArray = new int[n];
        for(int i = n; i > 0; --i){
            countArray[n - i] = i;
        }
        return countArray;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Incorrect Value");
        if(n == 0) return 1;
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("Incorrect Value");
        int sizeOfArray = arr.length;
        for(int i = 0; i < sizeOfArray / 2; ++i){
            int tmp = arr[i];
            arr[i] = arr[sizeOfArray - i - 1];
            arr[sizeOfArray - i - 1] = tmp;
        }
        return arr;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            throw new IllegalArgumentException("Incorrect Value");
        int[] length = new int[2];
        length[0] = matrix.length;
        length[1] = matrix[0].length;
        int sum = 0;
        for(int i = 0; i < length[0]; ++i){
            for(int j = 0; j < length[1]; ++j){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if(s == null || s.isEmpty())
            throw  new IllegalArgumentException("Incorrect Value");
        boolean isPalindrome = true;
        int sizeOfString = s.length();
        for(int i = 0; i < sizeOfString / 2; ++i){
            if(s.charAt(i) != s.charAt(sizeOfString - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("Incorrect Value");
        int[] result = new int[2];
        result[0] = arr[0]; // minimum
        result[1] = arr[0]; // maximum
        int sizeOfArray = arr.length;
        for(int i = 1; i < sizeOfArray; ++i){
            if(result[0] > arr[i]) result[0] = arr[i];
            if(result[1] < arr[i]) result[1] = arr[i];
        }
        return result;
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if(n <= 0)
            throw new IllegalArgumentException("Incorrect Value");
        int[][] resultMultiplicationTable = new int[n][n];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                resultMultiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return resultMultiplicationTable;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if(n < 0 )
            throw new IllegalArgumentException("Incorrect Value");
        int sizeOfArray = n / 2;
        int[] result = new int[sizeOfArray];
        int count = 0;
        for(int i = 2; i <= n; ++i){
            if(i % 2 == 0) {
                result[count] = i;
                count ++;
            }
        }
        return result;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        int limitNumber = (int) Math.sqrt(n);
        for(int i = 2; i <= limitNumber; ++i){
            if(n % i == 0) {isPrime = false; break;}
        }
        return isPrime;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'y'};
        int sizeOfString = s.length(), count = 0;
        for(int i = 0; i < sizeOfString; ++i){
            char tmpChar = s.charAt(i);
            for(int j = 0; j < 6; ++j){
                if(vowelsArray[j] == tmpChar) {count++; j = 6;}
            }
        }
        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if(n < 0)
            throw new IllegalArgumentException("Incorrect Value");
        if(n == 1) return new int[]{0};
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        for(int i = 2; i < n; ++i){
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length,  cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for(int i = 0; i < cols; ++i){
            for(int j = 0; j < rows; ++j){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if(arr == null || arr.length == 0 || low >= high) return;
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        quickSort(arr, 0, n - 1);
        for(int i = 0; i < n; ++i){
            result[i] = arr[i];
        }
        return result;
    }
}