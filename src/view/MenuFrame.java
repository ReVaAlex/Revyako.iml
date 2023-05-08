package view;

import Plot.GraphPlotter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuFrame extends JFrame{

    public double func(double y){
        double E = 5; // Перенести функцию в другой класс
        double R = 2; // Изменить библиотеку для отрисовки (рассмотреть StdDraw)
        double L = 1; //
        return E-R*y/L;
    }

    public  MenuFrame() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        //CREATING COMPONENTS
        JPanel panel = new JPanel();

        List<Double> X = new ArrayList<>();
        List<Double> Y = new ArrayList<>();

        double R = 2;
        double L = 1;
        double x = 0;
        double y = 0;
        double k1 ,k2, k3, k4, h = 0.01; // шаг
        while (x < L/R){

            k1 = func(y);

            k2 = func(y + h*k1/2.0);

            k3 = func(y + h*k2/2.0);

            k4 = func(y + h*k3);

            y = y + (k1 + 2.0*k2 + 2.0*k3 + k4)/6.0;
            X.add(x);
            Y.add(y);
            x+=h;
        }
        panel.add(GraphPlotter.createChart(X,Y));

        JButton aboutAuthorJB = new JButton("Об авторе");
        JButton aboutProgramJB = new JButton("О программе");
        JButton exitJB = new JButton("Выход");
        aboutAuthorJB.setSize(100, 400);
        aboutAuthorJB.setAlignmentX(Component.CENTER_ALIGNMENT);
        aboutProgramJB.setSize(100, 400);
        aboutProgramJB.setAlignmentX(Component.CENTER_ALIGNMENT);

        exitJB.setSize(100, 400);
        exitJB.setAlignmentX(Component.CENTER_ALIGNMENT);


        JPanel enterJP = new JPanel(new GridLayout(7, 1, 0, 0));
        JPanel menuButtonsJP = new JPanel(new FlowLayout());

        JPanel infosJP = new JPanel(new GridLayout(1, 2, 0, 0));
        JPanel exitJP = new JPanel(new GridLayout(1, 2, 0, 0));

        infosJP.add(aboutProgramJB, 0);
        infosJP.add(aboutAuthorJB, 1);


        exitJP.add(exitJB, 0);

        menuButtonsJP.add(infosJP);
        menuButtonsJP.add(exitJP);


        add(panel);
        add(enterJP);
        add(menuButtonsJP);


        /*GETTING ACTIONS TO BUTTONS*/
        aboutAuthorJB.addActionListener(e -> {
            this.dispose();
            new AboutAuthorFrame();
        });

        aboutProgramJB.addActionListener(e -> {
            this.dispose();
            new AboutProgramFrame();
        });

        exitJB.addActionListener(e -> {
            this.dispose();
        });
        setVisible(true);
        pack();

    }}





