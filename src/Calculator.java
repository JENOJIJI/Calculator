import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculator {
    public Calculator() {
        JFrame frame = new JFrame("Calculator");


        JLabel displayField = new JLabel(" 0");
        displayField.setBounds(20, 30, 340, 80);
        Border border=BorderFactory.createLineBorder(Color.BLACK,2,true);
        displayField.setBorder(border);
        displayField.setOpaque(true);
        displayField.setBackground(Color.WHITE);
        displayField.setFont(new Font("Arial",Font.BOLD,30));
        displayField.setHorizontalAlignment(JLabel.RIGHT);
        Font buttonFond = new Font("Arial", Font.BOLD, 20);
        //button-creation
        // -- Header Row --
        JButton modulusButton = new JButton("%");
        modulusButton.setBounds(20,140,70,50);
        modulusButton.setFocusPainted(false);
        modulusButton.setFont(buttonFond);
        frame.add(modulusButton);
        JButton zeroButton = new JButton("C");
        zeroButton.setBounds(110,140,70,50);
        zeroButton.setFocusPainted(false);
        zeroButton.setFont(buttonFond);
        frame.add(zeroButton);
        JButton dotButton = new JButton("D");
        dotButton.setBounds(200,140,70,50);
        dotButton.setFocusPainted(false);
        dotButton.setFont(buttonFond);
        frame.add(dotButton);
        JButton divButton = new JButton("/");
        divButton.setBounds(290,140,70,50);
        divButton.setFocusPainted(false);
        divButton.setFont(buttonFond);
        frame.add(divButton);



        // -- First Row--
        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(20,210,70,50);
        sevenButton.setFocusPainted(false);
        sevenButton.setFont(buttonFond);
        frame.add(sevenButton);
        JButton eightButton = new JButton("8");
        eightButton.setBounds(110,210,70,50);
        eightButton.setFocusPainted(false);
        eightButton.setFont(buttonFond);
        frame.add(eightButton);
        JButton nineButton = new JButton("9");
        nineButton.setBounds(200,210,70,50);
        nineButton.setFocusPainted(false);
        nineButton.setFont(buttonFond);
        frame.add(nineButton);
        JButton plusButton = new JButton("+");
        plusButton.setBounds(290,210,70,50);
        plusButton.setFocusPainted(false);
        plusButton.setFont(buttonFond);
        frame.add(plusButton);

        // -- Second Row
        JButton fourButton = new JButton("4");
        fourButton.setBounds(20,280,70,50);
        fourButton.setFocusPainted(false);
        fourButton.setFont(buttonFond);
        frame.add(fourButton);
        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(110,280,70,50);
        fiveButton.setFocusPainted(false);
        fiveButton.setFont(buttonFond);
        frame.add(fiveButton);
        JButton sixButton = new JButton("6");
        sixButton.setBounds(200,280,70,50);
        sixButton.setFocusPainted(false);
        sixButton.setFont(buttonFond);
        frame.add(sixButton);
        JButton minusButton = new JButton("-");
        minusButton.setBounds(290,280,70,50);
        minusButton.setFocusPainted(false);
        minusButton.setFont(buttonFond);
        frame.add(minusButton);

        // --Third Row --
        JButton oneButton = new JButton("1");
        oneButton.setBounds(20,350,70,50);
        oneButton.setFocusPainted(false);
        oneButton.setFont(buttonFond);
        frame.add(oneButton);
        JButton twoButton = new JButton("2");
        twoButton.setBounds(110,350,70,50);
        twoButton.setFocusPainted(false);
        twoButton.setFont(buttonFond);
        frame.add(twoButton);
        JButton threeButton = new JButton("3");
        threeButton.setBounds(200,350,70,50);
        threeButton.setFocusPainted(false);
        threeButton.setFont(buttonFond);
        frame.add(threeButton);
        JButton multiplyButton = new JButton("x");
        multiplyButton.setBounds(290,350,70,50);
        multiplyButton.setFocusPainted(false);
        multiplyButton.setFont(buttonFond);
        frame.add(multiplyButton);

        // -- Fourth Row --
        JButton posOrNegButton = new JButton("+/-");
        posOrNegButton.setBounds(20,420,70,50);
        posOrNegButton.setFocusPainted(false);
        posOrNegButton.setFont(buttonFond);
        frame.add(posOrNegButton);
        JButton clearButton = new JButton("0");
        clearButton.setBounds(110,420,70,50);
        clearButton.setFocusPainted(false);
        clearButton.setFont(buttonFond);
        frame.add(clearButton);
        JButton deleteButton = new JButton(".");
        deleteButton.setBounds(200,420,70,50);
        deleteButton.setFocusPainted(false);
        deleteButton.setFont(buttonFond);
        frame.add(deleteButton);
        JButton divisionButton = new JButton("=");
        divisionButton.setBounds(290,420,70,50);
        divisionButton.setFocusPainted(false);
        divisionButton.setFont(buttonFond);
        frame.add(divisionButton);


        frame.setBackground(Color.BLACK);
        frame.add(displayField);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400  , 550);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
