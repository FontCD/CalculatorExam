package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selector {

    public void selectOperation() throws IOException {
        System.out.println("\n1) Sum\n2) Sub\n3) Multiplication\n4) Division\n5) Logarithm (base10)\n6) Sqrt\n7) Exit");
        System.out.println("\nSelect operation:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        switch (input) {
            case "1" -> {
                Sum sum = new Sum();
                sum.selectSumOperands();
            }
            case "2" -> {
                Sub sub = new Sub();
                sub.selectSubOperands();
            }
            case "3" -> {
                Molt molt = new Molt();
                molt.selectMoltOperands();
            }
            case "4" -> {
                Div div = new Div();
                div.selectDivOperands();
            }
            case "5" -> {
                Log log = new Log();
                log.selectLogOperands();
            }
            case "6" -> {
                Rad rad = new Rad();
                rad.selectRadOperands();
            }
            case "7" -> System.exit(0);
            default -> selectOperation();
        }


        System.out.println("\nContinue or exit?\n1) New calculation\n2) Exit ");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String input2 = reader2.readLine();

        if (input2.equals("1")) {
            selectOperation();
        }
        if (input2.equals("2")) {
            System.exit(0);
        }

    }

}