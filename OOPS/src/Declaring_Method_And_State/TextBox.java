package Declaring_Method_And_State;

public class TextBox {
    public String text; //Field

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
