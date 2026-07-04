import java.util.Scanner;
import java.util.ArrayList;

// Custom Exception
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

// Abstract class
abstract class Parent {
	abstract void message();
}

class Child1 extends Parent {
	void message() {
		System.out.println("This is first subclass");
	}
}

class Child2 extends Parent {
	void message() {
		System.out.println("This is second subclass");
	}
}

// Runnable Thread
class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Thread using Runnable interface is running");
	}
}

// Thread Class
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread using Thread class is running");
	}
}

public class Assignment {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// લૂપ ચાલુ રાખવા માટે while(true) વાપરેલ છે
		while (true) {
			System.out.println("\n===== MENU =====");
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
			System.out.println("21. Runnable Thread");
			System.out.println("22. Thread Class");
			System.out.println("23. ArrayList Iterate");
			System.out.println("24. Update Array Element");
			System.out.println("25. Remove 3rd Element ArrayList");
			System.out.println("26. Copy Array");
			System.out.println("27. Reverse Array");
			System.out.println("28. Second Largest Element");
			System.out.println("29. Abstract Class Demo");
			System.out.println("30. Grade System");
			System.out.println("31. Bank Custom Exception");
			System.out.println("0. EXIT"); // બહાર નીકળવા માટે નવો ઓપ્શન

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			// બહાર નીકળવા માટેની શરત
			if (choice == 0) {
				System.out.println("Exiting program... Thank you!");
				break;
			}

			int i; // લૂપ વેરીએબલ કોમન કરી દીધો

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
				i = 1;
				System.out.println("First 10 Natural Numbers:");
				while (i <= 10) {
					System.out.print(i + " ");
					i++;
				}
				System.out.println();
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

				if (num <= 1)
					isPrime = false;

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
				System.out.println();
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
				int arrCase9[] = new int[size]; // વેરીએબલનું નામ બદલ્યું

				System.out.println("Enter elements:");
				for (i = 0; i < size; i++) {
					arrCase9[i] = sc.nextInt();
				}

				arrSum = 0;
				for (int val : arrCase9) {
					arrSum += val;
				}
				System.out.println("Average = " + (arrSum / (double) size));
				break;

			case 10:
				System.out.print("Enter array size: ");
				size = sc.nextInt();
				int arrCase10[] = new int[size];

				System.out.println("Enter elements:");
				for (i = 0; i < size; i++) {
					arrCase10[i] = sc.nextInt();
				}

				System.out.print("Enter element to find: ");
				int key = sc.nextInt();
				int index = -1;

				for (i = 0; i < size; i++) {
					if (arrCase10[i] == key) {
						index = i;
						break;
					}
				}
				System.out.println("Index = " + index);
				break;

			case 11:
				System.out.print("Enter array size: ");
				size = sc.nextInt();
				int arrCase11[] = new int[size];

				System.out.println("Enter elements:");
				for (i = 0; i < size; i++) {
					arrCase11[i] = sc.nextInt();
				}

				int maxVal = arrCase11[0], minVal = arrCase11[0];

				for (i = 1; i < size; i++) {
					if (arrCase11[i] > maxVal)
						maxVal = arrCase11[i];
					if (arrCase11[i] < minVal)
						minVal = arrCase11[i];
				}
				System.out.println("Max = " + maxVal + ", Min = " + minVal);
				break;

			case 12:
				sc.nextLine(); // Scanner buffer clear કરવા માટે
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

			case 16:
			case 17: // ૧૬ અને ૧૭ માં સેમ પેટર્ન હતી એટલે સાથે રાખ્યા છે
				for (i = 1; i <= 5; i++) {
					for (int j = 1; j <= i; j++)
						System.out.print(j);
					System.out.println();
				}
				break;

			case 18:
				for (i = 1; i <= 5; i++) {
					for (int j = 1; j <= i; j++)
						System.out.print((i + j) % 2);
					System.out.println();
				}
				break;

			case 19:
				for (i = 1; i <= 4; i++) {
					for (int sp = 4 - i; sp > 0; sp--)
						System.out.print(" ");
					for (int j = 1; j <= i; j++)
						System.out.print(i + " ");
					System.out.println();
				}
				break;

			case 20:
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

			case 21:
				MyRunnable r = new MyRunnable();
				Thread t1 = new Thread(r);
				t1.start();
				try {
					t1.join();
				} catch (Exception e) {
				} // લૂપ સિક્વન્સ જળવાઈ રહે તે માટે join કરેલ છે
				break;

			case 22:
				MyThread t2 = new MyThread();
				t2.start();
				try {
					t2.join();
				} catch (Exception e) {
				}
				break;

			case 23:
				ArrayList<Integer> list = new ArrayList<>();
				list.add(10);
				list.add(20);
				list.add(30);

				for (int val : list) {
					System.out.println(val);
				}
				break;

			case 24:
				int[] arrCase24 = { 10, 20, 30, 40 };
				System.out.print("Enter index (0 to 3): ");
				int idx = sc.nextInt();
				System.out.print("Enter new value: ");
				int val = sc.nextInt();

				if (idx >= 0 && idx < arrCase24.length) {
					arrCase24[idx] = val;
					for (int x : arrCase24)
						System.out.print(x + " ");
					System.out.println();
				} else {
					System.out.println("Invalid Index!");
				}
				break;

			case 25:
				ArrayList<Integer> list2 = new ArrayList<>();
				list2.add(1);
				list2.add(2);
				list2.add(3);
				list2.add(4);

				list2.remove(2); // 3rd element
				System.out.println(list2);
				break;

			case 26:
				int[] a1 = { 1, 2, 3 };
				int[] a2 = new int[a1.length];

				for (int j = 0; j < a1.length; j++) {
					a2[j] = a1[j];
				}

				for (int x : a2)
					System.out.print(x + " ");
				System.out.println();
				break;

			case 27:
				int[] a3 = { 1, 2, 3, 4, 5 };

				for (int j = a3.length - 1; j >= 0; j--) {
					System.out.print(a3[j] + " ");
				}
				System.out.println();
				break;

			case 28:
				int[] a4 = { 10, 50, 20, 90, 40 };

				int maxElement = a4[0];
				int secondElement = a4[0];

				for (int j = 0; j < a4.length; j++) {
					if (a4[j] > maxElement) {
						secondElement = maxElement;
						maxElement = a4[j];
					} else if (a4[j] > secondElement && a4[j] != maxElement) {
						secondElement = a4[j];
					}
				}
				System.out.println("Second Largest = " + secondElement);
				break;

			case 29:
				Parent p1 = new Child1();
				Parent p2 = new Child2();

				p1.message();
				p2.message();
				break;

			case 30:
				System.out.print("Enter marks: ");
				int marks = sc.nextInt();

				if (marks >= 91)
					System.out.println("AA");
				else if (marks >= 81)
					System.out.println("AB");
				else if (marks >= 71)
					System.out.println("BB");
				else if (marks >= 61)
					System.out.println("BC");
				else if (marks >= 51)
					System.out.println("CD");
				else if (marks >= 41)
					System.out.println("DD");
				else
					System.out.println("Fail");
				break;

			case 31:
				int balance = 2000;

				try {
					System.out.print("Enter withdraw amount: ");
					int withdraw = sc.nextInt();

					if (withdraw > balance) {
						throw new InsufficientBalanceException(
								"Sorry, insufficient balance, need more " + (withdraw - balance) + " Rs");
					}

					balance -= withdraw;
					System.out.println("Remaining Balance: " + balance);

				} catch (InsufficientBalanceException e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				System.out.println("Invalid Choice!");
			}
		}
		sc.close();
	}
}
