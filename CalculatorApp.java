import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorApp implements ActionListener
{
    // req variables
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    int calculation ;

    // CREATING REQ OBJ.

    JFrame frame = new JFrame("Calculator");
    JLabel lable = new JLabel();
    JTextField textfield = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("ON");
    JRadioButton offRadioButton = new JRadioButton("OFF");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");

    CalculatorApp()
    {
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui()
    {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);         // No Layout Manager
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);        // For window at center of the screen
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents()
    {
        // setting the lable parameters

        lable.setBounds(250, 0, 50, 50);
        lable.setForeground(Color.white);
        frame.add(lable);

        // setting the text area over frame

        textfield.setBounds(10, 40, 270, 40);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);        // TEXT WILL NOT EDITABLE
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);

        // setting the radio button over frame

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        // grouping ON and OFF button

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(onRadioButton);
        buttongroup.add(offRadioButton);

        // setting numeric buttons 

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);
    
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(239,188,2));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        buttonDiv.setBackground(new Color(79,255,55));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);
        
        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(new Color(79,255,55));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);


        buttonMinus.setBounds(220, 170, 60, 40);        
        buttonMinus.setFont(new Font("Arial",Font.BOLD,20));
        buttonMinus.setBackground(new Color(79,255,55));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);


        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
        buttonPlus.setBackground(new Color(79,255,55));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);


        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);


        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);


        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial",Font.BOLD,12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);



        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial",Font.BOLD,12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);


    }

    public void addActionEvent()
    {
        // respective code executed for each button using actionperformed
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)   // for buttons action event
    {
        Object source = e.getSource();   // object of Object class to take inp


        if(source==onRadioButton) //if onrad is pressed
        {
            enable();  // all the components willl be enabled
        }
        else if(source==offRadioButton)
        {
            disable();    // all buttons are disable only onRadioisenbled
        }
        else if(source==buttonClear)  // clear all the text from window
        {   
            lable.setText("");
            textfield.setText("");
        }
        else if(source==buttonDelete)   // delete the numbers one by one until it clears
        {
            int length = textfield.getText().length();    // store the length of numbers present at text
            int number = length-1;  //  as we using the stringbuilder to store numbers hence length should be -1 from full length 
            if(length>0)
            {
                StringBuilder back = new StringBuilder(textfield.getText());   // storing the text into string such that we can delete numbers one by one
                back.deleteCharAt(number);   // delete the last number
                textfield.setText(back.toString());   // print the remaining numbers to text
            
            }

            if(textfield.getText().endsWith(""))   // if there is no text at textField the set label to blank
            {
                lable.setText("");
            }
        }
        else if(source==buttonZero)  // if zero is pressed
        {
            if(textfield.getText().equals("0")) // if textField is already zero then dont add zero simply return
            {
                return ;
            }
            else
            {
                textfield.setText(textfield.getText()+"0");
            }
        }
        else if(source==buttonOne)
        {
            textfield.setText(textfield.getText()+"1");
        }
        else if(source==buttonTwo)
        {
            textfield.setText(textfield.getText()+"2");
        }
        else if(source==buttonThree)
        {
            textfield.setText(textfield.getText()+"3");
        }
        else if(source==buttonFour)
        {
            textfield.setText(textfield.getText()+"4");
        }
        else if(source==buttonFive)
        {
            textfield.setText(textfield.getText()+"5");
        }
        else if(source==buttonSix)
        {
            textfield.setText(textfield.getText()+"6");
        }
        else if(source==buttonSeven)
        {
            textfield.setText(textfield.getText()+"7");
        }
        else if(source==buttonEight)
        {
            textfield.setText(textfield.getText()+"8");
        }
        else if(source==buttonNine)
        {
            textfield.setText(textfield.getText()+"9");
        }
        else if(source==buttonDot)
        {
            if(textfield.getText().contains(".")) // if there is already decimal dont add it 
            {
                return ;
            }
            else
            {
                textfield.setText(textfield.getText()+".");  // add the decimal
            }
        }
        else if(source==buttonPlus)
        {
            String str = textfield.getText();  // store the number present at textfield as a string 
            num1 = Double.parseDouble(textfield.getText());    //store the text as the double value
            calculation = 1;
            textfield.setText("");  // clear the textfield
            lable.setText( str+"+");   // show the text along with plus sign  

        }
        else if(source==buttonMinus)
        {
            String str = textfield.getText();  // store the number present at textfield as a string 
            num1 = Double.parseDouble(textfield.getText());    //store the text as the double value
            calculation = 2;
            textfield.setText("");  // clear the textfield
            lable.setText( str+"-");   // show the text along with Minus sign  

        }
        else if(source==buttonMul)
        {
            String str = textfield.getText();  // store the number present at textfield as a string 
            num1 = Double.parseDouble(textfield.getText());    //store the text as the double value
            calculation = 3;
            textfield.setText("");  // clear the textfield
            lable.setText( str+"X");   // show the text along with MUL sign  

        }
        else if(source==buttonDiv)
        {
            String str = textfield.getText();  // store the number present at textfield as a string 
            num1 = Double.parseDouble(textfield.getText());    //store the text as the double value
            calculation = 4;
            textfield.setText("");  // clear the textfield
            lable.setText( str+"/");   // show the text along with Div sign  

        }
        else if(source==buttonSquare)
        {
            num1 = Double.parseDouble(textfield.getText());    //store the text as the double value
            double square = Math.pow(num1,2);          // make its square
            String string = Double.toString(square);      // convert the value into string
            textfield.setText(string);       // print the string at textfield

        }
        else if(source==buttonSqrt)
        {
            num1 = Double.parseDouble(textfield.getText());
            double sqrt = Math.sqrt(num1);
            textfield.setText(Double.toString(sqrt));
        }
        else if(source==buttonReciprocal)
        {
            num1 = Double.parseDouble(textfield.getText());
            double Reciprocal =  1/num1 ;
            textfield.setText(Double.toString(Reciprocal));
        }
        else if(source==buttonEqual)
        {
            num2 = Double.parseDouble(textfield.getText());   // store the second number
            switch(calculation)               // for performing operations
            {
                case 1:                     // Addition
                result = num1 + num2;
                break;

                case 2:
                result = num1 - num2;
                break;

                case 3:
                result = num1 * num2;
                break;

                case 4:
                result = num1 / num2 ;
                break;
            }

            textfield.setText(Double.toString(result));

            lable.setText("");     // clear the label 
            num1 = result ;
        }

    }


    public void enable()
    {
        onRadioButton.setEnabled(false);  // already pressed 
        offRadioButton.setEnabled(true);
        textfield.setEnabled(true);
        lable.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
    }


    public void disable()
    {

        onRadioButton.setEnabled(true);  // only these button is enabled
        offRadioButton.setEnabled(false);
        textfield.setEnabled(false);
        lable.setEnabled(false);
        lable.setText("");  // clear the lable
        textfield.setText("");   // clear the text field
        buttonClear.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);

    }




    public static void main(String[] args)
    {
        CalculatorApp calculator = new CalculatorApp();
    }
}