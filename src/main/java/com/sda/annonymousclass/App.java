package com.sda.annonymousclass;

import javafx.scene.control.Button;

public class App {

    public interface Buttont {
        void click();

      //  void mouseOn();
    }

    public static void action() {
        Buttont buttont = new Buttont() {
            @Override
            public void click() {
                System.out.println("Buttont is clicked.");
            }

//            @Override
//            public void mouseOn() {
//                System.out.println("Mouse is moved.");
//            }
        };
        buttont.click();
        // buttont.mouseOn();
    }

    public static void main(String[] args) {
        Buttont buttont = () -> System.out.println("Buttont is clicked."); //()lista parametrow -> wykonanie metody
        buttont.click();

        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread.");
            }
        };

        Runnable r1 = () -> System.out.println("New thread.");
        r1.run();

        Button btn = new Button();
        btn.setText("Test");
        btn.setOnAction(event -> System.out.println("Button is clicked!"));

    }
}
