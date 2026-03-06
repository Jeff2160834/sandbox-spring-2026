package org.example.sandbox.StreamAPI;

public class FluentApi {

    static void main(String[] args) {
        Widget widget = Widget.builder()
                .withLength(10)
                .withWidth(5)
                .withHeight(2)
                .build();

        System.out.println("Widget created with length: " + widget.getLength() +
                ", width: " + widget.getWidth() +
                ", height: " + widget.getHeight());
    }
}
