package ua.kpi;

import ua.kpi.controller.Controller;
import ua.kpi.model.Model;
import ua.kpi.view.View;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
