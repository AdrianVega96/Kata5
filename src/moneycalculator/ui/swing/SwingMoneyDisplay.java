package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {
    public SwingMoneyDisplay(){
        setLayout(new FlowLayout());
        add(amount());
        add(currency());
    } 

    private JLabel currency() {
        JLabel currency = new JLabel("$");
        return currency;
    }

    private JLabel amount() {
        JLabel amount = new JLabel("500");
        return amount;
    }
}
