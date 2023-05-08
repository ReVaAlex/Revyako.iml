package view;

import javax.swing.*;
import java.awt.*;
/**
 * Класс для стартового окна
 * @author Revyako A.A.
 * @version 1.0 25.02.2023
 */
public class StartFrame extends JFrame {
    public static void main(String[] args) {
        StartFrame startFrame = new StartFrame();
        startFrame.setTitle("Start menu");
        startFrame.setSize(800,600);
        startFrame.setLocationRelativeTo(null);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setVisible(true);
    }
    public StartFrame(){
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        /*Creating all components*/
        TitleLabel bntuJL = new TitleLabel("Белорусский национальный технический универистет",1,20);
        TitleLabel fitrJL = new TitleLabel("Факультет информационных технологий и робототехники",1,16);
        TitleLabel departmentJL = new TitleLabel("Кафедра программного обеспечения информационных информационных систем и технологий",1,16);
        TitleLabel courseWorkJL = new TitleLabel("Курсовая Работа", 1, 20);
        TitleLabel disciplineJL = new TitleLabel("по дисциплине \"Программирование на языке Java\"",3,15);
        TitleLabel titleNameJL = new TitleLabel("Колебательные процессы в RL цепи",1,25);
        TitleLabel authorInfoJL = new TitleLabel("Выполнил:Студент группы 10702320",1,16);
        TitleLabel authorInitialsJL = new TitleLabel("Ревяко Алексей Александрович",1,16);
        TitleLabel reviewerInfoJL = new TitleLabel("Преподаватель:к.ф.-м.н.,доц.",1,16);
        TitleLabel reviewerInitialsJL = new TitleLabel("Сидорик Валерий Владимирович",1,16);
        TitleLabel placeJL = new TitleLabel("Минск, 2023",1,16);

        /*Creating panels*/
        JPanel topJP = new JPanel(new BorderLayout());
        JPanel titleJP = new JPanel(new BorderLayout());
        JPanel middleJP = new JPanel(new GridLayout(1,2,15,0));
        JPanel buttonsJP = new JPanel(new GridLayout(1,2,0,0));
        JPanel placeJP = new JPanel(new BorderLayout());

        /*Adding all panels on main panel*/
        add(topJP,0);
        add(titleJP,1);
        add(middleJP,2);
        add(placeJP,3);
        add(buttonsJP,4);

        /*SETTING UP TOP PANEL*/
        JPanel bntuJP = new JPanel();
        bntuJP.setPreferredSize(new Dimension(WIDTH,30));
        bntuJP.add(bntuJL);

        JPanel fitrJP = new JPanel();
        fitrJP.setPreferredSize(new Dimension(WIDTH,25));
        fitrJP.add(fitrJL);

        JPanel departmentJP = new JPanel();
        departmentJP.setPreferredSize(new Dimension(WIDTH,30));
        departmentJP.add(departmentJL);

        topJP.add(bntuJP,BorderLayout.NORTH);
        topJP.add(fitrJP,BorderLayout.CENTER);
        topJP.add(departmentJP,BorderLayout.SOUTH);

        /*SETTING UP TITLE PANEL*/
        JPanel courseWorkJP = new JPanel();
        courseWorkJP.add(courseWorkJL);

        JPanel disciplineJP = new JPanel();
        disciplineJP.add(disciplineJL);

        JPanel titleNameJP = new JPanel();
        titleNameJP.add(titleNameJL);

        titleJP.add(courseWorkJP,BorderLayout.NORTH);
        titleJP.add(disciplineJP,BorderLayout.CENTER);
        titleJP.add(titleNameJP,BorderLayout.SOUTH);

        /*SETTING UP MIDDLE PANEL*/
        JPanel iconImageJP = new JPanel();
        ImageIcon logoImage = new ImageIcon("Resources/AuthorA/Main.png");
        JLabel imageJL = new JLabel(new ImageIcon(logoImage.getImage().getScaledInstance(170,170,Image.SCALE_SMOOTH)));
        iconImageJP.add(imageJL);

        JPanel otherInfoJP = new JPanel(new GridLayout(2,1,0,0));
        JPanel authorInfoJP = new JPanel(new BorderLayout());
        authorInfoJP.add(authorInfoJL,BorderLayout.NORTH);
        authorInfoJP.add(authorInitialsJL,BorderLayout.CENTER);

        JPanel reviewerInfoJP = new JPanel(new BorderLayout());
        reviewerInfoJP.add(reviewerInfoJL,BorderLayout.CENTER);
        reviewerInfoJP.add(reviewerInitialsJL,BorderLayout.SOUTH);
        otherInfoJP.add(authorInfoJP,0);
        otherInfoJP.add(reviewerInfoJP,1);

        middleJP.add(iconImageJP,0);
        middleJP.add(otherInfoJP,1);

        /*SETTING UP PLACE PANEL*/
        placeJP.add(placeJL,BorderLayout.CENTER);
        placeJP.setPreferredSize(new Dimension(WIDTH,10));

        /*SETTING UP BUTTON PANEL*/
        JButton nextButton = new JButton("Далее");
        JButton exitButton = new JButton("Выход");
        buttonsJP.add(nextButton,0);
        buttonsJP.add(exitButton,1);
        nextButton.addActionListener(e->{
            //this.dispose();
            new MenuFrame();
        });

        exitButton.addActionListener(e->{
            this.dispose();
        });

    }

}