package LECTURE;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        // If input is int, aotumatically cast to float
        // Left data type has to be larger than right side one
        // int num = input.nextFloat(); will give error
        // But this can be done by: int num = (int)a where a is float variable

        System.out.println(num);
    }
}