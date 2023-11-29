import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FirstPage extends JFrame implements ActionListener {
    JLabel l1, l2, limage;
    JButton b1;

    FirstPage() {
        l1 = new JLabel("Currency Converter");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l2 = new JLabel("You Travel, We Calculate!");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        b1 = new JButton("Next");
        ImageIcon i = new ImageIcon("CurrencyBackground.jpeg");
        limage = new JLabel(i);
        l1.setBounds(80, 50, 280, 30);
        l2.setBounds(120, 80, 280, 30);
        b1.setBounds(160, 200, 100, 50);
        limage.setBounds(0, 0, 450, 330);
        add(limage);
        limage.add(b1);
        limage.add(l1);
        limage.add(l2);

        setLayout(null);
        setSize(450, 300);
        setTitle("Currency Exchange First Page");
        setLocation(340, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        CurrencyConverter w = new CurrencyConverter();
    }
}

public class CurrencyConverter extends JFrame implements ItemListener, ActionListener {
    JComboBox convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, exit, reset;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;

    public CurrencyConverter() {
        super("Currency Converter");
        setSize(450, 350);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setLocation(340, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30, 45, 250, 30);
        lblFrom.setForeground(Color.RED);
        add(lblFrom);

        convertFrom = new JComboBox();
        convertFrom.setBounds(30, 70, 170, 30);
        convertFrom.addItem("India (Rupee)");
        convertFrom.addItem("US (Dollar)");
        convertFrom.addItem("Philippine (Peso)");
        convertFrom.addItem("Japan (Yen)");
        convertFrom.addItem("UK (Pound)");
        convertFrom.addItem("China (Yuan)");
        convertFrom.addItem("Korea (Won)");
        convertFrom.addItem("Thailand (Thai Baht)");
        convertFrom.addItem("Canada (Canadian Dollar)");
        convertFrom.addItem("Europe (Euros)");
        add(convertFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(230, 45, 250, 30);
        lblTo.setForeground(Color.RED);
        add(lblTo);

        convertTo = new JComboBox();
        convertTo.setBounds(230, 70, 170, 30);
        convertTo.addItem("India (Rupee)");
        convertTo.addItem("US (Dollar)");
        convertTo.addItem("Philippine (Peso)");
        convertTo.addItem("Japan (Yen)");
        convertTo.addItem("UK (Pound)");
        convertTo.addItem("China (Yuan)");
        convertTo.addItem("Korea (Won)");
        convertTo.addItem("Thailand (Thai Baht)");
        convertTo.addItem("Canada (Canadian Dollar)");
        convertTo.addItem("Europe (Euros)");
        add(convertTo);

        from = new JLabel("Enter Amount to Convert");
        from.setBounds(50, 110, 300, 30);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(50, 140, 300, 30);
        add(txtFrom);

        compute = new JButton("Compute");
        compute.setBounds(50, 250, 100, 30);
        add(compute);

        reset = new JButton("Reset");
        reset.setBounds(170, 250, 100, 30);
        add(reset);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50, 170, 300, 30);
        add(to);

        txtTo = new JTextField(15);
        txtTo.setBounds(50, 200, 300, 30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        exit = new JButton("Exit");
        exit.setBounds(290, 250, 100, 30);
        add(exit);

        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exit();
            }

        });
    }

    public void exit() {
        setVisible(false);
        dispose();
        System.exit(0);
    }

    public static void main(String args[]) {
        FirstPage f = new FirstPage();

    }

    public void ConvertDollar() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 50.49);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 115.37);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 33.30);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 82.44);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 6.39);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 1195.84);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 1.28);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.88);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.75);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertPeso() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.020);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 2.29);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 0.66);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 1.48);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 0.13);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 23.69);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 0.025);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.018);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.015);
            txtTo.setText(" " + result);
        }

    }

    public void ConvertYen() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.0087);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 0.44);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 0.28);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 0.63);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 0.056);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 10.55);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 0.011);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.0078);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.0065);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertBaht() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.030);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 1.52);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 3.46);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 2.24);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 0.19);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 35.51);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 0.038);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.026);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.022);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertPound() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 1.33);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 67.40);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 154.00);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 44.48);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 99.46);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 8.53);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 1595.55);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 1.71);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 1.18);
            txtTo.setText(" " + result);
        } else {
            result = (input);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertRupee() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.012);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 0.68);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 1.55);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 0.45);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 0.085);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 15.93);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 0.017);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.012);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.010);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertYuan() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.16);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 7.90);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 17.74);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 5.27);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 11.74);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 187.05);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 0.20);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.14);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.12);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertWon() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.00084);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 0.042);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 0.095);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 0.028);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 0.063);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 0.0053);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 0.0011);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.00074);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.00067);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertCanadian() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 0.78);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 39.48);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 88.60);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 26.33);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 58.69);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 5.00);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 934.91);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input * 0.69);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.59);
            txtTo.setText(" " + result);
        }
    }

    public void ConvertEuros() {
        if (convertTo.getSelectedItem() == "US (Dollar)") {
            result = (input * 1.13);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Philippine (Peso)") {
            result = (input * 57.14);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Japan (Yen)") {
            result = (input * 128.27);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Thailand (Thai Baht)") {
            result = (input * 38.12);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "India (Rupee)") {
            result = (input * 84.98);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "China (Yuan)") {
            result = (input * 7.24);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Korea (Won)") {
            result = (input * 1353.69);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Canada (Canadian Dollar)") {
            result = (input * 1.45);
            txtTo.setText(" " + result);
        } else if (convertTo.getSelectedItem() == "Europe (Euros)") {
            result = (input);
            txtTo.setText(" " + result);
        } else {
            result = (input * 0.85);
            txtTo.setText(" " + result);
        }
    }

    public void actionPerformed(ActionEvent e) {
        input = Double.parseDouble(txtFrom.getText());
        String msg = txtFrom.getText();

        if (e.getSource() == compute) {
            if (convertFrom.getSelectedItem() == "US (Dollar)") {
                ConvertDollar();
            } else if (convertFrom.getSelectedItem() == "Philippine (Peso)") {
                ConvertPeso();
            } else if (convertFrom.getSelectedItem() == "India (Rupee)") {
                ConvertRupee();
            } else if (convertFrom.getSelectedItem() == "Japan (Yen)") {
                ConvertYen();
            } else if (convertFrom.getSelectedItem() == "Korea (Won)") {
                ConvertWon();
            } else if (convertFrom.getSelectedItem() == "Canada (Canadian Dollar)") {
                ConvertCanadian();
            } else if (convertFrom.getSelectedItem() == "Europe (Euros)") {
                ConvertEuros();
            } else if (convertFrom.getSelectedItem() == "UK (Pound)") {
                ConvertPound();
            } else if (convertFrom.getSelectedItem() == "China (Yuan)") {
                ConvertYuan();
            } else {
                ConvertBaht();
            }
        } else if (e.getSource() == reset) {
            txtFrom.setText("");
            txtTo.setText("");
        } else {
            int choice = JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e) {

    }

}