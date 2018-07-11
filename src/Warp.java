import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Warp {

	private JFrame frmTravelmachineexe;
	private JTextField textField;
	private int teclas=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warp window = new Warp();
					window.frmTravelmachineexe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Warp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTravelmachineexe = new JFrame();
		
		frmTravelmachineexe.setTitle("TravelMachine.Exe");
		frmTravelmachineexe.setBounds(100, 100, 600, 300);
		frmTravelmachineexe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTravelmachineexe.setLocationRelativeTo(null);
JLabel lblFavorAguarde = new JLabel(" Aguarde...");
lblFavorAguarde.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblFavorAguarde.setVisible(false);
		JLabel lblNewLabel = new JLabel("Destino:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		JLabel resta = new JLabel("New label");
		resta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resta.setVisible(false);
		textField = new JTextField();
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				teclas++;
				if (textField.getText().length() ==2) {
					textField.setText(textField.getText()+"/");
				}
				
				if (textField.getText().length() ==5) {
					textField.setText(textField.getText()+"/");
				}
				
				
			
				
				
			}
		});
		textField.setColumns(10);
		
		JButton btnTravel = new JButton("Travel");
		btnTravel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				textField.setVisible(false);
				lblNewLabel.setVisible(false);
				btnTravel.setVisible(false);
				resta.setVisible(true);
				LocalDate hoje = LocalDate.now();
				
				String destino = textField.getText();
				
				String ano=destino.substring(6, destino.length());
				
				String mes = destino.substring(3,5);
				
				String dia = destino.substring(0,2);
			
				
				LocalDate destinoz=new LocalDate(ano+"-"+mes+"-"+dia);
				resta.setText(daysToNewYear(hoje,destinoz));
				
                 lblFavorAguarde.setVisible(true);
				
			}
			
			
		});
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frmTravelmachineexe.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(255, Short.MAX_VALUE)
					.addComponent(lblFavorAguarde)
					.addGap(243))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(267, Short.MAX_VALUE)
					.addComponent(btnTravel)
					.addGap(254))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(151, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addComponent(resta)
					.addContainerGap(444, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addComponent(resta)
					.addGap(45)
					.addComponent(lblFavorAguarde)
					.addGap(26)
					.addComponent(btnTravel)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		frmTravelmachineexe.getContentPane().setLayout(groupLayout);
	}
	
	public String daysToNewYear(LocalDate fromDate, LocalDate newYear) {
		 
		  String agua;
		 Period p = new Period(fromDate, newYear, PeriodType.yearMonthDayTime());
		// agua=agua.substring(1, agua.length()-1);
		 System.out.println("chegando ao destino em: "+p.getMonths() + "meses"+ ", "+p.getDays()+" Dias.");
		 
				 String retorn = ("Chegando ao destino em: " +p.getYears() +" Ano(s), "+p.getMonths() + " Meses e "+p.getDays()+" Dia(s).");	
		  return retorn;
		  
		}
}
