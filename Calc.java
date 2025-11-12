package com.back;

public class Calc {

    static int run(String num) {
        String[] tokens = num.split("\\s+");
        if (tokens.length == 0) {
            return 0;
        }

        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String opperator = tokens[i];

            int nextNumber = Integer.parseInt(tokens[i + 1]);

            switch (opperator) {
                case "+" :
                    result += nextNumber;
                    break;


                case "-" :
                    result -= nextNumber;
                    break;

                case "*" :
                    result *= nextNumber;
                    break;


                case "/" :
                    result /= nextNumber;
                    break;

            }

        }return result;
    }
}
