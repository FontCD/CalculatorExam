package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

    public void selectSumOperands() throws IOException {
        System.out.println("\nSelect operand 1:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader1.readLine();

        System.out.println("\nSelect operand 2:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String input2 = reader2.readLine();

        int operand1 = Integer.parseInt(input1);
        int operand2 = Integer.parseInt(input2);

        int result = operand1 + operand2;

        System.out.println("Result: " + result);

    }

}
