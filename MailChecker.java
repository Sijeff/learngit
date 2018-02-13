import javax.swing.*;

public class MailChecker {
    public static void main (String[] args){
        int length;
        int width;
        int depth;

        length = Integer.parseInt(JOptionPane.showInputDialog("Längd?"));
        depth = Integer.parseInt(JOptionPane.showInputDialog("Tjocklek?"));
        width = Integer.parseInt(JOptionPane.showInputDialog("Bredd?"));

        if(((length <= 600 && length >= 140) && depth <= 100) && (depth >= 90 && (length + width + depth) <= 900)){
            JOptionPane.showMessageDialog(null, "Måtten OK");
        } else {
            JOptionPane.showMessageDialog(null, "Felaktiga mått");
        }
    }
}
