package pt.ipb.esact.poo.aulas.aula08;

import javax.swing.*;
import java.util.ArrayList;

public class Praticar6 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        while (true) {
            String umaString = JOptionPane.showInputDialog("cenas");
            String[] split = umaString.split(":");

            // no split(":"), se for "index:?" vai ser length = 2
            if (split.length > 1) {
                int index = Integer.parseInt(split[1]);
                try {
                    String s = stringList.get(index);
                    System.out.println("A string na posição " + index + " é " + s);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("A posição " + index + " não existe");
                }
            } else {
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

}
