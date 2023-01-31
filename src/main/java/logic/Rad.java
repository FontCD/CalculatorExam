package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rad {

    public void selectRadOperands() throws IOException {
        System.out.println("\nSelect operand 1:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader1.readLine();

        int operand1 = Integer.parseInt(input1);
        double result = Math.sqrt(operand1);

        System.out.println("Result: " + result);
    }

}