package com.berkay.Soru2;

public abstract class Component {
    int width;
    int height;
    String text;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Component{");
        sb.append("text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Component() {
        this.width =100;
        this.height =50;
        this.text = "Default Text";
    }

    public Component(int width, int height, String text) {
        super();
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
