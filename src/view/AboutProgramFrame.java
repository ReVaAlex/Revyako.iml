package view;

import javax.swing.*;
import java.awt.*;

public class AboutProgramFrame extends JFrame {
    public AboutProgramFrame(){
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        /*creating all components*/
        JLabel titleJL = new TitleLabel("Колебательные процессы в RL цепи",1,20);
        JPanel titleJP = new JPanel(new BorderLayout());
        titleJP.add(titleJL,BorderLayout.WEST);

        String line = new String("Программа позволяет:\n1. Вычислять формулу.\n2. Изменять входные параметры.\n3. Отрисока графика.");

        JTextArea mainJTA = new JTextArea(line,6,10);
        mainJTA.setFont(new Font("Dialog",Font.ITALIC,14));
        mainJTA.setTabSize(10);
        mainJTA.setLineWrap(true);
        mainJTA.setEditable(false);

        /*mainJTA.add(ruleLine1);
        mainJTA.setLineWrap(true);
        mainJTA.add(ruleLine2);
        mainJTA.setLineWrap(true);
        mainJTA.add(ruleLine3);
        mainJTA.setLineWrap(true);
        mainJTA.add(ruleLine4);
        mainJTA.setEditable(false);*/

        JPanel bottomJP = new JPanel(new FlowLayout());
        JTextField versionJTF = new JTextField("Версия 1.1.1.");
        JButton exitJB = new JButton("Назад");

        exitJB.addActionListener(e->{
            this.dispose();
            new MenuFrame();
        });

        bottomJP.add(versionJTF);
        bottomJP.add(exitJB);

        add(titleJP);
        add(mainJTA);
        add(bottomJP);

        /*SETTING UP ABOUT AUTHOR FRAME*/
        setTitle("About program");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}