import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read the integer N
        int N = scanner.nextInt();
        
        // TODO: Create a HashSet to store the integers
        Set<Integer> set = new LinkedHashSet<>();
        
        // TODO: Loop N times to read the integers and add them to the HashSet
        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }
        
        // TODO: Iterate through the HashSet and print the unique numbers (space-separated)
        boolean first = true;
        for (int num : set) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(num);
            first = false;
        }
        
        scanner.close();
    }
}
