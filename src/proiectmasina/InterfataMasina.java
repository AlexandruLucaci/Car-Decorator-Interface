package proiectmasina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class InterfataMasina {

    private JFrame frame;
    private JCheckBox OglinziRabatabile;
    private JCheckBox IncalzireScaune;
    private JTextArea NumeMasinaBaza;
    private JTextArea Sumamasina;

    /**Launch the application.*/
  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  InterfataMasina window = new InterfataMasina();
                  window.frame.setVisible(true);} catch (Exception e) {
                  e.printStackTrace();}}});}

	/**
	 * Create the application.
	 */
  public InterfataMasina() {
      initialize();
  }

  /**
   
Initialize the contents of the frame.*/
private void initialize() {
    frame = new JFrame("AUTO DESIGN");
    frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 10));
    frame.setBounds(100, 100, 679, 443);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    JCheckBox LuminiAmbientale = new JCheckBox("Lumini Ambientale");
    LuminiAmbientale.setFont(new Font("Tahoma", Font.PLAIN, 14));
    LuminiAmbientale.setBounds(230, 80, 150, 50);
    frame.getContentPane().add(LuminiAmbientale);
    OglinziRabatabile = new JCheckBox("Oglinzi Rabatabile");
    OglinziRabatabile.setFont(new Font("Tahoma", Font.PLAIN, 14));
    OglinziRabatabile.setBounds(230, 140, 140, 50);
    frame.getContentPane().add(OglinziRabatabile);
    IncalzireScaune = new JCheckBox("Incalzire Scaune");
    IncalzireScaune.setFont(new Font("Tahoma", Font.PLAIN, 14));
    IncalzireScaune.setBounds(230, 200, 140, 50);
    frame.getContentPane().add(IncalzireScaune);
    JTextArea txtfinal = new JTextArea();
    txtfinal.setFont(new Font("Monospaced", Font.PLAIN, 12));
    txtfinal.setRows(2);
    txtfinal.setLineWrap(true);
    txtfinal.setWrapStyleWord(true);
    txtfinal.setBounds(200, 300, 400, 60);
    frame.getContentPane().add(txtfinal);
    
    JCheckBox IncarcatorWireless = new JCheckBox("Incarcator Wireless");
    IncarcatorWireless.setFont(new Font("Tahoma", Font.PLAIN, 14));
    IncarcatorWireless.setBounds(430, 80, 150, 50);
    frame.getContentPane().add(IncarcatorWireless);
    
    JCheckBox Trapa = new JCheckBox("Trapa");
    Trapa.setFont(new Font("Tahoma", Font.PLAIN, 14));
    Trapa.setBounds(430, 140, 150, 50);
    frame.getContentPane().add(Trapa);
    
    JCheckBox SistemAudio = new JCheckBox("Sistem Audio");
    SistemAudio.setFont(new Font("Tahoma", Font.PLAIN, 14));
    SistemAudio.setBounds(430, 200, 150, 50);
    frame.getContentPane().add(SistemAudio);
    
    JButton butoncostfinal = new JButton("COST FINAL");
    butoncostfinal.setFont(new Font("Tahoma", Font.BOLD, 14));
    butoncostfinal.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Masina masina = new MasinaDeBaza();
    		if(IncalzireScaune.isSelected())
    			masina = new ScauneIncalzite(masina);
    		if(OglinziRabatabile.isSelected())
    			masina = new OglinziRabatabile(masina);
    		if(LuminiAmbientale.isSelected())
    			masina = new LuminiAmbientale(masina);
    		if(SistemAudio.isSelected())
    			masina = new SistemAudio(masina);
    		if(Trapa.isSelected())
    			masina = new Trapa(masina);
    		if(IncarcatorWireless.isSelected())
    			masina = new IncarcatorWireless(masina);
    		txtfinal.setText(masina.Descriere()+" €"+masina.Pret());
    	}});
    butoncostfinal.setBounds(50, 300, 130, 60);
    frame.getContentPane().add(butoncostfinal);

    NumeMasinaBaza = new JTextArea("AUDI A4");
    NumeMasinaBaza.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 17));
    NumeMasinaBaza.setEditable(false);
    NumeMasinaBaza.setBounds(40, 80, 170, 30);
    frame.getContentPane().add(NumeMasinaBaza);

    Sumamasina = new JTextArea("3500$");
    Sumamasina.setFont(new Font("Monospaced", Font.BOLD, 17));
    Sumamasina.setEditable(false);
    Sumamasina.setBackground(Color.WHITE);
    Sumamasina.setBounds(40, 160, 170, 30);
    frame.getContentPane().add(Sumamasina);
    
    JLabel LabelMasina = new JLabel("MASINA DE BAZA: ");
    LabelMasina.setFont(new Font("Tahoma", Font.BOLD, 14));
    LabelMasina.setBounds(40, 45, 150, 30);
    frame.getContentPane().add(LabelMasina);
    
    JLabel Labelpret = new JLabel("PRET DE PORNIRE:");
    Labelpret.setFont(new Font("Tahoma", Font.BOLD, 14));
    Labelpret.setBounds(40, 120, 150, 30);
    frame.getContentPane().add(Labelpret);
    
    JLabel LabelOptiuni = new JLabel("OPTIUNI DESIGN\r\n");
    LabelOptiuni.setFont(new Font("Tahoma", Font.BOLD, 18));
    LabelOptiuni.setHorizontalAlignment(SwingConstants.CENTER);
    LabelOptiuni.setBounds(320, 30, 220, 50);
    frame.getContentPane().add(LabelOptiuni);
    
    JLabel PretLumini = new JLabel("250\u20AC");
    PretLumini.setFont(new Font("Tahoma", Font.PLAIN, 14));
    PretLumini.setBounds(380, 90, 40, 30);
    frame.getContentPane().add(PretLumini);
    
    JLabel PretOglinzi = new JLabel("150\u20AC");
    PretOglinzi.setFont(new Font("Tahoma", Font.PLAIN, 14));
    PretOglinzi.setBounds(380, 150, 40, 30);
    frame.getContentPane().add(PretOglinzi);
    
    JLabel PretIncalzire = new JLabel("500\u20AC");
    PretIncalzire.setFont(new Font("Tahoma", Font.PLAIN, 14));
    PretIncalzire.setBounds(380, 210, 40, 30);
    frame.getContentPane().add(PretIncalzire);
    
    JLabel PretIncarcator = new JLabel("50\u20AC");
    PretIncarcator.setFont(new Font("Tahoma", Font.PLAIN, 14));
    PretIncarcator.setBounds(580, 90, 40, 30);
    frame.getContentPane().add(PretIncarcator);
    
    JLabel PretTrapa = new JLabel("100\u20AC");
    PretTrapa.setFont(new Font("Tahoma", Font.PLAIN, 14));
    PretTrapa.setBounds(580, 150, 40, 30);
    frame.getContentPane().add(PretTrapa);
    
    JLabel lblNewLabel = new JLabel("200\u20AC");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNewLabel.setBounds(580, 210, 40, 30);
    frame.getContentPane().add(lblNewLabel);
}
}