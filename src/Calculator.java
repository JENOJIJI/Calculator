import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator implements ActionListener {
    JLabel displayField;
    JButton openBracketButton, zeroButton, dotButton, sevenButton, eightButton, nineButton, plusButton, fourButton,
            fiveButton, sixButton, minusButton, oneButton, twoButton, threeButton, multiplyButton, closedBracketButton,
            clearButton, deleteButton, divisionButton, equalToButton;

    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        displayField = new JLabel();
        displayField.setBounds(20, 30, 340, 80);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2, true);
        displayField.setBorder(border);
        displayField.setOpaque(true);
        displayField.setBackground(Color.WHITE);
        displayField.setFont(new Font("Arial", Font.BOLD, 30));
        displayField.setHorizontalAlignment(JLabel.RIGHT);
        Font buttonFond = new Font("Arial", Font.BOLD, 20);

        //button-creation
        // -- Header Row --
        openBracketButton = new JButton("(");
        openBracketButton.setBounds(20, 140, 70, 50);
        openBracketButton.addActionListener(this);
        openBracketButton.setFocusPainted(false);
        openBracketButton.setFont(buttonFond);
        frame.add(openBracketButton);
        clearButton = new JButton("C");
        clearButton.setBounds(110, 140, 70, 50);
        clearButton.addActionListener(this);
        clearButton.setFocusPainted(false);
        clearButton.setFont(buttonFond);
        frame.add(clearButton);
        deleteButton = new JButton("D");
        deleteButton.setBounds(200, 140, 70, 50);
        deleteButton.addActionListener(this);
        deleteButton.setFocusPainted(false);
        deleteButton.setFont(buttonFond);
        frame.add(deleteButton);
        divisionButton = new JButton("/");
        divisionButton.setBounds(290, 140, 70, 50);
        divisionButton.addActionListener(this);
        divisionButton.setFocusPainted(false);
        divisionButton.setFont(buttonFond);
        frame.add(divisionButton);


        // -- First Row--
        sevenButton = new JButton("7");
        sevenButton.setBounds(20, 210, 70, 50);
        sevenButton.addActionListener(this);
        sevenButton.setFocusPainted(false);
        sevenButton.setFont(buttonFond);
        frame.add(sevenButton);
        eightButton = new JButton("8");
        eightButton.setBounds(110, 210, 70, 50);
        eightButton.addActionListener(this);
        eightButton.setFocusPainted(false);
        eightButton.setFont(buttonFond);
        frame.add(eightButton);
        nineButton = new JButton("9");
        nineButton.setBounds(200, 210, 70, 50);
        nineButton.addActionListener(this);
        nineButton.setFocusPainted(false);
        nineButton.setFont(buttonFond);
        frame.add(nineButton);
        plusButton = new JButton("+");
        plusButton.setBounds(290, 210, 70, 50);
        plusButton.addActionListener(this);
        plusButton.setFocusPainted(false);
        plusButton.setFont(buttonFond);
        frame.add(plusButton);

        // -- Second Row
        fourButton = new JButton("4");
        fourButton.setBounds(20, 280, 70, 50);
        fourButton.addActionListener(this);
        fourButton.setFocusPainted(false);
        fourButton.setFont(buttonFond);
        frame.add(fourButton);
        fiveButton = new JButton("5");
        fiveButton.setBounds(110, 280, 70, 50);
        fiveButton.addActionListener(this);
        fiveButton.setFocusPainted(false);
        fiveButton.setFont(buttonFond);
        frame.add(fiveButton);
        sixButton = new JButton("6");
        sixButton.setBounds(200, 280, 70, 50);
        sixButton.addActionListener(this);
        sixButton.setFocusPainted(false);
        sixButton.setFont(buttonFond);
        frame.add(sixButton);
        minusButton = new JButton("-");
        minusButton.setBounds(290, 280, 70, 50);
        minusButton.addActionListener(this);
        minusButton.setFocusPainted(false);
        minusButton.setFont(buttonFond);
        frame.add(minusButton);

        // --Third Row --
        oneButton = new JButton("1");
        oneButton.setBounds(20, 350, 70, 50);
        oneButton.addActionListener(this);
        oneButton.setFocusPainted(false);
        oneButton.setFont(buttonFond);
        frame.add(oneButton);
        twoButton = new JButton("2");
        twoButton.setBounds(110, 350, 70, 50);
        twoButton.addActionListener(this);
        twoButton.setFocusPainted(false);
        twoButton.setFont(buttonFond);
        frame.add(twoButton);
        threeButton = new JButton("3");
        threeButton.setBounds(200, 350, 70, 50);
        threeButton.addActionListener(this);
        threeButton.setFocusPainted(false);
        threeButton.setFont(buttonFond);
        frame.add(threeButton);
        multiplyButton = new JButton("*");
        multiplyButton.setBounds(290, 350, 70, 50);
        multiplyButton.addActionListener(this);
        multiplyButton.setFocusPainted(false);
        multiplyButton.setFont(buttonFond);
        frame.add(multiplyButton);

        // -- Fourth Row --
        closedBracketButton = new JButton(")");
        closedBracketButton.setBounds(20, 420, 70, 50);
        closedBracketButton.addActionListener(this);
        closedBracketButton.setFocusPainted(false);
        closedBracketButton.setFont(buttonFond);
        frame.add(closedBracketButton);
        zeroButton = new JButton("0");
        zeroButton.setBounds(110, 420, 70, 50);
        zeroButton.addActionListener(this);
        zeroButton.setFocusPainted(false);
        zeroButton.setFont(buttonFond);
        frame.add(zeroButton);
        dotButton = new JButton(".");
        dotButton.setBounds(200, 420, 70, 50);
        dotButton.addActionListener(this);
        dotButton.setFocusPainted(false);
        dotButton.setFont(buttonFond);
        frame.add(dotButton);
        equalToButton = new JButton("=");
        equalToButton.setBounds(290, 420, 70, 50);
        equalToButton.addActionListener(this);
        equalToButton.setFocusPainted(false);
        equalToButton.setFont(buttonFond);
        frame.add(equalToButton);


        frame.setBackground(Color.BLACK);
        frame.add(displayField);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 550);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    public static ArrayList<String> tokenizeString(String expression) {
        String regex = "\\d*\\.\\d+|\\d+|[+\\-*/()]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        ArrayList<String> tokens = new ArrayList<>();

        while (matcher.find()) {
            tokens.add(matcher.group());
        }
        return tokens;
    }

    //Helper Functions start
    //Number_or_not_checking function
    private static boolean isNumber(String tokenStr) {
        try {
            Double.parseDouble(tokenStr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    //is operator or not checking
    private static boolean isOperator(String tokenStr) {
        return tokenStr.equals("+") || tokenStr.equals("-") || tokenStr.equals("*") || tokenStr.equals("/");
    }

    //precedence calculation function
    private static int precedence(String tokenStr) {
        return switch (tokenStr) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> -1;
        };
    }

    //Helper Functions end

    private static double performOperation(double A, double B, String operator) {
        double result=0;
        return switch (operator) {
            case "+" -> B + A;
            case "-" -> B - A;
            case "*" -> B * A;
            case "/" -> B / A;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };

    }

    public void calculate(String expression) {
        ArrayList<String> tokens = tokenizeString(expression);
        String postfix = convertInfixToPostFix(tokens);
        double result = evaluatePostfix(postfix);
        displayField.setText(String.valueOf(result));


    }

    public String convertInfixToPostFix(ArrayList<String> infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (String token : infix) {
            if (isNumber(token)) {
                postfix.append(token).append(' ');
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else if (isOperator(token)) {
                while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }
        return postfix.toString();
    }

    public double evaluatePostfix(String postfix) {
        String[] tokens = postfix.split(" ");
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(token);
            } else if (isOperator(token)) {
                double A = Double.parseDouble(stack.pop());
                double B = Double.parseDouble(stack.pop());
                double result = performOperation(A, B, token);
                stack.push(String.valueOf(result));
            }
        }
        return Double.parseDouble(stack.pop());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "C":
                displayField.setText("");
                break;
            case "D":
                displayField.setText(displayField.getText().substring(0, displayField.getText().length() - 1));
                break;
            case "=":
                calculate(displayField.getText());
                break;
            default:
                displayField.setText(displayField.getText() + e.getActionCommand());
                break;
        }
    }
}
