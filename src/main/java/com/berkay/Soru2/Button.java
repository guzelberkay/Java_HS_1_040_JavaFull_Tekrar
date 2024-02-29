package com.berkay.Soru2;

public class Button extends Component{

    public Button(int width, int height, String label){
        super(width, height, label);
    }
    public void onClick(){
        System.out.println("Butona tıklandi.");
    }
}
