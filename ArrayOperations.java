Certainly! Here's the equivalent Java code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of values: ");
        int a = Integer.parseInt(scanner.nextLine());

        if (a < 5 || a > 10) {
            System.out.println("Invalid array size");
            System.exit(0);
        } else {
            System.out.println("Enter the Values");
        }

        for (int x = 0; x < a; x++) {
            arr.add(Integer.parseInt(scanner.nextLine()));
        }

        int i = 0;
        while (i < arr.size() - 2) {
            ans.add(arr.get(i) - arr.get(i + 2));
            i++;
        }

        System.out.println("");
        System.out.println(max(ans) + " Greatest difference");

        int s1 = ans.indexOf(max(ans));
        int s2 = ans.indexOf(max(ans)) + 2;

        System.out.println(min(arr.get(s1), arr.get(s2)) + " is the smallest parent");
        System.out.println(max(arr.get(s1), arr.get(s2)) + " is the greatest parent");
    }

    private static int max(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int value : list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int min(int a, int b) {
        return Math.min(a, b);
    }

    private static int max(int a, int b) {
        return Math.max(a, b);
    }
}
```

This Java code should perform the same functionality as your original Python code.
