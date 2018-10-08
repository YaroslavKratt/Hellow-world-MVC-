package ua.training;

import java.util.Scanner;

/**
 * Created by raccoon888 on 05.10.2018
 */
public class Controller {
    public static final String HELLOW = "Hellow";
    public static final String WORLD = "world!";
    private Model model;
    private View view;

    Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        model.setData(validateIput(scanner));
        model.concatenateWithData(validateIput(scanner));

        view.printMassage(model.getData());



    }

    private String validateIput(Scanner scanner){
        String output = "";

        if(model.getData().equals(Controller.HELLOW)){
            System.out.println(View.WORLD_MESSAGE);
        }
        else {
            System.out.println(View.HELLOW_MESSAGE);
        }
        while (scanner.hasNext() != false){
            String next=scanner.next();

            if((next.equals( Controller.HELLOW)) || next.equals(Controller.WORLD)){
                output=next;
                break;
            }
            else {
                System.out.println(View.INVALID_INPUT_MESSAGE);
            }
        }
        return output;
    }



}
