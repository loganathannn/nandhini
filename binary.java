import java.util.Arrays;
import java.util.*;
public class binary {
static int N=5;
static int []sequence = new int[N];
    public int[] twoSum(int[] numbers, int target) {
        int tail = numbers.length-1;
        int[] n = new int[2];
        for (int i=0;i<tail;i++) {
            for(int j=i+1;j<tail;j++) {
                if(target ==(numbers[i]+numbers[j])) {
                    n[0] = i+1;
                    n[1] = j+1;
System.out.println("1 number to be added  is "+ n[0]+"\n2 nd number to be added is "+ n[1]);
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        
Scanner s=new Scanner(System.in);
System.out.println("enter the elements of array:");

    for(int i=0;i<N;i++)
        sequence[i]=s.nextInt();
Scanner sc=new Scanner(System.in);
System.out.println("enter the value to be added up:");

        int value = sc.nextInt();
        binary r = new binary();
        int[] a = r.twoSum(sequence,value);
        
    }
}
