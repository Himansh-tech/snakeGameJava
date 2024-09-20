package snakegame; //package lena padta hai kyuki ham source package ke andara ek aur folder ke andar hai agar nahi hote to koi jarurat nahi tha mention karen ka

import javax.swing.*;
public class SnakeGame extends JFrame{
    
    //constructor
    SnakeGame(){
        super("Saap Khaye Sev");
        add(new Board());
        pack();//refresh frame so that new changes can be visible
        
        //setLocation(500,200);//sets location of frame but we can decide center so we will use function
        setLocationRelativeTo(null);
        setResizable(false);
        
    }
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);//fram already hota hai usse bas abhi visibility true kar rahe hai frame default top left me minimum size me khulta hai;//class ka object banate hi class ka constructor call hota hai
    }
    
}
