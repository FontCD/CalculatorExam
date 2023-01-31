package Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Div {

    public void selectDivOperands() throws IOException {
        System.out.println("\nSelect operand 1:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader1.readLine();

        System.out.println("\nSelect operand 2:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String input2 = reader2.readLine();

        int operand1 = Integer.parseInt(input1);
        int operand2 = Integer.parseInt(input2);

        if (operand2 == 0) {
            System.out.println("\nError");
        } else {
            int result = operand1 * operand2;
            System.out.println("\nResult: " + result);
        }
    }

}