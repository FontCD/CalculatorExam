package Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Log {

    public void selectLogOperands() throws IOException {
        System.out.println("\nSelect operand 1:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader1.readLine();

        int operand1 = Integer.parseInt(input1);
        double result = Math.log10(operand1);

        System.out.println("Result: " + result);
    }

}