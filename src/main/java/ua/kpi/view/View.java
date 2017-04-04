package ua.kpi.view;

import ua.kpi.model.Fraction;

/**
 * Created by Bohdan on 25.03.2017.
 */
public class View {
    public final static String INPUT_STRING = "Enter your fraction";
    public final static String INPUT_NUMERATOR = "numerator:";
    public final static String INPUT_DENOMINATOR = "denominator:";
    public final static String ERROR_INPUT = "Wrong input!";
    public final static String OUTPUT = "Result fraction is: %s";

    public static final String ERROR_MENU =
            "Enter digit between 1 and 5!";

    public static final String ERROR_STRING =
            "ERROR :";

    public static final String REPEAT_STRING =
            "Repeat please!";

    public static final String ERROR_IMPROPER_FRACTION =
            "Imporper fraction!";

    public static final String[] MENU = {
            "1. Add;",
            "2. Substract;",
            "3. Divide;",
            "4. Multiply;",
            "5. Exit;"
    };

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printError(String errorMessage) {
        printMessage(ERROR_STRING + errorMessage + REPEAT_STRING);
    }

    public void printMenu(){
        for(String str : MENU){
            System.out.println(str);
        }
    }
}
