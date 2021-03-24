package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        BinaryReversal binaryReversal = new BinaryReversal();
        System.out.println(binaryReversal.binaryReversalProcessor(input));
        scan.close();
    }
}