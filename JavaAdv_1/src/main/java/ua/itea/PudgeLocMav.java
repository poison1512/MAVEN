package ua.itea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PudgeLocMav extends JPanel implements Serializable {
	private Locale localeEN = new Locale("en", "EN");
	private Locale localeDE = new Locale("de", "DE");
	private Locale localeRU = new Locale("ru", "RU");
	private ResourceBundle bundleEN = ResourceBundle.getBundle("TextBundle", localeEN);
	private ResourceBundle bundleDE = ResourceBundle.getBundle("TextBundle", localeDE);
	private ResourceBundle bundleRU = ResourceBundle.getBundle("TextBundle", localeRU);
	private JFrame window = new JFrame("Try to switch V 1.0");
	private JPanel panel = new JPanel();
	private JPanel panelT = new JPanel();
	private JPanel panelB = new JPanel();
	private JButton englButton = new JButton();
	private JButton germButton = new JButton();
	private JButton russButton = new JButton();
	private JButton saveButton = new JButton("Save");
	private JButton loadButton = new JButton("Load");
	private JLabel picLabel = new JLabel(new ImageIcon(getClass().getResource("/img/pudge.png")));
	private JLabel txtLabel1 = new JLabel(bundleRU.getString("Joshua"));
	private JLabel txtLabel2 = new JLabel(bundleDE.getString("Sara"));
	private JLabel txtLabel3 = new JLabel(bundleEN.getString("Ash"));

	public PudgeLocMav() {
		
			this.setBackground(Color.WHITE);
			window.add(this);
			picLabel.setBackground(Color.WHITE);
		
			englButton.addActionListener((e)-> txtLabel1.setText(bundleEN.getString("Joshua")));
			englButton.addActionListener((e)-> txtLabel2.setText(bundleEN.getString("Sara")));
			englButton.addActionListener((e)-> txtLabel3.setText(bundleEN.getString("Ash")));
			
			germButton.addActionListener((e)-> txtLabel1.setText(bundleDE.getString("Joshua")));
			germButton.addActionListener((e)-> txtLabel2.setText(bundleDE.getString("Sara")));
			germButton.addActionListener((e)-> txtLabel3.setText(bundleDE.getString("Ash")));
			
			russButton.addActionListener((e)-> txtLabel1.setText(bundleRU.getString("Joshua")));
			russButton.addActionListener((e)-> txtLabel2.setText(bundleRU.getString("Sara")));
			russButton.addActionListener((e)-> txtLabel3.setText(bundleRU.getString("Ash")));

			englButton.setIcon(new ImageIcon(getClass().getResource("/img/USA.png")));
			englButton.setSize(50, 210);
			germButton.setIcon(new ImageIcon(getClass().getResource("/img/GER.png")));
			germButton.setSize(50, 210);
			russButton.setIcon(new ImageIcon(getClass().getResource("/img/RUS.png")));
			russButton.setSize(50, 210);

			panel.setLayout(new GridLayout(1, 3, 1, 1));
			panel.setBounds(240, 0, 100, 100);
			panel.add(englButton);
			panel.add(germButton);
			panel.add(russButton);

			panelT.setLayout(new GridLayout(4, 1, 1, 1));
			panelT.setSize(600, 210);
			panelT.setBackground(Color.WHITE);
			panelT.add(txtLabel1);
			panelT.add(txtLabel2);
			panelT.add(txtLabel3);
			panelT.add(panelB);
			
			panelB.add(saveButton,BorderLayout.LINE_START);
			panelB.add(loadButton, BorderLayout.LINE_END);
			
			window.add(picLabel, BorderLayout.LINE_START);
			window.add(panel, BorderLayout.CENTER);
			window.add(panelT, BorderLayout.LINE_END);

			window.setSize(800, 210);
			window.setLocation(1200, 1000);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setResizable(false);
			window.setVisible(true);

		}
}
