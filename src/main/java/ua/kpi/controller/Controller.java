package ua.kpi.controller;

import ua.kpi.model.Fraction;
import ua.kpi.model.Model;
import ua.kpi.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Bohdan on 25.03.2017.
 */
public class Controller {
    final int ADD_MENU_ITEM = 1;
    final int SUBSTRACT_MENU_ITEM = 2;
    final int MULTIPLY_MENU_ITEM = 3;
    final int DIVIDE_MENU_ITEM = 4;
    final int EXIT_MENU_ITEM = 5;

    String MENU_REGEXP =
            "1|2|3|4|5";

    String NUMBER_REGEXP =
            "[+-]?\\d+";

    Model model;
    View view;

    Fraction fraction;
    Fraction other;

    Scanner scanner = new Scanner(System.in);

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        fraction = createFraction();
        while (true) {
            view.printMenu();
            switch (getMenuItem()) {
                case ADD_MENU_ITEM:
                    other = createFraction();
                    fraction = model.add(fraction, other);
                    view.printMessage(String.format(view.OUTPUT,fraction.toString()));
                    break;
                case SUBSTRACT_MENU_ITEM:
                    other = createFraction();
                    fraction = model.substract(fraction, other);
                    view.printMessage(String.format(view.OUTPUT,fraction.toString()));
                    break;
                case MULTIPLY_MENU_ITEM:
                    other = createFraction();
                    fraction = model.multiply(fraction, other);
                    view.printMessage(String.format(view.OUTPUT,fraction.toString()));
                    break;
                case DIVIDE_MENU_ITEM:
                    other = createFraction();
                    fraction = model.divide(fraction, other);
                    view.printMessage(String.format(view.OUTPUT,fraction.toString()));
                    break;
                case EXIT_MENU_ITEM:
                    System.exit(0);
            }
        }
    }


    private int getMenuItem() {
        Pattern MENU_PATTERN = Pattern.compile(MENU_REGEXP);
        while (!scanner.hasNext(MENU_PATTERN)) {
            view.printError(View.ERROR_MENU);
            view.printMenu();
            scanner.next();
        }
        return Integer.parseInt(scanner.next());
    }

    private Fraction createFraction(){
        int numerator;
        int denominator;
        Pattern NUMBER_PATTERN = Pattern.compile(NUMBER_REGEXP);
        while (true) {
            view.printMessage(view.INPUT_STRING);
            view.printMessage(view.INPUT_NUMERATOR);
            while (!scanner.hasNext(NUMBER_PATTERN)) {
                view.printError(View.ERROR_INPUT);
                scanner.next();
            }
            numerator = Integer.parseInt(scanner.next());
            view.printMessage(view.INPUT_DENOMINATOR);
            while (!scanner.hasNext(NUMBER_PATTERN)) {
                view.printError(View.ERROR_INPUT);
                scanner.next();
            }
            denominator = Integer.parseInt(scanner.next());
            if(denominator > numerator)
                return new Fraction(denominator, numerator);
            else
                view.printError(view.ERROR_IMPROPER_FRACTION);
        }
    }
}
