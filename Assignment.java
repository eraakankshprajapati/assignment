import java.util.Scanner;

public class AllProgramsSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Greatest of 3 Numbers");
        System.out.println("2. First 10 Natural Numbers");
        System.out.println("3. Factorial");
        System.out.println("4. Prime Number");
        System.out.println("5. Armstrong Number");
        System.out.println("6. Fibonacci Series");
        System.out.println("7. Sum of First 100 Prime Numbers");
        System.out.println("8. Sum of Array");
        System.out.println("9. Average of Array");
        System.out.println("10. Find Index in Array");
        System.out.println("11. Max and Min in Array");
        System.out.println("12. Compare Two Strings");
        System.out.println("13. Concatenate Strings");
        System.out.println("14. Try-Catch Demo");
        System.out.println("15. Multiple Catch Demo");
        System.out.println("16. Pattern 1");
        System.out.println("17. Pattern 2");
        System.out.println("18. Pattern 3");
        System.out.println("19. Pattern 4");
        System.out.println("20. Pattern 5");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter three numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int greatest = Math.max(a, Math.max(b, c));
                System.out.println("Greatest Number = " + greatest);
                break;

            case 2:
                int i = 1;
                System.out.println("First 10 Natural Numbers:");
                while (i <= 10) {
                    System.out.print(i + " ");
                    i++;
                }
                break;

            case 3:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                int fact = 1;

                for (i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial = " + fact);
                break;

            case 4:
                System.out.print("Enter number: ");
                num = sc.nextInt();
                boolean isPrime = true;

                if (num <= 1) isPrime = false;

                for (i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                System.out.println(isPrime ? "Prime Number" : "Not Prime");
                break;

            case 5:
                System.out.print("Enter number: ");
                num = sc.nextInt();
                int temp = num, sum = 0, rem;

                while (temp != 0) {
                    rem = temp % 10;
                    sum += rem * rem * rem;
                    temp /= 10;
                }
                System.out.println(sum == num ? "Armstrong Number" : "Not Armstrong");
                break;

            case 6:
                System.out.print("Enter limit: ");
                int n = sc.nextInt();
                int f1 = 0, f2 = 1;

                System.out.print("Fibonacci Series: " + f1 + " " + f2);

                for (i = 3; i <= n; i++) {
                    int f3 = f1 + f2;
                    System.out.print(" " + f3);
                    f1 = f2;
                    f2 = f3;
                }
                break;

            case 7:
                int count = 0, number = 2, primeSum = 0;

                while (count < 100) {
                    boolean prime = true;

                    for (i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            prime = false;
                            break;
                        }
                    }

                    if (prime) {
                        primeSum += number;
                        count++;
                    }
                    number++;
                }
                System.out.println("Sum of First 100 Primes = " + primeSum);
                break;

            case 8:
                System.out.print("Enter array size: ");
                int size = sc.nextInt();
                int arr[] = new int[size];

                System.out.println("Enter elements:");
                for (i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                int arrSum = 0;
                for (int val : arr) {
                    arrSum += val;
                }
                System.out.println("Sum of Array = " + arrSum);
                break;

            case 9:
                System.out.print("Enter array size: ");
                size = sc.nextInt();
                arr = new int[size];

                System.out.println("Enter elements:");
                for (i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                arrSum = 0;
                for (int val : arr) {
                    arrSum += val;
                }
                System.out.println("Average = " + (arrSum / (double) size));
                break;

            case 10:
                System.out.print("Enter array size: ");
                size = sc.nextInt();
                arr = new int[size];

                System.out.println("Enter elements:");
                for (i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.print("Enter element to find: ");
                int key = sc.nextInt();
                int index = -1;

                for (i = 0; i < size; i++) {
                    if (arr[i] == key) {
                        index = i;
                        break;
                    }
                }
                System.out.println("Index = " + index);
                break;

            case 11:
                System.out.print("Enter array size: ");
                size = sc.nextInt();
                arr = new int[size];

                System.out.println("Enter elements:");
                for (i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                int max = arr[0], min = arr[0];

                for (i = 1; i < size; i++) {
                    if (arr[i] > max) max = arr[i];
                    if (arr[i] < min) min = arr[i];
                }
                System.out.println("Max = " + max + ", Min = " + min);
                break;

            case 12:
                sc.nextLine();
                System.out.print("Enter first string: ");
                String s1 = sc.nextLine();
                System.out.print("Enter second string: ");
                String s2 = sc.nextLine();

                if (s1.equals(s2))
                    System.out.println("Strings are Equal");
                else
                    System.out.println("Strings are Not Equal");
                break;

            case 13:
                sc.nextLine();
                System.out.print("Enter first string: ");
                s1 = sc.nextLine();
                System.out.print("Enter second string: ");
                s2 = sc.nextLine();

                System.out.println("Concatenated String = " + s1.concat(s2));
                break;

            case 14:
                try {
                    int x = 10 / 0;
                } catch (Exception e) {
                    System.out.println("Exception Caught: " + e);
                }
                break;

            case 15:
                try {
                    int arr2[] = new int[5];
                    arr2[10] = 50;
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out Of Bounds Exception");
                } catch (Exception e) {
                    System.out.println("General Exception");
                }
                break;

            case 16: // Pattern 1
                for (i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print(j);
                    System.out.println();
                }
                break;

            case 17: // Pattern 2
                for (i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print(j);
                    System.out.println();
                }
                break;

            case 18: // Pattern 3
                for (i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print((i + j) % 2);
                    System.out.println();
                }
                break;

            case 19: // Pattern 4
                for (i = 1; i <= 4; i++) {
                    for (int sp = 4 - i; sp > 0; sp--)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++)
                        System.out.print(i + " ");
                    System.out.println();
                }
                break;

            case 20: // Pattern 5
                for (i = 1; i <= 3; i++) {
                    for (int sp = 3 - i; sp > 0; sp--)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                for (i = 2; i >= 1; i--) {
                    for (int sp = 3 - i; sp > 0; sp--)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}