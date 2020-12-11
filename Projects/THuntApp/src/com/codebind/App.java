package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class App {
    private JPanel panelMain;
    private JButton go;
    private JTextField case1;
    private JCheckBox check2020;
    private JCheckBox check2021;
    private String message;

    public App() {
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = case1.getText();
                if(check2020.isSelected()&&check2021.isSelected()){
                    message = "Error : Multiple years Selected";
                } else if(check2020.isSelected()){
                    message = getCase2020(c);
                } else if(check2021.isSelected()){
                    message = getCase2021(c);
                }
                JOptionPane.showMessageDialog(panelMain, message);
            }
        });
    }

    public String getCase2020(String x_){
        String x = x_.toLowerCase();
        if (x.equals("a")){
            return ("Super T-Hunt :: Nissan Skyline GT-R [BNR32]\n"+"T-Hunt :: Bubble Matic");
        } else if(x.equals("b")){
            return ("Super T-Hunt :: Ford GT-40\n" + "T-Hunt :: Mercedes-Benz Unimog 1300");
        } else if(x.equals("c")){
            return ("Super T-Hunt :: ’67 Commando Jeepster\n"+"T-Hunt :: Grass Chomper");
        } else if(x.equals("d")){
            return ("Super T-Hunt :: Porsche 918 Spyder\n"+"T-Hunt :: Buns of Steel");
        } else if(x.equals("e")){
            return ("Super T-Hunt :: ’88 Honda CR-X\n"+"T-Hunt :: Batman Arkham Asylum Batmobile");
        } else if(x.equals("f")){
            return ("Super T-Hunt :: Mazda RX-7\n"+"T-Hunt :: Circle Trucker");
        } else if(x.equals("g")){
            return ("Super T-Hunt :: ’17 Nissan GT-R (R35)\n"+"T-Hunt :: Dodge Charger Daytona");
        } else if(x.equals("h")){
            return ("Super T-Hunt :: ’84 Audi Sport Quattro\n"+"T-Hunt :: 2013 Hot Wheels Chevy Camaro Special Edition");
        } else if(x.equals("j")){
            return ("Super T-Hunt :: Lamborghini Sesto Elemento\n"+"T-Hunt :: Power Pistons");
        } else if(x.equals("k")){
            return ("Super T-Hunt :: ’57 Chevy\n"+"T-Hunt :: Custom ’56 Ford Truck");
        } else if(x.equals("l")){
            return ("Super T-Hunt :: Custom ’69 Chevy\n"+"T-Hunt :: Dune Daddy");
        } else if(x.equals("m")){
            return ("Super T-Hunt :: ’65 Ford Galaxie\n"+"T-Hunt :: Tricera-Truck");
        } else if(x.equals("n")){
            return ("Super T-Hunt :: ’18 Dodge Challenger SRT Demon\n"+"T-Hunt :: The Beatles Yellow Submarine");
        } else if(x.equals("p")){
            return ("Super T-Hunt :: ’17 Pagani Huayra Roadster\n"+"T-Hunt :: Chevy Silverado");
        } else if(x.equals("q")){
            return ("Super T-Hunt :: ’64 Chevy Chevelle SS\n"+"T-Hunt :: Dodge Viper RT/10");
        }
        return "Invalid Case";
    }

    public String getCase2021(String y_){
        String y = y_.toLowerCase();
        if (y.equals("a")){
            return ("Super T-Hunt :: Nissan 300ZX Twin Turbo\n"+"T-Hunt :: Baja Bone Shaker");
        } else if(y.equals("b")){
            return ("Super T-Hunt :: Corvette Grand Sport Roadster\n" + "T-Hunt :: Street Wiener");
        } else if(y.equals("c")){
            return ("Super T-Hunt :: Rodger Dodger\n"+"T-Hunt :: Not Released");
        } else if(y.equals("d")){
            return ("Super T-Hunt :: '95 Mazda RX-7\n"+"T-Hunt :: Not Released");
        } else if(y.equals("e")){
            return ("Super T-Hunt :: Corvette C7 Zo6 Convertible\n"+"T-Hunt :: Not Released");
        } else if(y.equals("f")){
            return ("Super T-Hunt :: Mazda RX-3\n"+"T-Hunt :: Not Released");
        } else if(y.equals("g")){
            return ("Super T-Hunt :: 2020 Ford Mustang Shelby GT500\n"+"T-Hunt :: Not Released");
        } else if(y.equals("h")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("j")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("k")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("l")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("m")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("n")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("p")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        } else if(y.equals("q")){
            return ("Super T-Hunt :: Not Released\n"+"T-Hunt :: Not Released");
        }
        return "Invalid Case";
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("T-hunt");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,300);
        //frame.pack();
        frame.setVisible(true);
    }

}
