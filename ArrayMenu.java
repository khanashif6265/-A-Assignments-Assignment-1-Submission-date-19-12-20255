import java.util.*;


class ArrayMenu {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] arr = new int[100];
int n = 0, choice;


do {
System.out.println("\n1.Insert 2.Delete 3.Linear Search 4.Binary Search");
System.out.println("5.Max 6.Count Even/Odd 7.Insertion Sort 8.Exit");
choice = sc.nextInt();


switch (choice) {
case 1:
System.out.print("Enter element: ");
arr[n++] = sc.nextInt();
break;
case 2:
System.out.print("Enter index: ");
int idx = sc.nextInt();
for (int i = idx; i < n - 1; i++) arr[i] = arr[i + 1];
n--;
break;
case 3:
System.out.print("Enter element to search: ");
int key = sc.nextInt();
for (int i = 0; i < n; i++)
if (arr[i] == key) System.out.println("Found at " + i);
break;
case 4:
Arrays.sort(arr, 0, n);
System.out.print("Enter key: ");
key = sc.nextInt();
int pos = Arrays.binarySearch(arr, 0, n, key);
System.out.println("Position: " + pos);
break;
case 5:
int max = arr[0];
for (int i = 1; i < n; i++) if (arr[i] > max) max = arr[i];
System.out.println("Max: " + max);
break;
case 6:
int even = 0, odd = 0;
for (int i = 0; i < n; i++) if (arr[i] % 2 == 0) even++; else odd++;
System.out.println("Even: " + even + " Odd: " + odd);
break;
case 7:
for (int i = 1; i < n; i++) {
int temp = arr[i], j = i - 1;
while (j >= 0 && arr[j] > temp) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = temp;
}
System.out.println("Sorted");
break;
}
} while (choice != 8);
}
}