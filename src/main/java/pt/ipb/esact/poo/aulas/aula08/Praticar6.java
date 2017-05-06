package pt.ipb.esact.poo.aulas.aula08;

import javax.swing.*;
import java.util.ArrayList;

public class Praticar6 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        while (true) {
            String umaString = JOptionPane.showInputDialog("cenas");
            if ("print".equals(umaString) || umaString == null) {
                for (String s : stringList) {
                    System.out.println(s);
                }
                if (umaString == null)
                    break;
            } else {
                stringList.add(umaString);
            }
        }
    }

}
