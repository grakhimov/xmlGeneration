package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Utils.Generator.generateXml;

/**
 * Created by George_Rakhimov on 7/5/2017.
 */
public class XmlGenerator extends JFrame {
    private JButton button1 = new JButton("Generate");
    private JButton button2 = new JButton("Exit");
    private JTextField input1 = new JTextField("");
    private JTextField input2 = new JTextField("");
    private JTextField input3 = new JTextField("\\GEUK\\");
    private JLabel label1 = new JLabel("Number of .xml's:");
    private JLabel label2 = new JLabel("Number of nodes:");
    private JLabel label3 = new JLabel("Path to save files:");
    private JRadioButton radio1 = new JRadioButton("Generate only products");
    private JRadioButton radio2 = new JRadioButton("Generate only prices");
    private JRadioButton radio3 = new JRadioButton("Generate products and prices");

    public XmlGenerator() {
        super(".xml Generator");
        this.setBounds(300, 300, 550, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        GroupLayout layout = new GroupLayout(container);
        container.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        radio3.setSelected(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numberOfFiles = Integer.valueOf(input1.getText());
                int numberOfNodes = Integer.valueOf(input2.getText());
                String path = input3.getText();
                boolean onlyProductsIsSelected = radio1.isSelected();
                boolean onlyPricesIsSelected = radio2.isSelected();
                boolean productsAndPricesAreSelected = radio3.isSelected();
                generateXml(numberOfFiles, numberOfNodes, path, onlyProductsIsSelected, onlyPricesIsSelected, productsAndPricesAreSelected);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label1)
                                .addComponent(label2)
                                .addComponent(label3)
                        )

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(input1)
                                .addComponent(input2)
                                .addComponent(input3)
                        )

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(radio1)
                                .addComponent(radio2)
                                .addComponent(radio3)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button1)
                                .addComponent(button2)
                        ));


        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(input1)
                                .addComponent(radio1)
                                .addComponent(button1)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(input2)
                                .addComponent(radio2)
                                .addComponent(button2)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(input3)
                                .addComponent(radio3)
                        )
        );

    }

    public static void main(String[] args) {
        XmlGenerator app = new XmlGenerator();
        app.setVisible(true);
    }
}
