package view;


import javax.swing.*;
import java.awt.*;

public class AboutAuthorFrame extends JFrame{
    public AboutAuthorFrame(){
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        /*CREATING COMPONENTS*/
        ImageIcon authorImage = new ImageIcon("Resources/AuthorA/Author.jpg");
        JLabel authorJL = new TitleLabel("Автор",1,20);
        JLabel studentJL = new TitleLabel("Студент группы 10702320",1,20);
        JLabel initialsJL = new TitleLabel("Ревяко Алексей Александрович",1,20);
        JLabel gmailJL = new TitleLabel("alexreviako1@gmail.com",1,20);
        JButton exitJB = new JButton("Назад");
        exitJB.setSize(200,100);
        JLabel imageJL = new JLabel(new ImageIcon(authorImage.getImage().getScaledInstance(325,490,Image.SCALE_SMOOTH)));

        imageJL.setAlignmentX(Component.CENTER_ALIGNMENT);
        authorJL.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentJL.setAlignmentX(Component.CENTER_ALIGNMENT);
        initialsJL.setAlignmentX(Component.CENTER_ALIGNMENT);
        gmailJL.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitJB.setAlignmentX(Component.CENTER_ALIGNMENT);



        /*GETTING ACTION TO BUTTON*/
        exitJB.addActionListener(e->{
            this.dispose();
            new MenuFrame();
        });

        add(imageJL);
        add(authorJL);
        add(studentJL);
        add(initialsJL);
        add(gmailJL);
        add(exitJB);

        /*SETTING UP ABOUT AUTHOR FRAME*/
        setTitle("Author Info");
        setSize(375,700);
        //pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}