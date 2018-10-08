package ua.training;

/**
 * Created by raccoon888 on 05.10.2018
 */
public class Model {
    private String data = "";

    public void setData(String input){
        this.data = input;
    }

    public String getData(){
        return this.data;
    }

    public String concatenateWithData(String strToAdd){
        this.data += " " + strToAdd;
        return this.data;
    }
}
